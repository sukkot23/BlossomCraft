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
            BloomAPI.onLoadJsonLangFile();
            BloomAPI.onLoadMessageConfig();
        }

        catch (FileNotFoundException e) { e.printStackTrace(); }
    }
}
