package re.hugobaret.workshopmod.register;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import re.hugobaret.workshopmod.WorkshopMod;
import re.hugobaret.workshopmod.item.WorkshopItems;

@Mod.EventBusSubscriber(modid = WorkshopMod.MODID)
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(WorkshopItems.LIST.toArray(new Item[0]));
    }
}
