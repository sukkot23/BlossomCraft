package com.flora.plugin;

import com.flora.api.BloomAPI;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        try {
            BloomAPI.onLoadMessageConfig();
            BloomAPI.onLoadJsonLangFile();

            System.out.println(BloomAPI.getLocaleMap("ko_kr").size());
        }

        catch (FileNotFoundException e) { e.printStackTrace(); }
    }
}
