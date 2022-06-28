package re.hugobaret.workshopmod.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import re.hugobaret.workshopmod.WorkshopMod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = WorkshopMod.MODID, value = Side.CLIENT)
public class WorkshopItems {
    public static final ArrayList<Item> LIST = new ArrayList<>();
    public static final Item item = new BasicItem("item");


    public static void setItemName(Item item, String name) {
        item.setRegistryName(WorkshopMod.MODID, name).setUnlocalizedName(WorkshopMod.MODID + "." + name);
        LIST.add(item);
    }

    public static void setItemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        LIST.add(item);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    protected static void registerItemModels(ModelRegistryEvent e) {
        LIST.forEach(item -> registerModels(item, 0));
    }

    @SideOnly(Side.CLIENT)
    protected static void registerModels(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
