package me.ksafin.DynamicEconomy;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

public class Initialize {

    static Logger                    log = Logger.getLogger("Minecraft");
    private static FileConfiguration config;
    private static File              configFile;

    private File                     itemsFile;
    private FileConfiguration        conf;

    public static void setConfig(FileConfiguration conf) {

        config = conf;

        config.set("Use-Stock", true);
        config.set("Use-boundaries", true);
        config.set("prefix", "");
        config.set("default-amount", 1);
        config.set("local-price-notify", true);
        config.set("global-price-notify", true);
        config.set("log-writing", true);
        config.set("salestax", 0.0);
        config.set("purchasetax", 0.0);
        config.set("deposit-tax-to-account", false);
        config.set("account-name", "");
        config.set("location-restrict", false);
        config.set("minimum-y", 0);
        config.set("maximum-y", 128);
        config.set("alt-commands", false);
        config.set("enable-update-checker", true);
        config.set("use-regions", false);
        config.set("use-region-flags", true);
        config.set("use-loans", true);
        config.set("use-static-interest", false);
        config.set("interest-rate", 0.05);
        config.set("dynamic-interest-rate", 0.0);
        config.set("dynamic-compression-rate", 0.0);
        config.set("payback-time", 20);
        config.set("max-num-loans", 1);
        config.set("max-loan-amount", 500);
        config.set("min-loan-amount", 10);
        config.set("use-loan-account", false);
        config.set("loan-account-name", "");
        config.set("loan-check-interval", 300);
        config.set("banned-sale-items", "");
        config.set("banned-purchase-items", "");

        config.set("enable-over-time-price-decay", true);
        config.set("enable-over-time-price-inflation", true);

        config.set("over-time-price-decay-percent", .1);
        config.set("over-time-price-inflation-percent", .1);

        config.set("over-time-price-change-period", 1440);
        config.set("over-time-price-change-period-check", 60);

        config.set("use-percent-velocity", false);
        config.set("dynecon-world", "world");
        config.set("currency-symbol", "$");
        config.set("enable-random-events", true);
        config.set("random-event-interval", 10);
        config.set("random-event-chance", .1);
        config.set("sign-tagline-color", "&a");
        config.set("sign-info-color", "&f");
        config.set("sign-invalid-color", "&c");

        config.set("group-control", false);

        try {
            config.save(configFile);
        } catch (Exception e) {
            log.info("[DynamicEconomy] Error saving config");
            log.info(e.toString());
            e.printStackTrace();
        }
    }

    public void setGroupsExample() {
        FileConfiguration config = DynamicEconomy.groupsConfig;

        ArrayList<String> list = new ArrayList<String>();
        list.add("GLOWINGREDSTONEORE");
        list.add("GOLDORE");
        list.add("IRONORE");
        list.add("COALORE");
        list.add("LAPISLAZULIORE");
        list.add("DIAMONDORE");
        list.add("REDSTONEORE");

        config.set("ORES", list);

        try {
            config.save(DynamicEconomy.groupsFile);
        } catch (Exception e) {
            log.info("[DynamicEconomy] Error saving groups.yml");
            log.info(e.toString());
            e.printStackTrace();
        }

    }

    public void setAliases() {
        FileConfiguration config = DynamicEconomy.aliasConfig;

        config.set("STONE", "STONE");
        config.set("SMOOTHSTONE", "STONE");
        config.set("1", "STONE");
        config.set("GRASS", "GRASS");
        config.set("2", "GRASS");
        config.set("DIRT", "DIRT");
        config.set("2", "DIRT");
        config.set("PLANK", "PLANK");
        config.set("WOODENPLANK", "PLANK");
        config.set("WOODENPLANKS", "PLANK");
        config.set("PLANKS", "PLANK");
        config.set("5", "PLANK");
        config.set("PINEPLANK", "PINEPLANK");
        config.set("PINEPLANKS", "PINEPLANK");
        config.set("5:1", "PINEPLANK");
        config.set("BIRCHPLANK", "BIRCHPLANK");
        config.set("BIRCHPLANKS", "BIRCHPLANK");
        config.set("5:2", "BIRCHPLANK");
        config.set("JUNGLEPLANK", "JUNGLEPLANK");
        config.set("JUNGLEPLANKS", "JUNGLEPLANK");
        config.set("5:3", "JUNGLEPLANK");
        config.set("COBBLESTONE", "COBBLESTONE");
        config.set("COBBLE", "COBBLESTONE");
        config.set("4", "COBBLESTONE");
        config.set("SAPLING", "SAPLING");
        config.set("6", "SAPLING");
        config.set("BIRCHSAPLING", "BIRCHSAPLING");
        config.set("SPRUCESAPLING", "BIRCHSAPLING");
        config.set("6:1", "BIRCHSAPLING");
        config.set("PINESAPLING", "PINESAPLING");
        config.set("6:2", "PINESAPLING");
        config.set("JUNGLESAPLING", "JUNGLESAPLING");
        config.set("6:3", "JUNGLESAPLING");
        config.set("BEDROCK", "BEDROCK");
        config.set("7", "BEDROCK");
        config.set("STILLWATER", "STILLWATER");
        config.set("8", "STILLWATER");
        config.set("WATER", "WATER");
        config.set("9", "WATER");
        config.set("STILLLAVA", "STILLLAVA");
        config.set("10", "STILLLAVA");
        config.set("LAVA", "LAVA");
        config.set("11", "LAVA");
        config.set("SAND", "SAND");
        config.set("12", "SAND");
        config.set("GRAVEL", "GRAVEL");
        config.set("13", "GRAVEL");
        config.set("WOOD", "WOOD");
        config.set("LOG", "WOOD");
        config.set("17", "WOOD");
        config.set("17:0", "WOOD");
        config.set("BIRCHWOOD", "BIRCHWOOD");
        config.set("BIRCHLOG", "BIRCHWOOD");
        config.set("17:2", "BIRCHWOOD");
        config.set("PINEWOOD", "PINEWOOD");
        config.set("DARKWOOD", "PINEWOOD");
        config.set("DARKLOG", "PINEWOOD");
        config.set("PINGLOG", "PINEWOOD");
        config.set("SPRUCEWOOD", "PINEWOOD");
        config.set("17:1", "PINEWOOD");
        config.set("JUNGLEWOOD", "JUNGLEWOOD");
        config.set("JUNGLELOG", "JUNGLEWOOD");
        config.set("17:3", "JUNGLEWOOD");
        config.set("SPONGE", "SPONGE");
        config.set("19", "SPONGE");
        config.set("GLASS", "GLASS");
        config.set("GLASSBLOCK", "GLASS");
        config.set("20", "GLASS");
        config.set("LAPISLAZULIBLOCK", "LAPISLAZULIBLOCK");
        config.set("22", "LAPISLAZULIBLOCK");
        config.set("DISPENSER", "DISPENSER");
        config.set("23", "DISPENSER");
        config.set("SANDSTONE", "SANDSTONE");
        config.set("SANDBRICK", "SANDSTONE");
        config.set("24", "SANDSTONE");
        config.set("HIEROGLYPHICSANDSTONE", "HIEROGLYPHICSANDSTONE");
        config.set("CREEPERSANDSTONE", "HIEROGLYPHICSANDSTONE");
        config.set("24:1", "HIEROGLYPHICSANDSTONE");
        config.set("SMOOTHSANDSTONE", "SMOOTHSANDSTONE");
        config.set("24:2", "SMOOTHSANDSTONE");
        config.set("NOTEBLOCK", "NOTEBLOCK");
        config.set("MUSICBLOCK", "NOTEBLOCK");
        config.set("25", "NOTEBLOCK");
        config.set("POWEREDRAIL", "POWEREDRAIL");
        config.set("POWERRAIL", "POWEREDRAIL");
        config.set("POWERTRACK", "POWEREDRAIL");
        config.set("POWEREDTRACK", "POWEREDRAIL");
        config.set("27", "POWEREDRAIL");
        config.set("DETECTORRAIL", "DETECTORRAIL");
        config.set("DETECTORTRACK", "DETECTORRAIL");
        config.set("28", "DETECTORRAIL");
        config.set("STICKYPISTON", "STICKYPISTON");
        config.set("29", "STICKYPISTON");
        config.set("WEB", "WEB");
        config.set("SPIDERWEB", "WEB");
        config.set("30", "WEB");
        config.set("DEADSHRUB", "DEADSHRUB");
        config.set("31:0", "DEADSHRUB");
        config.set("31", "DEADSHRUB");
        config.set("TALLGRASS", "TALLGRASS");
        config.set("31:1", "TALLGRASS");
        config.set("31001", "TALLGRASS");
        config.set("FERN", "FERN");
        config.set("31:2", "FERN");
        config.set("31002", "FERN");
        config.set("PISTON", "PISTON");
        config.set("33", "PISTON");
        config.set("WOOL", "WOOL");
        config.set("35", "WOOL");
        config.set("ORANGEWOOL", "ORANGEWOOL");
        config.set("35:1", "ORANGEWOOL");
        config.set("MAGENTAWOOL", "MAGENTAWOOL");
        config.set("35:2", "MAGENTAWOOL");
        config.set("LIGHTBLUEWOOL", "LIGHTBLUEWOOL");
        config.set("35:3", "LIGHTBLUEWOOL");
        config.set("YELLOWWOOL", "YELLOWWOOL");
        config.set("35:4", "YELLOWWOOL");
        config.set("LIMEWOOL", "LIMEWOOL");
        config.set("35:5", "LIMEWOOL");
        config.set("PINKWOOL", "PINKWOOL");
        config.set("35:6", "PINKWOOL");
        config.set("GRAYWOOL", "GRAYWOOL");
        config.set("GREYWOOL", "GRAYWOOL");
        config.set("35:7", "GRAYWOOL");
        config.set("LIGHTGRAYWOOL", "LIGHTGRAYWOOL");
        config.set("LIGHTGREYWOOL", "LIGHTGRAYWOOL");
        config.set("35:8", "LIGHTGRAYWOOL");
        config.set("CYANWOOL", "CYANWOOL");
        config.set("35:9", "CYANWOOL");
        config.set("PURPLEWOOL", "PURPLEWOOL");
        config.set("35:10", "PURPLEWOOL");
        config.set("BLUEWOOL", "BLUEWOOL");
        config.set("35:11", "BLUEWOOL");
        config.set("BROWNWOOL", "BROWNWOOL");
        config.set("35:12", "BROWNWOOL");
        config.set("GREENWOOL", "GREENWOOL");
        config.set("35:13", "GREENWOOL");
        config.set("REDWOOL", "REDWOOL");
        config.set("35:14", "REDWOOL");
        config.set("BLACKWOOL", "BLACKWOOL");
        config.set("35:15", "BLACKWOOL");
        config.set("DANDELION", "DANDELION");
        config.set("YELLOWFLOWER", "DANDELION");
        config.set("37", "DANDELION");
        config.set("ROSE", "ROSE");
        config.set("REDFLOWER", "ROSE");
        config.set("38", "ROSE");
        config.set("BROWNMUSHROOM", "BROWNMUSHROOM");
        config.set("39", "BROWNMUSHROOM");
        config.set("REDMUSHROOM", "REDMUSHROOM");
        config.set("40", "REDMUSHROOM");
        config.set("GOLDBLOCK", "GOLDBLOCK");
        config.set("BLOCKOFGOLD", "GOLDBLOCK");
        config.set("41", "GOLDBLOCK");
        config.set("IRONBLOCK", "IRONBLOCK");
        config.set("BLOCKOFIRON", "IRONBLOCK");
        config.set("42", "IRONBLOCK");
        config.set("DOUBLESLABS", "DOUBLESLABS");
        config.set("DOUBLESLAB", "DOUBLESLABS");
        config.set("DOUBLESTEP", "DOUBLESLABS");
        config.set("DOUBLESTEPS", "DOUBLESLABS");
        config.set("43", "DOUBLESLABS");
        config.set("SLABS", "SLABS");
        config.set("SLAB", "SLABS");
        config.set("STONESLAB", "SLABS");
        config.set("STONESLABS", "SLABS");
        config.set("44", "SLABS");
        config.set("SANDSTONESLABS", "SANDSTONESLABS");
        config.set("SANDSTONESLAB", "SANDSTONESLABS");
        config.set("SANDSLAB", "SANDSTONESLABS");
        config.set("SANDSLABS", "SANDSTONESLABS");
        config.set("44:1", "SANDSTONESLABS");
        config.set("PLANKSLABS", "PLANKSLABS");
        config.set("PLANKSLAB", "PLANKSLABS");
        config.set("WOODSLABS", "PLANKSLABS");
        config.set("WOODSLAB", "PLANKSLABS");
        config.set("44:2", "PLANKSLABS");
        config.set("COBBLESLABS", "COBBLESLABS");
        config.set("COBBLESLAB", "COBBLESLABS");
        config.set("44:3", "COBBLESLABS");
        config.set("BRICKSLABS", "BRICKSLABS");
        config.set("BRICKSLAB", "BRICKSLABS");
        config.set("44:4", "BRICKSLABS");
        config.set("STONEBRICKSLABS", "STONEBRICKSLABS");
        config.set("STONEBRICKSLAB", "STONEBRICKSLABS");
        config.set("STONEBRICKSSLABS", "STONEBRICKSLABS");
        config.set("STONEBRICKSSLAB", "STONEBRICKSLABS");
        config.set("44:5", "STONEBRICKSLABS");
        config.set("BRICKBLOCK", "BRICKBLOCK");
        config.set("45", "BRICKBLOCK");
        config.set("TNT", "TNT");
        config.set("46", "TNT");
        config.set("BOOKSHELF", "BOOKSHELF");
        config.set("47", "BOOKSHELF");
        config.set("MOSSYCOBBLE", "MOSSYCOBBLE");
        config.set("MOSSCOBBLE", "MOSSYCOBBLE");
        config.set("MOSSYCOBBLESTONE", "MOSSYCOBBLE");
        config.set("48", "MOSSYCOBBLE");
        config.set("OBSIDIAN", "OBSIDIAN");
        config.set("OBBY", "OBSIDIAN");
        config.set("49", "OBSIDIAN");
        config.set("TORCH", "TORCH");
        config.set("50", "TORCH");
        config.set("FIRE", "FIRE");
        config.set("51", "FIRE");
        config.set("MOBSPAWNER", "MOBSPAWNER");
        config.set("SPAWNER", "MOBSPAWNER");
        config.set("52", "MOBSPAWNER");
        config.set("WOODENSTAIRS", "WOODENSTAIRS");
        config.set("WOODSTAIRS", "WOODENSTAIRS");
        config.set("PLANKSTAIRS", "WOODENSTAIRS");
        config.set("53", "WOODENSTAIRS");
        config.set("CHEST", "CHEST");
        config.set("54", "CHEST");
        config.set("DIAMONDBLOCK", "DIAMONDBLOCK");
        config.set("BLOCKOFDIAMOND", "DIAMONDBLOCK");
        config.set("57", "DIAMONDBLOCK");
        config.set("CRAFTBENCH", "CRAFTBENCH");
        config.set("CRAFTINGBENCH", "CRAFTBENCH");
        config.set("CRAFTINGTABLE", "CRAFTBENCH");
        config.set("58", "CRAFTBENCH");
        config.set("FURNACE", "FURNACE");
        config.set("61", "FURNACE");
        config.set("BURNINGFURNACE", "BURNINGFURNACE");
        config.set("62", "BURNINGFURNACE");
        config.set("LADDER", "LADDER");
        config.set("LADDERS", "LADDER");
        config.set("65", "LADDER");
        config.set("RAIL", "RAIL");
        config.set("RAILS", "RAIL");
        config.set("TRACKS", "RAIL");
        config.set("66", "RAIL");
        config.set("COBBLESTAIRS", "COBBLESTAIRS");
        config.set("COBBLESTONESTAIRS", "COBBLESTAIRS");
        config.set("67", "COBBLESTAIRS");
        config.set("LEVER", "LEVER");
        config.set("69", "LEVER");
        config.set("STONEPLATE", "STONEPLATE");
        config.set("STONEPRESSUREPLATE", "STONEPLATE");
        config.set("70", "STONEPLATE");
        config.set("WOODENPLATE", "WOODENPLATE");
        config.set("WOODENPRESSUREPLATE", "WOODENPLATE");
        config.set("72", "WOODENPLATE");
        config.set("GLOWINGREDSTONEORE", "GLOWINGREDSTONEORE");
        config.set("GLOWINGREDSTONE", "GLOWINGREDSTONEORE");
        config.set("74", "GLOWINGREDSTONEORE");
        config.set("BUTTON", "BUTTON");
        config.set("STONEBUTTON", "BUTTON");
        config.set("77", "BUTTON");
        config.set("ICE", "ICE");
        config.set("ICEBLOCK", "ICE");
        config.set("79", "ICE");
        config.set("CACTUS", "CACTUS");
        config.set("CACTI", "CACTUS");
        config.set("81", "CACTUS");
        config.set("CLAYBLOCK", "CLAYBLOCK");
        config.set("82", "CLAYBLOCK");
        config.set("JUKEBOX", "JUKEBOX");
        config.set("84", "JUKEBOX");
        config.set("FENCE", "FENCE");
        config.set("85", "FENCE");
        config.set("PUMPKIN", "PUMPKIN");
        config.set("86", "PUMPKIN");
        config.set("NETHERRACK", "NETHERRACK");
        config.set("87", "NETHERRACK");
        config.set("SOULSAND", "SOULSAND");
        config.set("SLOWSAND", "SOULSAND");
        config.set("QUICKSAND", "SOULSAND");
        config.set("88", "SOULSAND");
        config.set("GLOWSTONE", "GLOWSTONE");
        config.set("GLOWSTONEBLOCK", "GLOWSTONE");
        config.set("89", "GLOWSTONE");
        config.set("TRAPDOOR", "TRAPDOOR");
        config.set("96", "TRAPDOOR");
        config.set("STONEBRICKS", "STONE");
        config.set("STONEBRICK", "STONE");
        config.set("98", "STONE");
        config.set("MOSSYSTONEBRICKS", "MOSSYSTONEBRICKS");
        config.set("MOSSYSTONEBRICK", "MOSSYSTONEBRICKS");
        config.set("98001", "MOSSYSTONEBRICKS");
        config.set("98:1", "MOSSYSTONEBRICKS");
        config.set("CRACKEDSTONEBRICKS", "CRACKEDSTONEBRICKS");
        config.set("CRACKEDSTONEBRICK", "CRACKEDSTONEBRICKS");
        config.set("98002", "CRACKEDSTONEBRICKS");
        config.set("98:2", "CRACKEDSTONEBRICKS");
        config.set("CIRCLESTONEBRICKS", "CIRCLESTONEBRICKS");
        config.set("CIRCLESTONEBRICKS", "CIRCLESTONEBRICKS");
        config.set("98003", "CIRCLESTONEBRICKS");
        config.set("98:3", "CIRCLESTONEBRICKS");
        config.set("IRONBARS", "IRONBARS");
        config.set("101", "IRONBARS");
        config.set("GLASSPANE", "GLASSPANE");
        config.set("102", "GLASSPANE");
        config.set("VINES", "VINES");
        config.set("106", "VINES");
        config.set("FENCEGATE", "FENCEGATE");
        config.set("107", "FENCEGATE");
        config.set("BRICKSTAIRS", "BRICKSTAIRS");
        config.set("108", "BRICKSTAIRS");
        config.set("STONEBRICKSTAIRS", "STONEBRICKSTAIRS");
        config.set("109", "STONEBRICKSTAIRS");
        config.set("MYCELIUM", "MYCELIUM");
        config.set("110", "MYCELIUM");
        config.set("LILYPAD", "LILYPAD");
        config.set("LILYPADS", "LILYPAD");
        config.set("111", "LILYPAD");
        config.set("NETHERBRICK", "NETHERBRICK");
        config.set("NETHERSTONE", "NETHERBRICK");
        config.set("112", "NETHERBRICK");
        config.set("NETHERBRICKFENCE", "NETHERBRICKFENCE");
        config.set("NETHERSTONEFENCE", "NETHERBRICKFENCE");
        config.set("113", "NETHERBRICKFENCE");
        config.set("NETHERBRICKSTAIRS", "NETHERBRICKSTAIRS");
        config.set("NETHERSTONESTAIRS", "NETHERBRICKSTAIRS");
        config.set("114", "NETHERBRICKSTAIRS");
        config.set("ENCHANTMENTTABLE", "ENCHANTMENTTABLE");
        config.set("116", "ENCHANTMENTTABLE");
        config.set("ENDSTONE", "ENDSTONE");
        config.set("121", "ENDSTONE");
        config.set("DRAGONEGG", "DRAGONEGG");
        config.set("122", "DRAGONEGG");
        config.set("REDSTONELAMP", "REDSTONELAMP");
        config.set("RSLAMP", "REDSTONELAMP");
        config.set("123", "REDSTONELAMP");
        config.set("IRONSHOVEL", "IRONSHOVEL");
        config.set("ISHOVEL", "IRONSHOVEL");
        config.set("256", "IRONSHOVEL");
        config.set("IRONPICKAXE", "IRONPICKAXE");
        config.set("IPICKAXE", "IRONPICKAXE");
        config.set("IPICK", "IRONPICKAXE");
        config.set("IRONPICK", "IRONPICKAXE");
        config.set("257", "IRONPICKAXE");
        config.set("IRONAXE", "IRONAXE");
        config.set("IAXE", "IRONAXE");
        config.set("IRONHATCHET", "IRONAXE");
        config.set("IHATCHET", "IRONAXE");
        config.set("258", "IRONAXE");
        config.set("FLINTANDSTEEL", "FLINTANDSTEEL");
        config.set("FLINTSTEEL", "FLINTANDSTEEL");
        config.set("259", "FLINTANDSTEEL");
        config.set("APPLE", "APPLE");
        config.set("REDAPPLE", "APPLE");
        config.set("260", "APPLE");
        config.set("BOW", "BOW");
        config.set("261", "BOW");
        config.set("ARROW", "ARROW");
        config.set("ARROWS", "ARROW");
        config.set("262", "ARROW");
        config.set("COAL", "COAL");
        config.set("263:0", "COAL");
        config.set("263", "COAL");
        config.set("CHARCOAL", "CHARCOAL");
        config.set("263:1", "CHARCOAL");
        config.set("DIAMOND", "DIAMOND");
        config.set("264", "DIAMOND");
        config.set("IRONINGOT", "IRONINGOT");
        config.set("IRON", "IRONINGOT");
        config.set("265", "IRONINGOT");
        config.set("GOLDINGOT", "GOLDINGOT");
        config.set("GOLD", "GOLDINGOT");
        config.set("266", "GOLDINGOT");
        config.set("IRONSWORD", "IRONSWORD");
        config.set("ISWORD", "IRONSWORD");
        config.set("267", "IRONSWORD");
        config.set("WOODENSWORD", "WOODENSWORD");
        config.set("WSWORD", "WOODENSWORD");
        config.set("268", "WOODENSWORD");
        config.set("WOODENSHOVEL", "WOODENSHOVEL");
        config.set("WSHOVEL", "WOODENSHOVEL");
        config.set("269", "WOODENSHOVEL");
        config.set("WOODENPICKAXE", "WOODENPICKAXE");
        config.set("WPICK", "WOODENPICKAXE");
        config.set("WPICKAXE", "WOODENPICKAXE");
        config.set("WOODENPICK", "WOODENPICKAXE");
        config.set("270", "WOODENPICKAXE");
        config.set("WOODENAXE", "WOODENAXE");
        config.set("WAXE", "WOODENAXE");
        config.set("WHATCHET", "WOODENAXE");
        config.set("WOODENHATCHET", "WOODENAXE");
        config.set("271", "WOODENAXE");
        config.set("STONESWORD", "STONESWORD");
        config.set("SSWORD", "STONESWORD");
        config.set("272", "STONESWORD");
        config.set("STONESHOVEL", "STONESHOVEL");
        config.set("SSHOVEL", "STONESHOVEL");
        config.set("273", "STONESHOVEL");
        config.set("STONEPICKAXE", "STONEPICKAXE");
        config.set("SPICKAXE", "STONEPICKAXE");
        config.set("SPICK", "STONEPICKAXE");
        config.set("STONEPICK", "STONEPICKAXE");
        config.set("274", "STONEPICKAXE");
        config.set("STONEAXE", "STONEAXE");
        config.set("SAXE", "STONEAXE");
        config.set("STONEHATCHET", "STONEAXE");
        config.set("SHATCHET", "STONEAXE");
        config.set("275", "STONEAXE");
        config.set("DIAMONDSWORD", "DIAMONDSWORD");
        config.set("DSWORD", "DIAMONDSWORD");
        config.set("276", "DIAMONDSWORD");
        config.set("DIAMONDSHOVEL", "DIAMONDSHOVEL");
        config.set("DSHOVEL", "DIAMONDSHOVEL");
        config.set("277", "DIAMONDSHOVEL");
        config.set("DIAMONDPICKAXE", "DIAMONDPICKAXE");
        config.set("DPICK", "DIAMONDPICKAXE");
        config.set("DPICKAXE", "DIAMONDPICKAXE");
        config.set("DIAMONDPICK", "DIAMONDPICKAXE");
        config.set("278", "DIAMONDPICKAXE");
        config.set("DIAMONDAXE", "DIAMONDAXE");
        config.set("DAXE", "DIAMONDAXE");
        config.set("DIAMONDHATCHET", "DIAMONDAXE");
        config.set("DHATCHET", "DIAMONDAXE");
        config.set("279", "DIAMONDAXE");
        config.set("STICK", "STICK");
        config.set("WOODENSTICK", "STICK");
        config.set("280", "STICK");
        config.set("BOWL", "BOWL");
        config.set("281", "BOWL");
        config.set("MUSHROOMSOUP", "MUSHROOMSOUP");
        config.set("282", "MUSHROOMSOUP");
        config.set("GOLDSWORD", "STONE");
        config.set("GSWORD", "GOLDSWORD");
        config.set("283", "GOLDSWORD");
        config.set("GOLDSHOVEL", "GOLDSHOVEL");
        config.set("GSHOVEL", "GOLDSHOVEL");
        config.set("284", "GOLDSHOVEL");
        config.set("GOLDPICKAXE", "GOLDPICKAXE");
        config.set("GPICK", "GOLDPICKAXE");
        config.set("GOLDPICK", "GOLDPICKAXE");
        config.set("GPICKAXE", "GOLDPICKAXE");
        config.set("285", "GOLDPICKAXE");
        config.set("GOLDAXE", "GOLDAXE");
        config.set("GAXE", "GOLDAXE");
        config.set("GOLDHATCHET", "GOLDAXE");
        config.set("GHATCHET", "GOLDAXE");
        config.set("286", "GOLDAXE");
        config.set("STRING", "STRING");
        config.set("287", "STRING");
        config.set("FEATHER", "FEATHER");
        config.set("288", "FEATHER");
        config.set("GUNPOWDER", "GUNPOWDER");
        config.set("289", "GUNPOWDER");
        config.set("WOODENHOE", "WOODENHOE");
        config.set("WHOE", "WOODENHOE");
        config.set("290", "WOODENHOE");
        config.set("STONEHOE", "STONEHOE");
        config.set("SHOE", "STONEHOE");
        config.set("291", "STONEHOE");
        config.set("IRONHOE", "IRONHOE");
        config.set("IHOE", "IRONHOE");
        config.set("292", "IRONHOE");
        config.set("DIAMONDHOE", "DIAMONDHOE");
        config.set("DHOE", "DIAMONDHOE");
        config.set("293", "DIAMONDHOE");
        config.set("GOLDHOE", "GOLDHOE");
        config.set("GHOE", "GOLDHOE");
        config.set("294", "GOLDHOE");
        config.set("SEEDS", "SEEDS");
        config.set("295", "SEEDS");
        config.set("WHEAT", "WHEAT");
        config.set("296", "WHEAT");
        config.set("BREAD", "BREAD");
        config.set("297", "BREAD");
        config.set("LEATHERCAP", "LEATHERCAP");
        config.set("LEATHERHELMET", "LEATHERCAP");
        config.set("298", "LEATHERCAP");
        config.set("LEATHERTUNIC", "LEATHERTUNIC");
        config.set("LEATHERCHESTPLATE", "LEATHERTUNIC");
        config.set("299", "LEATHERTUNIC");
        config.set("LEATHERPANTS", "LEATHERPANTS");
        config.set("LEATHERLEGGINGS", "LEATHERPANTS");
        config.set("300", "LEATHERPANTS");
        config.set("LEATHERBOOTS", "LEATHERBOOTS");
        config.set("301", "LEATHERBOOTS");
        config.set("CHAINMAILHELMET", "CHAINMAILHELMET");
        config.set("CMHELMET", "CHAINMAILHELMET");
        config.set("302", "CHAINMAILHELMET");
        config.set("CHAINMAILCHESTPLATE", "CHAINMAILCHESTPLATE");
        config.set("CMCHESTPLATE", "CHAINMAILCHESTPLATE");
        config.set("303", "CHAINMAILCHESTPLATE");
        config.set("CHAINMAILLEGGINGS", "CHAINMAILLEGGINGS");
        config.set("CMLEGGINGS", "CHAINMAILLEGGINGS");
        config.set("304", "CHAINMAILLEGGINGS");
        config.set("CHAINMAILBOOTS", "CHAINMAILBOOTS");
        config.set("CMBOOTS", "CHAINMAILBOOTS");
        config.set("305", "CHAINMAILBOOTS");
        config.set("IRONHELMET", "IRONHELMET");
        config.set("IHELMET", "IRONHELMET");
        config.set("306", "IRONHELMET");
        config.set("IRONCHESTPLATE", "IRONCHESTPLATE");
        config.set("ICHESTPLATE", "IRONCHESTPLATE");
        config.set("307", "IRONCHESTPLATE");
        config.set("IRONLEGGINGS", "IRONLEGGINGS");
        config.set("ILEGGINGS", "IRONLEGGINGS");
        config.set("308", "IRONLEGGINGS");
        config.set("IRONBOOTS", "IRONBOOTS");
        config.set("IBOOTS", "IRONBOOTS");
        config.set("309", "IRONBOOTS");
        config.set("DIAMONDHELMET", "DIAMONDHELMET");
        config.set("DHELMET", "DIAMONDHELMET");
        config.set("310", "DIAMONDHELMET");
        config.set("DIAMONDCHESTPLATE", "DIAMONDHELMET");
        config.set("DCHESTPLATE", "DIAMONDHELMET");
        config.set("311", "DIAMONDHELMET");
        config.set("DIAMONDLEGGINGS", "DIAMONDLEGGINGS");
        config.set("DLEGGINGS", "DIAMONDLEGGINGS");
        config.set("312", "DIAMONDLEGGINGS");
        config.set("DIAMONDBOOTS", "DIAMONDBOOTS");
        config.set("DBOOTS", "DIAMONDBOOTS");
        config.set("313", "DIAMONDBOOTS");
        config.set("GOLDHELMET", "GOLDHELMET");
        config.set("GHELMET", "GOLDHELMET");
        config.set("314", "GOLDHELMET");
        config.set("GOLDCHESTPLATE", "GOLDCHESTPLATE");
        config.set("GCHESTPLATE", "GOLDCHESTPLATE");
        config.set("315", "GOLDCHESTPLATE");
        config.set("GOLDLEGGINGS", "GOLDLEGGINGS");
        config.set("GLEGGINGS", "GOLDLEGGINGS");
        config.set("316", "GOLDLEGGINGS");
        config.set("GOLDBOOTS", "GOLDBOOTS");
        config.set("GBOOTS", "GOLDBOOTS");
        config.set("317", "GOLDBOOTS");
        config.set("FLINT", "FLINT");
        config.set("318", "FLINT");
        config.set("RAWPORKCHOP", "RAWPORKCHOP");
        config.set("RAWPORK", "RAWPORKCHOP");
        config.set("319", "RAWPORKCHOP");
        config.set("COOKEDPORKCHOP", "COOKEDPORKCHOP");
        config.set("COOKEDPORK", "COOKEDPORKCHOP");
        config.set("320", "COOKEDPORKCHOP");
        config.set("PAINTING", "PAINTING");
        config.set("321", "PAINTING");
        config.set("GOLDENAPPLE", "GOLDENAPPLE");
        config.set("GOLDAPPLE", "GOLDENAPPLE");
        config.set("322", "GOLDENAPPLE");
        config.set("SIGN", "SIGN");
        config.set("SIGNPOST", "SIGN");
        config.set("323", "SIGN");
        config.set("WOODENDOOR", "WOODENDOOR");
        config.set("WOODDOOR", "WOODENDOOR");
        config.set("324", "WOODENDOOR");
        config.set("BUCKET", "BUCKET");
        config.set("BUKKIT", "BUCKET");
        config.set("325", "BUCKET");
        config.set("WATERBUCKET", "WATERBUCKET");
        config.set("326", "WATERBUCKET");
        config.set("LAVABUCKET", "LAVABUCKET");
        config.set("327", "LAVABUCKET");
        config.set("MINECART", "MINECART");
        config.set("328", "MINECART");
        config.set("SADDLE", "SADDLE");
        config.set("329", "SADDLE");
        config.set("IRONDOOR", "IRONDOOR");
        config.set("330", "IRONDOOR");
        config.set("REDSTONE", "REDSTONE");
        config.set("REDSTONEDUST", "REDSTONE");
        config.set("RS", "REDSTONE");
        config.set("331", "REDSTONE");
        config.set("SNOWBALL", "SNOWBALL");
        config.set("332", "SNOWBALL");
        config.set("BOAT", "BOAT");
        config.set("333", "BOAT");
        config.set("GOLDORE", "GOLDORE");
        config.set("14", "GOLDORE");
        config.set("IRONORE", "IRONORE");
        config.set("15", "IRONORE");
        config.set("COALORE", "COALORE");
        config.set("16", "COALORE");
        config.set("LAPISLAZULIORE", "LAPISLAZULIORE");
        config.set("21", "LAPISLAZULIORE");
        config.set("DIAMONDORE", "DIAMONDORE");
        config.set("56", "DIAMONDORE");
        config.set("REDSTONEORE", "REDSTONEORE");
        config.set("73", "REDSTONEORE");
        config.set("LEATHER", "LEATHER");
        config.set("334", "LEATHER");
        config.set("MILK", "MILK");
        config.set("MILKBUCKET", "MILK");
        config.set("BUCKETOFMILK", "MILK");
        config.set("335", "MILK");
        config.set("BRICK", "BRICK");
        config.set("CLAYBRICK", "BRICK");
        config.set("336", "BRICK");
        config.set("CLAY", "CLAY");
        config.set("337", "CLAY");
        config.set("SUGARCANE", "SUGARCANE");
        config.set("REED", "SUGARCANE");
        config.set("338", "SUGARCANE");
        config.set("PAPER", "PAPER");
        config.set("339", "PAPER");
        config.set("BOOK", "BOOK");
        config.set("340", "BOOK");
        config.set("SLIMEBALL", "SLIMEBALL");
        config.set("SLIME", "SLIMEBALL");
        config.set("341", "SLIMEBALL");
        config.set("MINECARTWITHCHEST", "MINECARTWITHCHEST");
        config.set("342", "MINECARTWITHCHEST");
        config.set("MINECARTWITHFURNACE", "MINECARTWITHFURNACE");
        config.set("POWEREDMINECART", "MINECARTWITHFURNACE");
        config.set("343", "MINECARTWITHFURNACE");
        config.set("EGG", "EGG");
        config.set("344", "EGG");
        config.set("COMPASS", "COMPASS");
        config.set("345", "COMPASS");
        config.set("FISHINGROD", "FISHINGROD");
        config.set("346", "FISHINGROD");
        config.set("CLOCK", "CLOCK");
        config.set("347", "CLOCK");
        config.set("GLOWSTONEDUST", "GLOWSTONEDUST");
        config.set("348", "GLOWSTONEDUST");
        config.set("RAWFISH", "RAWFISH");
        config.set("349", "RAWFISH");
        config.set("COOKEDFISH", "COOKEDFISH");
        config.set("350", "COOKEDFISH");
        config.set("INK", "INK");
        config.set("INKSACK", "INK");
        config.set("351", "INK");

        config.set("REDINK", "REDINK");
        config.set("REDDYE", "REDINK");
        config.set("ROSERED", "REDINK");
        config.set("351:1", "REDINK");

        config.set("GREENINK", "GREENINK");
        config.set("GREENDYE", "GREENINK");
        config.set("CACTUSGREEN", "GREENINK");
        config.set("351:2", "GREENINK");

        config.set("BROWNINK", "BROWNINK");
        config.set("BROWNDYE", "BROWNINK");
        config.set("COCOABEANBROWN", "BROWNINK");
        config.set("351:3", "BROWNINK");

        config.set("LAPISLAZULI", "LAPISLAZULI");
        config.set("LAPIS", "LAPISLAZULI");
        config.set("LAZULI", "LAPISLAZULI");
        config.set("351:4", "LAPISLAZULI");

        config.set("PURPLEINK", "PURPLEINK");
        config.set("PURPLEDYE", "PURPLEINK");
        config.set("351:5", "PURPLEINK");

        config.set("CYANINK", "CYANINK");
        config.set("REDDYE", "CYANINK");
        config.set("351:6", "CYANINK");

        config.set("LIGHTGRAYINK", "LIGHTGRAYINK");
        config.set("LIGHTGRAYDYE", "LIGHTGRAYINK");
        config.set("LIGHTGREYINK", "LIGHTGRAYINK");
        config.set("LIGHTGREYDYE", "LIGHTGRAYINK");
        config.set("351:7", "LIGHTGRAYINK");

        config.set("GRAYINK", "GRAYINK");
        config.set("GRAYDYE", "GRAYINK");
        config.set("GREYINK", "GRAYINK");
        config.set("GREYDYE", "GRAYINK");
        config.set("351:8", "GRAYINK");

        config.set("PINKINK", "PINKINK");
        config.set("PINKDYE", "PINKINK");
        config.set("351:9", "PINKINK");

        config.set("LIMEINK", "LIMEINK");
        config.set("LIMEDYE", "LIMEINK");
        config.set("351:10", "LIMEINK");

        config.set("YELLOWINK", "YELLOWINK");
        config.set("YELLOWDYE", "YELLOWINK");
        config.set("DANDELIONYELLOW", "YELLOWINK");
        config.set("351:11", "YELLOWINK");

        config.set("LIGHTBLUEINK", "LIGHTBLUEINK");
        config.set("LIGHTBLUEDYE", "LIGHTBLUEINK");
        config.set("351:12", "LIGHTBLUEINK");

        config.set("MAGENTAINK", "MAGENTAINK");
        config.set("MAGENTADYE", "MAGENTAINK");
        config.set("351:13", "MAGENTAINK");

        config.set("ORANGEINK", "ORANGEINK");
        config.set("ORANGEDYE", "ORANGEINK");
        config.set("351:14", "ORANGEINK");

        config.set("BONEMEAL", "BONEMEAL");
        config.set("351:15", "BONEMEAL");

        config.set("BONE", "BONE");
        config.set("352", "BONE");
        config.set("SUGAR", "SUGAR");
        config.set("353", "SUGAR");
        config.set("CAKE", "CAKE");
        config.set("354", "CAKE");
        config.set("BED", "BED");
        config.set("355", "BED");
        config.set("REPEATER", "REPEATER");
        config.set("REDSTONEREPEATER", "REPEATER");
        config.set("DIODE", "REPEATER");
        config.set("356", "REPEATER");
        config.set("COOKIE", "COOKIE");
        config.set("357", "COOKIE");
        config.set("MAP", "MAP");
        config.set("358", "MAP");
        config.set("SHEARS", "SHEARS");
        config.set("359", "SHEARS");
        config.set("MELONSLICE", "MELONSLICE");
        config.set("MELON", "MELONSLICE");
        config.set("360", "MELONSLICE");
        config.set("PUMPKINSEED", "PUMPKINSEED");
        config.set("PUMPKINSEEDS", "PUMPKINSEED");
        config.set("361", "PUMPKINSEED");
        config.set("MELONSEED", "MELONSEED");
        config.set("MELONSEEDS", "MELONSEED");
        config.set("362", "MELONSEED");
        config.set("RAWBEEF", "RAWBEEF");
        config.set("363", "RAWBEEF");
        config.set("COOKEDBEEF", "STEAK");
        config.set("STEAK", "STEAK");
        config.set("364", "STEAK");
        config.set("RAWCHICKEN", "RAWCHICKEN");
        config.set("365", "RAWCHICKEN");
        config.set("COOKEDCHICKEN", "COOKEDCHICKEN");
        config.set("366", "COOKEDCHICKEN");
        config.set("ROTTENFLESH", "ROTTENFLESH");
        config.set("367", "ROTTENFLESH");
        config.set("ENDERPEARL", "ENDERPEARL");
        config.set("368", "ENDERPEARL");
        config.set("BLAZEROD", "BLAZEROD");
        config.set("369", "BLAZEROD");
        config.set("GHASTTEAR", "GHASTTEAR");
        config.set("370", "GHASTTEAR");
        config.set("GOLDNUGGET", "GOLDNUGGET");
        config.set("371", "GOLDNUGGET");
        config.set("NETHERWART", "NETHERWART");
        config.set("372", "NETHERWART");
        config.set("GLASSBOTTLE", "GLASSBOTTLE");
        config.set("GLASSVIAL", "GLASSBOTTLE");
        config.set("VIAL", "GLASSBOTTLE");
        config.set("374", "GLASSBOTTLE");
        config.set("SPIDEREYE", "SPIDEREYE");
        config.set("375", "SPIDEREYE");
        config.set("BREWINGSTAND", "BREWINGSTAND");
        config.set("379", "BREWINGSTAND");
        config.set("CAULDRON", "CAULDRON");
        config.set("380", "CAULDRON");
        config.set("EXPERIENCE", "EXPERIENCE");
        config.set("999", "EXPERIENCE");
        config.set("EXP", "EXPERIENCE");
        config.set("EXPPOINTS", "EXPERIENCE");

        config.set("POTIONOFREGENERATION", "POTIONOFREGENERATION");
        config.set("373:8193", "POTIONOFREGENERATION");

        config.set("POTIONOFSWIFTNESS", "POTIONOFSWIFTNESS");
        config.set("373:8194", "POTIONOFSWIFTNESS");

        config.set("POTIONOFFIRERESISTANCE", "POTIONOFFIRERESISTANCE");
        config.set("373:8195", "POTIONOFFIRERESISTANCE");

        config.set("POTIONOFHEALING", "POTIONOFHEALING");
        config.set("373:8261", "POTIONOFHEALING");

        config.set("POTIONOFSTRENGTH", "POTIONOFSTRENGTH");
        config.set("373:8201", "POTIONOFSTRENGTH");

        config.set("POTIONOFPOISON", "POTIONOFPOISON");
        config.set("373:8196", "POTIONOFPOISON");

        config.set("POTIONOFWEAKNESS", "POTIONOFWEAKNESS");
        config.set("373:8200", "POTIONOFWEAKNESS");

        config.set("POTIONOFSLOWNESS", "POTIONOFSLOWNESS");
        config.set("373:8202", "POTIONOFSLOWNESS");

        config.set("POTIONOFHARMING", "POTIONOFHARMING");
        config.set("373:8204", "POTIONOFHARMING");

        config.set("POTIONOFREGENERATIONEXTENDED", "POTIONOFREGENERATIONEXTENDED");
        config.set("373:8257", "POTIONOFREGENERATIONEXTENDED");

        config.set("POTIONOFSWIFTNESSEXTENDED", "POTIONOFSWIFTNESSEXTENDED");
        config.set("373:8258", "POTIONOFSWIFTNESSEXTENDED");

        config.set("POTIONOFFIRERESISTANCEEXTENDED", "POTIONOFFIRERESISTANCEEXTENDED");
        config.set("373:8259", "POTIONOFFIRERESISTANCEEXTENDED");

        config.set("POTIONOFHEALINGEXTENDED", "POTIONOFHEALINGEXTENDED");
        config.set("373:8261", "POTIONOFHEALINGEXTENDED");

        config.set("POTIONOFSTRENGTHEXTENDED", "POTIONOFSTRENGTHEXTENDED");
        config.set("373:8265", "POTIONOFSTRENGTHEXTENDED");

        config.set("POTIONOFPOISONEXTENDED", "POTIONOFPOISONEXTENDED");
        config.set("373:8260", "POTIONOFPOISONEXTENDED");

        config.set("POTIONOFWEAKNESSEXTENDED", "POTIONOFWEAKNESSEXTENDED");
        config.set("373:8264", "POTIONOFWEAKNESSEXTENDED");

        config.set("POTIONOFSLOWNESSEXTENDED", "POTIONOFSLOWNESSEXTENDED");
        config.set("373:8266", "POTIONOFSLOWNESSEXTENDED");

        config.set("POTIONOFHARMINGEXTENDED", "POTIONOFHARMINGEXTENDED");
        config.set("373:8268", "POTIONOFHARMINGEXTENDED");

        config.set("POTIONOFREGENERATIONII", "POTIONOFREGENERATIONII");
        config.set("373:8225", "POTIONOFREGENERATIONII");

        config.set("POTIONOFSWIFTNESSII", "POTIONOFSWIFTNESSII");
        config.set("373:8226", "POTIONOFSWIFTNESSII");

        config.set("POTIONOFFIRERESISTANCEII", "POTIONOFFIRERESISTANCEII");
        config.set("373:8227", "POTIONOFFIRERESISTANCEII");

        config.set("POTIONOFHEALINGII", "POTIONOFHEALINGII");
        config.set("373:8229", "POTIONOFHEALINGII");

        config.set("POTIONOFSTRENGTHII", "POTIONOFSTRENGTHII");
        config.set("373:8233", "POTIONOFSTRENGTHII");

        config.set("POTIONOFPOISONII", "POTIONOFPOISONII");
        config.set("373:8228", "POTIONOFPOISONII");

        config.set("POTIONOFWEAKNESSII", "POTIONOFWEAKNESSII");
        config.set("373:8232", "POTIONOFWEAKNESSII");

        config.set("POTIONOFSLOWNESSII", "POTIONOFSLOWNESSII");
        config.set("373:8234", "POTIONOFSLOWNESSII");

        config.set("POTIONOFHARMINGII", "POTIONOFHARMINGII");
        config.set("373:8236", "POTIONOFHARMINGII");

        config.set("AWKWARDPOTION", "AWKWARDPOTION");
        config.set("373:16", "AWKWARDPOTION");
        config.set("THICKPOTION", "THICKPOTION");
        config.set("373:32", "THICKPOTION");
        config.set("MUNDANEPOTIONEXTENDED", "MUNDANEPOTIONEXTENDED");
        config.set("373:64", "MUNDANEPOTIONEXTENDED");
        config.set("MUNDANEPOTION", "MUNDANEPOTION");
        config.set("373:8192", "MUNDANEPOTION");
        config.set("WATERBOTTLE", "WATERBOTTLE");
        config.set("373:0", "WATERBOTTLE");

        config.set("SPLASHPOTIONOFREGENERATION", "SPLASHPOTIONOFREGENERATION");
        config.set("373:16385", "SPLASHPOTIONOFREGENERATION");

        config.set("SPLASHPOTIONOFSWIFTNESS", "SPLASHPOTIONOFSWIFTNESS");
        config.set("373:16386", "SPLASHPOTIONOFSWIFTNESS");

        config.set("SPLASHPOTIONOFFIRERESISTANCE", "SPLASHPOTIONOFFIRERESISTANCE");
        config.set("373:16387", "SPLASHPOTIONOFFIRERESISTANCE");

        config.set("SPLASHPOTIONOFHEALING", "SPLASHPOTIONOFHEALING");
        config.set("373:16389", "POTIONOFHEALING");

        config.set("SPLASHPOTIONOFSTRENGTH", "SPLASHPOTIONOFSTRENGTH");
        config.set("373:16393", "SPLASHPOTIONOFSTRENGTH");

        config.set("SPLASHPOTIONOFPOISON", "SPLASHPOTIONOFPOISON");
        config.set("373:16388", "SPLASHPOTIONOFPOISON");

        config.set("SPLASHPOTIONOFWEAKNESS", "SPLASHPOTIONOFWEAKNESS");
        config.set("373:16392", "SPLASHPOTIONOFWEAKNESS");

        config.set("SPLASHPOTIONOFSLOWNESS", "SPLASHPOTIONOFSLOWNESS");
        config.set("373:16394", "SPLASHPOTIONOFSLOWNESS");

        config.set("SPLASHPOTIONOFHARMING", "SPLASHPOTIONOFHARMING");
        config.set("373:16396", "SPLASHPOTIONOFHARMING");

        config.set("SPLASHPOTIONOFREGENERATIONEXTENDED", "SPLASHPOTIONOFREGENERATIONEXTENDED");
        config.set("373:16449", "SPLASHPOTIONOFREGENERATIONEXTENDED");

        config.set("SPLASHPOTIONOFSWIFTNESSEXTENDED", "SPLASHPOTIONOFSWIFTNESSEXTENDED");
        config.set("373:16450", "SPLASHPOTIONOFSWIFTNESSEXTENDED");

        config.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED", "SPLASHPOTIONOFFIRERESISTANCEEXTENDED");
        config.set("373:16451", "SPLASHPOTIONOFFIRERESISTANCEEXTENDED");

        config.set("SPLASHPOTIONOFHEALINGEXTENDED", "SPLASHPOTIONOFHEALINGEXTENDED");
        config.set("373:16453", "SPLASHPOTIONOFHEALINGEXTENDED");

        config.set("SPLASHPOTIONOFSTRENGTHEXTENDED", "SPLASHPOTIONOFSTRENGTHEXTENDED");
        config.set("373:16457", "SPLASHPOTIONOFSTRENGTHEXTENDED");

        config.set("SPLASHPOTIONOFPOISONEXTENDED", "SPLASHPOTIONOFPOISONEXTENDED");
        config.set("373:16452", "SPLASHPOTIONOFPOISONEXTENDED");

        config.set("SPLASHPOTIONOFWEAKNESSEXTENDED", "SPLASHPOTIONOFWEAKNESSEXTENDED");
        config.set("373:16456", "SPLASHPOTIONOFWEAKNESSEXTENDED");

        config.set("SPLASHPOTIONOFSLOWNESSEXTENDED", "SPLASHPOTIONOFSLOWNESSEXTENDED");
        config.set("373:16458", "SPLASHPOTIONOFSLOWNESSEXTENDED");

        config.set("SPLASHPOTIONOFHARMINGEXTENDED", "SPLASHPOTIONOFHARMINGEXTENDED");
        config.set("373:16460", "SPLASHPOTIONOFHARMINGEXTENDED");

        config.set("SPLASHPOTIONOFREGENERATIONII", "SPLASHPOTIONOFREGENERATIONII");
        config.set("373:16417", "SPLASHPOTIONOFREGENERATIONII");

        config.set("SPLASHPOTIONOFSWIFTNESSII", "SPLASHPOTIONOFSWIFTNESSII");
        config.set("373:16418", "SPLASHPOTIONOFSWIFTNESSII");

        config.set("SPLASHPOTIONOFFIRERESISTANCEII", "SPLASHPOTIONOFFIRERESISTANCEII");
        config.set("373:16419", "SPLASHPOTIONOFFIRERESISTANCEII");

        config.set("SPLASHPOTIONOFHEALINGII", "SPLASHPOTIONOFHEALINGII");
        config.set("373:16421", "SPLASHPOTIONOFHEALINGII");

        config.set("SPLASHPOTIONOFSTRENGTHII", "SPLASHPOTIONOFSTRENGTHII");
        config.set("373:16425", "SPLASHPOTIONOFSTRENGTHII");

        config.set("SPLASHPOTIONOFPOISONII", "SPLASHPOTIONOFPOISONII");
        config.set("373:16420", "SPLASHPOTIONOFPOISONII");

        config.set("SPLASHPOTIONOFWEAKNESSII", "SPLASHPOTIONOFWEAKNESSII");
        config.set("373:16424", "SPLASHPOTIONOFWEAKNESSII");

        config.set("SPLASHPOTIONOFSLOWNESSII", "SPLASHPOTIONOFSLOWNESSII");
        config.set("373:16426", "SPLASHPOTIONOFSLOWNESSII");

        config.set("SPLASHPOTIONOFHARMINGII", "SPLASHPOTIONOFHARMINGII");
        config.set("373:16428", "SPLASHPOTIONOFHARMINGII");

        config.set("SPLASHMUNDANEPOTION", "SPLASHMUNDANEPOTION");
        config.set("373:16384", "SPLASHMUNDANEPOTION");

        config.set("MUSICDISK13", "MUSICDISK13");
        config.set("2256", "MUSICDISK13");
        config.set("MUSICDISKCAT", "MUSICDISKCAT");
        config.set("2257", "MUSICDISKCAT");
        config.set("MUSICDISKBLOCKS", "MUSICDISKBLOCKS");
        config.set("2258", "MUSICDISKBLOCKS");
        config.set("MUSICDISKCHIRP", "MUSICDISKCHIRP");
        config.set("2259", "MUSICDISKCHIRP");
        config.set("MUSICDISKFAR", "MUSICDISKFAR");
        config.set("2260", "MUSICDISKFAR");
        config.set("MUSICDISKMALL", "MUSICDISKMALL");
        config.set("2261", "MUSICDISKMALL");
        config.set("MUSICDISKMELLOHI", "MUSICDISKMELLOHI");
        config.set("2262", "MUSICDISKMELLOHI");
        config.set("MUSICDISKSTAL", "MUSICDISKSTAL");
        config.set("2263", "MUSICDISKSTAL");
        config.set("MUSICDISKSTRAD", "MUSICDISKSTRAD");
        config.set("2264", "MUSICDISKSTRAD");
        config.set("MUSICDISKWARD", "MUSICDISKWARD");
        config.set("2265", "MUSICDISKWARD");
        config.set("MUSICDISK11", "MUSICDISK11");
        config.set("2266", "MUSICDISK11");

    }

