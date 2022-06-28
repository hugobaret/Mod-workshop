package re.hugobaret.workshopmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import re.hugobaret.workshopmod.WorkshopMod;

public class WorkshopCreativeTab extends CreativeTabs {
    public WorkshopCreativeTab() {
        super(WorkshopMod.MODID + "_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(WorkshopItems.item);
    }
}
