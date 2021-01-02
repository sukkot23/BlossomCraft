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
        }

        catch (FileNotFoundException e) { e.printStackTrace(); }
    }
}
