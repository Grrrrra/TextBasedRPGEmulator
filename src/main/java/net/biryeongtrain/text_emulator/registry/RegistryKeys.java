package net.biryeongtrain.text_emulator.registry;

import net.biryeongtrain.text_emulator.entity.Entity;
import net.biryeongtrain.text_emulator.item.Item;
import net.biryeongtrain.text_emulator.level.Scene;
import net.biryeongtrain.text_emulator.synario.Scenario;
import net.biryeongtrain.text_emulator.utils.identifier.Identifier;

public class RegistryKeys {
    public static final Identifier ROOT = Identifier.of("root");
    public static final RegistryKey<Registry<Item>> ITEM = RegistryKey.ofRegistry(Identifier.of("item"));
    public static final RegistryKey<Registry<Scenario>> SCENARIO = RegistryKey.ofRegistry(Identifier.of("scenario"));
    public static final RegistryKey<Registry<Entity>> ENTITY = RegistryKey.ofRegistry(Identifier.of("entity"));
    public static final RegistryKey<Registry<Scene>> SCENE = RegistryKey.ofRegistry(Identifier.of("scene"));
}
