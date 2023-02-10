package com.crisp.crispy_server.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab meinTab =
            new CreativeModeTab("crispyserver") {
                @Override
                public ItemStack makeIcon() {
                    return new ItemStack(ModItems.MyItem.get());
                }
            };
}