    public void setItems() {
        // File itemsFile = new File(plugin.getDataFolder(), "Items.yml");
        // FileConfiguration conf =
        // YamlConfiguration.loadConfiguration(itemsFile);

        conf.set("STONE.velocity", .01);
        conf.set("STONE.id", 1);
        conf.set("STONE.price", .5);
        conf.set("STONE.floor", .01);
        conf.set("STONE.ceiling", 1);
        conf.set("STONE.description", "A Smooth Stone");
        conf.set("STONE.stock", 50);
        conf.set("STONE.spread", .01);
        conf.set("STONE.buytime", 0);
        conf.set("STONE.selltime", 0);

        conf.set("GRASS.velocity", .01);
        conf.set("GRASS.id", 2);
        conf.set("GRASS.price", .5);
        conf.set("GRASS.floor", .01);
        conf.set("GRASS.ceiling", 1);
        conf.set("GRASS.description", "Grassy Green!");
        conf.set("GRASS.stock", 50);
        conf.set("GRASS.spread", .01);
        conf.set("GRASS.buytime", 0);
        conf.set("GRASS.selltime", 0);

        conf.set("DIRT.velocity", .001);
        conf.set("DIRT.id", 3);
        conf.set("DIRT.price", .02);
        conf.set("DIRT.floor", .001);
        conf.set("DIRT.ceiling", .3);
        conf.set("DIRT.description", "Dirt dug from the crust");
        conf.set("DIRT.stock", 50);
        conf.set("DIRT.spread", .001);
        conf.set("DIRT.buytime", 0);
        conf.set("DIRT.selltime", 0);

        conf.set("COBBLESTONE.velocity", .01);
        conf.set("COBBLESTONE.id", 4);
        conf.set("COBBLESTONE.price", .1);
        conf.set("COBBLESTONE.floor", .01);
        conf.set("COBBLESTONE.ceiling", .5);
        conf.set("COBBLESTONE.description", "Un-refined rock");
        conf.set("COBBLESTONE.stock", 50);
        conf.set("COBBLESTONE.spread", .01);
        conf.set("COBBLESTONE.buytime", 0);
        conf.set("COBBLESTONE.selltime", 0);

        // BEGIN ALL PLANKS

        conf.set("PLANK.velocity", .01);
        conf.set("PLANK.id", 5);
        conf.set("PLANK.price", .2);
        conf.set("PLANK.floor", .01);
        conf.set("PLANK.ceiling", .4);
        conf.set("PLANK.description", "Processed wood");
        conf.set("PLANK.stock", 50);
        conf.set("PLANK.spread", .01);
        conf.set("PLANK.buytime", 0);
        conf.set("PLANK.selltime", 0);

        conf.set("PINEPLANK.velocity", .01);
        conf.set("PINEPLANK.id", 5001);
        conf.set("PINEPLANK.price", .2);
        conf.set("PINEPLANK.floor", .01);
        conf.set("PINEPLANK.ceiling", .4);
        conf.set("PINEPLANK.description", "Processed wood");
        conf.set("PINEPLANK.stock", 50);
        conf.set("PINEPLANK.spread", .01);
        conf.set("PINEPLANK.buytime", 0);
        conf.set("PINEPLANK.selltime", 0);

        conf.set("BIRCHPLANK.velocity", .01);
        conf.set("BIRCHPLANK.id", 5002);
        conf.set("BIRCHPLANK.price", .2);
        conf.set("BIRCHPLANK.floor", .01);
        conf.set("BIRCHPLANK.ceiling", .4);
        conf.set("BIRCHPLANK.description", "Processed wood");
        conf.set("BIRCHPLANK.stock", 50);
        conf.set("BIRCHPLANK.spread", .01);
        conf.set("BIRCHPLANK.buytime", 0);
        conf.set("BIRCHPLANK.selltime", 0);

        conf.set("JUNGLEPLANK.velocity", .01);
        conf.set("JUNGLEPLANK.id", 5003);
        conf.set("JUNGLEPLANK.price", .2);
        conf.set("JUNGLEPLANK.floor", .01);
        conf.set("JUNGLEPLANK.ceiling", .4);
        conf.set("JUNGLEPLANK.description", "Processed wood");
        conf.set("JUNGLEPLANK.stock", 50);
        conf.set("JUNGLEPLANK.spread", .01);
        conf.set("JUNGLEPLANK.buytime", 0);
        conf.set("JUNGLEPLANK.selltime", 0);

        // BEGIN ALL PLANK SLABS

        conf.set("OAKSLAB.velocity", .01);
        conf.set("OAKSLAB.id", 126);
        conf.set("OAKSLAB.price", .2);
        conf.set("OAKSLAB.floor", .01);
        conf.set("OAKSLAB.ceiling", .4);
        conf.set("OAKSLAB.description", "Processed wood");
        conf.set("OAKSLAB.stock", 50);
        conf.set("OAKSLAB.spread", .01);
        conf.set("OAKSLAB.buytime", 0);
        conf.set("OAKSLAB.selltime", 0);

        conf.set("PINESLAB.velocity", .01);
        conf.set("PINESLAB.id", 126001);
        conf.set("PINESLAB.price", .2);
        conf.set("PINESLAB.floor", .01);
        conf.set("PINESLAB.ceiling", .4);
        conf.set("PINESLAB.description", "Processed wood");
        conf.set("PINESLAB.stock", 50);
        conf.set("PINESLAB.spread", .01);
        conf.set("PINESLAB.buytime", 0);
        conf.set("PINESLAB.selltime", 0);

        conf.set("BIRCHSLAB.velocity", .01);
        conf.set("BIRCHSLAB.id", 126002);
        conf.set("BIRCHSLAB.price", .2);
        conf.set("BIRCHSLAB.floor", .01);
        conf.set("BIRCHSLAB.ceiling", .4);
        conf.set("BIRCHSLAB.description", "Processed wood");
        conf.set("BIRCHSLAB.stock", 50);
        conf.set("BIRCHSLAB.spread", .01);
        conf.set("BIRCHSLAB.buytime", 0);
        conf.set("BIRCHSLAB.selltime", 0);

        conf.set("JUNGLESLAB.velocity", .01);
        conf.set("JUNGLESLAB.id", 126003);
        conf.set("JUNGLESLAB.price", .2);
        conf.set("JUNGLESLAB.floor", .01);
        conf.set("JUNGLESLAB.ceiling", .4);
        conf.set("JUNGLESLAB.description", "Processed wood");
        conf.set("JUNGLESLAB.stock", 50);
        conf.set("JUNGLESLAB.spread", .01);
        conf.set("JUNGLESLABK.buytime", 0);
        conf.set("JUNGLESLABK.selltime", 0);

        // BEGIN ALL SAPLINGS

        conf.set("SAPLING.velocity", .01);
        conf.set("SAPLING.id", 6);
        conf.set("SAPLING.price", .2);
        conf.set("SAPLING.floor", .01);
        conf.set("SAPLING.ceiling", .45);
        conf.set("SAPLING.description", "A small plant");
        conf.set("SAPLING.stock", 50);
        conf.set("SAPLING.spread", .01);
        conf.set("SAPLING.buytime", 0);
        conf.set("SAPLING.selltime", 0);

        conf.set("BIRCHSAPLING.velocity", .01);
        conf.set("BIRCHSAPLING.id", 6001);
        conf.set("BIRCHSAPLING.price", .2);
        conf.set("BIRCHSAPLING.floor", .01);
        conf.set("BIRCHSAPLING.ceiling", .45);
        conf.set("BIRCHSAPLING.description", "A small plant");
        conf.set("BIRCHSAPLING.stock", 50);
        conf.set("BIRCHSAPLING.spread", .01);
        conf.set("BIRCHSAPLING.buytime", 0);
        conf.set("BIRCHSAPLING.selltime", 0);

        conf.set("PINESAPLING.velocity", .01);
        conf.set("PINESAPLING.id", 6002);
        conf.set("PINESAPLING.price", .2);
        conf.set("PINESAPLING.floor", .01);
        conf.set("PINESAPLING.ceiling", .45);
        conf.set("PINESAPLING.description", "A small plant");
        conf.set("PINESAPLING.stock", 50);
        conf.set("PINESAPLING.spread", .01);
        conf.set("PINESAPLING.buytime", 0);
        conf.set("PINESAPLING.selltime", 0);

        conf.set("JUNGLESAPLING.velocity", .01);
        conf.set("JUNGLESAPLING.id", 6003);
        conf.set("JUNGLESAPLING.price", .2);
        conf.set("JUNGLESAPLING.floor", .01);
        conf.set("JUNGLESAPLING.ceiling", .45);
        conf.set("JUNGLESAPLING.description", "A small plant");
        conf.set("JUNGLESAPLING.stock", 50);
        conf.set("JUNGLESAPLING.spread", .01);
        conf.set("JUNGLESAPLING.buytime", 0);
        conf.set("JUNGLESAPLING.selltime", 0);

        // END SAPLINGS

        conf.set("BEDROCK.velocity", .04);
        conf.set("BEDROCK.id", 7);
        conf.set("BEDROCK.price", 20);
        conf.set("BEDROCK.floor", 1);
        conf.set("BEDROCK.ceiling", 30);
        conf.set("BEDROCK.description", "An unbreakable block that is found at the bottom of the world.");
        conf.set("BEDROCK.stock", 50);
        conf.set("BEDROCK.spread", .01);
        conf.set("BEDROCK.buytime", 0);
        conf.set("BEDROCK.selltime", 0);

        conf.set("WATER.velocity", .04);
        conf.set("WATER.id", 8);
        conf.set("WATER.price", 20);
        conf.set("WATER.floor", 1);
        conf.set("WATER.ceiling", 30);
        conf.set("WATER.description", "Liquid H20");
        conf.set("WATER.stock", 50);
        conf.set("WATER.spread", .01);
        conf.set("WATER.buytime", 0);
        conf.set("WATER.selltime", 0);

        conf.set("STILLWATER.velocity", .04);
        conf.set("STILLWATER.id", 9);
        conf.set("STILLWATER.price", 20);
        conf.set("STILLWATER.floor", 1);
        conf.set("STILLWATER.ceiling", 30);
        conf.set("STILLWATER.description", "Liquid H20");
        conf.set("STILLWATER.stock", 50);
        conf.set("STILLWATER.spread", .01);
        conf.set("STILLWATER.buytime", 0);
        conf.set("STILLWATER.selltime", 0);

        conf.set("LAVA.velocity", .04);
        conf.set("LAVA.id", 10);
        conf.set("LAVA.price", 20);
        conf.set("LAVA.floor", 1);
        conf.set("LAVA.ceiling", 30);
        conf.set("LAVA.description", "Molten Volcano stuff!");
        conf.set("LAVA.stock", 50);
        conf.set("LAVA.spread", .01);
        conf.set("LAVA.buytime", 0);
        conf.set("LAVA.selltime", 0);

        conf.set("STILLLAVA.velocity", .04);
        conf.set("STILLLAVA.id", 11);
        conf.set("STILLLAVA.price", 20);
        conf.set("STILLLAVA.floor", 1);
        conf.set("STILLLAVA.ceiling", 30);
        conf.set("STILLLAVA.description", "Molten Volcano stuff!");
        conf.set("STILLLAVA.stock", 50);
        conf.set("STILLLAVA.spread", .01);
        conf.set("STILLLAVA.buytime", 0);
        conf.set("STILLLAVA.selltime", 0);

        conf.set("SAND.velocity", .001);
        conf.set("SAND.id", 12);
        conf.set("SAND.price", .04);
        conf.set("SAND.floor", .001);
        conf.set("SAND.ceiling", .3);
        conf.set("SAND.description", "Found on beaches!");
        conf.set("SAND.stock", 50);
        conf.set("SAND.spread", .001);
        conf.set("SAND.buytime", 0);
        conf.set("SAND.selltime", 0);

        conf.set("GRAVEL.velocity", .001);
        conf.set("GRAVEL.id", 13);
        conf.set("GRAVEL.price", .04);
        conf.set("GRAVEL.floor", .001);
        conf.set("GRAVEL.ceiling", .3);
        conf.set("GRAVEL.description", "Useless cave slush");
        conf.set("GRAVEL.stock", 50);
        conf.set("GRAVEL.spread", .001);
        conf.set("GRAVEL.buytime", 0);
        conf.set("GRAVEL.selltime", 0);

        conf.set("GOLDORE.velocity", .19);
        conf.set("GOLDORE.id", 14);
        conf.set("GOLDORE.price", 300);
        conf.set("GOLDORE.floor", 250);
        conf.set("GOLDORE.ceiling", 400);
        conf.set("GOLDORE.description", "Prettiest metal ever!");
        conf.set("GOLDORE.stock", 50);
        conf.set("GOLDORE.spread", .19);
        conf.set("GOLDORE.buytime", 0);
        conf.set("GOLDORE.selltime", 0);

        conf.set("IRONORE.velocity", .12);
        conf.set("IRONORE.id", 15);
        conf.set("IRONORE.price", 50);
        conf.set("IRONORE.floor", 30);
        conf.set("IRONORE.ceiling", 80);
        conf.set("IRONORE.description", "Tough as steel!");
        conf.set("IRONORE.stock", 50);
        conf.set("IRONORE.spread", .12);
        conf.set("IRONORE.buytime", 0);
        conf.set("IRONORE.selltime", 0);

        conf.set("COALORE.velocity", .09);
        conf.set("COALORE.id", 16);
        conf.set("COALORE.price", 10);
        conf.set("COALORE.floor", 1);
        conf.set("COALORE.ceiling", 30);
        conf.set("COALORE.description", "Good for burning!");
        conf.set("COALORE.stock", 50);
        conf.set("COALORE.spread", .09);
        conf.set("COALORE.buytime", 0);
        conf.set("COALORE.selltime", 0);

        conf.set("WOOD.velocity", .05);
        conf.set("WOOD.id", 17);
        conf.set("WOOD.price", .8);
        conf.set("WOOD.floor", .1);
        conf.set("WOOD.ceiling", 1);
        conf.set("WOOD.description", "Part of a tree!");
        conf.set("WOOD.stock", 50);
        conf.set("WOOD.spread", .05);
        conf.set("WOOD.buytime", 0);
        conf.set("WOOD.selltime", 0);

        conf.set("BIRCHWOOD.velocity", .05);
        conf.set("BIRCHWOOD.id", 17002);
        conf.set("BIRCHWOOD.price", .8);
        conf.set("BIRCHWOOD.floor", .1);
        conf.set("BIRCHWOOD.ceiling", 1);
        conf.set("BIRCHWOOD.description", "Part of a tree!");
        conf.set("BIRCHWOOD.stock", 50);
        conf.set("BIRCHWOOD.spread", .05);
        conf.set("BIRCHWOOD.buytime", 0);
        conf.set("BIRCHWOOD.selltime", 0);

        conf.set("PINEWOOD.velocity", .05);
        conf.set("PINEWOOD.id", 17001);
        conf.set("PINEWOOD.price", .8);
        conf.set("PINEWOOD.floor", .1);
        conf.set("PINEWOOD.ceiling", 1);
        conf.set("PINEWOOD.description", "Part of a tree!");
        conf.set("PINEWOOD.stock", 50);
        conf.set("PINEWOOD.spread", .05);
        conf.set("PINEWOOD.buytime", 0);
        conf.set("PINEWOOD.selltime", 0);

        conf.set("JUNGLEWOOD.velocity", .05);
        conf.set("JUNGLEWOOD.id", 17003);
        conf.set("JUNGLEWOOD.price", .8);
        conf.set("JUNGLEWOOD.floor", .1);
        conf.set("JUNGLEWOOD.ceiling", 1);
        conf.set("JUNGLEWOOD.description", "Part of a tree!");
        conf.set("JUNGLEWOOD.stock", 50);
        conf.set("JUNGLEWOOD.spread", .05);
        conf.set("JUNGLEWOOD.buytime", 0);
        conf.set("JUNGLEWOOD.selltime", 0);

        conf.set("SPONGE.velocity", .05);
        conf.set("SPONGE.id", 19);
        conf.set("SPONGE.price", 20);
        conf.set("SPONGE.floor", 1);
        conf.set("SPONGE.ceiling", 30);
        conf.set("SPONGE.description", "Soaks up water like nothing else!");
        conf.set("SPONGE.stock", 50);
        conf.set("SPONGE.spread", .05);
        conf.set("SPONGE.buytime", 0);
        conf.set("SPONGE.selltime", 0);

        conf.set("GLASS.velocity", .02);
        conf.set("GLASS.id", 20);
        conf.set("GLASS.price", .35);
        conf.set("GLASS.floor", .2);
        conf.set("GLASS.ceiling", .5);
        conf.set("GLASS.description", "Clear as day.");
        conf.set("GLASS.stock", 50);
        conf.set("GLASS.spread", .02);
        conf.set("GLASS.buytime", 0);
        conf.set("GLASS.selltime", 0);

        conf.set("LAPISLAZULIORE.velocity", .9);
        conf.set("LAPISLAZULIORE.id", 21);
        conf.set("LAPISLAZULIORE.price", 25);
        conf.set("LAPISLAZULIORE.floor", 10);
        conf.set("LAPISLAZULIORE.ceiling", 50);
        conf.set("LAPISLAZULIORE.description", "Prettiest ore in the world");
        conf.set("LAPISLAZULIORE.stock", 50);
        conf.set("LAPISLAZULIORE.spread", .8);
        conf.set("LAPISLAZULIORE.buytime", 0);
        conf.set("LAPISLAZULIORE.selltime", 0);

        conf.set("LAPISLAZULIBLOCK.velocity", .9);
        conf.set("LAPISLAZULIBLOCK.id", 22);
        conf.set("LAPISLAZULIBLOCK.price", 25);
        conf.set("LAPISLAZULIBLOCK.floor", 10);
        conf.set("LAPISLAZULIBLOCK.ceiling", 50);
        conf.set("LAPISLAZULIBLOCK.description", "Prettiest ore in the world");
        conf.set("LAPISLAZULIBLOCK.stock", 50);
        conf.set("LAPISLAZULIBLOCK.spread", .8);
        conf.set("LAPISLAZULIBLOCK.buytime", 0);
        conf.set("LAPISLAZULIBLOCK.selltime", 0);

        conf.set("DISPENSER.velocity", .15);
        conf.set("DISPENSER.id", 23);
        conf.set("DISPENSER.price", 2.5);
        conf.set("DISPENSER.floor", 1);
        conf.set("DISPENSER.ceiling", 5);
        conf.set("DISPENSER.description", "Dispenses stuff!");
        conf.set("DISPENSER.stock", 50);
        conf.set("DISPENSER.spread", .15);
        conf.set("DISPENSER.buytime", 0);
        conf.set("DISPENSER.selltime", 0);

        // BEGIN SANDSTONE

        conf.set("SANDSTONE.velocity", .01);
        conf.set("SANDSTONE.id", 24);
        conf.set("SANDSTONE.price", .15);
        conf.set("SANDSTONE.floor", .1);
        conf.set("SANDSTONE.ceiling", .5);
        conf.set("SANDSTONE.description", "Looks like sand, feels like stone!");
        conf.set("SANDSTONE.stock", 50);
        conf.set("SANDSTONE.spread", .01);
        conf.set("SANDSTONE.buytime", 0);
        conf.set("SANDSTONE.selltime", 0);

        conf.set("HIEROGLYPHICSANDSTONE.velocity", .01);
        conf.set("HIEROGLYPHICSANDSTONE.id", 24001);
        conf.set("HIEROGLYPHICSANDSTONE.price", .15);
        conf.set("HIEROGLYPHICSANDSTONE.floor", .1);
        conf.set("HIEROGLYPHICSANDSTONE.ceiling", .5);
        conf.set("HIEROGLYPHICSANDSTONE.description", "Looks like sand, feels like stone!");
        conf.set("HIEROGLYPHICSANDSTONE.stock", 50);
        conf.set("HIEROGLYPHICSANDSTONE.spread", .01);
        conf.set("HIEROGLYPHICSANDSTONE.buytime", 0);
        conf.set("HIEROGLYPHICSANDSTONE.selltime", 0);

        conf.set("SMOOTHSANDSTONE.velocity", .01);
        conf.set("SMOOTHSANDSTONE.id", 24002);
        conf.set("SMOOTHSANDSTONE.price", .15);
        conf.set("SMOOTHSANDSTONE.floor", .1);
        conf.set("SMOOTHSANDSTONE.ceiling", .5);
        conf.set("SMOOTHSANDSTONE.description", "Looks like sand, feels like stone!");
        conf.set("SMOOTHSANDSTONE.stock", 50);
        conf.set("SMOOTHSANDSTONE.spread", .01);
        conf.set("SMOOTHSANDSTONE.buytime", 0);
        conf.set("SMOOTHSANDSTONE.selltime", 0);

        conf.set("NOTEBLOCK.velocity", .08);
        conf.set("NOTEBLOCK.id", 25);
        conf.set("NOTEBLOCK.price", 1.5);
        conf.set("NOTEBLOCK.floor", .75);
        conf.set("NOTEBLOCK.ceiling", 5);
        conf.set("NOTEBLOCK.description", "Plays musical notes");
        conf.set("NOTEBLOCK.stock", 50);
        conf.set("NOTEBLOCK.spread", .08);
        conf.set("NOTEBLOCK.buytime", 0);
        conf.set("NOTEBLOCK.selltime", 0);

        conf.set("BED.velocity", .1);
        conf.set("BED.id", 355);
        conf.set("BED.price", 2.5);
        conf.set("BED.floor", .5);
        conf.set("BED.ceiling", 5);
        conf.set("BED.description", "Useful for sleeping!");
        conf.set("BED.stock", 50);
        conf.set("BED.spread", .1);
        conf.set("BED.buytime", 0);
        conf.set("BED.selltime", 0);

        conf.set("POWEREDRAIL.velocity", 1.2);
        conf.set("POWEREDRAIL.id", 27);
        conf.set("POWEREDRAIL.price", 301);
        conf.set("POWEREDRAIL.floor", 275);
        conf.set("POWEREDRAIL.ceiling", 325);
        conf.set("POWEREDRAIL.description", "A rail that can power minecarts");
        conf.set("POWEREDRAIL.stock", 50);
        conf.set("POWEREDRAIL.spread", 1.2);
        conf.set("POWEREDRAIL.buytime", 0);
        conf.set("POWEREDRAIL.selltime", 0);

        conf.set("DETECTORRAIL.velocity", .5);
        conf.set("DETECTORRAIL.id", 28);
        conf.set("DETECTORRAIL.price", 54);
        conf.set("DETECTORRAIL.floor", 45);
        conf.set("DETECTORRAIL.ceiling", 74);
        conf.set("DETECTORRAIL.description", "Provides power!");
        conf.set("DETECTORRAIL.stock", 50);
        conf.set("DETECTORRAIL.spread", .5);
        conf.set("DETECTORRAIL.buytime", 0);
        conf.set("DETECTORRAIL.selltime", 0);

        conf.set("STICKYPISTON.velocity", .8);
        conf.set("STICKYPISTON.id", 29);
        conf.set("STICKYPISTON.price", 120);
        conf.set("STICKYPISTON.floor", 100);
        conf.set("STICKYPISTON.ceiling", 145);
        conf.set("STICKYPISTON.description", "Grabs and moves blocks!");
        conf.set("STICKYPISTON.stock", 50);
        conf.set("STICKYPISTON.spread", .8);
        conf.set("STICKYPISTON.buytime", 0);
        conf.set("STICKYPISTON.selltime", 0);

        conf.set("WEB.velocity", .03);
        conf.set("WEB.id", 30);
        conf.set("WEB.price", 20);
        conf.set("WEB.floor", 10);
        conf.set("WEB.ceiling", 30);
        conf.set("WEB.description", "A spiders sweet home.");
        conf.set("WEB.stock", 50);
        conf.set("WEB.spread", .8);
        conf.set("WEB.buytime", 0);
        conf.set("WEB.selltime", 0);

        conf.set("DEADSHRUB.velocity", .05);
        conf.set("DEADSHRUB.id", 31);
        conf.set("DEADSHRUB.price", 1);
        conf.set("DEADSHRUB.floor", .1);
        conf.set("DEADSHRUB.ceiling", 2);
        conf.set("DEADSHRUB.description", "Tall Grass in dead shrub form");
        conf.set("DEADSHRUB.stock", 50);
        conf.set("DEADSHRUB.spread", .05);
        conf.set("DEADSHRUB.buytime", 0);
        conf.set("DEADSHRUB.selltime", 0);

        conf.set("TALLGRASS.velocity", .05);
        conf.set("TALLGRASS.id", 31001);
        conf.set("TALLGRASS.price", 1);
        conf.set("TALLGRASS.floor", .1);
        conf.set("TALLGRASS.ceiling", 2);
        conf.set("TALLGRASS.description", "Tall Grass");
        conf.set("TALLGRASS.stock", 50);
        conf.set("TALLGRASS.spread", .05);
        conf.set("TALLGRASS.buytime", 0);
        conf.set("TALLGRASS.selltime", 0);

        conf.set("FERN.velocity", .05);
        conf.set("FERN.id", 31002);
        conf.set("FERN.price", 1);
        conf.set("FERN.floor", .1);
        conf.set("FERN.ceiling", 2);
        conf.set("FERN.description", "Tall Grass in Fern form!");
        conf.set("FERN.stock", 50);
        conf.set("FERN.spread", .05);
        conf.set("FERN.buytime", 0);
        conf.set("FERN.selltime", 0);

        conf.set("PISTON.velocity", .75);
        conf.set("PISTON.id", 33);
        conf.set("PISTON.price", 53.2);
        conf.set("PISTON.floor", 50);
        conf.set("PISTON.ceiling", 60);
        conf.set("PISTON.description", "Moves stuff!");
        conf.set("PISTON.stock", 50);
        conf.set("PISTON.spread", .75);
        conf.set("PISTON.buytime", 0);
        conf.set("PISTON.selltime", 0);

        conf.set("WOOL.velocity", .05);
        conf.set("WOOL.id", 35);
        conf.set("WOOL.price", 1);
        conf.set("WOOL.floor", .1);
        conf.set("WOOL.ceiling", 2);
        conf.set("WOOL.description", "Found on sheep & dye-able!");
        conf.set("WOOL.stock", 50);
        conf.set("WOOL.spread", .05);
        conf.set("WOOL.buytime", 0);
        conf.set("WOOL.selltime", 0);

        // COLORED WOOLS

        conf.set("ORANGEWOOL.velocity", .05);
        conf.set("ORANGEWOOL.id", 35001);
        conf.set("ORANGEWOOL.price", 1);
        conf.set("ORANGEWOOL.floor", .1);
        conf.set("ORANGEWOOL.ceiling", 2);
        conf.set("ORANGEWOOL.description", "Found on sheep & dye-able!");
        conf.set("ORANGEWOOL.stock", 50);
        conf.set("ORANGEWOOL.spread", .05);
        conf.set("ORANGEWOOL.buytime", 0);
        conf.set("ORANGEWOOL.selltime", 0);

        conf.set("MAGENTAWOOL.velocity", .05);
        conf.set("MAGENTAWOOL.id", 35002);
        conf.set("MAGENTAWOOL.price", 1);
        conf.set("MAGENTAWOOL.floor", .1);
        conf.set("MAGENTAWOOL.ceiling", 2);
        conf.set("MAGENTAWOOL.description", "Found on sheep & dye-able!");
        conf.set("MAGENTAWOOL.stock", 50);
        conf.set("MAGENTAWOOL.spread", .05);
        conf.set("MAGENTAWOOL.buytime", 0);
        conf.set("MAGENTAWOOL.selltime", 0);

        conf.set("LIGHTBLUEWOOL.velocity", .05);
        conf.set("LIGHTBLUEWOOL.id", 35003);
        conf.set("LIGHTBLUEWOOL.price", 1);
        conf.set("LIGHTBLUEWOOL.floor", .1);
        conf.set("LIGHTBLUEWOOL.ceiling", 2);
        conf.set("LIGHTBLUEWOOL.description", "Found on sheep & dye-able!");
        conf.set("LIGHTBLUEWOOL.stock", 50);
        conf.set("LIGHTBLUEWOOL.spread", .05);
        conf.set("LIGHTBLUEWOOL.buytime", 0);
        conf.set("LIGHTBLUEWOOL.selltime", 0);

        conf.set("YELLOWWOOL.velocity", .05);
        conf.set("YELLOWWOOL.id", 35004);
        conf.set("YELLOWWOOL.price", 1);
        conf.set("YELLOWWOOL.floor", .1);
        conf.set("YELLOWWOOL.ceiling", 2);
        conf.set("YELLOWWOOL.description", "Found on sheep & dye-able!");
        conf.set("YELLOWWOOL.stock", 50);
        conf.set("YELLOWWOOL.spread", .05);
        conf.set("YELLOWWOOL.buytime", 0);
        conf.set("YELLOWWOOL.selltime", 0);

        conf.set("LIMEWOOL.velocity", .05);
        conf.set("LIMEWOOL.id", 35005);
        conf.set("LIMEWOOL.price", 1);
        conf.set("LIMEWOOL.floor", .1);
        conf.set("LIMEWOOL.ceiling", 2);
        conf.set("LIMEWOOL.description", "Found on sheep & dye-able!");
        conf.set("LIMEWOOL.stock", 50);
        conf.set("LIMEWOOL.spread", .05);
        conf.set("LIMEWOOL.buytime", 0);
        conf.set("LIMEWOOL.selltime", 0);

        conf.set("PINKWOOL.velocity", .05);
        conf.set("PINKWOOL.id", 35006);
        conf.set("PINKWOOL.price", 1);
        conf.set("PINKWOOL.floor", .1);
        conf.set("PINKWOOL.ceiling", 2);
        conf.set("PINKWOOL.description", "Found on sheep & dye-able!");
        conf.set("PINKWOOL.stock", 50);
        conf.set("PINKWOOL.spread", .05);
        conf.set("PINKWOOL.buytime", 0);
        conf.set("PINKWOOL.selltime", 0);

        conf.set("GRAYWOOL.velocity", .05);
        conf.set("GRAYWOOL.id", 35007);
        conf.set("GRAYWOOL.price", 1);
        conf.set("GRAYWOOL.floor", .1);
        conf.set("GRAYWOOL.ceiling", 2);
        conf.set("GRAYWOOL.description", "Found on sheep & dye-able!");
        conf.set("GRAYWOOL.stock", 50);
        conf.set("GRAYWOOL.spread", .05);
        conf.set("GRAYWOOL.buytime", 0);
        conf.set("GRAYWOOL.selltime", 0);

        conf.set("LIGHTGRAYWOOL.velocity", .05);
        conf.set("LIGHTGRAYWOOL.id", 35008);
        conf.set("LIGHTGRAYWOOL.price", 1);
        conf.set("LIGHTGRAYWOOL.floor", .1);
        conf.set("LIGHTGRAYWOOL.ceiling", 2);
        conf.set("LIGHTGRAYWOOL.description", "Found on sheep & dye-able!");
        conf.set("LIGHTGRAYWOOL.stock", 50);
        conf.set("LIGHTGRAYWOOL.spread", .05);
        conf.set("LIGHTGRAYWOOL.buytime", 0);
        conf.set("LIGHTGRAYWOOL.selltime", 0);

        conf.set("CYANWOOL.velocity", .05);
        conf.set("CYANWOOL.id", 35009);
        conf.set("CYANWOOL.price", 1);
        conf.set("CYANWOOL.floor", .1);
        conf.set("CYANWOOL.ceiling", 2);
        conf.set("CYANWOOL.description", "Found on sheep & dye-able!");
        conf.set("CYANWOOL.stock", 50);
        conf.set("CYANWOOL.spread", .05);
        conf.set("CYANWOOL.buytime", 0);
        conf.set("CYANWOOL.selltime", 0);

        conf.set("PURPLEWOOL.velocity", .05);
        conf.set("PURPLEWOOL.id", 350010);
        conf.set("PURPLEWOOL.price", 1);
        conf.set("PURPLEWOOL.floor", .1);
        conf.set("PURPLEWOOL.ceiling", 2);
        conf.set("PURPLEWOOL.description", "Found on sheep & dye-able!");
        conf.set("PURPLEWOOL.stock", 50);
        conf.set("PURPLEWOOL.spread", .05);
        conf.set("PURPLEWOOL.buytime", 0);
        conf.set("PURPLEWOOL.selltime", 0);

        conf.set("BLUEWOOL.velocity", .05);
        conf.set("BLUEWOOL.id", 350011);
        conf.set("BLUEWOOL.price", 1);
        conf.set("BLUEWOOL.floor", .1);
        conf.set("BLUEWOOL.ceiling", 2);
        conf.set("BLUEWOOL.description", "Found on sheep & dye-able!");
        conf.set("BLUEWOOL.stock", 50);
        conf.set("BLUEWOOL.spread", .05);
        conf.set("BLUEWOOL.buytime", 0);
        conf.set("BLUEWOOL.selltime", 0);

        conf.set("BROWNWOOL.velocity", .05);
        conf.set("BROWNWOOL.id", 350012);
        conf.set("BROWNWOOL.price", 1);
        conf.set("BROWNWOOL.floor", .1);
        conf.set("BROWNWOOL.ceiling", 2);
        conf.set("BROWNWOOL.description", "Found on sheep & dye-able!");
        conf.set("BROWNWOOL.stock", 50);
        conf.set("BROWNWOOL.spread", .05);
        conf.set("BROWNWOOL.buytime", 0);
        conf.set("BROWNWOOL.selltime", 0);

        conf.set("GREENWOOL.velocity", .05);
        conf.set("GREENWOOL.id", 350013);
        conf.set("GREENWOOL.price", 1);
        conf.set("GREENWOOL.floor", .1);
        conf.set("GREENWOOL.ceiling", 2);
        conf.set("GREENWOOL.description", "Found on sheep & dye-able!");
        conf.set("GREENWOOL.stock", 50);
        conf.set("GREENWOOL.spread", .05);
        conf.set("GREENWOOL.buytime", 0);
        conf.set("GREENWOOL.selltime", 0);

        conf.set("REDWOOL.velocity", .05);
        conf.set("REDWOOL.id", 350014);
        conf.set("REDWOOL.price", 1);
        conf.set("REDWOOL.floor", .1);
        conf.set("REDWOOL.ceiling", 2);
        conf.set("REDWOOL.description", "Found on sheep & dye-able!");
        conf.set("REDWOOL.stock", 50);
        conf.set("REDWOOL.spread", .05);
        conf.set("REDWOOL.buytime", 0);
        conf.set("REDWOOL.selltime", 0);

        conf.set("BLACKWOOL.velocity", .05);
        conf.set("BLACKWOOL.id", 350015);
        conf.set("BLACKWOOL.price", 1);
        conf.set("BLACKWOOL.floor", .1);
        conf.set("BLACKWOOL.ceiling", 2);
        conf.set("BLACKWOOL.description", "Found on sheep & dye-able!");
        conf.set("BLACKWOOL.stock", 50);
        conf.set("BLACKWOOL.spread", .05);
        conf.set("BLACKWOOL.buytime", 0);
        conf.set("BLACKWOOL.selltime", 0);

        // END COLORED WOOLS

        conf.set("DANDELION.velocity", .8);
        conf.set("DANDELION.id", 37);
        conf.set("DANDELION.price", 1.3);
        conf.set("DANDELION.floor", .3);
        conf.set("DANDELION.ceiling", 2);
        conf.set("DANDELION.description", "A pretty yellow flower!");
        conf.set("DANDELION.stock", 50);
        conf.set("DANDELION.spread", .8);
        conf.set("DANDELION.buytime", 0);
        conf.set("DANDELION.selltime", 0);

        conf.set("ROSE.velocity", .8);
        conf.set("ROSE.id", 38);
        conf.set("ROSE.price", 1.3);
        conf.set("ROSE.floor", .3);
        conf.set("ROSE.ceiling", 2);
        conf.set("ROSE.description", "A pretty red flower!");
        conf.set("ROSE.stock", 50);
        conf.set("ROSE.spread", .8);
        conf.set("ROSE.buytime", 0);
        conf.set("ROSE.selltime", 0);

        conf.set("BROWNMUSHROOM.velocity", .6);
        conf.set("BROWNMUSHROOM.id", 39);
        conf.set("BROWNMUSHROOM.price", .9);
        conf.set("BROWNMUSHROOM.floor", .05);
        conf.set("BROWNMUSHROOM.ceiling", 2);
        conf.set("BROWNMUSHROOM.description", "Tasty.. or not?");
        conf.set("BROWNMUSHROOM.stock", 50);
        conf.set("BROWNMUSHROOM.spread", .6);
        conf.set("BROWNMUSHROOM.buytime", 0);
        conf.set("BROWNMUSHROOM.selltime", 0);

        conf.set("REDMUSHROOM.velocity", .6);
        conf.set("REDMUSHROOM.id", 40);
        conf.set("REDMUSHROOM.price", .9);
        conf.set("REDMUSHROOM.floor", .05);
        conf.set("REDMUSHROOM.ceiling", 2);
        conf.set("REDMUSHROOM.description", "Tasty.. or not?");
        conf.set("REDMUSHROOM.stock", 50);
        conf.set("REDMUSHROOM.spread", .8);
        conf.set("REDMUSHROOM.buytime", 0);
        conf.set("REDMUSHROOM.selltime", 0);

        conf.set("GOLDBLOCK.velocity", 1);
        conf.set("GOLDBLOCK.id", 41);
        conf.set("GOLDBLOCK.price", 2700);
        conf.set("GOLDBLOCK.floor", 2400);
        conf.set("GOLDBLOCK.ceiling", 3000);
        conf.set("GOLDBLOCK.description", "A block of solid gold!");
        conf.set("GOLDBLOCK.stock", 50);
        conf.set("GOLDBLOCK.spread", 1);
        conf.set("GOLDBLOCK.buytime", 0);
        conf.set("GOLDBLOCK.selltime", 0);

        conf.set("IRONBLOCK.velocity", 1);
        conf.set("IRONBLOCK.id", 42);
        conf.set("IRONBLOCK.price", 450);
        conf.set("IRONBLOCK.floor", 400);
        conf.set("IRONBLOCK.ceiling", 500);
        conf.set("IRONBLOCK.description", "A block of solid Iron!!");
        conf.set("IRONBLOCK.stock", 50);
        conf.set("IRONBLOCK.spread", 1);
        conf.set("IRONBLOCK.buytime", 0);
        conf.set("IRONBLOCK.selltime", 0);

        conf.set("DOUBLESLABS.velocity", .03);
        conf.set("DOUBLESLABS.id", 43);
        conf.set("DOUBLESLABS.price", 2);
        conf.set("DOUBLESLABS.floor", 1);
        conf.set("DOUBLESLABS.ceiling", 3);
        conf.set("DOUBLESLABS.description", "Very sophisticated!");
        conf.set("DOUBLESLABS.stock", 50);
        conf.set("DOUBLESLABS.spread", .03);
        conf.set("DOUBLESLABS.buytime", 0);
        conf.set("DOUBLESLABS.selltime", 0);

        // BEGIN SLABS

        conf.set("SLABS.velocity", .03);
        conf.set("SLABS.id", 44);
        conf.set("SLABS.price", 1);
        conf.set("SLABS.floor", .01);
        conf.set("SLABS.ceiling", 2);
        conf.set("SLABS.description", "Half as sophisticated!");
        conf.set("SLABS.stock", 50);
        conf.set("SLABS.spread", .03);
        conf.set("SLABS.buytime", 0);
        conf.set("SLABS.selltime", 0);

        conf.set("SANDSTONESLABS.velocity", .03);
        conf.set("SANDSTONESLABS.id", 44001);
        conf.set("SANDSTONESLABS.price", 1);
        conf.set("SANDSTONESLABS.floor", .01);
        conf.set("SANDSTONESLABS.ceiling", 2);
        conf.set("SANDSTONESLABS.description", "Half as sophisticated!");
        conf.set("SANDSTONESLABS.stock", 50);
        conf.set("SANDSTONESLABS.spread", .03);
        conf.set("SANDSTONESLABS.buytime", 0);
        conf.set("SANDSTONESLABS.selltime", 0);

        conf.set("PLANKSLABS.velocity", .03);
        conf.set("PLANKSLABS.id", 44002);
        conf.set("PLANKSLABS.price", 1);
        conf.set("PLANKSLABS.floor", .01);
        conf.set("PLANKSLABS.ceiling", 2);
        conf.set("PLANKSLABS.description", "Half as sophisticated!");
        conf.set("PLANKSLABS.stock", 50);
        conf.set("PLANKSLABS.spread", .03);
        conf.set("PLANKSLABS.buytime", 0);
        conf.set("PLANKSLABS.selltime", 0);

        conf.set("COBBLESLABS.velocity", .03);
        conf.set("COBBLESLABS.id", 44003);
        conf.set("COBBLESLABS.price", 1);
        conf.set("COBBLESLABS.floor", .01);
        conf.set("COBBLESLABS.ceiling", 2);
        conf.set("COBBLESLABS.description", "Half as sophisticated!");
        conf.set("COBBLESLABS.stock", 50);
        conf.set("COBBLESLABS.spread", .03);
        conf.set("COBBLESLABS.buytime", 0);
        conf.set("COBBLESLABS.selltime", 0);

        conf.set("BRICKSLABS.velocity", .03);
        conf.set("BRICKSLABS.id", 44004);
        conf.set("BRICKSLABS.price", 1);
        conf.set("BRICKSLABS.floor", .01);
        conf.set("BRICKSLABS.ceiling", 2);
        conf.set("BRICKSLABS.description", "Half as sophisticated!");
        conf.set("BRICKSLABS.stock", 50);
        conf.set("BRICKSLABS.spread", .03);
        conf.set("BRICKSLABS.buytime", 0);
        conf.set("BRICKSLABS.selltime", 0);

        conf.set("STONEBRICKSLABS.velocity", .03);
        conf.set("STONEBRICKSLABS.id", 44005);
        conf.set("STONEBRICKSLABS.price", 1);
        conf.set("STONEBRICKSLABS.floor", .01);
        conf.set("STONEBRICKSLABS.ceiling", 2);
        conf.set("STONEBRICKSLABS.description", "Half as sophisticated!");
        conf.set("STONEBRICKSLABS.stock", 50);
        conf.set("STONEBRICKSLABS.spread", .03);
        conf.set("STONEBRICKSLABS.buytime", 0);
        conf.set("STONEBRICKSLABS.selltime", 0);

        // END SLABS

        conf.set("BRICKBLOCK.velocity", .8);
        conf.set("BRICKBLOCK.id", 45);
        conf.set("BRICKBLOCK.price", 20);
        conf.set("BRICKBLOCK.floor", 15);
        conf.set("BRICKBLOCK.ceiling", 25);
        conf.set("BRICKBLOCK.description", "Reminds me of Brooklyn!");
        conf.set("BRICKBLOCK.stock", 50);
        conf.set("BRICKBLOCK.spread", .8);
        conf.set("BRICKBLOCK.buytime", 0);
        conf.set("BRICKBLOCK.selltime", 0);

        conf.set("TNT.velocity", .7);
        conf.set("TNT.id", 46);
        conf.set("TNT.price", 60);
        conf.set("TNT.floor", 49);
        conf.set("TNT.ceiling", 73);
        conf.set("TNT.description", "Blows everything up!");
        conf.set("TNT.stock", 50);
        conf.set("TNT.spread", .7);
        conf.set("TNT.buytime", 0);
        conf.set("TNT.selltime", 0);

        conf.set("BOOKSHELF.velocity", .4);
        conf.set("BOOKSHELF.id", 47);
        conf.set("BOOKSHELF.price", 15.6);
        conf.set("BOOKSHELF.floor", 7);
        conf.set("BOOKSHELF.ceiling", 24);
        conf.set("BOOKSHELF.description", "Found in the homes of the sophisticated and educated!");
        conf.set("BOOKSHELF.stock", 50);
        conf.set("BOOKSHELF.spread", .4);
        conf.set("BOOKSHELF.buytime", 0);
        conf.set("BOOKSHELF.selltime", 0);

        conf.set("MOSSYCOBBLE.velocity", 1.3);
        conf.set("MOSSYCOBBLE.id", 48);
        conf.set("MOSSYCOBBLE.price", 175);
        conf.set("MOSSYCOBBLE.floor", 150);
        conf.set("MOSSYCOBBLE.ceiling", 250);
        conf.set("MOSSYCOBBLE.description", "Found in Dungeons!");
        conf.set("MOSSYCOBBLE.stock", 50);
        conf.set("MOSSYCOBBLE.spread", 1.3);
        conf.set("MOSSYCOBBLE.buytime", 0);
        conf.set("MOSSYCOBBLE.selltime", 0);

        conf.set("OBSIDIAN.velocity", 1.1);
        conf.set("OBSIDIAN.id", 49);
        conf.set("OBSIDIAN.price", 100);
        conf.set("OBSIDIAN.floor", 80);
        conf.set("OBSIDIAN.ceiling", 160);
        conf.set("OBSIDIAN.description", "Hardened Lava!");
        conf.set("OBSIDIAN.stock", 50);
        conf.set("OBSIDIAN.spread", 1.1);
        conf.set("OBSIDIAN.buytime", 0);
        conf.set("OBSIDIAN.selltime", 0);

        conf.set("TORCH.velocity", .01);
        conf.set("TORCH.id", 50);
        conf.set("TORCH.price", .4);
        conf.set("TORCH.floor", .2);
        conf.set("TORCH.ceiling", 1);
        conf.set("TORCH.description", "Cheapest light source!");
        conf.set("TORCH.stock", 50);
        conf.set("TORCH.spread", .01);
        conf.set("TORCH.buytime", 0);
        conf.set("TORCH.selltime", 0);

        conf.set("FIRE.velocity", .06);
        conf.set("FIRE.id", 51);
        conf.set("FIRE.price", 5);
        conf.set("FIRE.floor", .01);
        conf.set("FIRE.ceiling", 10);
        conf.set("FIRE.description", "YOU CAVE. ME MAN. CAVEMAN MAKE FIRE!");
        conf.set("FIRE.stock", 50);
        conf.set("FIRE.spread", .01);
        conf.set("FIRE.buytime", 0);
        conf.set("FIRE.selltime", 0);

        conf.set("MOBSPAWNER.velocity", .06);
        conf.set("MOBSPAWNER.id", 52);
        conf.set("MOBSPAWNER.price", 5);
        conf.set("MOBSPAWNER.floor", .01);
        conf.set("MOBSPAWNER.ceiling", 10);
        conf.set("MOBSPAWNER.description", "It.. makes monsters? Why would you want this?");
        conf.set("MOBSPAWNER.stock", 50);
        conf.set("MOBSPAWNER.spread", .01);
        conf.set("MOBSPAWNER.buytime", 0);
        conf.set("MOBSPAWNER.selltime", 0);

        conf.set("WOODENSTAIRS.velocity", .2);
        conf.set("WOODENSTAIRS.id", 53);
        conf.set("WOODENSTAIRS.price", 3);
        conf.set("WOODENSTAIRS.floor", 1.2);
        conf.set("WOODENSTAIRS.ceiling", 4.9);
        conf.set("WOODENSTAIRS.description", "set up high with wooden stairs!");
        conf.set("WOODENSTAIRS.stock", 50);
        conf.set("WOODENSTAIRS.spread", .2);
        conf.set("WOODENSTAIRS.buytime", 0);
        conf.set("WOODENSTAIRS.selltime", 0);

        conf.set("CHEST.velocity", .2);
        conf.set("CHEST.id", 54);
        conf.set("CHEST.price", 5);
        conf.set("CHEST.floor", 2);
        conf.set("CHEST.ceiling", 10);
        conf.set("CHEST.description", "Used for hiding your darkest secrets!");
        conf.set("CHEST.stock", 50);
        conf.set("CHEST.spread", .2);
        conf.set("CHEST.buytime", 0);
        conf.set("CHEST.selltime", 0);

        conf.set("DIAMONDORE.velocity", 2.2);
        conf.set("DIAMONDORE.id", 56);
        conf.set("DIAMONDORE.price", 5400);
        conf.set("DIAMONDORE.floor", 4800);
        conf.set("DIAMONDORE.ceiling", 6000);
        conf.set("DIAMONDORE.description", "A block of solid Diamond!");
        conf.set("DIAMONDORE.stock", 50);
        conf.set("DIAMONDORE.spread", 2.2);
        conf.set("DIAMONDORE.buytime", 0);
        conf.set("DIAMONDORE.selltime", 0);

        conf.set("DIAMONDBLOCK.velocity", 2.2);
        conf.set("DIAMONDBLOCK.id", 57);
        conf.set("DIAMONDBLOCK.price", 5400);
        conf.set("DIAMONDBLOCK.floor", 4800);
        conf.set("DIAMONDBLOCK.ceiling", 6000);
        conf.set("DIAMONDBLOCK.description", "A block of solid Diamond!");
        conf.set("DIAMONDBLOCK.stock", 50);
        conf.set("DIAMONDBLOCK.spread", 2.2);
        conf.set("DIAMONDBLOCK.buytime", 0);
        conf.set("DIAMONDBLOCK.selltime", 0);

        conf.set("CRAFTBENCH.velocity", .09);
        conf.set("CRAFTBENCH.id", 58);
        conf.set("CRAFTBENCH.price", 2.5);
        conf.set("CRAFTBENCH.floor", 1.5);
        conf.set("CRAFTBENCH.ceiling", 3.5);
        conf.set("CRAFTBENCH.description", "Use it to built just about anything!");
        conf.set("CRAFTBENCH.stock", 50);
        conf.set("CRAFTBENCH.spread", .09);
        conf.set("CRAFTBENCH.buytime", 0);
        conf.set("CRAFTBENCH.selltime", 0);

        conf.set("FURNACE.velocity", .09);
        conf.set("FURNACE.id", 61);
        conf.set("FURNACE.price", 2.5);
        conf.set("FURNACE.floor", 1.5);
        conf.set("FURNACE.ceiling", 2.5);
        conf.set("FURNACE.description", "Use it to burn all your stuff up or cook your food!");
        conf.set("FURNACE.stock", 50);
        conf.set("FURNACE.spread", .09);
        conf.set("FURNACE.buytime", 0);
        conf.set("FURNACE.selltime", 0);

        conf.set("BURNINGFURNACE.velocity", .09);
        conf.set("BURNINGFURNACE.id", 62);
        conf.set("BURNINGFURNACE.price", 2.5);
        conf.set("BURNINGFURNACE.floor", 1.5);
        conf.set("BURNINGFURNACE.ceiling", 2.5);
        conf.set("BURNINGFURNACE.description", "Use it to burn all your stuff up or cook your food!");
        conf.set("BURNINGFURNACE.stock", 50);
        conf.set("BURNINGFURNACE.spread", .09);
        conf.set("BURNINGFURNACE.buytime", 0);
        conf.set("BURNINGFURNACE.selltime", 0);

        conf.set("LADDER.velocity", .001);
        conf.set("LADDER.id", 65);
        conf.set("LADDER.price", 1.4);
        conf.set("LADDER.floor", 1);
        conf.set("LADDER.ceiling", 2);
        conf.set("LADDER.description", "Climb straight up anything!");
        conf.set("LADDER.stock", 50);
        conf.set("LADDER.spread", .001);
        conf.set("LADDER.buytime", 0);
        conf.set("LADDER.selltime", 0);

        conf.set("RAIL.velocity", .4);
        conf.set("RAIL.id", 66);
        conf.set("RAIL.price", 18);
        conf.set("RAIL.floor", 14);
        conf.set("RAIL.ceiling", 26);
        conf.set("RAIL.description", "Helps minecarts move along!");
        conf.set("RAIL.stock", 50);
        conf.set("RAIL.spread", .4);
        conf.set("RAIL.buytime", 0);
        conf.set("RAIL.selltime", 0);

        conf.set("COBBLESTAIRS.velocity", .04);
        conf.set("COBBLESTAIRS.id", 67);
        conf.set("COBBLESTAIRS.price", 1.2);
        conf.set("COBBLESTAIRS.floor", .9);
        conf.set("COBBLESTAIRS.ceiling", 1.5);
        conf.set("COBBLESTAIRS.description", "Walk up high on cobble stairs!");
        conf.set("COBBLESTAIRS.stock", 50);
        conf.set("COBBLESTAIRS.spread", .04);
        conf.set("COBBLESTAIRS.buytime", 0);
        conf.set("COBBLESTAIRS.selltime", 0);

        conf.set("LEVER.velocity", .08);
        conf.set("LEVER.id", 69);
        conf.set("LEVER.price", 1.2);
        conf.set("LEVER.floor", .01);
        conf.set("LEVER.ceiling", 2);
        conf.set("LEVER.description", "Either off or on!");
        conf.set("LEVER.stock", 50);
        conf.set("LEVER.spread", .08);
        conf.set("LEVER.buytime", 0);
        conf.set("LEVER.selltime", 0);

        conf.set("STONEPLATE.velocity", .06);
        conf.set("STONEPLATE.id", 70);
        conf.set("STONEPLATE.price", 2);
        conf.set("STONEPLATE.floor", .2);
        conf.set("STONEPLATE.ceiling", 2.8);
        conf.set("STONEPLATE.description", "Step to activate!");
        conf.set("STONEPLATE.stock", 50);
        conf.set("STONEPLATE.spread", .06);
        conf.set("STONEPLATE.buytime", 0);
        conf.set("STONEPLATE.selltime", 0);

        conf.set("WOODENPLATE.velocity", .06);
        conf.set("WOODENPLATE.id", 72);
        conf.set("WOODENPLATE.price", 2);
        conf.set("WOODENPLATE.floor", .2);
        conf.set("WOODENPLATE.ceiling", 2.8);
        conf.set("WOODENPLATE.description", "Step to activate!");
        conf.set("WOODENPLATE.stock", 50);
        conf.set("WOODENPLATE.spread", .06);
        conf.set("WOODENPLATE.buytime", 0);
        conf.set("WOODENPLATE.selltime", 0);

        conf.set("REDSTONEORE.velocity", .6);
        conf.set("REDSTONEORE.id", 73);
        conf.set("REDSTONEORE.price", 8);
        conf.set("REDSTONEORE.floor", 2);
        conf.set("REDSTONEORE.ceiling", 16);
        conf.set("REDSTONEORE.description", "Conducts power!");
        conf.set("REDSTONEORE.stock", 50);
        conf.set("REDSTONEORE.spread", .01);
        conf.set("REDSTONEORE.buytime", 0);
        conf.set("REDSTONEORE.selltime", 0);

        conf.set("GLOWINGREDSTONEORE.velocity", .6);
        conf.set("GLOWINGREDSTONEORE.id", 74);
        conf.set("GLOWINGREDSTONEORE.price", 8);
        conf.set("GLOWINGREDSTONEORE.floor", 2);
        conf.set("GLOWINGREDSTONEORE.ceiling", 16);
        conf.set("GLOWINGREDSTONEORE.description", "Conducts power!");
        conf.set("GLOWINGREDSTONEORE.stock", 50);
        conf.set("GLOWINGREDSTONEORE.spread", .01);
        conf.set("GLOWINGREDSTONEORE.buytime", 0);
        conf.set("GLOWINGREDSTONEORE.selltime", 0);

        conf.set("BUTTON.velocity", .06);
        conf.set("BUTTON.id", 77);
        conf.set("BUTTON.price", 2);
        conf.set("BUTTON.floor", 1);
        conf.set("BUTTON.ceiling", 2.4);
        conf.set("BUTTON.description", "Press to activate!");
        conf.set("BUTTON.stock", 50);
        conf.set("BUTTON.spread", .06);
        conf.set("BUTTON.buytime", 0);
        conf.set("BUTTON.selltime", 0);

        conf.set("ICE.velocity", .06);
        conf.set("ICE.id", 79);
        conf.set("ICE.price", 2);
        conf.set("ICE.floor", 1);
        conf.set("ICE.ceiling", 2.4);
        conf.set("ICE.description", "Melts near hot stuff.");
        conf.set("ICE.stock", 50);
        conf.set("ICE.spread", .06);
        conf.set("ICE.buytime", 0);
        conf.set("ICE.selltime", 0);

        conf.set("CACTUS.velocity", .3);
        conf.set("CACTUS.id", 81);
        conf.set("CACTUS.price", 4);
        conf.set("CACTUS.floor", 2);
        conf.set("CACTUS.ceiling", 6);
        conf.set("CACTUS.description", "Prickly! Found in deserts.");
        conf.set("CACTUS.stock", 50);
        conf.set("CACTUS.spread", .3);
        conf.set("CACTUS.buytime", 0);
        conf.set("CACTUS.selltime", 0);

        conf.set("CLAYBLOCK.velocity", .3);
        conf.set("CLAYBLOCK.id", 82);
        conf.set("CLAYBLOCK.price", 4);
        conf.set("CLAYBLOCK.floor", 2);
        conf.set("CLAYBLOCK.ceiling", 6);
        conf.set("CLAYBLOCK.description", "Soft and mushy, like clay!");
        conf.set("CLAYBLOCK.stock", 50);
        conf.set("CLAYBLOCK.spread", .3);
        conf.set("CLAYBLOCK.buytime", 0);
        conf.set("CLAYBLOCK.selltime", 0);

        conf.set("JUKEBOX.velocity", 1.8);
        conf.set("JUKEBOX.id", 84);
        conf.set("JUKEBOX.price", 620);
        conf.set("JUKEBOX.floor", 560);
        conf.set("JUKEBOX.ceiling", 580);
        conf.set("JUKEBOX.description", "Plays lovely records!");
        conf.set("JUKEBOX.stock", 50);
        conf.set("JUKEBOX.spread", 1.8);
        conf.set("JUKEBOX.buytime", 0);
        conf.set("JUKEBOX.selltime", 0);

        conf.set("FENCE.velocity", .02);
        conf.set("FENCE.id", 85);
        conf.set("FENCE.price", 1);
        conf.set("FENCE.floor", .2);
        conf.set("FENCE.ceiling", 1.8);
        conf.set("FENCE.description", "Guard your territory!");
        conf.set("FENCE.stock", 50);
        conf.set("FENCE.spread", .02);
        conf.set("FENCE.buytime", 0);
        conf.set("FENCE.selltime", 0);

        conf.set("PUMPKIN.velocity", .8);
        conf.set("PUMPKIN.id", 86);
        conf.set("PUMPKIN.price", 10);
        conf.set("PUMPKIN.floor", 3);
        conf.set("PUMPKIN.ceiling", 15);
        conf.set("PUMPKIN.description", "Scary or delicious?!");
        conf.set("PUMPKIN.stock", 50);
        conf.set("PUMPKIN.spread", .8);
        conf.set("PUMPKIN.buytime", 0);
        conf.set("PUMPKIN.selltime", 0);

        conf.set("NETHERRACK.velocity", .001);
        conf.set("NETHERRACK.id", 87);
        conf.set("NETHERRACK.price", .75);
        conf.set("NETHERRACK.floor", .3);
        conf.set("NETHERRACK.ceiling", 1);
        conf.set("NETHERRACK.description", "Burns indefinitely!");
        conf.set("NETHERRACK.stock", 50);
        conf.set("NETHERRACK.spread", .001);
        conf.set("NETHERRACK.buytime", 0);
        conf.set("NETHERRACK.selltime", 0);

        conf.set("SOULSAND.velocity", .06);
        conf.set("SOULSAND.id", 88);
        conf.set("SOULSAND.price", 3);
        conf.set("SOULSAND.floor", 1);
        conf.set("SOULSAND.ceiling", 8);
        conf.set("SOULSAND.description", "Slows you down!");
        conf.set("SOULSAND.stock", 50);
        conf.set("SOULSAND.spread", .06);
        conf.set("SOULSAND.buytime", 0);
        conf.set("SOULSAND.selltime", 0);

        conf.set("GLOWSTONE.velocity", .09);
        conf.set("GLOWSTONE.id", 89);
        conf.set("GLOWSTONE.price", 8);
        conf.set("GLOWSTONE.floor", 4);
        conf.set("GLOWSTONE.ceiling", 20);
        conf.set("GLOWSTONE.description", "Light from the pits of hell!");
        conf.set("GLOWSTONE.stock", 50);
        conf.set("GLOWSTONE.spread", .09);
        conf.set("GLOWSTONE.buytime", 0);
        conf.set("GLOWSTONE.selltime", 0);

        conf.set("TRAPDOOR.velocity", .03);
        conf.set("TRAPDOOR.id", 96);
        conf.set("TRAPDOOR.price", 4);
        conf.set("TRAPDOOR.floor", 1);
        conf.set("TRAPDOOR.ceiling", 6);
        conf.set("TRAPDOOR.description", "Kind of like.. a door for your floor!");
        conf.set("TRAPDOOR.stock", 50);
        conf.set("TRAPDOOR.spread", .03);
        conf.set("TRAPDOOR.buytime", 0);
        conf.set("TRAPDOOR.selltime", 0);

        conf.set("STONEBRICKS.velocity", .9);
        conf.set("STONEBRICKS.id", 98);
        conf.set("STONEBRICKS.price", 8);
        conf.set("STONEBRICKS.floor", 4);
        conf.set("STONEBRICKS.ceiling", 16);
        conf.set("STONEBRICKS.description", "Fancy Stronghold stone!");
        conf.set("STONEBRICKS.stock", 50);
        conf.set("STONEBRICKS.spread", .9);
        conf.set("STONEBRICKS.buytime", 0);
        conf.set("STONEBRICKS.selltime", 0);

        conf.set("MOSSYSTONEBRICKS.velocity", .9);
        conf.set("MOSSYSTONEBRICKS.id", 98001);
        conf.set("MOSSYSTONEBRICKS.price", 8);
        conf.set("MOSSYSTONEBRICKS.floor", 4);
        conf.set("MOSSYSTONEBRICKS.ceiling", 16);
        conf.set("MOSSYSTONEBRICKS.description", "Fancy Stronghold stone, moss edition!");
        conf.set("MOSSYSTONEBRICKS.stock", 50);
        conf.set("MOSSYSTONEBRICKS.spread", .9);
        conf.set("MOSSYSTONEBRICKS.buytime", 0);
        conf.set("MOSSYSTONEBRICKS.selltime", 0);

        conf.set("CRACKEDSTONEBRICKS.velocity", .9);
        conf.set("CRACKEDSTONEBRICKS.id", 98002);
        conf.set("CRACKEDSTONEBRICKS.price", 8);
        conf.set("CRACKEDSTONEBRICKS.floor", 4);
        conf.set("CRACKEDSTONEBRICKS.ceiling", 16);
        conf.set("CRACKEDSTONEBRICKS.description", "Fancy Stronghold stone, cracked edition!");
        conf.set("CRACKEDSTONEBRICKS.stock", 50);
        conf.set("CRACKEDSTONEBRICKS.spread", .9);
        conf.set("CRACKEDSTONEBRICKS.buytime", 0);
        conf.set("CRACKEDSTONEBRICKS.selltime", 0);

        conf.set("CIRCLESTONEBRICKS.velocity", .9);
        conf.set("CIRCLESTONEBRICKS.id", 98003);
        conf.set("CIRCLESTONEBRICKS.price", 8);
        conf.set("CIRCLESTONEBRICKS.floor", 4);
        conf.set("CIRCLESTONEBRICKS.ceiling", 16);
        conf.set("CIRCLESTONEBRICKS.description", "Fancy Stronghold stone, circle edition!");
        conf.set("CIRCLESTONEBRICKS.stock", 50);
        conf.set("CIRCLESTONEBRICKS.spread", .9);
        conf.set("CIRCLESTONEBRICKS.buytime", 0);
        conf.set("CIRCLESTONEBRICKS.selltime", 0);

        conf.set("IRONBARS.velocity", .11);
        conf.set("IRONBARS.id", 101);
        conf.set("IRONBARS.price", 18);
        conf.set("IRONBARS.floor", 11);
        conf.set("IRONBARS.ceiling", 29);
        conf.set("IRONBARS.description", "Fit for prisons!");
        conf.set("IRONBARS.stock", 50);
        conf.set("IRONBARS.spread", .11);
        conf.set("IRONBARS.buytime", 0);
        conf.set("IRONBARS.selltime", 0);

        conf.set("GLASSPANE.velocity", .005);
        conf.set("GLASSPANE.id", 102);
        conf.set("GLASSPANE.price", .14);
        conf.set("GLASSPANE.floor", .08);
        conf.set("GLASSPANE.ceiling", .2);
        conf.set("GLASSPANE.description", "Thinner than glass!");
        conf.set("GLASSPANE.stock", 50);
        conf.set("GLASSPANE.spread", .005);
        conf.set("GLASSPANE.buytime", 0);
        conf.set("GLASSPANE.selltime", 0);

        conf.set("VINES.velocity", .005);
        conf.set("VINES.id", 106);
        conf.set("VINES.price", .14);
        conf.set("VINES.floor", .08);
        conf.set("VINES.ceiling", .2);
        conf.set("VINES.description", "Seems like a vineyard kinda vine.");
        conf.set("VINES.stock", 50);
        conf.set("VINES.spread", .005);
        conf.set("VINES.buytime", 0);
        conf.set("VINES.selltime", 0);

        conf.set("FENCEGATE.velocity", .005);
        conf.set("FENCEGATE.id", 107);
        conf.set("FENCEGATE.price", .14);
        conf.set("FENCEGATE.floor", .08);
        conf.set("FENCEGATE.ceiling", .2);
        conf.set("FENCEGATE.description", "Essential for any fence!");
        conf.set("FENCEGATE.stock", 50);
        conf.set("FENCEGATE.spread", .005);
        conf.set("FENCEGATE.buytime", 0);
        conf.set("FENCEGATE.selltime", 0);

        conf.set("BRICKSTAIRS.velocity", .09);
        conf.set("BRICKSTAIRS.id", 108);
        conf.set("BRICKSTAIRS.price", 30);
        conf.set("BRICKSTAIRS.floor", 10);
        conf.set("BRICKSTAIRS.ceiling", 50);
        conf.set("BRICKSTAIRS.description", "Walk up high with brick stairs!");
        conf.set("BRICKSTAIRS.stock", 50);
        conf.set("BRICKSTAIRS.spread", .09);
        conf.set("BRICKSTAIRS.buytime", 0);
        conf.set("BRICKSTAIRS.selltime", 0);

        conf.set("STONEBRICKSTAIRS.velocity", .06);
        conf.set("STONEBRICKSTAIRS.id", 109);
        conf.set("STONEBRICKSTAIRS.price", 12);
        conf.set("STONEBRICKSTAIRS.floor", 6);
        conf.set("STONEBRICKSTAIRS.ceiling", 18);
        conf.set("STONEBRICKSTAIRS.description", "Walk up high with stairs from strongholds!");
        conf.set("STONEBRICKSTAIRS.stock", 50);
        conf.set("STONEBRICKSTAIRS.spread", .06);
        conf.set("STONEBRICKSTAIRS.buytime", 0);
        conf.set("STONEBRICKSTAIRS.selltime", 0);

        conf.set("MYCELIUM.velocity", .06);
        conf.set("MYCELIUM.id", 110);
        conf.set("MYCELIUM.price", 12);
        conf.set("MYCELIUM.floor", 6);
        conf.set("MYCELIUM.ceiling", 18);
        conf.set("MYCELIUM.description", "Found in swamps.");
        conf.set("MYCELIUM.stock", 50);
        conf.set("MYCELIUM.spread", .06);
        conf.set("MYCELIUM.buytime", 0);
        conf.set("MYCELIUM.selltime", 0);

        conf.set("LILYPAD.velocity", .06);
        conf.set("LILYPAD.id", 111);
        conf.set("LILYPAD.price", 12);
        conf.set("LILYPAD.floor", 6);
        conf.set("LILYPAD.ceiling", 18);
        conf.set("LILYPAD.description", "Frogs love em, you will too!");
        conf.set("LILYPAD.stock", 50);
        conf.set("LILYPAD.spread", .06);
        conf.set("LILYPAD.buytime", 0);
        conf.set("LILYPAD.selltime", 0);

        conf.set("NETHERBRICK.velocity", .07);
        conf.set("NETHERBRICK.id", 112);
        conf.set("NETHERBRICK.price", 5);
        conf.set("NETHERBRICK.floor", .5);
        conf.set("NETHERBRICK.ceiling", 10);
        conf.set("NETHERBRICK.description", "Stolen from the strongholds of hell!");
        conf.set("NETHERBRICK.stock", 50);
        conf.set("NETHERBRICK.spread", .07);
        conf.set("NETHERBRICK.buytime", 0);
        conf.set("NETHERBRICK.selltime", 0);

        conf.set("NETHERBRICKFENCE.velocity", .11);
        conf.set("NETHERBRICKFENCE.id", 113);
        conf.set("NETHERBRICKFENCE.price", 8);
        conf.set("NETHERBRICKFENCE.floor", 2);
        conf.set("NETHERBRICKFENCE.ceiling", 12);
        conf.set("NETHERBRICKFENCE.description", "Stolen from the strongholds of hell!");
        conf.set("NETHERBRICKFENCE.stock", 50);
        conf.set("NETHERBRICKFENCE.spread", .11);
        conf.set("NETHERBRICKFENCE.buytime", 0);
        conf.set("NETHERBRICKFENCE.selltime", 0);

        conf.set("NETHERBRICKSTAIRS.velocity", .07);
        conf.set("NETHERBRICKSTAIRS.id", 114);
        conf.set("NETHERBRICKSTAIRS.price", 8);
        conf.set("NETHERBRICKSTAIRS.floor", 2);
        conf.set("NETHERBRICKSTAIRS.ceiling", 12);
        conf.set("NETHERBRICKSTAIRS.description", "Stolen from the strongholds of hell!");
        conf.set("NETHERBRICKSTAIRS.stock", 50);
        conf.set("NETHERBRICKSTAIRS.spread", .07);
        conf.set("NETHERBRICKSTAIRS.buytime", 0);
        conf.set("NETHERBRICKSTAIRS.selltime", 0);

        conf.set("ENCHANTMENTTABLE.velocity", 1.5);
        conf.set("ENCHANTMENTTABLE.id", 116);
        conf.set("ENCHANTMENTTABLE.price", 1625);
        conf.set("ENCHANTMENTTABLE.floor", 1300);
        conf.set("ENCHANTMENTTABLE.ceiling", 1900);
        conf.set("ENCHANTMENTTABLE.description", "Used to enchant tools and armor!");
        conf.set("ENCHANTMENTTABLE.stock", 50);
        conf.set("ENCHANTMENTTABLE.spread", 1.5);
        conf.set("ENCHANTMENTTABLE.buytime", 0);
        conf.set("ENCHANTMENTTABLE.selltime", 0);

        conf.set("ENDSTONE.velocity", .3);
        conf.set("ENDSTONE.id", 121);
        conf.set("ENDSTONE.price", 50);
        conf.set("ENDSTONE.floor", 20);
        conf.set("ENDSTONE.ceiling", 80);
        conf.set("ENDSTONE.description", "Straight from The End!");
        conf.set("ENDSTONE.stock", 50);
        conf.set("ENDSTONE.spread", 1.5);
        conf.set("ENDSTONE.buytime", 0);
        conf.set("ENDSTONE.selltime", 0);

        conf.set("DRAGONEGG.velocity", .3);
        conf.set("DRAGONEGG.id", 122);
        conf.set("DRAGONEGG.price", 50);
        conf.set("DRAGONEGG.floor", 20);
        conf.set("DRAGONEGG.ceiling", 80);
        conf.set("DRAGONEGG.description", "The hatchling for a dragon.");
        conf.set("DRAGONEGG.stock", 50);
        conf.set("DRAGONEGG.spread", 1.5);
        conf.set("DRAGONEGG.buytime", 0);
        conf.set("DRAGONEGG.selltime", 0);

        conf.set("REDSTONELAMP.velocity", .09);
        conf.set("REDSTONELAMP.id", 123);
        conf.set("REDSTONELAMP.price", 20);
        conf.set("REDSTONELAMP.floor", 2);
        conf.set("REDSTONELAMP.ceiling", 50);
        conf.set("REDSTONELAMP.description", "Finally, a lamp with a simple lightswitch!");
        conf.set("REDSTONELAMP.stock", 50);
        conf.set("REDSTONELAMP.spread", 1.5);
        conf.set("REDSTONELAMP.buytime", 0);
        conf.set("REDSTONELAMP.selltime", 0);

        conf.set("SANDSTONESTAIRS.velocity", .02);
        conf.set("SANDSTONESTAIRS.id", 128);
        conf.set("SANDSTONESTAIRS.price", .5);
        conf.set("SANDSTONESTAIRS.floor", .1);
        conf.set("SANDSTONESTAIRS.ceiling", 3);
        conf.set("SANDSTONESTAIRS.description", "Stairs of sand?");
        conf.set("SANDSTONESTAIRS.stock", 50);
        conf.set("SANDSTONESTAIRS.spread", .01);
        conf.set("SANDSTONESTAIRS.buytime", 0);
        conf.set("SANDSTONESTAIRS.selltime", 0);

        conf.set("BREWINGSTAND.velocity", .45);
        conf.set("BREWINGSTAND.id", 379);
        conf.set("BREWINGSTAND.price", 155);
        conf.set("BREWINGSTAND.floor", 100);
        conf.set("BREWINGSTAND.ceiling", 200);
        conf.set("BREWINGSTAND.description", "Used to make potions!");
        conf.set("BREWINGSTAND.stock", 50);
        conf.set("BREWINGSTAND.spread", .45);
        conf.set("BREWINGSTAND.buytime", 0);
        conf.set("BREWINGSTAND.selltime", 0);

        conf.set("CAULDRON.velocity", .25);
        conf.set("CAULDRON.id", 380);
        conf.set("CAULDRON.price", 350);
        conf.set("CAULDRON.floor", 250);
        conf.set("CAULDRON.ceiling", 450);
        conf.set("CAULDRON.description", "Holds water for potion-making!");
        conf.set("CAULDRON.stock", 50);
        conf.set("CAULDRON.spread", .25);
        conf.set("CAULDRON.buytime", 0);
        conf.set("CAULDRON.selltime", 0);

        conf.set("IRONSHOVEL.velocity", .8);
        conf.set("IRONSHOVEL.id", 256);
        conf.set("IRONSHOVEL.price", 51);
        conf.set("IRONSHOVEL.floor", 40);
        conf.set("IRONSHOVEL.ceiling", 60);
        conf.set("IRONSHOVEL.description", "Digging with iron!");
        conf.set("IRONSHOVEL.stock", 50);
        conf.set("IRONSHOVEL.spread", .8);
        conf.set("IRONSHOVEL.buytime", 0);
        conf.set("IRONSHOVEL.selltime", 0);

        conf.set("IRONPICKAXE.velocity", 1.1);
        conf.set("IRONPICKAXE.id", 257);
        conf.set("IRONPICKAXE.price", 151);
        conf.set("IRONPICKAXE.floor", 130);
        conf.set("IRONPICKAXE.ceiling", 170);
        conf.set("IRONPICKAXE.description", "Mining with iron!");
        conf.set("IRONPICKAXE.stock", 50);
        conf.set("IRONPICKAXE.spread", 1.1);
        conf.set("IRONPICKAXE.buytime", 0);
        conf.set("IRONPICKAXE.selltime", 0);

        conf.set("IRONAXE.velocity", .9);
        conf.set("IRONAXE.id", 258);
        conf.set("IRONAXE.price", 101);
        conf.set("IRONAXE.floor", 80);
        conf.set("IRONAXE.ceiling", 120);
        conf.set("IRONAXE.description", "Cutting with iron!");
        conf.set("IRONAXE.stock", 50);
        conf.set("IRONAXE.spread", .9);
        conf.set("IRONAXE.buytime", 0);
        conf.set("IRONAXE.selltime", 0);

        conf.set("FLINTANDSTEEL.velocity", .001);
        conf.set("FLINTANDSTEEL.id", 259);
        conf.set("FLINTANDSTEEL.price", 62);
        conf.set("FLINTANDSTEEL.floor", 40);
        conf.set("FLINTANDSTEEL.ceiling", 80);
        conf.set("FLINTANDSTEEL.description", "Best friend to an Arsonist!");
        conf.set("FLINTANDSTEEL.stock", 50);
        conf.set("FLINTANDSTEEL.spread", .001);
        conf.set("FLINTANDSTEEL.buytime", 0);
        conf.set("FLINTANDSTEEL.selltime", 0);

        conf.set("APPLE.velocity", .8);
        conf.set("APPLE.id", 260);
        conf.set("APPLE.price", 150);
        conf.set("APPLE.floor", 100);
        conf.set("APPLE.ceiling", 300);
        conf.set("APPLE.description", "A delicious fruit!");
        conf.set("APPLE.stock", 50);
        conf.set("APPLE.spread", .8);
        conf.set("APPLE.buytime", 0);
        conf.set("APPLE.selltime", 0);

        conf.set("BOW.velocity", .1);
        conf.set("BOW.id", 261);
        conf.set("BOW.price", 5);
        conf.set("BOW.floor", 2);
        conf.set("BOW.ceiling", 25);
        conf.set("BOW.description", "Kill your opponents from far away!");
        conf.set("BOW.stock", 50);
        conf.set("BOW.spread", .1);
        conf.set("BOW.buytime", 0);
        conf.set("BOW.selltime", 0);

        conf.set("ARROW.velocity", .14);
        conf.set("ARROW.id", 262);
        conf.set("ARROW.price", 4);
        conf.set("ARROW.floor", 1);
        conf.set("ARROW.ceiling", 10);
        conf.set("ARROW.description", "Ammo for your bow!");
        conf.set("ARROW.stock", 50);
        conf.set("ARROW.spread", .14);
        conf.set("ARROW.buytime", 0);
        conf.set("ARROW.selltime", 0);

        conf.set("COAL.velocity", .09);
        conf.set("COAL.id", 263);
        conf.set("COAL.price", 10);
        conf.set("COAL.floor", 1);
        conf.set("COAL.ceiling", 30);
        conf.set("COAL.description", "Good for burning!");
        conf.set("COAL.stock", 50);
        conf.set("COAL.spread", .09);
        conf.set("COAL.buytime", 0);
        conf.set("COAL.selltime", 0);

        conf.set("CHARCOAL.velocity", .09);
        conf.set("CHARCOAL.id", 263001);
        conf.set("CHARCOAL.price", 10);
        conf.set("CHARCOAL.floor", 1);
        conf.set("CHARCOAL.ceiling", 30);
        conf.set("CHARCOAL.description", "Good for burning!");
        conf.set("CHARCOAL.stock", 50);
        conf.set("CHARCOAL.spread", .09);
        conf.set("CHARCOAL.buytime", 0);
        conf.set("CHARCOAL.selltime", 0);

        conf.set("DIAMOND.velocity", 2.9);
        conf.set("DIAMOND.id", 264);
        conf.set("DIAMOND.price", 600);
        conf.set("DIAMOND.floor", 450);
        conf.set("DIAMOND.ceiling", 900);
        conf.set("DIAMOND.description", "The most precious jewel of them all!");
        conf.set("DIAMOND.stock", 50);
        conf.set("DIAMOND.spread", 2.9);
        conf.set("DIAMOND.buytime", 0);
        conf.set("DIAMOND.selltime", 0);

        conf.set("IRONINGOT.velocity", .12);
        conf.set("IRONINGOT.id", 265);
        conf.set("IRONINGOT.price", 50);
        conf.set("IRONINGOT.floor", 30);
        conf.set("IRONINGOT.ceiling", 80);
        conf.set("IRONINGOT.description", "Tough as steel!");
        conf.set("IRONINGOT.stock", 50);
        conf.set("IRONINGOT.spread", .12);
        conf.set("IRONINGOT.buytime", 0);
        conf.set("IRONINGOT.selltime", 0);

        conf.set("GOLDINGOT.velocity", .19);
        conf.set("GOLDINGOT.id", 266);
        conf.set("GOLDINGOT.price", 300);
        conf.set("GOLDINGOT.floor", 250);
        conf.set("GOLDINGOT.ceiling", 400);
        conf.set("GOLDINGOT.description", "Prettiest metal ever!");
        conf.set("GOLDINGOT.stock", 50);
        conf.set("GOLDINGOT.spread", .19);
        conf.set("GOLDINGOT.buytime", 0);
        conf.set("GOLDINGOT.selltime", 0);

        conf.set("IRONSWORD.velocity", .29);
        conf.set("IRONSWORD.id", 267);
        conf.set("IRONSWORD.price", 101);
        conf.set("IRONSWORD.floor", 80);
        conf.set("IRONSWORD.ceiling", 120);
        conf.set("IRONSWORD.description", "Fight with Iron!");
        conf.set("IRONSWORD.stock", 50);
        conf.set("IRONSWORD.spread", .29);
        conf.set("IRONSWORD.buytime", 0);
        conf.set("IRONSWORD.selltime", 0);

        conf.set("WOODENSWORD.velocity", .009);
        conf.set("WOODENSWORD.id", 268);
        conf.set("WOODENSWORD.price", .5);
        conf.set("WOODENSWORD.floor", .3);
        conf.set("WOODENSWORD.ceiling", .8);
        conf.set("WOODENSWORD.description", "A weak sword made of wood!");
        conf.set("WOODENSWORD.stock", 50);
        conf.set("WOODENSWORD.spread", .009);
        conf.set("WOODENSWORD.buytime", 0);
        conf.set("WOODENSWORD.selltime", 0);

        conf.set("WOODENSHOVEL.velocity", .009);
        conf.set("WOODENSHOVEL.id", 269);
        conf.set("WOODENSHOVEL.price", .3);
        conf.set("WOODENSHOVEL.floor", .1);
        conf.set("WOODENSHOVEL.ceiling", .5);
        conf.set("WOODENSHOVEL.description", "Not a very reliable shovel!");
        conf.set("WOODENSHOVEL.stock", 50);
        conf.set("WOODENSHOVEL.spread", .009);
        conf.set("WOODENSHOVEL.buytime", 0);
        conf.set("WOODENSHOVEL.selltime", 0);

        conf.set("WOODENPICKAXE.velocity", .009);
        conf.set("WOODENPICKAXE.id", 270);
        conf.set("WOODENPICKAXE.price", .7);
        conf.set("WOODENPICKAXE.floor", .5);
        conf.set("WOODENPICKAXE.ceiling", .9);
        conf.set("WOODENPICKAXE.description", "I'm not sure if this can break stone..!");
        conf.set("WOODENPICKAXE.stock", 50);
        conf.set("WOODENPICKAXE.spread", .009);
        conf.set("WOODENPICKAXE.buytime", 0);
        conf.set("WOODENPICKAXE.selltime", 0);

        conf.set("WOODENAXE.velocity", .009);
        conf.set("WOODENAXE.id", 271);
        conf.set("WOODENAXE.price", .5);
        conf.set("WOODENAXE.floor", .3);
        conf.set("WOODENAXE.ceiling", .7);
        conf.set("WOODENAXE.description", "Wood on wood cutting!!");
        conf.set("WOODENAXE.stock", 50);
        conf.set("WOODENAXE.spread", .009);
        conf.set("WOODENAXE.buytime", 0);
        conf.set("WOODENAXE.selltime", 0);

        conf.set("STONESWORD.velocity", .03);
        conf.set("STONESWORD.id", 272);
        conf.set("STONESWORD.price", 1);
        conf.set("STONESWORD.floor", .5);
        conf.set("STONESWORD.ceiling", 1.5);
        conf.set("STONESWORD.description", "A sword of stone!");
        conf.set("STONESWORD.stock", 50);
        conf.set("STONESWORD.spread", .03);
        conf.set("STONESWORD.buytime", 0);
        conf.set("STONESWORD.selltime", 0);

        conf.set("STONESHOVEL.velocity", .03);
        conf.set("STONESHOVEL.id", 273);
        conf.set("STONESHOVEL.price", .6);
        conf.set("STONESHOVEL.floor", .3);
        conf.set("STONESHOVEL.ceiling", .9);
        conf.set("STONESHOVEL.description", "A shovel of stone!");
        conf.set("STONESHOVEL.stock", 50);
        conf.set("STONESHOVEL.spread", .03);
        conf.set("STONESHOVEL.buytime", 0);
        conf.set("STONESHOVEL.selltime", 0);

        conf.set("STONEPICKAXE.velocity", .03);
        conf.set("STONEPICKAXE.id", 274);
        conf.set("STONEPICKAXE.price", 1.4);
        conf.set("STONEPICKAXE.floor", .7);
        conf.set("STONEPICKAXE.ceiling", 2.1);
        conf.set("STONEPICKAXE.description", "Stone on Stone mining!");
        conf.set("STONEPICKAXE.stock", 50);
        conf.set("STONEPICKAXE.spread", .03);
        conf.set("STONEPICKAXE.buytime", 0);
        conf.set("STONEPICKAXE.selltime", 0);

        conf.set("STONEAXE.velocity", .03);
        conf.set("STONEAXE.id", 275);
        conf.set("STONEAXE.price", 1);
        conf.set("STONEAXE.floor", .5);
        conf.set("STONEAXE.ceiling", 1.5);
        conf.set("STONEAXE.description", "An axe of stone!");
        conf.set("STONEAXE.stock", 50);
        conf.set("STONEAXE.spread", .03);
        conf.set("STONEAXE.buytime", 0);
        conf.set("STONEAXE.selltime", 0);

        conf.set("DIAMONDSWORD.velocity", 9.3);
        conf.set("DIAMONDSWORD.id", 276);
        conf.set("DIAMONDSWORD.price", 1220);
        conf.set("DIAMONDSWORD.floor", 1100);
        conf.set("DIAMONDSWORD.ceiling", 1300);
        conf.set("DIAMONDSWORD.description", "Kill your enemies with DIAMOND!");
        conf.set("DIAMONDSWORD.stock", 50);
        conf.set("DIAMONDSWORD.spread", 9.3);
        conf.set("DIAMONDSWORD.buytime", 0);
        conf.set("DIAMONDSWORD.selltime", 0);

        conf.set("DIAMONDSHOVEL.velocity", 9.3);
        conf.set("DIAMONDSHOVEL.id", 277);
        conf.set("DIAMONDSHOVEL.price", 620);
        conf.set("DIAMONDSHOVEL.floor", 480);
        conf.set("DIAMONDSHOVEL.ceiling", 700);
        conf.set("DIAMONDSHOVEL.description", "Dirt and diamond, a nasty combo!");
        conf.set("DIAMONDSHOVEL.stock", 50);
        conf.set("DIAMONDSHOVEL.spread", 9.3);
        conf.set("DIAMONDSHOVEL.buytime", 0);
        conf.set("DIAMONDSHOVEL.selltime", 0);

        conf.set("DIAMONDPICKAXE.velocity", 12.2);
        conf.set("DIAMONDPICKAXE.id", 278);
        conf.set("DIAMONDPICKAXE.price", 1820);
        conf.set("DIAMONDPICKAXE.floor", 1600);
        conf.set("DIAMONDPICKAXE.ceiling", 1900);
        conf.set("DIAMONDPICKAXE.description", "Breaks through anything!");
        conf.set("DIAMONDPICKAXE.stock", 50);
        conf.set("DIAMONDPICKAXE.spread", 12.2);
        conf.set("DIAMONDPICKAXE.buytime", 0);
        conf.set("DIAMONDPICKAXE.selltime", 0);

        conf.set("DIAMONDAXE.velocity", 9.3);
        conf.set("DIAMONDAXE.id", 279);
        conf.set("DIAMONDAXE.price", 620);
        conf.set("DIAMONDAXE.floor", 480);
        conf.set("DIAMONDAXE.ceiling", 700);
        conf.set("DIAMONDAXE.description", "Cuts through anything!");
        conf.set("DIAMONDAXE.stock", 50);
        conf.set("DIAMONDAXE.spread", 9.3);
        conf.set("DIAMONDAXE.buytime", 0);
        conf.set("DIAMONDAXE.selltime", 0);

        conf.set("STICK.velocity", .003);
        conf.set("STICK.id", 280);
        conf.set("STICK.price", .05);
        conf.set("STICK.floor", .01);
        conf.set("STICK.ceiling", .1);
        conf.set("STICK.description", "Just a wooden stick!");
        conf.set("STICK.stock", 50);
        conf.set("STICK.spread", .003);
        conf.set("STICK.buytime", 0);
        conf.set("STICK.selltime", 0);

        conf.set("BOWL.velocity", .003);
        conf.set("BOWL.id", 281);
        conf.set("BOWL.price", .15);
        conf.set("BOWL.floor", .05);
        conf.set("BOWL.ceiling", .4);
        conf.set("BOWL.description", "A bowl.. for soup!");
        conf.set("BOWL.stock", 50);
        conf.set("BOWL.spread", .003);
        conf.set("BOWL.buytime", 0);
        conf.set("BOWL.selltime", 0);

        conf.set("MUSHROOMSOUP.velocity", .04);
        conf.set("MUSHROOMSOUP.id", 282);
        conf.set("MUSHROOMSOUP.price", 1.25);
        conf.set("MUSHROOMSOUP.floor", .7);
        conf.set("MUSHROOMSOUP.ceiling", 2);
        conf.set("MUSHROOMSOUP.description", "Shroom soup!");
        conf.set("MUSHROOMSOUP.stock", 50);
        conf.set("MUSHROOMSOUP.spread", .04);
        conf.set("MUSHROOMSOUP.buytime", 0);
        conf.set("MUSHROOMSOUP.selltime", 0);

        conf.set("GOLDSWORD.velocity", 5.6);
        conf.set("GOLDSWORD.id", 283);
        conf.set("GOLDSWORD.price", 600);
        conf.set("GOLDSWORD.floor", 400);
        conf.set("GOLDSWORD.ceiling", 800);
        conf.set("GOLDSWORD.description", "Effective, but short-lived!");
        conf.set("GOLDSWORD.stock", 50);
        conf.set("GOLDSWORD.spread", 5.6);
        conf.set("GOLDSWORD.buytime", 0);
        conf.set("GOLDSWORD.selltime", 0);

        conf.set("GOLDSHOVEL.velocity", 5.6);
        conf.set("GOLDSHOVEL.id", 284);
        conf.set("GOLDSHOVEL.price", 300);
        conf.set("GOLDSHOVEL.floor", 200);
        conf.set("GOLDSHOVEL.ceiling", 400);
        conf.set("GOLDSHOVEL.description", "Effective, but short-lived!");
        conf.set("GOLDSHOVEL.stock", 50);
        conf.set("GOLDSHOVEL.spread", 5.6);
        conf.set("GOLDSHOVEL.buytime", 0);
        conf.set("GOLDSHOVEL.selltime", 0);

        conf.set("GOLDPICKAXE.velocity", 5.6);
        conf.set("GOLDPICKAXE.id", 285);
        conf.set("GOLDPICKAXE.price", 900);
        conf.set("GOLDPICKAXE.floor", 850);
        conf.set("GOLDPICKAXE.ceiling", 1050);
        conf.set("GOLDPICKAXE.description", "Effective, but short-lived!");
        conf.set("GOLDPICKAXE.stock", 50);
        conf.set("GOLDPICKAXE.spread", 5.6);
        conf.set("GOLDPICKAXE.buytime", 0);
        conf.set("GOLDPICKAXE.selltime", 0);

        conf.set("GOLDAXE.velocity", 5.6);
        conf.set("GOLDAXE.id", 286);
        conf.set("GOLDAXE.price", 600);
        conf.set("GOLDAXE.floor", 500);
        conf.set("GOLDAXE.ceiling", 700);
        conf.set("GOLDAXE.description", "Effective, but short-lived!");
        conf.set("GOLDAXE.stock", 50);
        conf.set("GOLDAXE.spread", 5.6);
        conf.set("GOLDAXE.buytime", 0);
        conf.set("GOLDAXE.selltime", 0);

        conf.set("STRING.velocity", .16);
        conf.set("STRING.id", 287);
        conf.set("STRING.price", 10);
        conf.set("STRING.floor", 5);
        conf.set("STRING.ceiling", 20);
        conf.set("STRING.description", "String from spiders!");
        conf.set("STRING.stock", 50);
        conf.set("STRING.spread", .16);
        conf.set("STRING.buytime", 0);
        conf.set("STRING.selltime", 0);

        conf.set("FEATHER.velocity", .16);
        conf.set("FEATHER.id", 288);
        conf.set("FEATHER.price", 10);
        conf.set("FEATHER.floor", 5);
        conf.set("FEATHER.ceiling", 20);
        conf.set("FEATHER.description", "Feathers from...zombies?!");
        conf.set("FEATHER.stock", 50);
        conf.set("FEATHER.spread", .16);
        conf.set("FEATHER.buytime", 0);
        conf.set("FEATHER.selltime", 0);

        conf.set("GUNPOWDER.velocity", .32);
        conf.set("GUNPOWDER.id", 289);
        conf.set("GUNPOWDER.price", 20);
        conf.set("GUNPOWDER.floor", 10);
        conf.set("GUNPOWDER.ceiling", 40);
        conf.set("GUNPOWDER.description", "The heart of a creeper!");
        conf.set("GUNPOWDER.stock", 50);
        conf.set("GUNPOWDER.spread", .32);
        conf.set("GUNPOWDER.buytime", 0);
        conf.set("GUNPOWDER.selltime", 0);

        conf.set("WOODENHOE.velocity", .005);
        conf.set("WOODENHOE.id", 290);
        conf.set("WOODENHOE.price", .5);
        conf.set("WOODENHOE.floor", .3);
        conf.set("WOODENHOE.ceiling", .7);
        conf.set("WOODENHOE.description", "Till your farm, wood-style!");
        conf.set("WOODENHOE.stock", 50);
        conf.set("WOODENHOE.spread", .005);
        conf.set("WOODENHOE.buytime", 0);
        conf.set("WOODENHOE.selltime", 0);

        conf.set("STONEHOE.velocity", .01);
        conf.set("STONEHOE.id", 291);
        conf.set("STONEHOE.price", 1);
        conf.set("STONEHOE.floor", .5);
        conf.set("STONEHOE.ceiling", 1.5);
        conf.set("STONEHOE.description", "Till your farm, stone-style!");
        conf.set("STONEHOE.stock", 50);
        conf.set("STONEHOE.spread", .01);
        conf.set("STONEHOE.buytime", 0);
        conf.set("STONEHOE.selltime", 0);

        conf.set("IRONHOE.velocity", 1.9);
        conf.set("IRONHOE.id", 292);
        conf.set("IRONHOE.price", 101);
        conf.set("IRONHOE.floor", 80);
        conf.set("IRONHOE.ceiling", 120);
        conf.set("IRONHOE.description", "Till your farm, iron-style!");
        conf.set("IRONHOE.stock", 50);
        conf.set("IRONHOE.spread", 1.9);
        conf.set("IRONHOE.buytime", 0);
        conf.set("IRONHOE.selltime", 0);

        conf.set("DIAMONDHOE.velocity", 12.1);
        conf.set("DIAMONDHOE.id", 293);
        conf.set("DIAMONDHOE.price", 1200);
        conf.set("DIAMONDHOE.floor", 1000);
        conf.set("DIAMONDHOE.ceiling", 1400);
        conf.set("DIAMONDHOE.description", "Till your farm in excessive luxury!");
        conf.set("DIAMONDHOE.stock", 50);
        conf.set("DIAMONDHOE.spread", 12.1);
        conf.set("DIAMONDHOE.buytime", 0);
        conf.set("DIAMONDHOE.selltime", 0);

        conf.set("GOLDHOE.velocity", 7.9);
        conf.set("GOLDHOE.id", 294);
        conf.set("GOLDHOE.price", 600);
        conf.set("GOLDHOE.floor", 500);
        conf.set("GOLDHOE.ceiling", 600);
        conf.set("GOLDHOE.description", "Found on beaches!");
        conf.set("GOLDHOE.stock", 50);
        conf.set("GOLDHOE.spread", 7.9);
        conf.set("GOLDHOE.buytime", 0);
        conf.set("GOLDHOE.selltime", 0);

        conf.set("SEEDS.velocity", .01);
        conf.set("SEEDS.id", 295);
        conf.set("SEEDS.price", 1.2);
        conf.set("SEEDS.floor", .9);
        conf.set("SEEDS.ceiling", 1.5);
        conf.set("SEEDS.description", "Grows wheat!");
        conf.set("SEEDS.stock", 50);
        conf.set("SEEDS.spread", .01);
        conf.set("SEEDS.buytime", 0);
        conf.set("SEEDS.selltime", 0);

        conf.set("WHEAT.velocity", .07);
        conf.set("WHEAT.id", 296);
        conf.set("WHEAT.price", 3);
        conf.set("WHEAT.floor", 2);
        conf.set("WHEAT.ceiling", .4);
        conf.set("WHEAT.description", "Mmm, good for bread and cake!");
        conf.set("WHEAT.stock", 50);
        conf.set("WHEAT.spread", .07);
        conf.set("WHEAT.buytime", 0);
        conf.set("WHEAT.selltime", 0);

        conf.set("BREAD.velocity", .11);
        conf.set("BREAD.id", 297);
        conf.set("BREAD.price", 9);
        conf.set("BREAD.floor", 7);
        conf.set("BREAD.ceiling", 11);
        conf.set("BREAD.description", "Scrumptious carbohydrates!");
        conf.set("BREAD.stock", 50);
        conf.set("BREAD.spread", .11);
        conf.set("BREAD.buytime", 0);
        conf.set("BREAD.selltime", 0);

        conf.set("LEATHERCAP.velocity", .78);
        conf.set("LEATHERCAP.id", 298);
        conf.set("LEATHERCAP.price", 25);
        conf.set("LEATHERCAP.floor", 15);
        conf.set("LEATHERCAP.ceiling", 35);
        conf.set("LEATHERCAP.description", "A hat made of cow skin!");
        conf.set("LEATHERCAP.stock", 50);
        conf.set("LEATHERCAP.spread", .78);
        conf.set("LEATHERCAP.buytime", 0);
        conf.set("LEATHERCAP.selltime", 0);

        conf.set("LEATHERTUNIC.velocity", .8);
        conf.set("LEATHERTUNIC.id", 299);
        conf.set("LEATHERTUNIC.price", 50);
        conf.set("LEATHERTUNIC.floor", 40);
        conf.set("LEATHERTUNIC.ceiling", 60);
        conf.set("LEATHERTUNIC.description", "A shirt made of cow skin!");
        conf.set("LEATHERTUNIC.stock", 50);
        conf.set("LEATHERTUNIC.spread", .8);
        conf.set("LEATHERTUNIC.buytime", 0);
        conf.set("LEATHERTUNIC.selltime", 0);

        conf.set("LEATHERPANTS.velocity", .9);
        conf.set("LEATHERPANTS.id", 300);
        conf.set("LEATHERPANTS.price", 35);
        conf.set("LEATHERPANTS.floor", 25);
        conf.set("LEATHERPANTS.ceiling", 45);
        conf.set("LEATHERPANTS.description", "Pants made of cow skin!");
        conf.set("LEATHERPANTS.stock", 50);
        conf.set("LEATHERPANTS.spread", .9);
        conf.set("LEATHERPANTS.buytime", 0);
        conf.set("LEATHERPANTS.selltime", 0);

        conf.set("LEATHERBOOTS.velocity", 1);
        conf.set("LEATHERBOOTS.id", 301);
        conf.set("LEATHERBOOTS.price", 20);
        conf.set("LEATHERBOOTS.floor", 10);
        conf.set("LEATHERBOOTS.ceiling", 30);
        conf.set("LEATHERBOOTS.description", "Boots made of cow skin!");
        conf.set("LEATHERBOOTS.stock", 50);
        conf.set("LEATHERBOOTS.spread", 1);
        conf.set("LEATHERBOOTS.buytime", 0);
        conf.set("LEATHERBOOTS.selltime", 0);

        conf.set("CHAINMAILHELMET.velocity", 1);
        conf.set("CHAINMAILHELMET.id", 302);
        conf.set("CHAINMAILHELMET.price", 20);
        conf.set("CHAINMAILHELMET.floor", 10);
        conf.set("CHAINMAILHELMET.ceiling", 30);
        conf.set("CHAINMAILHELMET.description", "Legendary chainmail armor");
        conf.set("CHAINMAILHELMET.stock", 50);
        conf.set("CHAINMAILHELMET.spread", 1);
        conf.set("CHAINMAILHELMET.buytime", 0);
        conf.set("CHAINMAILHELMET.selltime", 0);

        conf.set("CHAINMAILCHESTPLATE.velocity", 1);
        conf.set("CHAINMAILCHESTPLATE.id", 303);
        conf.set("CHAINMAILCHESTPLATE.price", 20);
        conf.set("CHAINMAILCHESTPLATE.floor", 10);
        conf.set("CHAINMAILCHESTPLATE.ceiling", 30);
        conf.set("CHAINMAILCHESTPLATE.description", "Legendary chainmail armor");
        conf.set("CHAINMAILCHESTPLATE.stock", 50);
        conf.set("CHAINMAILCHESTPLATE.spread", 1);
        conf.set("CHAINMAILCHESTPLATE.buytime", 0);
        conf.set("CHAINMAILCHESTPLATE.selltime", 0);

        conf.set("CHAINMAILLEGGINGS.velocity", 1);
        conf.set("CHAINMAILLEGGINGS.id", 304);
        conf.set("CHAINMAILLEGGINGS.price", 20);
        conf.set("CHAINMAILLEGGINGS.floor", 10);
        conf.set("CHAINMAILLEGGINGS.ceiling", 30);
        conf.set("CHAINMAILLEGGINGS.description", "Legendary chainmail armor");
        conf.set("CHAINMAILLEGGINGS.stock", 50);
        conf.set("CHAINMAILLEGGINGS.spread", 1);
        conf.set("CHAINMAILLEGGINGS.buytime", 0);
        conf.set("CHAINMAILLEGGINGS.selltime", 0);

        conf.set("CHAINMAILBOOTS.velocity", 1);
        conf.set("CHAINMAILBOOTS.id", 305);
        conf.set("CHAINMAILBOOTS.price", 20);
        conf.set("CHAINMAILBOOTS.floor", 10);
        conf.set("CHAINMAILBOOTS.ceiling", 30);
        conf.set("CHAINMAILBOOTS.description", "Legendary chainmail armor");
        conf.set("CHAINMAILBOOTS.stock", 50);
        conf.set("CHAINMAILBOOTS.spread", 1);
        conf.set("CHAINMAILBOOTS.buytime", 0);
        conf.set("CHAINMAILBOOTS.selltime", 0);

        conf.set("IRONHELMET.velocity", 2.6);
        conf.set("IRONHELMET.id", 306);
        conf.set("IRONHELMET.price", 250);
        conf.set("IRONHELMET.floor", 200);
        conf.set("IRONHELMET.ceiling", 300);
        conf.set("IRONHELMET.description", "Ironhead!");
        conf.set("IRONHELMET.stock", 50);
        conf.set("IRONHELMET.spread", 2.6);
        conf.set("IRONHELMET.buytime", 0);
        conf.set("IRONHELMET.selltime", 0);

        conf.set("IRONCHESTPLATE.velocity", 3.6);
        conf.set("IRONCHESTPLATE.id", 307);
        conf.set("IRONCHESTPLATE.price", 400);
        conf.set("IRONCHESTPLATE.floor", 350);
        conf.set("IRONCHESTPLATE.ceiling", 450);
        conf.set("IRONCHESTPLATE.description", "IronTorso!");
        conf.set("IRONCHESTPLATE.stock", 50);
        conf.set("IRONCHESTPLATE.spread", 3.6);
        conf.set("IRONCHESTPLATE.buytime", 0);
        conf.set("IRONCHESTPLATE.selltime", 0);

        conf.set("IRONLEGGINGS.velocity", 3.9);
        conf.set("IRONLEGGINGS.id", 308);
        conf.set("IRONLEGGINGS.price", 350);
        conf.set("IRONLEGGINGS.floor", 275);
        conf.set("IRONLEGGINGS.ceiling", 475);
        conf.set("IRONLEGGINGS.description", "Ironlegs!");
        conf.set("IRONLEGGINGS.stock", 50);
        conf.set("IRONLEGGINGS.spread", 3.9);
        conf.set("IRONLEGGINGS.buytime", 0);
        conf.set("IRONLEGGINGS.selltime", 0);

        conf.set("IRONBOOTS.velocity", 4.6);
        conf.set("IRONBOOTS.id", 309);
        conf.set("IRONBOOTS.price", 200);
        conf.set("IRONBOOTS.floor", 150);
        conf.set("IRONBOOTS.ceiling", 250);
        conf.set("IRONBOOTS.description", "IronFeet!");
        conf.set("IRONBOOTS.stock", 50);
        conf.set("IRONBOOTS.spread", 4.6);
        conf.set("IRONBOOTS.buytime", 0);
        conf.set("IRONBOOTS.selltime", 0);

        conf.set("DIAMONDHELMET.velocity", 23.9);
        conf.set("DIAMONDHELMET.id", 310);
        conf.set("DIAMONDHELMET.price", 3000);
        conf.set("DIAMONDHELMET.floor", 2400);
        conf.set("DIAMONDHELMET.ceiling", 3600);
        conf.set("DIAMONDHELMET.description", "Flashiest helmet around!");
        conf.set("DIAMONDHELMET.stock", 50);
        conf.set("DIAMONDHELMET.spread", 23.9);
        conf.set("DIAMONDHELMET.buytime", 0);
        conf.set("DIAMONDHELMET.selltime", 0);

        conf.set("DIAMONDCHESTPLATE.velocity", 59.1);
        conf.set("DIAMONDCHESTPLATE.id", 311);
        conf.set("DIAMONDCHESTPLATE.price", 4800);
        conf.set("DIAMONDCHESTPLATE.floor", 4200);
        conf.set("DIAMONDCHESTPLATE.ceiling", 5600);
        conf.set("DIAMONDCHESTPLATE.description", "Flashiest chestplate around!");
        conf.set("DIAMONDCHESTPLATE.stock", 50);
        conf.set("DIAMONDCHESTPLATE.spread", 59.1);
        conf.set("DIAMONDCHESTPLATE.buytime", 0);
        conf.set("DIAMONDCHESTPLATE.selltime", 0);

        conf.set("DIAMONDLEGGINGS.velocity", 49.2);
        conf.set("DIAMONDLEGGINGS.id", 312);
        conf.set("DIAMONDLEGGINGS.price", 4200);
        conf.set("DIAMONDLEGGINGS.floor", 3500);
        conf.set("DIAMONDLEGGINGS.ceiling", 5000);
        conf.set("DIAMONDLEGGINGS.description", "Flashiest leggings around!");
        conf.set("DIAMONDLEGGINGS.stock", 50);
        conf.set("DIAMONDLEGGINGS.spread", 49.2);
        conf.set("DIAMONDLEGGINGS.buytime", 0);
        conf.set("DIAMONDLEGGINGS.selltime", 0);

        conf.set("DIAMONDBOOTS.velocity", 26.3);
        conf.set("DIAMONDBOOTS.id", 313);
        conf.set("DIAMONDBOOTS.price", 2400);
        conf.set("DIAMONDBOOTS.floor", 2000);
        conf.set("DIAMONDBOOTS.ceiling", 2800);
        conf.set("DIAMONDBOOTS.description", "Flashiest boots around!");
        conf.set("DIAMONDBOOTS.stock", 50);
        conf.set("DIAMONDBOOTS.spread", 26.3);
        conf.set("DIAMONDBOOTS.buytime", 0);
        conf.set("DIAMONDBOOTS.selltime", 0);

        conf.set("GOLDHELMET.velocity", 28.4);
        conf.set("GOLDHELMET.id", 314);
        conf.set("GOLDHELMET.price", 1500);
        conf.set("GOLDHELMET.floor", 1250);
        conf.set("GOLDHELMET.ceiling", 1750);
        conf.set("GOLDHELMET.description", "14K Helmet!");
        conf.set("GOLDHELMET.stock", 50);
        conf.set("GOLDHELMET.spread", 28.4);
        conf.set("GOLDHELMET.buytime", 0);
        conf.set("GOLDHELMET.selltime", 0);

        conf.set("GOLDCHESTPLATE.velocity", 39.1);
        conf.set("GOLDCHESTPLATE.id", 315);
        conf.set("GOLDCHESTPLATE.price", 4000);
        conf.set("GOLDCHESTPLATE.floor", 3750);
        conf.set("GOLDCHESTPLATE.ceiling", 4250);
        conf.set("GOLDCHESTPLATE.description", "20K Chestplate!");
        conf.set("GOLDCHESTPLATE.stock", 50);
        conf.set("GOLDCHESTPLATE.spread", 39.1);
        conf.set("GOLDCHESTPLATE.buytime", 0);
        conf.set("GOLDCHESTPLATE.selltime", 0);

        conf.set("GOLDLEGGINGS.velocity", 23.6);
        conf.set("GOLDLEGGINGS.id", 316);
        conf.set("GOLDLEGGINGS.price", 3500);
        conf.set("GOLDLEGGINGS.floor", 3250);
        conf.set("GOLDLEGGINGS.ceiling", 3750);
        conf.set("GOLDLEGGINGS.description", "24K Leggings!");
        conf.set("GOLDLEGGINGS.stock", 50);
        conf.set("GOLDLEGGINGS.spread", 23.6);
        conf.set("GOLDLEGGINGS.buytime", 0);
        conf.set("GOLDLEGGINGS.selltime", 0);

        conf.set("GOLDBOOTS.velocity", 29.3);
        conf.set("GOLDBOOTS.id", 317);
        conf.set("GOLDBOOTS.price", 2000);
        conf.set("GOLDBOOTS.floor", 1750);
        conf.set("GOLDBOOTS.ceiling", 2250);
        conf.set("GOLDBOOTS.description", "Boots, now in White Gold!");
        conf.set("GOLDBOOTS.stock", 50);
        conf.set("GOLDBOOTS.spread", 29.3);
        conf.set("GOLDBOOTS.buytime", 0);
        conf.set("GOLDBOOTS.selltime", 0);

        conf.set("FLINT.velocity", .6);
        conf.set("FLINT.id", 318);
        conf.set("FLINT.price", 5);
        conf.set("FLINT.floor", 1);
        conf.set("FLINT.ceiling", 20);
        conf.set("FLINT.description", "This has a purpose..?");
        conf.set("FLINT.stock", 50);
        conf.set("FLINT.spread", .6);
        conf.set("FLINT.buytime", 0);
        conf.set("FLINT.selltime", 0);

        conf.set("RAWPORKCHOP.velocity", .4);
        conf.set("RAWPORKCHOP.id", 319);
        conf.set("RAWPORKCHOP.price", 6);
        conf.set("RAWPORKCHOP.floor", 3);
        conf.set("RAWPORKCHOP.ceiling", 9);
        conf.set("RAWPORKCHOP.description", "Mmm, Piggy!");
        conf.set("RAWPORKCHOP.stock", 50);
        conf.set("RAWPORKCHOP.spread", .4);
        conf.set("RAWPORKCHOP.buytime", 0);
        conf.set("RAWPORKCHOP.selltime", 0);

        conf.set("COOKEDPORKCHOP.velocity", .4);
        conf.set("COOKEDPORKCHOP.id", 320);
        conf.set("COOKEDPORKCHOP.price", 8);
        conf.set("COOKEDPORKCHOP.floor", 5);
        conf.set("COOKEDPORKCHOP.ceiling", 15);
        conf.set("COOKEDPORKCHOP.description", "Mmm, Piggy read to eat!");
        conf.set("COOKEDPORKCHOP.stock", 50);
        conf.set("COOKEDPORKCHOP.spread", .4);
        conf.set("COOKEDPORKCHOP.buytime", 0);
        conf.set("COOKEDPORKCHOP.selltime", 0);

        conf.set("PAINTING.velocity", .5);
        conf.set("PAINTING.id", 321);
        conf.set("PAINTING.price", 12);
        conf.set("PAINTING.floor", 5);
        conf.set("PAINTING.ceiling", 20);
        conf.set("PAINTING.description", "Paintings by Notch Da Vinci himself!");
        conf.set("PAINTING.stock", 50);
        conf.set("PAINTING.spread", .5);
        conf.set("PAINTING.buytime", 0);
        conf.set("PAINTING.selltime", 0);

        conf.set("GOLDENAPPLE.velocity", 231.4);
        conf.set("GOLDENAPPLE.id", 322);
        conf.set("GOLDENAPPLE.price", 21750);
        conf.set("GOLDENAPPLE.floor", 5000);
        conf.set("GOLDENAPPLE.ceiling", 30000);
        conf.set("GOLDENAPPLE.description", "An apple of GOLD. Rather hard to consume!");
        conf.set("GOLDENAPPLE.stock", 50);
        conf.set("GOLDENAPPLE.spread", 231.4);
        conf.set("GOLDENAPPLE.buytime", 0);
        conf.set("GOLDENAPPLE.selltime", 0);

        conf.set("SIGN.velocity", .25);
        conf.set("SIGN.id", 323);
        conf.set("SIGN.price", 4);
        conf.set("SIGN.floor", 2);
        conf.set("SIGN.ceiling", 10);
        conf.set("SIGN.description", "Used to write meaningful information!");
        conf.set("SIGN.stock", 50);
        conf.set("SIGN.spread", .25);
        conf.set("SIGN.buytime", 0);
        conf.set("SIGN.selltime", 0);

        conf.set("WOODENDOOR.velocity", .05);
        conf.set("WOODENDOOR.id", 324);
        conf.set("WOODENDOOR.price", 1.5);
        conf.set("WOODENDOOR.floor", 1);
        conf.set("WOODENDOOR.ceiling", 5);
        conf.set("WOODENDOOR.description", "A door of wood!");
        conf.set("WOODENDOOR.stock", 50);
        conf.set("WOODENDOOR.spread", .05);
        conf.set("WOODENDOOR.buytime", 0);
        conf.set("WOODENDOOR.selltime", 0);

        conf.set("BUCKET.velocity", 1.4);
        conf.set("BUCKET.id", 325);
        conf.set("BUCKET.price", 150);
        conf.set("BUCKET.floor", 100);
        conf.set("BUCKET.ceiling", 200);
        conf.set("BUCKET.description", "A bucket for holding liquids.. or plasmas!");
        conf.set("BUCKET.stock", 50);
        conf.set("BUCKET.spread", 1.4);
        conf.set("BUCKET.buytime", 0);
        conf.set("BUCKET.selltime", 0);

        conf.set("WATERBUCKET.velocity", 2.1);
        conf.set("WATERBUCKET.id", 326);
        conf.set("WATERBUCKET.price", 155);
        conf.set("WATERBUCKET.floor", 130);
        conf.set("WATERBUCKET.ceiling", 180);
        conf.set("WATERBUCKET.description", "A bucket, with free water!");
        conf.set("WATERBUCKET.stock", 50);
        conf.set("WATERBUCKET.spread", 2.1);
        conf.set("WATERBUCKET.buytime", 0);
        conf.set("WATERBUCKET.selltime", 0);

        conf.set("LAVABUCKET.velocity", 3.1);
        conf.set("LAVABUCKET.id", 327);
        conf.set("LAVABUCKET.price", 160);
        conf.set("LAVABUCKET.floor", 140);
        conf.set("LAVABUCKET.ceiling", 180);
        conf.set("LAVABUCKET.description", "A bucket, with free molten death!");
        conf.set("LAVABUCKET.stock", 50);
        conf.set("LAVABUCKET.spread", 3.1);
        conf.set("LAVABUCKET.buytime", 0);
        conf.set("LAVABUCKET.selltime", 0);

        conf.set("MINECART.velocity", 1.6);
        conf.set("MINECART.id", 328);
        conf.set("MINECART.price", 250);
        conf.set("MINECART.floor", 200);
        conf.set("MINECART.ceiling", 400);
        conf.set("MINECART.description", "Takes you places!");
        conf.set("MINECART.stock", 50);
        conf.set("MINECART.spread", 1.6);
        conf.set("MINECART.buytime", 0);
        conf.set("MINECART.selltime", 0);

        conf.set("SADDLE.velocity", 3.7);
        conf.set("SADDLE.id", 329);
        conf.set("SADDLE.price", 1000);
        conf.set("SADDLE.floor", 800);
        conf.set("SADDLE.ceiling", 1200);
        conf.set("SADDLE.description", "Used to ride piggies!");
        conf.set("SADDLE.stock", 50);
        conf.set("SADDLE.spread", 3.7);
        conf.set("SADDLE.buytime", 0);
        conf.set("SADDLE.selltime", 0);

        conf.set("IRONDOOR.velocity", 1.9);
        conf.set("IRONDOOR.id", 330);
        conf.set("IRONDOOR.price", 300);
        conf.set("IRONDOOR.floor", 260);
        conf.set("IRONDOOR.ceiling", 340);
        conf.set("IRONDOOR.description", "Burglars won't be able to open this badboy!");
        conf.set("IRONDOOR.stock", 50);
        conf.set("IRONDOOR.spread", 1.9);
        conf.set("IRONDOOR.buytime", 0);
        conf.set("IRONDOOR.selltime", 0);

        conf.set("REDSTONE.velocity", .01);
        conf.set("REDSTONE.id", 331);
        conf.set("REDSTONE.price", 1);
        conf.set("REDSTONE.floor", .1);
        conf.set("REDSTONE.ceiling", 10);
        conf.set("REDSTONE.description", "Conducts power!");
        conf.set("REDSTONE.stock", 50);
        conf.set("REDSTONE.spread", .01);
        conf.set("REDSTONE.buytime", 0);
        conf.set("REDSTONE.selltime", 0);

        conf.set("SNOWBALL.velocity", .01);
        conf.set("SNOWBALL.id", 332);
        conf.set("SNOWBALL.price", 1);
        conf.set("SNOWBALL.floor", .1);
        conf.set("SNOWBALL.ceiling", 10);
        conf.set("SNOWBALL.description", "Conducts power!");
        conf.set("SNOWBALL.stock", 50);
        conf.set("SNOWBALL.spread", .01);
        conf.set("SNOWBALL.buytime", 0);
        conf.set("SNOWBALL.selltime", 0);

        conf.set("BOAT.velocity", .6);
        conf.set("BOAT.id", 333);
        conf.set("BOAT.price", 8);
        conf.set("BOAT.floor", 2);
        conf.set("BOAT.ceiling", 16);
        conf.set("BOAT.description", "Use this to ride the waves into newly generated land!");
        conf.set("BOAT.stock", 50);
        conf.set("BOAT.spread", .6);
        conf.set("BOAT.buytime", 0);
        conf.set("BOAT.selltime", 0);

        conf.set("LEATHER.velocity", .4);
        conf.set("LEATHER.id", 334);
        conf.set("LEATHER.price", 5);
        conf.set("LEATHER.floor", 2);
        conf.set("LEATHER.ceiling", 8);
        conf.set("LEATHER.description", "The skin of cattle!");
        conf.set("LEATHER.stock", 50);
        conf.set("LEATHER.spread", .4);
        conf.set("LEATHER.buytime", 0);
        conf.set("LEATHER.selltime", 0);

        conf.set("MILK.velocity", 3.6);
        conf.set("MILK.id", 335);
        conf.set("MILK.price", 180);
        conf.set("MILK.floor", 150);
        conf.set("MILK.ceiling", 200);
        conf.set("MILK.description", "White, creamy goodness!");
        conf.set("MILK.stock", 50);
        conf.set("MILK.spread", 3.6);
        conf.set("MILK.buytime", 0);
        conf.set("MILK.selltime", 0);

        conf.set("BRICK.velocity", .3);
        conf.set("BRICK.id", 336);
        conf.set("BRICK.price", 5);
        conf.set("BRICK.floor", 2);
        conf.set("BRICK.ceiling", 9);
        conf.set("BRICK.description", "A brick of hardened clay!");
        conf.set("BRICK.stock", 50);
        conf.set("BRICK.spread", .3);
        conf.set("BRICK.buytime", 0);
        conf.set("BRICK.selltime", 0);

        conf.set("CLAY.velocity", .25);
        conf.set("CLAY.id", 337);
        conf.set("CLAY.price", 4);
        conf.set("CLAY.floor", 1);
        conf.set("CLAY.ceiling", 9);
        conf.set("CLAY.description", "Moldable puddy!");
        conf.set("CLAY.stock", 50);
        conf.set("CLAY.spread", .25);
        conf.set("CLAY.buytime", 0);
        conf.set("CLAY.selltime", 0);

        conf.set("SUGARCANE.velocity", .03);
        conf.set("SUGARCANE.id", 338);
        conf.set("SUGARCANE.price", .6);
        conf.set("SUGARCANE.floor", .1);
        conf.set("SUGARCANE.ceiling", 3);
        conf.set("SUGARCANE.description", "Raw sugar!");
        conf.set("SUGARCANE.stock", 50);
        conf.set("SUGARCANE.spread", .03);
        conf.set("SUGARCANE.buytime", 0);
        conf.set("SUGARCANE.selltime", 0);

        conf.set("PAPER.velocity", .07);
        conf.set("PAPER.id", 339);
        conf.set("PAPER.price", 1.8);
        conf.set("PAPER.floor", .4);
        conf.set("PAPER.ceiling", 5);
        conf.set("PAPER.description", "Good for taking notes!");
        conf.set("PAPER.stock", 50);
        conf.set("PAPER.spread", .07);
        conf.set("PAPER.buytime", 0);
        conf.set("PAPER.selltime", 0);

        conf.set("BOOK.velocity", .09);
        conf.set("BOOK.id", 340);
        conf.set("BOOK.price", 5.4);
        conf.set("BOOK.floor", 2);
        conf.set("BOOK.ceiling", 9);
        conf.set("BOOK.description", "Good for reading.. except its blank!");
        conf.set("BOOK.stock", 50);
        conf.set("BOOK.spread", .09);
        conf.set("BOOK.buytime", 0);
        conf.set("BOOK.selltime", 0);

        conf.set("SLIMEBALL.velocity", .5);
        conf.set("SLIMEBALL.id", 341);
        conf.set("SLIMEBALL.price", 40);
        conf.set("SLIMEBALL.floor", 20);
        conf.set("SLIMEBALL.ceiling", 80);
        conf.set("SLIMEBALL.description", "A chunk of a slime!");
        conf.set("SLIMEBALL.stock", 50);
        conf.set("SLIMEBALL.spread", .5);
        conf.set("SLIMEBALL.buytime", 0);
        conf.set("SLIMEBALL.selltime", 0);

        conf.set("MINECARTWITHCHEST.velocity", 1.8);
        conf.set("MINECARTWITHCHEST.id", 342);
        conf.set("MINECARTWITHCHEST.price", 275);
        conf.set("MINECARTWITHCHEST.floor", 200);
        conf.set("MINECARTWITHCHEST.ceiling", 350);
        conf.set("MINECARTWITHCHEST.description", "Rapid transportation of items!");
        conf.set("MINECARTWITHCHEST.stock", 50);
        conf.set("MINECARTWITHCHEST.spread", 1.8);
        conf.set("MINECARTWITHCHEST.buytime", 0);
        conf.set("MINECARTWITHCHEST.selltime", 0);

        conf.set("MINECARTWITHFURNACE.velocity", 1.08);
        conf.set("MINECARTWITHFURNACE.id", 343);
        conf.set("MINECARTWITHFURNACE.price", .04);
        conf.set("MINECARTWITHFURNACE.floor", .001);
        conf.set("MINECARTWITHFURNACE.ceiling", .3);
        conf.set("MINECARTWITHFURNACE.description", "Choo Choo!");
        conf.set("MINECARTWITHFURNACE.stock", 50);
        conf.set("MINECARTWITHFURNACE.spread", 1.08);
        conf.set("MINECARTWITHFURNACE.buytime", 0);
        conf.set("MINECARTWITHFURNACE.selltime", 0);

        conf.set("EGG.velocity", .1);
        conf.set("EGG.id", 344);
        conf.set("EGG.price", 3);
        conf.set("EGG.floor", 1);
        conf.set("EGG.ceiling", 9);
        conf.set("EGG.description", "Right out of the chickens beh- you know.");
        conf.set("EGG.stock", 50);
        conf.set("EGG.spread", .1);
        conf.set("EGG.buytime", 0);
        conf.set("EGG.selltime", 0);

        conf.set("COMPASS.velocity", 2.7);
        conf.set("COMPASS.id", 345);
        conf.set("COMPASS.price", 210);
        conf.set("COMPASS.floor", 150);
        conf.set("COMPASS.ceiling", 250);
        conf.set("COMPASS.description", "Shows you direction!");
        conf.set("COMPASS.stock", 50);
        conf.set("COMPASS.spread", 2.7);
        conf.set("COMPASS.buytime", 0);
        conf.set("COMPASS.selltime", 0);

        conf.set("FISHINGROD.velocity", 1.6);
        conf.set("FISHINGROD.id", 346);
        conf.set("FISHINGROD.price", 20);
        conf.set("FISHINGROD.floor", 5);
        conf.set("FISHINGROD.ceiling", 40);
        conf.set("FISHINGROD.description", "Reel in a big one, son!");
        conf.set("FISHINGROD.stock", 50);
        conf.set("FISHINGROD.spread", 1.6);
        conf.set("FISHINGROD.buytime", 0);
        conf.set("FISHINGROD.selltime", 0);

        conf.set("CLOCK.velocity", 12.3);
        conf.set("CLOCK.id", 347);
        conf.set("CLOCK.price", 2450);
        conf.set("CLOCK.floor", 1500);
        conf.set("CLOCK.ceiling", 3000);
        conf.set("CLOCK.description", "Can anyone say 'What time is it?' Not this thing!");
        conf.set("CLOCK.stock", 50);
        conf.set("CLOCK.spread", 12.3);
        conf.set("CLOCK.buytime", 0);
        conf.set("CLOCK.selltime", 0);

        conf.set("GLOWSTONEDUST.velocity", .1);
        conf.set("GLOWSTONEDUST.id", 348);
        conf.set("GLOWSTONEDUST.price", 1);
        conf.set("GLOWSTONEDUST.floor", .1);
        conf.set("GLOWSTONEDUST.ceiling", 10);
        conf.set("GLOWSTONEDUST.description", "A particle of glowstone!");
        conf.set("GLOWSTONEDUST.stock", 50);
        conf.set("GLOWSTONEDUST.spread", .1);
        conf.set("GLOWSTONEDUST.buytime", 0);
        conf.set("GLOWSTONEDUST.selltime", 0);

        conf.set("RAWFISH.velocity", .4);
        conf.set("RAWFISH.id", 349);
        conf.set("RAWFISH.price", 5);
        conf.set("RAWFISH.floor", 1);
        conf.set("RAWFISH.ceiling", 10);
        conf.set("RAWFISH.description", "Don't eat this unless you want Salmonella!");
        conf.set("RAWFISH.stock", 50);
        conf.set("RAWFISH.spread", .4);
        conf.set("RAWFISH.buytime", 0);
        conf.set("RAWFISH.selltime", 0);

        conf.set("COOKEDFISH.velocity", .6);
        conf.set("COOKEDFISH.id", 350);
        conf.set("COOKEDFISH.price", 7.5);
        conf.set("COOKEDFISH.floor", 3);
        conf.set("COOKEDFISH.ceiling", 15);
        conf.set("COOKEDFISH.description", "Delicious fishy!");
        conf.set("COOKEDFISH.stock", 50);
        conf.set("COOKEDFISH.spread", .6);
        conf.set("COOKEDFISH.spread", .6);
        conf.set("COOKEDFISH.selltime", 0);
        conf.set("COOKEDFISH.buytime", 0);

        // INKS BEGIN

        conf.set("INK.velocity", .8);
        conf.set("INK.id", 351);
        conf.set("INK.price", 7);
        conf.set("INK.floor", 2);
        conf.set("INK.ceiling", 13);
        conf.set("INK.description", "Black Ink, from a squid!");
        conf.set("INK.stock", 50);
        conf.set("INK.spread", .8);
        conf.set("INK.selltime", 0);
        conf.set("INK.buytime", 0);

        conf.set("REDINK.velocity", .8);
        conf.set("REDINK.id", 351001);
        conf.set("REDINK.price", 7);
        conf.set("REDINK.floor", 2);
        conf.set("REDINK.ceiling", 13);
        conf.set("REDINK.description", "Red Ink, from the petals of a rose!");
        conf.set("REDINK.stock", 50);
        conf.set("REDINK.spread", .8);
        conf.set("REDINK.selltime", 0);
        conf.set("REDINK.buytime", 0);

        conf.set("GREENINK.velocity", .8);
        conf.set("GREENINK.id", 351002);
        conf.set("GREENINK.price", 7);
        conf.set("GREENINK.floor", 2);
        conf.set("GREENINK.ceiling", 13);
        conf.set("GREENINK.description", "Green ink, from melted cacti!");
        conf.set("GREENINK.stock", 50);
        conf.set("GREENINK.spread", .8);
        conf.set("GREENINK.selltime", 0);
        conf.set("GREENINK.buytime", 0);

        conf.set("BROWNINK.velocity", .8);
        conf.set("BROWNINK.id", 351003);
        conf.set("BROWNINK.price", 7);
        conf.set("BROWNINK.floor", 2);
        conf.set("BROWNINK.ceiling", 13);
        conf.set("BROWNINK.description", "Brown ink, from the coloring of cocoa beans!");
        conf.set("BROWNINK.stock", 50);
        conf.set("BROWNINK.spread", .8);
        conf.set("BROWNINK.selltime", 0);
        conf.set("BROWNINK.buytime", 0);

        conf.set("LAPISLAZULI.velocity", .8);
        conf.set("LAPISLAZULI.id", 351004);
        conf.set("LAPISLAZULI.price", 7);
        conf.set("LAPISLAZULI.floor", 2);
        conf.set("LAPISLAZULI.ceiling", 13);
        conf.set("LAPISLAZULI.description", "Prettiest ore in the world");
        conf.set("LAPISLAZULI.stock", 50);
        conf.set("LAPISLAZULI.spread", .8);
        conf.set("LAPISLAZULI.selltime", 0);
        conf.set("LAPISLAZULI.buytime", 0);

        conf.set("PURPLEINK.velocity", .8);
        conf.set("PURPLEINK.id", 351005);
        conf.set("PURPLEINK.price", 7);
        conf.set("PURPLEINK.floor", 2);
        conf.set("PURPLEINK.ceiling", 13);
        conf.set("PURPLEINK.description", "Purple ink!");
        conf.set("PURPLEINK.stock", 50);
        conf.set("PURPLEINK.spread", .8);
        conf.set("PURPLEINK.buytime", 0);
        conf.set("PURPLEINK.selltime", 0);

        conf.set("CYANINK.velocity", .8);
        conf.set("CYANINK.id", 351006);
        conf.set("CYANINK.price", 7);
        conf.set("CYANINK.floor", 2);
        conf.set("CYANINK.ceiling", 13);
        conf.set("CYANINK.description", "Cyan ink!");
        conf.set("CYANINK.stock", 50);
        conf.set("CYANINK.spread", .8);
        conf.set("CYANINK.buytime", 0);
        conf.set("CYANINK.selltime", 0);

        conf.set("LIGHTGRAYINK.velocity", .8);
        conf.set("LIGHTGRAYINK.id", 351007);
        conf.set("LIGHTGRAYINK.price", 7);
        conf.set("LIGHTGRAYINK.floor", 2);
        conf.set("LIGHTGRAYINK.ceiling", 13);
        conf.set("LIGHTGRAYINK.description", "Light gray ink!");
        conf.set("LIGHTGRAYINK.stock", 50);
        conf.set("LIGHTGRAYINK.spread", .8);
        conf.set("LIGHTGRAYINK.buytime", 0);
        conf.set("LIGHTGRAYINK.selltime", 0);

        conf.set("GRAYINK.velocity", .8);
        conf.set("GRAYINK.id", 351008);
        conf.set("GRAYINK.price", 7);
        conf.set("GRAYINK.floor", 2);
        conf.set("GRAYINK.ceiling", 13);
        conf.set("GRAYINK.description", "Gray ink!");
        conf.set("GRAYINK.stock", 50);
        conf.set("GRAYINK.spread", .8);
        conf.set("GRAYINK.buytime", 0);
        conf.set("GRAYINK.selltime", 0);

        conf.set("PINKINK.velocity", .8);
        conf.set("PINKINK.id", 351009);
        conf.set("PINKINK.price", 7);
        conf.set("PINKINK.floor", 2);
        conf.set("PINKINK.ceiling", 13);
        conf.set("PINKINK.description", "Pink ink!");
        conf.set("PINKINK.stock", 50);
        conf.set("PINKINK.spread", .8);
        conf.set("PINKINK.buytime", 0);
        conf.set("PINKINK.selltime", 0);

        conf.set("LIMEINK.velocity", .8);
        conf.set("LIMEINK.id", 3510010);
        conf.set("LIMEINK.price", 7);
        conf.set("LIMEINK.floor", 2);
        conf.set("LIMEINK.ceiling", 13);
        conf.set("LIMEINK.description", "Lime ink!");
        conf.set("LIMEINK.stock", 50);
        conf.set("LIMEINK.spread", .8);
        conf.set("LIMEINK.buytime", 0);
        conf.set("LIMEINK.selltime", 0);

        conf.set("YELLOWINK.velocity", .8);
        conf.set("YELLOWINK.id", 3510011);
        conf.set("YELLOWINK.price", 7);
        conf.set("YELLOWINK.floor", 2);
        conf.set("YELLOWINK.ceiling", 13);
        conf.set("YELLOWINK.description", "Yellow ink, from the petals of dandelions!");
        conf.set("YELLOWINK.stock", 50);
        conf.set("YELLOWINK.spread", .8);
        conf.set("YELLOWINK.buytime", 0);
        conf.set("YELLOWINK.selltime", 0);

        conf.set("LIGHTBLUEINK.velocity", .8);
        conf.set("LIGHTBLUEINK.id", 3510012);
        conf.set("LIGHTBLUEINK.price", 7);
        conf.set("LIGHTBLUEINK.floor", 2);
        conf.set("LIGHTBLUEINK.ceiling", 13);
        conf.set("LIGHTBLUEINK.description", "Light blue ink!");
        conf.set("LIGHTBLUEINK.stock", 50);
        conf.set("LIGHTBLUEINK.spread", .8);
        conf.set("LIGHTBLUEINK.buytime", 0);
        conf.set("LIGHTBLUEINK.selltime", 0);

        conf.set("MAGENTAINK.velocity", .8);
        conf.set("MAGENTAINK.id", 3510013);
        conf.set("MAGENTAINK.price", 7);
        conf.set("MAGENTAINK.floor", 2);
        conf.set("MAGENTAINK.ceiling", 13);
        conf.set("MAGENTAINK.description", "Magenta ink!");
        conf.set("MAGENTAINK.stock", 50);
        conf.set("MAGENTAINK.spread", .8);
        conf.set("MAGENTAINK.buytime", 0);
        conf.set("MAGENTAINK.selltime", 0);

        conf.set("ORANGEINK.velocity", .8);
        conf.set("ORANGEINK.id", 3510014);
        conf.set("ORANGEINK.price", 7);
        conf.set("ORANGEINK.floor", 2);
        conf.set("ORANGEINK.ceiling", 13);
        conf.set("ORANGEINK.description", "Orange ink!");
        conf.set("ORANGEINK.stock", 50);
        conf.set("ORANGEINK.spread", .8);
        conf.set("ORANGEINK.buytime", 0);
        conf.set("ORANGEINK.selltime", 0);

        conf.set("BONEMEAL.velocity", .8);
        conf.set("BONEMEAL.id", 3510015);
        conf.set("BONEMEAL.price", 7);
        conf.set("BONEMEAL.floor", 2);
        conf.set("BONEMEAL.ceiling", 13);
        conf.set("BONEMEAL.description", "Crushed bone.");
        conf.set("BONEMEAL.stock", 50);
        conf.set("BONEMEAL.spread", .8);
        conf.set("BONEMEAL.buytime", 0);
        conf.set("BONEMEAL.selltime", 0);

        // INKS END

        conf.set("BONE.velocity", .7);
        conf.set("BONE.id", 352);
        conf.set("BONE.price", 5);
        conf.set("BONE.floor", 1);
        conf.set("BONE.ceiling", 10);
        conf.set("BONE.description", "Not at all creepy!");
        conf.set("BONE.stock", 50);
        conf.set("BONE.spread", .7);
        conf.set("BONE.buytime", 0);
        conf.set("BONE.selltime", 0);

        conf.set("SUGAR.velocity", .008);
        conf.set("SUGAR.id", 353);
        conf.set("SUGAR.price", 1);
        conf.set("SUGAR.floor", .1);
        conf.set("SUGAR.ceiling", 5);
        conf.set("SUGAR.description", "Mmm, sweet and delicious; ready for baking!");
        conf.set("SUGAR.stock", 50);
        conf.set("SUGAR.spread", .008);
        conf.set("SUGAR.buytime", 0);
        conf.set("SUGAR.selltime", 0);

        conf.set("CAKE.velocity", 1.8);
        conf.set("CAKE.id", 354);
        conf.set("CAKE.price", 75);
        conf.set("CAKE.floor", 5);
        conf.set("CAKE.ceiling", 150);
        conf.set("CAKE.description", "This time, the cake is not a lie!");
        conf.set("CAKE.stock", 50);
        conf.set("CAKE.spread", 1.8);
        conf.set("CAKE.buytime", 0);
        conf.set("CAKE.selltime", 0);

        conf.set("REPEATER.velocity", .7);
        conf.set("REPEATER.id", 356);
        conf.set("REPEATER.price", 4);
        conf.set("REPEATER.floor", 1);
        conf.set("REPEATER.ceiling", 15);
        conf.set("REPEATER.description", "Extends a RedStone current!");
        conf.set("REPEATER.stock", 50);
        conf.set("REPEATER.spread", .7);
        conf.set("REPEATER.buytime", 0);
        conf.set("REPEATER.selltime", 0);

        conf.set("COOKIE.velocity", 19.2);
        conf.set("COOKIE.id", 357);
        conf.set("COOKIE.price", 470);
        conf.set("COOKIE.floor", 300);
        conf.set("COOKIE.ceiling", 2000);
        conf.set("COOKIE.description", "A Deliciously rare bite-size snack!");
        conf.set("COOKIE.stock", 50);
        conf.set("COOKIE.spread", 19.2);
        conf.set("COOKIE.buytime", 0);
        conf.set("COOKIE.selltime", 0);

        conf.set("MAP.velocity", 1.6);
        conf.set("MAP.id", 358);
        conf.set("MAP.price", 35);
        conf.set("MAP.floor", 5);
        conf.set("MAP.ceiling", 50);
        conf.set("MAP.description", "Helps you make your way through the unknown!");
        conf.set("MAP.stock", 50);
        conf.set("MAP.spread", 1.6);
        conf.set("MAP.buytime", 0);
        conf.set("MAP.selltime", 0);

        conf.set("SHEARS.velocity", 1.3);
        conf.set("SHEARS.id", 359);
        conf.set("SHEARS.price", 100);
        conf.set("SHEARS.floor", 70);
        conf.set("SHEARS.ceiling", 130);
        conf.set("SHEARS.description", "Sheep beware!");
        conf.set("SHEARS.stock", 50);
        conf.set("SHEARS.spread", 1.3);
        conf.set("SHEARS.buytime", 0);
        conf.set("SHEARS.selltime", 0);

        conf.set("MELONSLICE.velocity", .35);
        conf.set("MELONSLICE.id", 360);
        conf.set("MELONSLICE.price", 2.5);
        conf.set("MELONSLICE.floor", .5);
        conf.set("MELONSLICE.ceiling", 8);
        conf.set("MELONSLICE.description", "Mmm, a summer treat!");
        conf.set("MELONSLICE.stock", 50);
        conf.set("MELONSLICE.spread", .35);
        conf.set("MELONSLICE.buytime", 0);
        conf.set("MELONSLICE.selltime", 0);

        conf.set("PUMPKINSEED.velocity", 18.3);
        conf.set("PUMPKINSEED.id", 361);
        conf.set("PUMPKINSEED.price", 800);
        conf.set("PUMPKINSEED.floor", 500);
        conf.set("PUMPKINSEED.ceiling", 5000);
        conf.set("PUMPKINSEED.description", "The seed of a pumpkin!");
        conf.set("PUMPKINSEED.stock", 50);
        conf.set("PUMPKINSEED.spread", 18.3);
        conf.set("PUMPKINSEED.buytime", 0);
        conf.set("PUMPKINSEED.selltime", 0);

        conf.set("MELONSEED.velocity", 21.3);
        conf.set("MELONSEED.id", 362);
        conf.set("MELONSEED.price", 800);
        conf.set("MELONSEED.floor", 500);
        conf.set("MELONSEED.ceiling", 5000);
        conf.set("MELONSEED.description", "The seed of a melon!");
        conf.set("MELONSEED.stock", 50);
        conf.set("MELONSEED.spread", 21.3);
        conf.set("MELONSEED.buytime", 0);
        conf.set("MELONSEED.selltime", 0);

        conf.set("RAWBEEF.velocity", .6);
        conf.set("RAWBEEF.id", 363);
        conf.set("RAWBEEF.price", 8);
        conf.set("RAWBEEF.floor", 3);
        conf.set("RAWBEEF.ceiling", 15);
        conf.set("RAWBEEF.description", "Raw moo moo!");
        conf.set("RAWBEEF.stock", 50);
        conf.set("RAWBEEF.spread", .6);
        conf.set("RAWBEEF.buytime", 0);
        conf.set("RAWBEEF.selltime", 0);

        conf.set("STEAK.velocity", .5);
        conf.set("STEAK.id", 364);
        conf.set("STEAK.price", 9);
        conf.set("STEAK.floor", 4);
        conf.set("STEAK.ceiling", 16);
        conf.set("STEAK.description", "Ready to eat moo moo!");
        conf.set("STEAK.stock", 50);
        conf.set("STEAK.spread", .5);
        conf.set("STEAK.buytime", 0);
        conf.set("STEAK.selltime", 0);

        conf.set("RAWCHICKEN.velocity", .6);
        conf.set("RAWCHICKEN.id", 365);
        conf.set("RAWCHICKEN.price", 8);
        conf.set("RAWCHICKEN.floor", 3);
        conf.set("RAWCHICKEN.ceiling", 15);
        conf.set("RAWCHICKEN.description", "Cocka-doodle-munch!");
        conf.set("RAWCHICKEN.stock", 50);
        conf.set("RAWCHICKEN.spread", .6);
        conf.set("RAWCHICKEN.buytime", 0);
        conf.set("RAWCHICKEN.selltime", 0);

        conf.set("COOKEDCHICKEN.velocity", .5);
        conf.set("COOKEDCHICKEN.id", 366);
        conf.set("COOKEDCHICKEN.price", 9);
        conf.set("COOKEDCHICKEN.floor", .4);
        conf.set("COOKEDCHICKEN.ceiling", .16);
        conf.set("COOKEDCHICKEN.description", "Cocka-doodle-devour!");
        conf.set("COOKEDCHICKEN.stock", 50);
        conf.set("COOKEDCHICKEN.spread", .5);
        conf.set("COOKEDCHICKEN.buytime", 0);
        conf.set("COOKEDCHICKEN.selltime", 0);

        conf.set("ROTTENFLESH.velocity", 1.7);
        conf.set("ROTTENFLESH.id", 367);
        conf.set("ROTTENFLESH.price", 15);
        conf.set("ROTTENFLESH.floor", 5);
        conf.set("ROTTENFLESH.ceiling", 40);
        conf.set("ROTTENFLESH.description", "Gross. Poisonous zombie flesh!");
        conf.set("ROTTENFLESH.stock", 50);
        conf.set("ROTTENFLESH.spread", 1.7);
        conf.set("ROTTENFLESH.buytime", 0);
        conf.set("ROTTENFLESH.selltime", 0);

        conf.set("ENDERPEARL.velocity", 1.9);
        conf.set("ENDERPEARL.id", 368);
        conf.set("ENDERPEARL.price", 125);
        conf.set("ENDERPEARL.floor", 50);
        conf.set("ENDERPEARL.ceiling", 500);
        conf.set("ENDERPEARL.description", "A pearl of darkness!");
        conf.set("ENDERPEARL.stock", 50);
        conf.set("ENDERPEARL.spread", 1.9);
        conf.set("ENDERPEARL.buytime", 0);
        conf.set("ENDERPEARL.selltime", 0);

        conf.set("BLAZEROD.velocity", 4.3);
        conf.set("BLAZEROD.id", 369);
        conf.set("BLAZEROD.price", 250);
        conf.set("BLAZEROD.floor", 75);
        conf.set("BLAZEROD.ceiling", 5000);
        conf.set("BLAZEROD.description", "A rod from the fiery guardians of hell!");
        conf.set("BLAZEROD.stock", 50);
        conf.set("BLAZEROD.spread", 4.3);
        conf.set("BLAZEROD.buytime", 0);
        conf.set("BLAZEROD.selltime", 0);

        conf.set("GHASTTEAR.velocity", 6.1);
        conf.set("GHASTTEAR.id", 370);
        conf.set("GHASTTEAR.price", 150);
        conf.set("GHASTTEAR.floor", 50);
        conf.set("GHASTTEAR.ceiling", 1000);
        conf.set("GHASTTEAR.description", "The tear of a very depressed, very insane creature!");
        conf.set("GHASTTEAR.stock", 50);
        conf.set("GHASTTEAR.spread", 6.1);
        conf.set("GHASTTEAR.buytime", 0);
        conf.set("GHASTTEAR.selltime", 0);

        conf.set("GOLDNUGset.velocity", .9);
        conf.set("GOLDNUGset.id", 371);
        conf.set("GOLDNUGset.price", 33.33);
        conf.set("GOLDNUGset.floor", 15);
        conf.set("GOLDNUGset.ceiling", 60);
        conf.set("GOLDNUGset.description", "A small piece of gold!");
        conf.set("GOLDNUGset.stock", 50);
        conf.set("GOLDNUGset.spread", .9);
        conf.set("GOLDNUGset.buytime", 0);
        conf.set("GOLDNUGset.selltime", 0);

        conf.set("NETHERWART.velocity", 3.7);
        conf.set("NETHERWART.id", 372);
        conf.set("NETHERWART.price", 150);
        conf.set("NETHERWART.floor", 50);
        conf.set("NETHERWART.ceiling", 900);
        conf.set("NETHERWART.description", "A hell-ridden plant!");
        conf.set("NETHERWART.stock", 50);
        conf.set("NETHERWART.spread", 3.7);
        conf.set("NETHERWART.buytime", 0);
        conf.set("NETHERWART.selltime", 0);

        conf.set("GLASSBOTTLE.velocity", .09);
        conf.set("GLASSBOTTLE.id", 374);
        conf.set("GLASSBOTTLE.price", 2);
        conf.set("GLASSBOTTLE.floor", .1);
        conf.set("GLASSBOTTLE.ceiling", 7);
        conf.set("GLASSBOTTLE.description", "A bottle to make potions in!");
        conf.set("GLASSBOTTLE.stock", 50);
        conf.set("GLASSBOTTLE.spread", .09);
        conf.set("GLASSBOTTLE.buytime", 0);
        conf.set("GLASSBOTTLE.selltime", 0);

        conf.set("SPIDEREYE.velocity", .9);
        conf.set("SPIDEREYE.id", 375);
        conf.set("SPIDEREYE.price", 10);
        conf.set("SPIDEREYE.floor", 1);
        conf.set("SPIDEREYE.ceiling", 50);
        conf.set("SPIDEREYE.description", "I see 8 hairy legs!");
        conf.set("SPIDEREYE.stock", 50);
        conf.set("SPIDEREYE.spread", .9);
        conf.set("SPIDEREYE.buytime", 0);
        conf.set("SPIDEREYE.selltime", 0);

        conf.set("EXPERIENCE.velocity", .001);
        conf.set("EXPERIENCE.id", 999);
        conf.set("EXPERIENCE.price", 1);
        conf.set("EXPERIENCE.floor", .01);
        conf.set("EXPERIENCE.ceiling", 50);
        conf.set("EXPERIENCE.description", "Orbs of wisdom!");
        conf.set("EXPERIENCE.stock", 100000);
        conf.set("EXPERIENCE.spread", .9);
        conf.set("EXPERIENCE.buytime", 0);
        conf.set("EXPERIENCE.selltime", 0);

        // BEGIN POSTIONS

        conf.set("MUNDANEPOTION.velocity", .2);
        conf.set("MUNDANEPOTION.id", 373008192);
        conf.set("MUNDANEPOTION.price", 5);
        conf.set("MUNDANEPOTION.floor", 1);
        conf.set("MUNDANEPOTION.ceiling", 30);
        conf.set("MUNDANEPOTION.description", "Base potion of Weakness and Splash Mundane potion");
        conf.set("MUNDANEPOTION.stock", 50);
        conf.set("MUNDANEPOTION.spread", .9);
        conf.set("MUNDANEPOTION.buytime", 0);
        conf.set("MUNDANEPOTION.selltime", 0);

        conf.set("WATERBOTTLE.velocity", .2);
        conf.set("WATERBOTTLE.id", 373000);
        conf.set("WATERBOTTLE.price", 5);
        conf.set("WATERBOTTLE.floor", 1);
        conf.set("WATERBOTTLE.ceiling", 30);
        conf.set("WATERBOTTLE.description", "Starting point for every recipe.. Nice h20");
        conf.set("WATERBOTTLE.stock", 50);
        conf.set("WATERBOTTLE.spread", .9);
        conf.set("WATERBOTTLE.buytime", 0);
        conf.set("WATERBOTTLE.selltime", 0);

        conf.set("MUNDANEPOTIONEXTENDED.velocity", .2);
        conf.set("MUNDANEPOTIONEXTENDED.id", 3730064);
        conf.set("MUNDANEPOTIONEXTENDED.price", 5);
        conf.set("MUNDANEPOTIONEXTENDED.floor", 1);
        conf.set("MUNDANEPOTIONEXTENDED.ceiling", 30);
        conf.set("MUNDANEPOTIONEXTENDED.description", "Base for potion of weakness (extended)");
        conf.set("MUNDANEPOTIONEXTENDED.stock", 50);
        conf.set("MUNDANEPOTIONEXTENDED.spread", .9);
        conf.set("MUNDANEPOTIONEXTENDED.buytime", 0);
        conf.set("MUNDANEPOTIONEXTENDED.selltime", 0);

        conf.set("THICKPOTION.velocity", .2);
        conf.set("THICKPOTION.id", 3730064);
        conf.set("THICKPOTION.price", 5);
        conf.set("THICKPOTION.floor", 1);
        conf.set("THICKPOTION.ceiling", 30);
        conf.set("THICKPOTION.description", "Base for potion of weakness");
        conf.set("THICKPOTION.stock", 50);
        conf.set("THICKPOTION.spread", .9);
        conf.set("THICKPOTION.buytime", 0);
        conf.set("THICKPOTION.selltime", 0);

        conf.set("POTIONOFREGENERATION.velocity", .2);
        conf.set("POTIONOFREGENERATION.id", 373008193);
        conf.set("POTIONOFREGENERATION.price", 5);
        conf.set("POTIONOFREGENERATION.floor", 1);
        conf.set("POTIONOFREGENERATION.ceiling", 30);
        conf.set("POTIONOFREGENERATION.description", "Restores 23 hearts of health over 0:45");
        conf.set("POTIONOFREGENERATION.stock", 50);
        conf.set("POTIONOFREGENERATION.spread", .9);
        conf.set("POTIONOFREGENERATION.buytime", 0);
        conf.set("POTIONOFREGENERATION.selltime", 0);

        conf.set("POTIONOFREGENERATIONEXTENDED.velocity", .2);
        conf.set("POTIONOFREGENERATIONEXTENDED.id", 373008257);
        conf.set("POTIONOFREGENERATIONEXTENDED.price", 5);
        conf.set("POTIONOFREGENERATIONEXTENDED.floor", 1);
        conf.set("POTIONOFREGENERATIONEXTENDED.ceiling", 30);
        conf.set("POTIONOFREGENERATIONEXTENDED.description", "Restores 54 hearts of health over 2:00");
        conf.set("POTIONOFREGENERATIONEXTENDED.stock", 50);
        conf.set("POTIONOFREGENERATIONEXTENDED.spread", .9);
        conf.set("POTIONOFREGENERATIONEXTENDED.buytime", 0);
        conf.set("POTIONOFREGENERATIONEXTENDED.selltime", 0);

        conf.set("POTIONOFSWIFTNESS.velocity", .2);
        conf.set("POTIONOFSWIFTNESS.id", 373008194);
        conf.set("POTIONOFSWIFTNESS.price", 5);
        conf.set("POTIONOFSWIFTNESS.floor", 1);
        conf.set("POTIONOFSWIFTNESS.ceiling", 30);
        conf.set("POTIONOFSWIFTNESS.description",
                "Increases a players movement, sprinting speed, jumping length, and FOV, for 3:00");
        conf.set("POTIONOFSWIFTNESS.stock", 50);
        conf.set("POTIONOFSWIFTNESS.spread", .9);
        conf.set("POTIONOFSWIFTNESS.buytime", 0);
        conf.set("POTIONOFSWIFTNESS.selltime", 0);

        conf.set("POTIONOFSWIFTNESSEXTENDED.velocity", .2);
        conf.set("POTIONOFSWIFTNESSEXTENDED.id", 373008258);
        conf.set("POTIONOFSWIFTNESSEXTENDED.price", 5);
        conf.set("POTIONOFSWIFTNESSEXTENDED.floor", 1);
        conf.set("POTIONOFSWIFTNESSEXTENDED.ceiling", 30);
        conf.set("POTIONOFSWIFTNESSEXTENDED.description",
                "Increases a players movement, sprinting speed, jumping length, and FOV, for 8:00");
        conf.set("POTIONOFSWIFTNESSEXTENDED.stock", 50);
        conf.set("POTIONOFSWIFTNESSEXTENDED.spread", .9);
        conf.set("POTIONOFSWIFTNESSEXTENDED.buytime", 0);
        conf.set("POTIONOFSWIFTNESSEXTENDED.selltime", 0);

        conf.set("POTIONOFFIRERESISTANCE.velocity", .2);
        conf.set("POTIONOFFIRERESISTANCE.id", 373008195);
        conf.set("POTIONOFFIRERESISTANCE.price", 5);
        conf.set("POTIONOFFIRERESISTANCE.floor", 1);
        conf.set("POTIONOFFIRERESISTANCE.ceiling", 30);
        conf.set("POTIONOFFIRERESISTANCE.description",
                "Gives immunity to damage from fire, lava, and ranged Blaze attacks for 3:00");
        conf.set("POTIONOFFIRERESISTANCE.stock", 50);
        conf.set("POTIONOFFIRERESISTANCE.spread", .9);
        conf.set("POTIONOFFIRERESISTANCE.buytime", 0);
        conf.set("POTIONOFFIRERESISTANCE.selltime", 0);

        conf.set("POTIONOFFIRERESISTANCEEXTENDED.velocity", .2);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.id", 373008259);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.price", 5);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.floor", 1);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.ceiling", 30);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.description",
                "Gives immunity to damage from fire, lava, and ranged Blaze attacks for 8:00");
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.stock", 50);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.spread", .9);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.buytime", 0);
        conf.set("POTIONOFFIRERESISTANCEEXTENDED.selltime", 0);

        conf.set("POTIONOFPOISON.velocity", .2);
        conf.set("POTIONOFPOISON.id", 373008196);
        conf.set("POTIONOFPOISON.price", 5);
        conf.set("POTIONOFPOISON.floor", 1);
        conf.set("POTIONOFPOISON.ceiling", 30);
        conf.set("POTIONOFPOISON.description", "Poisons the player for 0:45, reducing the health to 1 heart at most.");
        conf.set("POTIONOFPOISON.stock", 50);
        conf.set("POTIONOFPOISON.spread", .9);
        conf.set("POTIONOFPOISON.buytime", 0);
        conf.set("POTIONOFPOISON.selltime", 0);

        conf.set("POTIONOFPOISONEXTENDED.velocity", .2);
        conf.set("POTIONOFPOISONEXTENDED.id", 373008260);
        conf.set("POTIONOFPOISONEXTENDED.price", 5);
        conf.set("POTIONOFPOISONEXTENDED.floor", 1);
        conf.set("POTIONOFPOISONEXTENDED.ceiling", 30);
        conf.set("POTIONOFPOISONEXTENDED.description",
                "Poisons the player for 2:00, reducing the health to 1 heart at most.");
        conf.set("POTIONOFPOISONEXTENDED.stock", 50);
        conf.set("POTIONOFPOISONEXTENDED.spread", .9);
        conf.set("POTIONOFPOISONEXTENDED.buytime", 0);
        conf.set("POTIONOFPOISONEXTENDED.selltime", 0);

        conf.set("POTIONOFHEALING.velocity", .2);
        conf.set("POTIONOFHEALING.id", 373008197);
        conf.set("POTIONOFHEALING.price", 5);
        conf.set("POTIONOFHEALING.floor", 1);
        conf.set("POTIONOFHEALING.ceiling", 30);
        conf.set("POTIONOFHEALING.description", "Restores 3 hearts");
        conf.set("POTIONOFHEALING.stock", 50);
        conf.set("POTIONOFHEALING.spread", .9);
        conf.set("POTIONOFHEALING.buytime", 0);
        conf.set("POTIONOFHEALING.selltime", 0);

        conf.set("POTIONOFHEALINGEXTENDED.velocity", .2);
        conf.set("POTIONOFHEALINGEXTENDED.id", 373008261);
        conf.set("POTIONOFHEALINGEXTENDED.price", 5);
        conf.set("POTIONOFHEALINGEXTENDED.floor", 1);
        conf.set("POTIONOFHEALINGEXTENDED.ceiling", 30);
        conf.set("POTIONOFHEALINGEXTENDED.description", "Restores 3 hearts");
        conf.set("POTIONOFHEALINGEXTENDED.stock", 50);
        conf.set("POTIONOFHEALINGEXTENDED.spread", .9);
        conf.set("POTIONOFHEALINGEXTENDED.buytime", 0);
        conf.set("POTIONOFHEALINGEXTENDED.selltime", 0);

        conf.set("POTIONOFWEAKNESS.velocity", .2);
        conf.set("POTIONOFWEAKNESS.id", 373008200);
        conf.set("POTIONOFWEAKNESS.price", 5);
        conf.set("POTIONOFWEAKNESS.floor", 1);
        conf.set("POTIONOFWEAKNESS.ceiling", 30);
        conf.set("POTIONOFWEAKNESS.description", "Reduces melee damage by one heart for 1:30");
        conf.set("POTIONOFWEAKNESS.stock", 50);
        conf.set("POTIONOFWEAKNESS.spread", .9);
        conf.set("POTIONOFWEAKNESS.buytime", 0);
        conf.set("POTIONOFWEAKNESS.selltime", 0);

        conf.set("POTIONOFWEAKNESSEXTENDED.velocity", .2);
        conf.set("POTIONOFWEAKNESSEXTENDED.id", 373008264);
        conf.set("POTIONOFWEAKNESSEXTENDED.price", 5);
        conf.set("POTIONOFWEAKNESSEXTENDED.floor", 1);
        conf.set("POTIONOFWEAKNESSEXTENDED.ceiling", 30);
        conf.set("POTIONOFWEAKNESSEXTENDED.description", "Reduces melee damage by one heart for 4:00");
        conf.set("POTIONOFWEAKNESSEXTENDED.stock", 50);
        conf.set("POTIONOFWEAKNESSEXTENDED.spread", .9);
        conf.set("POTIONOFWEAKNESSEXTENDED.buytime", 0);
        conf.set("POTIONOFWEAKNESSEXTENDED.selltime", 0);

        conf.set("POTIONOFSTRENGTH.velocity", .2);
        conf.set("POTIONOFSTRENGTH.id", 373008201);
        conf.set("POTIONOFSTRENGTH.price", 5);
        conf.set("POTIONOFSTRENGTH.floor", 1);
        conf.set("POTIONOFSTRENGTH.ceiling", 30);
        conf.set("POTIONOFSTRENGTH.description", "Increases melee damage by one and a half hearts for 3:00");
        conf.set("POTIONOFSTRENGTH.stock", 50);
        conf.set("POTIONOFSTRENGTH.spread", .9);
        conf.set("POTIONOFSTRENGTH.buytime", 0);
        conf.set("POTIONOFSTRENGTH.selltime", 0);

        conf.set("POTIONOFSTRENGTHEXTENDED.velocity", .2);
        conf.set("POTIONOFSTRENGTHEXTENDED.id", 373008265);
        conf.set("POTIONOFSTRENGTHEXTENDED.price", 5);
        conf.set("POTIONOFSTRENGTHEXTENDED.floor", 1);
        conf.set("POTIONOFSTRENGTHEXTENDED.ceiling", 30);
        conf.set("POTIONOFSTRENGTHEXTENDED.description", "Increases melee damage by one and a half hearts for 8:00");
        conf.set("POTIONOFSTRENGTHEXTENDED.stock", 50);
        conf.set("POTIONOFSTRENGTHEXTENDED.spread", .9);
        conf.set("POTIONOFSTRENGTHEXTENDED.buytime", 0);
        conf.set("POTIONOFSTRENGTHEXTENDED.selltime", 0);

        conf.set("POTIONOFSLOWNESS.velocity", .2);
        conf.set("POTIONOFSLOWNESS.id", 373008202);
        conf.set("POTIONOFSLOWNESS.price", 5);
        conf.set("POTIONOFSLOWNESS.floor", 1);
        conf.set("POTIONOFSLOWNESS.ceiling", 30);
        conf.set("POTIONOFSLOWNESS.description", "Players movement is slowed to a crouch for 1:30");
        conf.set("POTIONOFSLOWNESS.stock", 50);
        conf.set("POTIONOFSLOWNESS.spread", .9);
        conf.set("POTIONOFSLOWNESS.buytime", 0);
        conf.set("POTIONOFSLOWNESS.selltime", 0);

        conf.set("POTIONOFSLOWNESSEXTENDED.velocity", .2);
        conf.set("POTIONOFSLOWNESSEXTENDED.id", 373008266);
        conf.set("POTIONOFSLOWNESSEXTENDED.price", 5);
        conf.set("POTIONOFSLOWNESSEXTENDED.floor", 1);
        conf.set("POTIONOFSLOWNESSEXTENDED.ceiling", 30);
        conf.set("POTIONOFSLOWNESSEXTENDED.description", "Players movement is slowed to a crouch for 4:00");
        conf.set("POTIONOFSLOWNESSEXTENDED.stock", 50);
        conf.set("POTIONOFSLOWNESSEXTENDED.spread", .9);
        conf.set("POTIONOFSLOWNESSEXTENDED.buytime", 0);
        conf.set("POTIONOFSLOWNESSEXTENDED.selltime", 0);

        conf.set("POTIONOFHARMING.velocity", .2);
        conf.set("POTIONOFHARMING.id", 373008204);
        conf.set("POTIONOFHARMING.price", 5);
        conf.set("POTIONOFHARMING.floor", 1);
        conf.set("POTIONOFHARMING.ceiling", 30);
        conf.set("POTIONOFHARMING.description", "Inflicts 3 hearts of damage");
        conf.set("POTIONOFHARMING.stock", 50);
        conf.set("POTIONOFHARMING.spread", .9);
        conf.set("POTIONOFHARMING.buytime", 0);
        conf.set("POTIONOFHARMING.selltime", 0);

        conf.set("POTIONOFHARMINGEXTENDED.velocity", .2);
        conf.set("POTIONOFHARMINGEXTENDED.id", 373008268);
        conf.set("POTIONOFHARMINGEXTENDED.price", 5);
        conf.set("POTIONOFHARMINGEXTENDED.floor", 1);
        conf.set("POTIONOFHARMINGEXTENDED.ceiling", 30);
        conf.set("POTIONOFHARMINGEXTENDED.description", "Inflicts 3 hearts of damage");
        conf.set("POTIONOFHARMINGEXTENDED.stock", 50);
        conf.set("POTIONOFHARMINGEXTENDED.spread", .9);
        conf.set("POTIONOFHARMINGEXTENDED.buytime", 0);
        conf.set("POTIONOFHARMINGEXTENDED.selltime", 0);

        conf.set("AWKWARDPOTION.velocity", .2);
        conf.set("AWKWARDPOTION.id", 3730016);
        conf.set("AWKWARDPOTION.price", 5);
        conf.set("AWKWARDPOTION.floor", 1);
        conf.set("AWKWARDPOTION.ceiling", 30);
        conf.set("AWKWARDPOTION.description", "This potion is highly awkward, you should avoid social encounters.");
        conf.set("AWKWARDPOTION.stock", 50);
        conf.set("AWKWARDPOTION.spread", .9);
        conf.set("AWKWARDPOTION.buytime", 0);
        conf.set("AWKWARDPOTION.selltime", 0);

        // II STRENGHT POTIONS

        conf.set("POTIONOFREGENERATIONII.velocity", .2);
        conf.set("POTIONOFREGENERATIONII.id", 373008225);
        conf.set("POTIONOFREGENERATIONII.price", 5);
        conf.set("POTIONOFREGENERATIONII.floor", 1);
        conf.set("POTIONOFREGENERATIONII.ceiling", 30);
        conf.set("POTIONOFREGENERATIONII.description", "Restores 24 hearts over 0:22 seconds");
        conf.set("POTIONOFREGENERATIONII.stock", 50);
        conf.set("POTIONOFREGENERATIONII.spread", .9);
        conf.set("POTIONOFREGENERATIONII.buytime", 0);
        conf.set("POTIONOFREGENERATIONII.selltime", 0);

        conf.set("POTIONOFSWIFTNESSII.velocity", .2);
        conf.set("POTIONOFSWIFTNESSII.id", 373008226);
        conf.set("POTIONOFSWIFTNESSII.price", 5);
        conf.set("POTIONOFSWIFTNESSII.floor", 1);
        conf.set("POTIONOFSWIFTNESSII.ceiling", 30);
        conf.set("POTIONOFSWIFTNESSII.description",
                "Increases players movement, sprinting speed, jumping length, and FOV for 1:30");
        conf.set("POTIONOFSWIFTNESSII.stock", 50);
        conf.set("POTIONOFSWIFTNESSII.spread", .9);
        conf.set("POTIONOFSWIFTNESSII.buytime", 0);
        conf.set("POTIONOFSWIFTNESSII.selltime", 0);

        conf.set("POTIONOFFIRERESISTANCEII.velocity", .2);
        conf.set("POTIONOFFIRERESISTANCEII.id", 373008227);
        conf.set("POTIONOFFIRERESISTANCEII.price", 5);
        conf.set("POTIONOFFIRERESISTANCEII.floor", 1);
        conf.set("POTIONOFFIRERESISTANCEII.ceiling", 30);
        conf.set("POTIONOFFIRERESISTANCEII.description",
                "Gives immunity to damage from fire, lava, and ranged Blaze attacks for 3:00");
        conf.set("POTIONOFFIRERESISTANCEII.stock", 50);
        conf.set("POTIONOFFIRERESISTANCEII.spread", .9);
        conf.set("POTIONOFFIRERESISTANCEII.buytime", 0);
        conf.set("POTIONOFFIRERESISTANCEII.selltime", 0);

        conf.set("POTIONOFPOISONII.velocity", .2);
        conf.set("POTIONOFPOISONII.id", 373008228);
        conf.set("POTIONOFPOISONII.price", 5);
        conf.set("POTIONOFPOISONII.floor", 1);
        conf.set("POTIONOFPOISONII.ceiling", 30);
        conf.set("POTIONOFPOISONII.description",
                "Poisons the player, reducing the health for :22 to half a heart at most.");
        conf.set("POTIONOFPOISONII.stock", 50);
        conf.set("POTIONOFPOISONII.spread", .9);
        conf.set("POTIONOFPOISONII.buytime", 0);
        conf.set("POTIONOFPOISONII.selltime", 0);

        conf.set("POTIONOFHEALINGII.velocity", .2);
        conf.set("POTIONOFHEALINGII.id", 373008229);
        conf.set("POTIONOFHEALINGII.price", 5);
        conf.set("POTIONOFHEALINGII.floor", 1);
        conf.set("POTIONOFHEALINGII.ceiling", 30);
        conf.set("POTIONOFHEALINGII.description", "Restores 6 hearts");
        conf.set("POTIONOFHEALINGII.stock", 50);
        conf.set("POTIONOFHEALINGII.spread", .9);
        conf.set("POTIONOFHEALINGII.buytime", 0);
        conf.set("POTIONOFHEALINGII.selltime", 0);

        conf.set("POTIONOFWEAKNESSII.velocity", .2);
        conf.set("POTIONOFWEAKNESSII.id", 373008232);
        conf.set("POTIONOFWEAKNESSII.price", 5);
        conf.set("POTIONOFWEAKNESSII.floor", 1);
        conf.set("POTIONOFWEAKNESSII.ceiling", 30);
        conf.set("POTIONOFWEAKNESSII.description", "Reduces melee damage by one heart for 1:30");
        conf.set("POTIONOFWEAKNESSII.stock", 50);
        conf.set("POTIONOFWEAKNESSII.spread", .9);
        conf.set("POTIONOFWEAKNESSII.buytime", 0);
        conf.set("POTIONOFWEAKNESSII.selltime", 0);

        conf.set("POTIONOFSTRENGTHII.velocity", .2);
        conf.set("POTIONOFSTRENGTHII.id", 373008233);
        conf.set("POTIONOFSTRENGTHII.price", 5);
        conf.set("POTIONOFSTRENGTHII.floor", 1);
        conf.set("POTIONOFSTRENGTHII.ceiling", 30);
        conf.set("POTIONOFSTRENGTHII.description", "Increases melee damage by 3 hearts for 1:30");
        conf.set("POTIONOFSTRENGTHII.stock", 50);
        conf.set("POTIONOFSTRENGTHII.spread", .9);
        conf.set("POTIONOFSTRENGTHII.buytime", 0);
        conf.set("POTIONOFSTRENGTHII.selltime", 0);

        conf.set("POTIONOFSLOWNESSII.velocity", .2);
        conf.set("POTIONOFSLOWNESSII.id", 373008234);
        conf.set("POTIONOFSLOWNESSII.price", 5);
        conf.set("POTIONOFSLOWNESSII.floor", 1);
        conf.set("POTIONOFSLOWNESSII.ceiling", 30);
        conf.set("POTIONOFSLOWNESSII.description", "Players movement is slowed to a crouch for 1:30");
        conf.set("POTIONOFSLOWNESSII.stock", 50);
        conf.set("POTIONOFSLOWNESSII.spread", .9);
        conf.set("POTIONOFSLOWNESSII.buytime", 0);
        conf.set("POTIONOFSLOWNESSII.selltime", 0);

        conf.set("POTIONOFHARMINGII.velocity", .2);
        conf.set("POTIONOFHARMINGII.id", 373008236);
        conf.set("POTIONOFHARMINGII.price", 5);
        conf.set("POTIONOFHARMINGII.floor", 1);
        conf.set("POTIONOFHARMINGII.ceiling", 30);
        conf.set("POTIONOFHARMINGII.description", "Inflicts 6 hearts of damage");
        conf.set("POTIONOFHARMINGII.stock", 50);
        conf.set("POTIONOFHARMINGII.spread", .9);
        conf.set("POTIONOFHARMINGII.buytime", 0);
        conf.set("POTIONOFHARMINGII.selltime", 0);

        // BEGIN SPLASH POTIONS

        conf.set("SPLASHMUNDANEPOTION.velocity", .2);
        conf.set("SPLASHMUNDANEPOTION.id", 3730016384L);
        conf.set("SPLASHMUNDANEPOTION.price", 5);
        conf.set("SPLASHMUNDANEPOTION.floor", 1);
        conf.set("SPLASHMUNDANEPOTION.ceiling", 30);
        conf.set("SPLASHMUNDANEPOTION.description", "Base potion of Weakness and Splash Mundane potion");
        conf.set("SPLASHMUNDANEPOTION.stock", 50);
        conf.set("SPLASHMUNDANEPOTION.spread", .9);
        conf.set("SPLASHMUNDANEPOTION.buytime", 0);
        conf.set("SPLASHMUNDANEPOTION.selltime", 0);

        conf.set("SPLASHPOTIONOFREGENERATION.velocity", .2);
        conf.set("SPLASHPOTIONOFREGENERATION.id", 3730016385L);
        conf.set("SPLASHPOTIONOFREGENERATION.price", 5);
        conf.set("SPLASHPOTIONOFREGENERATION.floor", 1);
        conf.set("SPLASHPOTIONOFREGENERATION.ceiling", 30);
        conf.set("SPLASHPOTIONOFREGENERATION.description", "Restores 19 hearts over 0:33");
        conf.set("SPLASHPOTIONOFREGENERATION.stock", 50);
        conf.set("SPLASHPOTIONOFREGENERATION.spread", .9);
        conf.set("SPLASHPOTIONOFREGENERATION.buytime", 0);
        conf.set("SPLASHPOTIONOFREGENERATION.selltime", 0);

        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.id", 3730016449L);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.description", "Restores 42.5 hearts over 1:30");
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFREGENERATIONEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFSWIFTNESS.velocity", .2);
        conf.set("SPLASHPOTIONOFSWIFTNESS.id", 3730016386L);
        conf.set("SPLASHPOTIONOFSWIFTNESS.price", 5);
        conf.set("SPLASHPOTIONOFSWIFTNESS.floor", 1);
        conf.set("SPLASHPOTIONOFSWIFTNESS.ceiling", 30);
        conf.set("SPLASHPOTIONOFSWIFTNESS.description",
                "Increases a players movement, sprinting speed, jumping length, and FOV, for 3:00");
        conf.set("SPLASHPOTIONOFSWIFTNESS.stock", 50);
        conf.set("SPLASHPOTIONOFSWIFTNESS.spread", .9);
        conf.set("SPLASHPOTIONOFSWIFTNESS.buytime", 0);
        conf.set("SPLASHPOTIONOFSWIFTNESS.selltime", 0);

        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.id", 3730016450L);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.description",
                "Increases a players movement, sprinting speed, jumping length, and FOV, for 8:00");
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFSWIFTNESSEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFFIRERESISTANCE.velocity", .2);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.id", 3730016387L);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.price", 5);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.floor", 1);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.ceiling", 30);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.description",
                "Gives immunity to damage from fire, lava, and ranged Blaze attacks for 3:00");
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.stock", 50);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.spread", .9);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.buytime", 0);
        conf.set("SPLASHPOTIONOFFIRERESISTANCE.selltime", 0);

        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.id", 3730016451L);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.description",
                "Gives immunity to damage from fire, lava, and ranged Blaze attacks for 8:00");
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFPOISON.velocity", .2);
        conf.set("SPLASHPOTIONOFPOISON.id", 3730016388L);
        conf.set("SPLASHPOTIONOFPOISON.price", 5);
        conf.set("SPLASHPOTIONOFPOISON.floor", 1);
        conf.set("SPLASHPOTIONOFPOISON.ceiling", 30);
        conf.set("SPLASHPOTIONOFPOISON.description", "Poisons humans, but undead and spiders are immune to this poison");
        conf.set("SPLASHPOTIONOFPOISON.stock", 50);
        conf.set("SPLASHPOTIONOFPOISON.spread", .9);
        conf.set("SPLASHPOTIONOFPOISON.buytime", 0);
        conf.set("SPLASHPOTIONOFPOISON.selltime", 0);

        conf.set("SPLASHPOTIONOFPOISONEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.id", 3730016452L);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.description",
                "Poisons humans, but undead and spiders are immune to this poison");
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFPOISONEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFHEALING.velocity", .2);
        conf.set("SPLASHPOTIONOFHEALING.id", 3730016389L);
        conf.set("SPLASHPOTIONOFHEALING.price", 5);
        conf.set("SPLASHPOTIONOFHEALING.floor", 1);
        conf.set("SPLASHPOTIONOFHEALING.ceiling", 30);
        conf.set("SPLASHPOTIONOFHEALING.description", "Restores health of people, but hurts the undead.");
        conf.set("SPLASHPOTIONOFHEALING.stock", 50);
        conf.set("SPLASHPOTIONOFHEALING.spread", .9);
        conf.set("SPLASHPOTIONOFHEALING.buytime", 0);
        conf.set("SPLASHPOTIONOFHEALING.selltime", 0);

        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.id", 3730016453L);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.description", "Restores health of people, but hurts the undead.");
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFHEALINGEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFWEAKNESS.velocity", .2);
        conf.set("SPLASHPOTIONOFWEAKNESS.id", 3730016392L);
        conf.set("SPLASHPOTIONOFWEAKNESS.price", 5);
        conf.set("SPLASHPOTIONOFWEAKNESS.floor", 1);
        conf.set("SPLASHPOTIONOFWEAKNESS.ceiling", 30);
        conf.set("SPLASHPOTIONOFWEAKNESS.description", "Reduces melee damage by one heart for 1:30");
        conf.set("SPLASHPOTIONOFWEAKNESS.stock", 50);
        conf.set("SPLASHPOTIONOFWEAKNESS.spread", .9);
        conf.set("SPLASHPOTIONOFWEAKNESS.buytime", 0);
        conf.set("SPLASHPOTIONOFWEAKNESS.selltime", 0);

        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.id", 3730016456L);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.description", "Reduces melee damage by one heart for 4:00");
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFWEAKNESSEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFSTRENGTH.velocity", .2);
        conf.set("SPLASHPOTIONOFSTRENGTH.id", 3730016393L);
        conf.set("SPLASHPOTIONOFSTRENGTH.price", 5);
        conf.set("SPLASHPOTIONOFSTRENGTH.floor", 1);
        conf.set("SPLASHPOTIONOFSTRENGTH.ceiling", 30);
        conf.set("SPLASHPOTIONOFSTRENGTH.description", "Increases melee damage by one and a half hearts for 3:00");
        conf.set("SPLASHPOTIONOFSTRENGTH.stock", 50);
        conf.set("SPLASHPOTIONOFSTRENGTH.spread", .9);
        conf.set("SPLASHPOTIONOFSTRENGTH.buytime", 0);
        conf.set("SPLASHPOTIONOFSTRENGTH.selltime", 0);

        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.id", 3730016457L);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.description",
                "Increases melee damage by one and a half hearts for 8:00");
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFSTRENGTHEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFSLOWNESS.velocity", .2);
        conf.set("SPLASHPOTIONOFSLOWNESS.id", 3730016394L);
        conf.set("SPLASHPOTIONOFSLOWNESS.price", 5);
        conf.set("SPLASHPOTIONOFSLOWNESS.floor", 1);
        conf.set("SPLASHPOTIONOFSLOWNESS.ceiling", 30);
        conf.set("SPLASHPOTIONOFSLOWNESS.description", "Players movement is slowed to a crouch for 1:30");
        conf.set("SPLASHPOTIONOFSLOWNESS.stock", 50);
        conf.set("SPLASHPOTIONOFSLOWNESS.spread", .9);
        conf.set("SPLASHPOTIONOFSLOWNESS.buytime", 0);
        conf.set("SPLASHPOTIONOFSLOWNESS.selltime", 0);

        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.id", 3730016458L);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.description", "Players movement is slowed to a crouch for 4:00");
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFSLOWNESSEXTENDED.selltime", 0);

        conf.set("SPLASHPOTIONOFHARMING.velocity", .2);
        conf.set("SPLASHPOTIONOFHARMING.id", 3730016396L);
        conf.set("SPLASHPOTIONOFHARMING.price", 5);
        conf.set("SPLASHPOTIONOFHARMING.floor", 1);
        conf.set("SPLASHPOTIONOFHARMING.ceiling", 30);
        conf.set("SPLASHPOTIONOFHARMING.description", "Hurts humans, but heals the undead");
        conf.set("SPLASHPOTIONOFHARMING.stock", 50);
        conf.set("SPLASHPOTIONOFHARMING.spread", .9);
        conf.set("SPLASHPOTIONOFHARMING.buytime", 0);
        conf.set("SPLASHPOTIONOFHARMING.selltime", 0);

        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.velocity", .2);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.id", 3730016460L);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.price", 5);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.floor", 1);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.ceiling", 30);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.description", "Hurts humans, but heals the undead");
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.stock", 50);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.spread", .9);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.buytime", 0);
        conf.set("SPLASHPOTIONOFHARMINGEXTENDED.selltime", 0);

        // II STRENGHTH SPLASH POTIONS

        conf.set("SPLASHPOTIONOFREGENERATIONII.velocity", .2);
        conf.set("SPLASHPOTIONOFREGENERATIONII.id", 3730016417L);
        conf.set("SPLASHPOTIONOFREGENERATIONII.price", 5);
        conf.set("SPLASHPOTIONOFREGENERATIONII.floor", 1);
        conf.set("SPLASHPOTIONOFREGENERATIONII.ceiling", 30);
        conf.set("SPLASHPOTIONOFREGENERATIONII.description", "Restores 19.5 hearts over 0:16");
        conf.set("SPLASHPOTIONOFREGENERATIONII.stock", 50);
        conf.set("SPLASHPOTIONOFREGENERATIONII.spread", .9);
        conf.set("SPLASHPOTIONOFREGENERATIONII.buytime", 0);
        conf.set("SPLASHPOTIONOFREGENERATIONII.selltime", 0);

        conf.set("SPLASHPOTIONOFSWIFTNESSII.velocity", .2);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.id", 3730016418L);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.price", 5);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.floor", 1);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.ceiling", 30);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.description",
                "Increases players movement, sprinting speed, jumping length, and FOV for 1:30");
        conf.set("SPLASHPOTIONOFSWIFTNESSII.stock", 50);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.spread", .9);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.buytime", 0);
        conf.set("SPLASHPOTIONOFSWIFTNESSII.selltime", 0);

        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.velocity", .2);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.id", 3730016419L);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.price", 5);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.floor", 1);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.ceiling", 30);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.description",
                "Gives immunity to damage from fire, lava, and ranged Blaze attacks for 3:00");
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.stock", 50);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.spread", .9);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.buytime", 0);
        conf.set("SPLASHPOTIONOFFIRERESISTANCEII.selltime", 0);

        conf.set("SPLASHPOTIONOFPOISONII.velocity", .2);
        conf.set("SPLASHPOTIONOFPOISONII.id", 3730016420L);
        conf.set("SPLASHPOTIONOFPOISONII.price", 5);
        conf.set("SPLASHPOTIONOFPOISONII.floor", 1);
        conf.set("SPLASHPOTIONOFPOISONII.ceiling", 30);
        conf.set("SPLASHPOTIONOFPOISONII.description",
                "Poisons humans, but undead and spiders are immune to this poison");
        conf.set("SPLASHPOTIONOFPOISONII.stock", 50);
        conf.set("SPLASHPOTIONOFPOISONII.spread", .9);
        conf.set("SPLASHPOTIONOFPOISONII.buytime", 0);
        conf.set("SPLASHPOTIONOFPOISONII.selltime", 0);

        conf.set("SPLASHPOTIONOFHEALINGII.velocity", .2);
        conf.set("SPLASHPOTIONOFHEALINGII.id", 3730016421L);
        conf.set("SPLASHPOTIONOFHEALINGII.price", 5);
        conf.set("SPLASHPOTIONOFHEALINGII.floor", 1);
        conf.set("SPLASHPOTIONOFHEALINGII.ceiling", 30);
        conf.set("SPLASHPOTIONOFHEALINGII.description", "Restores 6 hearts");
        conf.set("SPLASHPOTIONOFHEALINGII.stock", 50);
        conf.set("SPLASHPOTIONOFHEALINGII.spread", .9);
        conf.set("SPLASHPOTIONOFHEALINGII.buytime", 0);
        conf.set("SPLASHPOTIONOFHEALINGII.selltime", 0);

        conf.set("SPLASHPOTIONOFWEAKNESSII.velocity", .2);
        conf.set("SPLASHPOTIONOFWEAKNESSII.id", 3730016424L);
        conf.set("SPLASHPOTIONOFWEAKNESSII.price", 5);
        conf.set("SPLASHPOTIONOFWEAKNESSII.floor", 1);
        conf.set("SPLASHPOTIONOFWEAKNESSII.ceiling", 30);
        conf.set("SPLASHPOTIONOFWEAKNESSII.description", "Reduces melee damage by one heart for 1:30");
        conf.set("SPLASHPOTIONOFWEAKNESSII.stock", 50);
        conf.set("SPLASHPOTIONOFWEAKNESSII.spread", .9);
        conf.set("SPLASHPOTIONOFWEAKNESSII.buytime", 0);
        conf.set("SPLASHPOTIONOFWEAKNESSII.selltime", 0);

        conf.set("SPLASHPOTIONOFSTRENGTHII.velocity", .2);
        conf.set("SPLASHPOTIONOFSTRENGTHII.id", 3730016425L);
        conf.set("SPLASHPOTIONOFSTRENGTHII.price", 5);
        conf.set("SPLASHPOTIONOFSTRENGTHII.floor", 1);
        conf.set("SPLASHPOTIONOFSTRENGTHII.ceiling", 30);
        conf.set("SPLASHPOTIONOFSTRENGTHII.description", "Increases melee damage by 3 hearts for 1:30");
        conf.set("SPLASHPOTIONOFSTRENGTHII.stock", 50);
        conf.set("SPLASHPOTIONOFSTRENGTHII.spread", .9);
        conf.set("SPLASHPOTIONOFSTRENGTHII.buytime", 0);
        conf.set("SPLASHPOTIONOFSTRENGTHII.selltime", 0);

        conf.set("SPLASHPOTIONOFSLOWNESSII.velocity", .2);
        conf.set("SPLASHPOTIONOFSLOWNESSII.id", 3730016426L);
        conf.set("SPLASHPOTIONOFSLOWNESSII.price", 5);
        conf.set("SPLASHPOTIONOFSLOWNESSII.floor", 1);
        conf.set("SPLASHPOTIONOFSLOWNESSII.ceiling", 30);
        conf.set("SPLASHPOTIONOFSLOWNESSII.description", "Players movement is slowed to a crouch for 1:30");
        conf.set("SPLASHPOTIONOFSLOWNESSII.stock", 50);
        conf.set("SPLASHPOTIONOFSLOWNESSII.spread", .9);
        conf.set("SPLASHPOTIONOFSLOWNESSII.buytime", 0);
        conf.set("SPLASHPOTIONOFSLOWNESSII.selltime", 0);

        conf.set("SPLASHPOTIONOFHARMINGII.velocity", .2);
        conf.set("SPLASHPOTIONOFHARMINGII.id", 3730016428L);
        conf.set("SPLASHPOTIONOFHARMINGII.price", 5);
        conf.set("SPLASHPOTIONOFHARMINGII.floor", 1);
        conf.set("SPLASHPOTIONOFHARMINGII.ceiling", 30);
        conf.set("SPLASHPOTIONOFHARMINGII.description", "Hurts humans, but heals the undead");
        conf.set("SPLASHPOTIONOFHARMINGII.stock", 50);
        conf.set("SPLASHPOTIONOFHARMINGII.spread", .9);
        conf.set("SPLASHPOTIONOFHARMINGII.buytime", 0);
        conf.set("SPLASHPOTIONOFHARMINGII.selltime", 0);

        // MUSIC CDS START

        conf.set("MUSICDISK13.velocity", 80);
        conf.set("MUSICDISK13.id", 2256);
        conf.set("MUSICDISK13.price", 2000);
        conf.set("MUSICDISK13.floor", 1600);
        conf.set("MUSICDISK13.ceiling", 8000);
        conf.set("MUSICDISK13.description", "A CD with the Song '13' on it");
        conf.set("MUSICDISK13.stock", 50);
        conf.set("MUSICDISK13.spread", .9);
        conf.set("MUSICDISK13.buytime", 0);
        conf.set("MUSICDISK13.selltime", 0);

        conf.set("MUSICDISKCAT.velocity", 80);
        conf.set("MUSICDISKCAT.id", 2257);
        conf.set("MUSICDISKCAT.price", 2000);
        conf.set("MUSICDISKCAT.floor", 1600);
        conf.set("MUSICDISKCAT.ceiling", 8000);
        conf.set("MUSICDISKCAT.description", "A CD with the Song 'Cat' on it");
        conf.set("MUSICDISKCAT.stock", 50);
        conf.set("MUSICDISKCAT.spread", .9);
        conf.set("MUSICDISKCAT.buytime", 0);
        conf.set("MUSICDISKCAT.selltime", 0);

        conf.set("MUSICDISKBLOCKS.velocity", 80);
        conf.set("MUSICDISKBLOCKS.id", 2258);
        conf.set("MUSICDISKBLOCKS.price", 2000);
        conf.set("MUSICDISKBLOCKS.floor", 1600);
        conf.set("MUSICDISKBLOCKS.ceiling", 8000);
        conf.set("MUSICDISKBLOCKS.description", "A CD with the Song 'Blocks' on it");
        conf.set("MUSICDISKBLOCKS.stock", 50);
        conf.set("MUSICDISKBLOCKS.spread", .9);
        conf.set("MUSICDISKBLOCKS.buytime", 0);
        conf.set("MUSICDISKBLOCKS.selltime", 0);

        conf.set("MUSICDISKCHIRP.velocity", 80);
        conf.set("MUSICDISKCHIRP.id", 2259);
        conf.set("MUSICDISKCHIRP.price", 2000);
        conf.set("MUSICDISKCHIRP.floor", 1600);
        conf.set("MUSICDISKCHIRP.ceiling", 8000);
        conf.set("MUSICDISKCHIRP.description", "A CD with the Song 'Chirp' on it");
        conf.set("MUSICDISKCHIRP.stock", 50);
        conf.set("MUSICDISKCHIRP.spread", .9);
        conf.set("MUSICDISKCHIRP.buytime", 0);
        conf.set("MUSICDISKCHIRP.selltime", 0);

        conf.set("MUSICDISKFAR.velocity", 80);
        conf.set("MUSICDISKFAR.id", 2260);
        conf.set("MUSICDISKFAR.price", 2000);
        conf.set("MUSICDISKFAR.floor", 1600);
        conf.set("MUSICDISKFAR.ceiling", 8000);
        conf.set("MUSICDISKFAR.description", "A CD with the Song 'Far' on it");
        conf.set("MUSICDISKFAR.stock", 50);
        conf.set("MUSICDISKFAR.spread", .9);
        conf.set("MUSICDISKFAR.buytime", 0);
        conf.set("MUSICDISKFAR.selltime", 0);

        conf.set("MUSICDISKMALL.velocity", 80);
        conf.set("MUSICDISKMALL.id", 2261);
        conf.set("MUSICDISKMALL.price", 2000);
        conf.set("MUSICDISKMALL.floor", 1600);
        conf.set("MUSICDISKMALL.ceiling", 8000);
        conf.set("MUSICDISKMALL.description", "A CD with the Song 'Mall' on it");
        conf.set("MUSICDISKMALL.stock", 50);
        conf.set("MUSICDISKMALL.spread", .9);
        conf.set("MUSICDISKMALL.buytime", 0);
        conf.set("MUSICDISKMALL.selltime", 0);

        conf.set("MUSICDISKMELLOHI.velocity", 80);
        conf.set("MUSICDISKMELLOHI.id", 2262);
        conf.set("MUSICDISKMELLOHI.price", 2000);
        conf.set("MUSICDISKMELLOHI.floor", 1600);
        conf.set("MUSICDISKMELLOHI.ceiling", 8000);
        conf.set("MUSICDISKMELLOHI.description", "A CD with the Song 'Mellohi' on it");
        conf.set("MUSICDISKMELLOHI.stock", 50);
        conf.set("MUSICDISKMELLOHI.spread", .9);
        conf.set("MUSICDISKMELLOHI.buytime", 0);
        conf.set("MUSICDISKMELLOHI.selltime", 0);

        conf.set("MUSICDISKSTAL.velocity", 80);
        conf.set("MUSICDISKSTAL.id", 2263);
        conf.set("MUSICDISKSTAL.price", 2000);
        conf.set("MUSICDISKSTAL.floor", 1600);
        conf.set("MUSICDISKSTAL.ceiling", 8000);
        conf.set("MUSICDISKSTAL.description", "A CD with the Song 'Stal' on it");
        conf.set("MUSICDISKSTAL.stock", 50);
        conf.set("MUSICDISKSTAL.spread", .9);
        conf.set("MUSICDISKSTAL.buytime", 0);
        conf.set("MUSICDISKSTAL.selltime", 0);

        conf.set("MUSICDISKSTRAD.velocity", 80);
        conf.set("MUSICDISKSTRAD.id", 2264);
        conf.set("MUSICDISKSTRAD.price", 2000);
        conf.set("MUSICDISKSTRAD.floor", 1600);
        conf.set("MUSICDISKSTRAD.ceiling", 8000);
        conf.set("MUSICDISKSTRAD.description", "A CD with the Song 'Strad' on it");
        conf.set("MUSICDISKSTRAD.stock", 50);
        conf.set("MUSICDISKSTRAD.spread", .9);
        conf.set("MUSICDISKSTRAD.buytime", 0);
        conf.set("MUSICDISKSTRAD.selltime", 0);

        conf.set("MUSICDISKWARD.velocity", 80);
        conf.set("MUSICDISKWARD.id", 2265);
        conf.set("MUSICDISKWARD.price", 2000);
        conf.set("MUSICDISKWARD.floor", 1600);
        conf.set("MUSICDISKWARD.ceiling", 8000);
        conf.set("MUSICDISKWARD.description", "A CD with the Song 'Ward' on it");
        conf.set("MUSICDISKWARD.stock", 50);
        conf.set("MUSICDISKWARD.spread", .9);
        conf.set("MUSICDISKWARD.buytime", 0);
        conf.set("MUSICDISKWARD.selltime", 0);

        conf.set("MUSICDISK11.velocity", 80);
        conf.set("MUSICDISK11.id", 2266);
        conf.set("MUSICDISK11.price", 2000);
        conf.set("MUSICDISK11.floor", 1600);
        conf.set("MUSICDISK11.ceiling", 8000);
        conf.set("MUSICDISK11.description", "A CD with the Song '11' on it");
        conf.set("MUSICDISK11.stock", 50);
        conf.set("MUSICDISK11.spread", .9);
        conf.set("MUSICDISK11.buytime", 0);
        conf.set("MUSICDISK11.selltime", 0);

        try {
            conf.save(itemsFile);
            log.info("[DynamicEconomy] Config created!");
        } catch (Exception e) {
            log.info("[IOEXCEPTION] Items Config not saved.");
            log.info(e.toString());
        }

    }

    public Initialize(FileConfiguration conf, File confFile) {
        config = conf;
        configFile = confFile;
    }

    public void setItemsData(FileConfiguration config, File items) {
        conf = config;
        itemsFile = items;
    }

    public static void setConfigFile(File confFile) {
        configFile = confFile;
    }

    public static void initMessages() {
        FileConfiguration config = DynamicEconomy.messagesConfig;

        config.set("no-permission", "&2You do not have permission to use this command.");
        config.set("invalid-command-args",
                "&2You entered the command arguments in the wrong order, or your amount was invalid. Try again. ");
        config.set("wrong-world", "&2This world does not have access to this command.");
        config.set("below-min-y", "&2You are too deep underground to access the economy!");
        config.set("above-max-y", "&2You are too high up to access the economy!");
        config.set("loans-disabled", "&2The Bank is not available for loans at this time.");
        config.set("stock-on", "&2Stock is turned on.");
        config.set("stock-off", "&2Stock is turned off.");
        config.set("boundaries-on", "&2Boundaries are turned on.");
        config.set("boundaries-off", "&2Boundaries are turned off.");
        config.set("item-doesnt-exist", "&2This item does not exist. ");
        config.set("item-has-no-durability", "&2This item has no durability.");
        config.set("no-armor-equipped", "&2You do not have any armor equipped");
        config.set("no-helmet-equipped", "&2You do not have a &fhelmet &2equipped");
        config.set("no-chestplate-equipped", "&2You do not have a &fchestplate &2equipped");
        config.set("no-leggings-equipped", "&2You do not have &fleggings &2equipped");
        config.set("no-boots-equipped", "&2You do not have &fboots &2equipped");
        config.set("banned-item", "&2This item is banned, and not allowed to be traded in the economy.");
        config.set("cannot-buy-all", "&2Stock Disabled, cannot use keyword 'all' ");
        config.set("negative-buy-amount", "&2This amount is invalid!");
        config.set("negative-sell-amount", "&2This amount is invalid!");
        config.set("not-enough-money", "&2You do not have enough money to purchase this.");
        config.set("not-enough-stock", "&2There is not enough stock of this item.");
        config.set("purchase-success", "&2Purchase Success!");
        config.set("not-within-region", "&2You are not within an economy region!");
        config.set("sale-success", "&2Sale Success!");
        config.set("stock-added", "&2Stock succesfully added.");
        config.set("stock-removed", "&2Stock succesfully removed.");
        config.set("no-region-selected", "&2No region selected!");
        config.set("region-expanded", "&2Region expanded!");
        config.set("region-contracted", "&2Region contracted!");
        config.set("max-loans", "&2You have the maximum number of loans allowed.");
        config.set("loan-account-not-found", "&2The Bank is not available, contact your server admin");
        try {
            config.save(DynamicEconomy.messagesFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void initRandomEvents() {
        FileConfiguration config = DynamicEconomy.randomEventConfig;

        config.createSection("events.event1");
        ConfigurationSection section = config.getConfigurationSection("events.event1");

        section.set("Description",
                "&2A forest-fire sparks, and the entire forest burns to ashes! The supply of wood is decreased.");
        section.set("Item", "17");
        section.set("Type", "Stock");
        section.set("Change", "-");
        section.set("Percent", false);
        section.set("Amount", 40);

        config.createSection("events.event2");
        ConfigurationSection section2 = config.getConfigurationSection("events.event2");

        section2.set("Description", "&2Chickens are reproducing like crazy! The supply of raw chicken skyrockets!");
        section2.set("Item", "rawchicken");
        section2.set("Type", "Price");
        section2.set("Change", "-");
        section2.set("Percent", true);
        section2.set("Amount", .5);

        try {
            config.save(DynamicEconomy.randomEventFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
