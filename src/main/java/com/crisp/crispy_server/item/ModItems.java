package com.crisp.crispy_server.item;

import com.crisp.crispy_server.CrispyServer;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrispyServer.MODID);

    public  static final RegistryObject<Item> MyItem =
            ITEMS.register("my_item", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.meinTab)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
