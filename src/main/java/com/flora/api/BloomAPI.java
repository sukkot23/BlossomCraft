package com.flora.api;

import com.flora.plugin.Main;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.libs.org.apache.commons.io.FileUtils;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BloomAPI
{
    public static Plugin APIplugin = JavaPlugin.getPlugin(Main.class);
    public static Map<String, JsonObject> langMap = new HashMap<>();
    public static Map<String, Object> messageMap = new HashMap<>();



    /* Get Country Codes */
    private static String[] getCountryCode()
    {
        Locale[] locales = Locale.getAvailableLocales();
        String[] strings = new String[locales.length];

        for (int i = 0; i < locales.length; i++) {
            if (locales[i].getCountry().isEmpty()) { strings[i] = locales[i].getLanguage(); continue; }
            if (locales[i].getLanguage().isEmpty()) { strings[i] = locales[i].getCountry(); continue; }

            strings[i] = locales[i].getLanguage() + "_" + locales[i].getCountry().toLowerCase();
        }
        return strings;
    }


    public static void onLoadJsonLangFile() throws FileNotFoundException {
        int readCount = 0;
        File file = JavaPlugin.getPlugin(Main.class).getDataFolder();
        File[] files = file.listFiles();

        if (!(file.canRead())) {
            System.out.println("발견된 언어 없음");
            return;
        }

        String[] countryCodes = getCountryCode();
        assert files != null;

        for (File f : files) {
            String fileName = f.getName().split("\\.")[0];

            for (String code : countryCodes)
                if (code.equals(fileName))
                    if (isJsonObject(code, f))
                        readCount++;
        }

        if (readCount < 1)
            System.out.println("발견된 언어 없음");
        else
            System.out.println("발견된 언어 있음 " + readCount + "개 발견");
    }

    private static boolean isJsonObject(String countryCode, File file) throws FileNotFoundException
    {
        JsonParser jsonParser = new JsonParser();
        JsonElement element = jsonParser.parse(new FileReader(file.getPath()));

        if (element.isJsonObject())
        {
            langMap.put(countryCode, element.getAsJsonObject());
            return true;
        }

        return false;
    }





    /* Message Config */
    protected static FileConfiguration getMessageConfig()
    {
        String configName = "message.yml";
        File file = new File(APIplugin.getDataFolder(), configName);

        if (!(file.canRead())) {
            try { FileUtils.copyInputStreamToFile(Objects.requireNonNull(APIplugin.getResource(configName)), file); }
            catch (IOException e) { e.printStackTrace(); }
        }

        return YamlConfiguration.loadConfiguration(file);

        /* 참고자료 : https://soft.plusblog.co.kr/116 - inputStream 객체 File 객체로 변환 */
    }

    public static void onLoadMessageConfig()
    {
        FileConfiguration config = getMessageConfig();
        Set<String> list = Objects.requireNonNull(config.getConfigurationSection("")).getKeys(true);

        for (String a : list)
            if (!(config.get(a) instanceof MemorySection))
                messageMap.put(a, config.get(a));
    }
}
