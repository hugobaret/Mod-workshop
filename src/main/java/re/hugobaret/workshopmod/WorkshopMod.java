package re.hugobaret.workshopmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import re.hugobaret.workshopmod.item.WorkshopCreativeTab;

@Mod(modid = WorkshopMod.MODID, name = WorkshopMod.NAME, version = WorkshopMod.VERSION)
public class WorkshopMod
{
    public static final String MODID = "workshopmod";
    public static final String NAME = "Workshop Mod";
    public static final String VERSION = "1.0.0";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    public static final CreativeTabs CT = new WorkshopCreativeTab();

}
