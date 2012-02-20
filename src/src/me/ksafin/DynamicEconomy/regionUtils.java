package me.ksafin.DynamicEconomy;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import couk.Adamki11s.Extras.Colour.ExtrasColour;

public class regionUtils {

	private static File regionFile;
	private static FileConfiguration regionFileConfig;
	static Logger log = Logger.getLogger("Minecraft");
	private static final ExtrasColour color = new ExtrasColour();
	
	public static void setRegionFile(File regFile) {
		regionFile = regFile;
	}
	
	public static void setRegionFileConfig(FileConfiguration regConfig) {
		regionFileConfig = regConfig;
	}
	
	public static boolean createRegion(Player player, String[] args) {
		if ((args.length == 1) && (args[0] instanceof String)) { 
			String name = player.getName();
		
			Object selectionsObject = DynamicEconomy.selectedCorners.get(name);
		
			if (selectionsObject == null) {
				color.sendColouredMessage(player, "&2No region selected!");
				return false;
			}
		
			String[] selections = (String[]) selectionsObject;
			
			
			if ((selections[0] == null) || (selections[1] == null)) {
				color.sendColouredMessage(player, "&2No region selected!");
				return false;
			}
			
			if ((selections[0].isEmpty()) || (selections[1].isEmpty())) {
				color.sendColouredMessage(player, "&2No region selected!");
				return false;
			}
		
			
			
			int[] coord1 = Utility.decodeCoordinates(selections[0]);
			int[] coord2 = Utility.decodeCoordinates(selections[1]);
			
			
			
			String regionName = args[0];
			
			int xMax = 0;
			int yMax = 0;
			int zMax = 0;
			
			int xMin = 0;
			int yMin = 0;
			int zMin = 0;
			
			if (coord1[0] > coord2[0]) {
				xMax = coord1[0];
				xMin = coord2[0];
			} else {
				xMax = coord2[0];
				xMin = coord1[0];
			}
			
			if (coord1[1] > coord2[1]) {
				yMax = coord1[1];
				yMin = coord2[1];
			} else {
				yMax = coord2[1];
				yMin = coord1[1];
			}
			
			if (coord1[2] > coord2[2]) {
				zMax = coord1[2];
				zMin = coord2[2];
			} else {
				zMax = coord2[2];
				zMin = coord1[2];
			}
			
			
			String block1X = "regions." + regionName.toUpperCase() + ".CornerOne.X";
			String block1Y = "regions." + regionName.toUpperCase() + ".CornerOne.Y";
			String block1Z = "regions." + regionName.toUpperCase() + ".CornerOne.Z";
			
			String block2X = "regions." + regionName.toUpperCase() + ".CornerTwo.X";
			String block2Y = "regions." + regionName.toUpperCase() + ".CornerTwo.Y";
			String block2Z = "regions." + regionName.toUpperCase() + ".CornerTwo.Z";
			
			String xMaxStr = "regions." + regionName.toUpperCase() + ".xMax";
			String yMaxStr = "regions." + regionName.toUpperCase() + ".yMax";
			String zMaxStr = "regions." + regionName.toUpperCase() + ".zMax";
			
			String xMinStr = "regions." + regionName.toUpperCase() + ".xMin";
			String yMinStr = "regions." + regionName.toUpperCase() + ".yMin";
			String zMinStr = "regions." + regionName.toUpperCase() + ".zMin";
			
			if (regionFileConfig.contains(regionName)) {
				color.sendColouredMessage(player, "&2Region already exists!");
				return false;
			}
			
			regionFileConfig.set(block1X, coord1[0]);
			regionFileConfig.set(block1Y, coord1[1]);
			regionFileConfig.set(block1Z, coord1[2]);
			
			regionFileConfig.set(block2X, coord2[0]);
			regionFileConfig.set(block2Y, coord2[1]);
			regionFileConfig.set(block2Z, coord2[2]);
			
			regionFileConfig.set(xMaxStr, xMax);
			regionFileConfig.set(yMaxStr, yMax);
			regionFileConfig.set(zMaxStr, zMax);
			
			regionFileConfig.set(xMinStr, xMin);
			regionFileConfig.set(yMinStr, yMin);
			regionFileConfig.set(zMinStr, zMin);
			
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Region &f" + regionName + "&2 created!");
			DynamicEconomy.selectedCorners.remove(name);
			
			try {
				regionFileConfig.save(regionFile);
			} catch (Exception e) {
				log.info("[DynamicEconomy]IOException saving Region.yml");
			}
			
			return true;
		
		} else {
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/shopregion [Name]");
			Utility.writeToLog(player.getName() + " incorrectly called /shopregion");
			return false;
		}
	}
	
	public static boolean withinRegion(int x, int y, int z) {
		Set<String> sectionsSet = regionFileConfig.getConfigurationSection("regions").getKeys(false);
		
		Object[] sectionsObj = (sectionsSet.toArray());
		String[] sections = new String[sectionsObj.length];
		
		for (int i = 0; i < sections.length; i++) {
			sections[i] = sectionsObj[i].toString();
		}
		
		if (sections.length == 0) {
			return false;
		}
		
		int regionXMin = 0;
		int regionYMin = 0;
		int regionZMin = 0;
		int regionXMax = 0;
		int regionYMax = 0;
		int regionZMax = 0;
		
		for (int i = 0; i < sections.length ; i++) {
			String section = sections[i];
			
			regionXMin = regionFileConfig.getInt("regions." + section + ".xMin");
			regionYMin = regionFileConfig.getInt("regions." + section + ".yMin");
			regionZMin = regionFileConfig.getInt("regions." + section + ".zMin");
			
			regionXMax = regionFileConfig.getInt("regions." + section + ".xMax");
			regionYMax = regionFileConfig.getInt("regions." + section + ".yMax");
			regionZMax = regionFileConfig.getInt("regions." + section + ".zMax");
			
			if (((x > regionXMin) && (x < regionXMax)) && ((y > regionYMin) && (y < regionYMax)) && ((z > regionZMin) && (z < regionZMax))) {
				return true;
			}
			
		}
		return false;
		
	}
	
	
	
}
