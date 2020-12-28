package com.flora.plugin;

import com.flora.api.BloomAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        try
        {

            BloomAPI.onLoadJsonLangFile();
            BloomAPI.onLoadMessageConfig();


            for (Player p : Bukkit.getOnlinePlayers())
            {
                p.sendMessage("" + BloomAPI.messageMap.toString());
            }

        }

        catch (FileNotFoundException e) { e.printStackTrace(); }



    }
}
