package re.hugobaret.workshopmod.item;

import net.minecraft.item.Item;
import re.hugobaret.workshopmod.WorkshopMod;

public class BasicItem extends Item {
    public BasicItem(String name) {
        WorkshopItems.setItemName(this, name);
        setCreativeTab(WorkshopMod.CT);
    }
}
