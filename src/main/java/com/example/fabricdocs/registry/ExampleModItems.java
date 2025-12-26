package com.example.fabricdocs.registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class ExampleModItems implements ModInitializer {

    @Override
    public void onInitialize() {
        CompostingChanceRegistry.INSTANCE.add(ModItems.SUSPICIOUS_SUBSTANCE, 1.0f);
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.SUSPICIOUS_SUBSTANCE, 30 * 20);
        });
        ModItems.initialize();
    }
}