package com.example.fabricdocs.registry;

import net.fabricmc.api.ModInitializer;

public class ExampleModItems implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}