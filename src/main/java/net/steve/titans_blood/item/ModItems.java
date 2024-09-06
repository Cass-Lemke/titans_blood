package net.steve.titans_blood.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steve.titans_blood.TitansBlood;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TitansBlood.MOD_ID);

    public static final RegistryObject<Item> UNBOUNDSPELL = ITEMS.register("unbound_spell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOUNDSPELL = ITEMS.register("bound_spell",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
