package me.Cleardragonf.HOB;
 
import java.io.File;
import java.io.IOException;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;
 
public class ConfigurationManager {

	private static ConfigurationManager instance = new ConfigurationManager();



	public static ConfigurationManager getInstance(){
		return instance ;
	}
	


	private File configDir;

	
	
	//The configuration folder for this plugi
	public void ConfigurationManager2(File configDir) {
		this.configDir = configDir;
	}


	// The config Manager for the mail storage file
	private ConfigurationLoader<CommentedConfigurationNode>configLoader1;
	private ConfigurationLoader<CommentedConfigurationNode>configLoader2;
	private ConfigurationLoader<CommentedConfigurationNode>configLoader3;
	private ConfigurationLoader<CommentedConfigurationNode>configLoader4;
	private ConfigurationLoader<CommentedConfigurationNode>configLoader5;
	private ConfigurationLoader<CommentedConfigurationNode>TimeTrackLoader;

	// the in-memory version of the mail storage file
	private CommentedConfigurationNode config1;
	private CommentedConfigurationNode config2;
	private CommentedConfigurationNode config3;
	private CommentedConfigurationNode config4;
	private CommentedConfigurationNode config5;
	private CommentedConfigurationNode TimeTracker;

	  
	  public void enable()
	  {
		//setting the name of the file
	    File Week1 = new File(this.configDir, "Week1.conf");
	    File Week2 = new File(this.configDir, "Week2.conf");
	    File Week3 = new File(this.configDir, "Week3.conf");
	    File Week4 = new File(this.configDir, "Week4.conf");
	    File Week5 = new File(this.configDir, "Week5.conf");
	    File TimeTrackerTime = new File(this.configDir, "TimeTracking.conf");
	    
	    

	    this.configLoader1 = HoconConfigurationLoader.builder().setFile(Week1).build();
	    this.configLoader2 = HoconConfigurationLoader.builder().setFile(Week2).build();
	    this.configLoader3 = HoconConfigurationLoader.builder().setFile(Week3).build();
	    this.configLoader4 = HoconConfigurationLoader.builder().setFile(Week4).build();
	    this.configLoader5 = HoconConfigurationLoader.builder().setFile(Week5).build();
	    this.TimeTrackLoader = HoconConfigurationLoader.builder().setFile(TimeTrackerTime).build();
	    
	    
	    try{
	    	//create a new folder if it does not exist
	    	if(!this.configDir.isDirectory()){
	    		this.configDir.mkdirs();
	    	}
	    	//create a new one if the file does not exist
	    	
	    	if(!TimeTrackerTime.isFile()){
	    		try{
	    			TimeTrackerTime.createNewFile();
	    			loadTime();
	    			TimeTracker.getNode("========Time Tracking========").setComment("The Point of this config is to keep track of the Time and Date");
	    			TimeTracker.getNode("========Time Tracking========", "Day: ").setComment("Day number in Game. Between 1-30").setValue(1);
	    			TimeTracker.getNode("========Time Tracking========", "Time: ").setComment("Set the Time in Game. Between 0 - 24000").setValue("0");
	    			saveTime();	    		
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
	    	if(!Week1.isFile()){
	    		try{
		    		Week1.createNewFile();
		    		load1();
		    		config1.getNode("Natural Spawning!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config1.getNode("Natural Spawning!", "Bat");
                    config1.getNode("Natural Spawning!", "Bat", "#").setComment("Number of bats to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Blaze");
                    config1.getNode("Natural Spawning!", "Blaze", "#").setComment("Number of Blazes to Attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "CaveSpider");
                    config1.getNode("Natural Spawning!", "CaveSpider", "#").setComment("Number of CaveSpider to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Chicken");
                    config1.getNode("Natural Spawning!", "Chicken", "#").setComment("Number of Chicken to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Cow");
                    config1.getNode("Natural Spawning!", "Cow", "#").setComment("Number of Cow to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Creeper");
                    config1.getNode("Natural Spawning!", "Creeper", "#").setComment("Number of Creeper to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "EnderDragon");
                    config1.getNode("Natural Spawning!", "EnderDragon", "#").setComment("Number of EnderDragon to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Enderman");                             
                    config1.getNode("Natural Spawning!", "Enderman", "#").setComment("Number of Enderman to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Ghast");
                    config1.getNode("Natural Spawning!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Giant");
                    config1.getNode("Natural Spawning!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Guardian");
                    config1.getNode("Natural Spawning!", "Guardian", "#").setComment("Number of Guardian to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Horse");
                    config1.getNode("Natural Spawning!", "Horse", "#").setComment("Number of Horse to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "IronGolemn");
                    config1.getNode("Natural Spawning!", "IronGolemn", "#").setComment("Number of IronGolemn to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "MagmaCube");
                    config1.getNode("Natural Spawning!", "MagmaCube", "#").setComment("Number of MagmaCube to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "MushroomCow");
                    config1.getNode("Natural Spawning!", "MushroomCow", "#").setComment("Number of MushroomCow to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Ocelot");
                    config1.getNode("Natural Spawning!", "Ocelot", "#").setComment("Number of Ocelot to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Pig");
                    config1.getNode("Natural Spawning!", "Pig", "#").setComment("Number of Pig to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "PigZombie");
                    config1.getNode("Natural Spawning!", "PigZombie", "#").setComment("Number of PigZombie to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Rabbit");
                    config1.getNode("Natural Spawning!", "Rabbit", "#").setComment("Number of Rabit to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Sheep");
                    config1.getNode("Natural Spawning!", "Sheep", "#").setComment("Number of Sheep to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "SilverFish");
                    config1.getNode("Natural Spawning!", "SilverFish", "#").setComment("Number of SilverFish to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Skeleton");
                    config1.getNode("Natural Spawning!", "Skeleton", "#").setComment("Number of Skeleton to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Slime");
                    config1.getNode("Natural Spawning!", "Slime", "#").setComment("Number of Slime to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Snowman");
                    config1.getNode("Natural Spawning!", "Snowman", "#").setComment("Number of Snowman to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Spider");
                    config1.getNode("Natural Spawning!", "Spider", "#").setComment("Number of Spider to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Squid");
                    config1.getNode("Natural Spawning!", "Squid", "#").setComment("Number of Squid to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Witch");
                    config1.getNode("Natural Spawning!", "Witch", "#").setComment("Number of Witch to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Wither");
                    config1.getNode("Natural Spawning!", "Wither", "#").setComment("Number of Wither to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Wolf");
                    config1.getNode("Natural Spawning!", "Wolf", "#").setComment("Number of Wolf to attempt").setValue("1");                  
                    config1.getNode("Natural Spawning!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config1.getNode("Natural Spawning!", "Zombie");
                    config1.getNode("Natural Spawning!", "Zombie", "#").setComment("Number of Zombie to attempt").setValue("1");
                    config1.getNode("Natural Spawning!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    config1.getNode("Spawning Bonuses!").setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    config1.getNode("Spawning Bonuses!", "Ender Dragon");
                    config1.getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    config1.getNode("Spawning Bonuses!", "Ender Dragon", "#").setComment("Number of Ender Dragons to attempt").setValue("1");
                    config1.getNode("Spawning Bonuses!", "Ender Dragon", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config1.getNode("Spawning Bonuses!", "Ghast");
                    config1.getNode("Spawning Bonuses!", "Ghast", "Enabled").setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    config1.getNode("Spawning Bonuses!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config1.getNode("Spawning Bonuses!", "Ghast", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config1.getNode("Spawning Bonuses!", "Giant");
                    config1.getNode("Spawning Bonuses!", "Giant", "Enabled").setComment("If value is set to True, Giant may spawn.").setValue("False");
                    config1.getNode("Spawning Bonuses!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config1.getNode("Spawning Bonuses!", "Giant", "%").setComment("The Chance for each Giant to be spawned 1-100").setValue("1");
                    //the below is for the CustomProperties
		    		config1.getNode("Custom Properties!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config1.getNode("Custom Properties!", "Bat");
                    config1.getNode("Custom Properties!", "Bat", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Blaze");
                    config1.getNode("Custom Properties!", "Blaze", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "CaveSpider");
                    config1.getNode("Custom Properties!", "CaveSpider", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Chicken");
                    config1.getNode("Custom Properties!", "Chicken", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Cow");
                    config1.getNode("Custom Properties!", "Cow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Creeper");
                    config1.getNode("Custom Properties!", "Creeper", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "EnderDragon");
                    config1.getNode("Custom Properties!", "EnderDragon", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Enderman");                             
                    config1.getNode("Custom Properties!", "Enderman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Ghast");
                    config1.getNode("Custom Properties!", "Ghast", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Giant");
                    config1.getNode("Custom Properties!", "Giant", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Guardian");
                    config1.getNode("Custom Properties!", "Guardian", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Horse");
                    config1.getNode("Custom Properties!", "Horse", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "IronGolemn");
                    config1.getNode("Custom Properties!", "IronGolemn", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "MagmaCube");
                    config1.getNode("Custom Properties!", "MagmaCube", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "MushroomCow");
                    config1.getNode("Custom Properties!", "MushroomCow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Ocelot");
                    config1.getNode("Custom Properties!", "Ocelot", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Pig");
                    config1.getNode("Custom Properties!", "Pig", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "PigZombie");
                    config1.getNode("Custom Properties!", "PigZombie", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Rabbit");
                    config1.getNode("Custom Properties!", "Rabbit", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Sheep");
                    config1.getNode("Custom Properties!", "Sheep", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "SilverFish");
                    config1.getNode("Custom Properties!", "SilverFish", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Skeleton");
                    config1.getNode("Custom Properties!", "Skeleton", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Slime");
                    config1.getNode("Custom Properties!", "Slime", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Snowman");
                    config1.getNode("Custom Properties!", "Snowman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Spider");
                    config1.getNode("Custom Properties!", "Spider", "Enabled").setComment("Number of Spider to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Squid");
                    config1.getNode("Custom Properties!", "Squid", "Enabled").setComment("Number of Squid to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Witch");
                    config1.getNode("Custom Properties!", "Witch", "Enabled").setComment("Number of Witch to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Wither");
                    config1.getNode("Custom Properties!", "Wither", "Enabled").setComment("Number of Wither to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Wolf");
                    config1.getNode("Custom Properties!", "Wolf", "Enabled").setComment("Number of Wolf to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config1.getNode("Custom Properties!", "Zombie");
                    config1.getNode("Custom Properties!", "Zombie", "Enabled").setComment("Number of Zombie to attempt").setValue("True");
                    config1.getNode("Custom Properties!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    
                    
		    		save1();
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
	    	if(!Week2.isFile()){
	    		try{
		    		Week2.createNewFile();
		    		load2();
		    		config2.getNode("Natural Spawning!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config2.getNode("Natural Spawning!", "Bat");
                    config2.getNode("Natural Spawning!", "Bat", "#").setComment("Number of bats to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Blaze");
                    config2.getNode("Natural Spawning!", "Blaze", "#").setComment("Number of Blazes to Attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "CaveSpider");
                    config2.getNode("Natural Spawning!", "CaveSpider", "#").setComment("Number of CaveSpider to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Chicken");
                    config2.getNode("Natural Spawning!", "Chicken", "#").setComment("Number of Chicken to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Cow");
                    config2.getNode("Natural Spawning!", "Cow", "#").setComment("Number of Cow to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Creeper");
                    config2.getNode("Natural Spawning!", "Creeper", "#").setComment("Number of Creeper to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "EnderDragon");
                    config2.getNode("Natural Spawning!", "EnderDragon", "#").setComment("Number of EnderDragon to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Enderman");                             
                    config2.getNode("Natural Spawning!", "Enderman", "#").setComment("Number of Enderman to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Ghast");
                    config2.getNode("Natural Spawning!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Giant");
                    config2.getNode("Natural Spawning!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Guardian");
                    config2.getNode("Natural Spawning!", "Guardian", "#").setComment("Number of Guardian to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Horse");
                    config2.getNode("Natural Spawning!", "Horse", "#").setComment("Number of Horse to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "IronGolemn");
                    config2.getNode("Natural Spawning!", "IronGolemn", "#").setComment("Number of IronGolemn to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "MagmaCube");
                    config2.getNode("Natural Spawning!", "MagmaCube", "#").setComment("Number of MagmaCube to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "MushroomCow");
                    config2.getNode("Natural Spawning!", "MushroomCow", "#").setComment("Number of MushroomCow to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Ocelot");
                    config2.getNode("Natural Spawning!", "Ocelot", "#").setComment("Number of Ocelot to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Pig");
                    config2.getNode("Natural Spawning!", "Pig", "#").setComment("Number of Pig to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "PigZombie");
                    config2.getNode("Natural Spawning!", "PigZombie", "#").setComment("Number of PigZombie to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Rabbit");
                    config2.getNode("Natural Spawning!", "Rabbit", "#").setComment("Number of Rabit to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Sheep");
                    config2.getNode("Natural Spawning!", "Sheep", "#").setComment("Number of Sheep to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "SilverFish");
                    config2.getNode("Natural Spawning!", "SilverFish", "#").setComment("Number of SilverFish to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Skeleton");
                    config2.getNode("Natural Spawning!", "Skeleton", "#").setComment("Number of Skeleton to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Slime");
                    config2.getNode("Natural Spawning!", "Slime", "#").setComment("Number of Slime to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Snowman");
                    config2.getNode("Natural Spawning!", "Snowman", "#").setComment("Number of Snowman to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Spider");
                    config2.getNode("Natural Spawning!", "Spider", "#").setComment("Number of Spider to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Squid");
                    config2.getNode("Natural Spawning!", "Squid", "#").setComment("Number of Squid to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Witch");
                    config2.getNode("Natural Spawning!", "Witch", "#").setComment("Number of Witch to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Wither");
                    config2.getNode("Natural Spawning!", "Wither", "#").setComment("Number of Wither to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Wolf");
                    config2.getNode("Natural Spawning!", "Wolf", "#").setComment("Number of Wolf to attempt").setValue("1");                  
                    config2.getNode("Natural Spawning!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config2.getNode("Natural Spawning!", "Zombie");
                    config2.getNode("Natural Spawning!", "Zombie", "#").setComment("Number of Zombie to attempt").setValue("1");
                    config2.getNode("Natural Spawning!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    config2.getNode("Spawning Bonuses!").setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    config2.getNode("Spawning Bonuses!", "Ender Dragon");
                    config2.getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    config2.getNode("Spawning Bonuses!", "Ender Dragon", "#").setComment("Number of Ender Dragons to attempt").setValue("1");
                    config2.getNode("Spawning Bonuses!", "Ender Dragon", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config2.getNode("Spawning Bonuses!", "Ghast");
                    config2.getNode("Spawning Bonuses!", "Ghast", "Enabled").setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    config2.getNode("Spawning Bonuses!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config2.getNode("Spawning Bonuses!", "Ghast", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config2.getNode("Spawning Bonuses!", "Giant");
                    config2.getNode("Spawning Bonuses!", "Giant", "Enabled").setComment("If value is set to True, Giant may spawn.").setValue("False");
                    config2.getNode("Spawning Bonuses!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config2.getNode("Spawning Bonuses!", "Giant", "%").setComment("The Chance for each Giant to be spawned 1-100").setValue("1");
                    //the below is for the CustomProperties
		    		config2.getNode("Custom Properties!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config2.getNode("Custom Properties!", "Bat");
                    config2.getNode("Custom Properties!", "Bat", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Blaze");
                    config2.getNode("Custom Properties!", "Blaze", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "CaveSpider");
                    config2.getNode("Custom Properties!", "CaveSpider", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Chicken");
                    config2.getNode("Custom Properties!", "Chicken", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Cow");
                    config2.getNode("Custom Properties!", "Cow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Creeper");
                    config2.getNode("Custom Properties!", "Creeper", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "EnderDragon");
                    config2.getNode("Custom Properties!", "EnderDragon", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Enderman");                             
                    config2.getNode("Custom Properties!", "Enderman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Ghast");
                    config2.getNode("Custom Properties!", "Ghast", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Giant");
                    config2.getNode("Custom Properties!", "Giant", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Guardian");
                    config2.getNode("Custom Properties!", "Guardian", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Horse");
                    config2.getNode("Custom Properties!", "Horse", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "IronGolemn");
                    config2.getNode("Custom Properties!", "IronGolemn", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "MagmaCube");
                    config2.getNode("Custom Properties!", "MagmaCube", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "MushroomCow");
                    config2.getNode("Custom Properties!", "MushroomCow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Ocelot");
                    config2.getNode("Custom Properties!", "Ocelot", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Pig");
                    config2.getNode("Custom Properties!", "Pig", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "PigZombie");
                    config2.getNode("Custom Properties!", "PigZombie", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Rabbit");
                    config2.getNode("Custom Properties!", "Rabbit", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Sheep");
                    config2.getNode("Custom Properties!", "Sheep", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "SilverFish");
                    config2.getNode("Custom Properties!", "SilverFish", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Skeleton");
                    config2.getNode("Custom Properties!", "Skeleton", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Slime");
                    config2.getNode("Custom Properties!", "Slime", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Snowman");
                    config2.getNode("Custom Properties!", "Snowman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Spider");
                    config2.getNode("Custom Properties!", "Spider", "Enabled").setComment("Number of Spider to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Squid");
                    config2.getNode("Custom Properties!", "Squid", "Enabled").setComment("Number of Squid to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Witch");
                    config2.getNode("Custom Properties!", "Witch", "Enabled").setComment("Number of Witch to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Wither");
                    config2.getNode("Custom Properties!", "Wither", "Enabled").setComment("Number of Wither to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Wolf");
                    config2.getNode("Custom Properties!", "Wolf", "Enabled").setComment("Number of Wolf to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config2.getNode("Custom Properties!", "Zombie");
                    config2.getNode("Custom Properties!", "Zombie", "Enabled").setComment("Number of Zombie to attempt").setValue("True");
                    config2.getNode("Custom Properties!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    
                    save2();
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
	    	if(!Week3.isFile()){
	    		try{
		    		Week3.createNewFile();
		    		load3();
		    		config3.getNode("Natural Spawning!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config3.getNode("Natural Spawning!", "Bat");
                    config3.getNode("Natural Spawning!", "Bat", "#").setComment("Number of bats to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Blaze");
                    config3.getNode("Natural Spawning!", "Blaze", "#").setComment("Number of Blazes to Attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "CaveSpider");
                    config3.getNode("Natural Spawning!", "CaveSpider", "#").setComment("Number of CaveSpider to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Chicken");
                    config3.getNode("Natural Spawning!", "Chicken", "#").setComment("Number of Chicken to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Cow");
                    config3.getNode("Natural Spawning!", "Cow", "#").setComment("Number of Cow to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Creeper");
                    config3.getNode("Natural Spawning!", "Creeper", "#").setComment("Number of Creeper to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "EnderDragon");
                    config3.getNode("Natural Spawning!", "EnderDragon", "#").setComment("Number of EnderDragon to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Enderman");                             
                    config3.getNode("Natural Spawning!", "Enderman", "#").setComment("Number of Enderman to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Ghast");
                    config3.getNode("Natural Spawning!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Giant");
                    config3.getNode("Natural Spawning!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Guardian");
                    config3.getNode("Natural Spawning!", "Guardian", "#").setComment("Number of Guardian to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Horse");
                    config3.getNode("Natural Spawning!", "Horse", "#").setComment("Number of Horse to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "IronGolemn");
                    config3.getNode("Natural Spawning!", "IronGolemn", "#").setComment("Number of IronGolemn to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "MagmaCube");
                    config3.getNode("Natural Spawning!", "MagmaCube", "#").setComment("Number of MagmaCube to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "MushroomCow");
                    config3.getNode("Natural Spawning!", "MushroomCow", "#").setComment("Number of MushroomCow to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Ocelot");
                    config3.getNode("Natural Spawning!", "Ocelot", "#").setComment("Number of Ocelot to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Pig");
                    config3.getNode("Natural Spawning!", "Pig", "#").setComment("Number of Pig to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "PigZombie");
                    config3.getNode("Natural Spawning!", "PigZombie", "#").setComment("Number of PigZombie to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Rabbit");
                    config3.getNode("Natural Spawning!", "Rabbit", "#").setComment("Number of Rabit to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Sheep");
                    config3.getNode("Natural Spawning!", "Sheep", "#").setComment("Number of Sheep to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "SilverFish");
                    config3.getNode("Natural Spawning!", "SilverFish", "#").setComment("Number of SilverFish to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Skeleton");
                    config3.getNode("Natural Spawning!", "Skeleton", "#").setComment("Number of Skeleton to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Slime");
                    config3.getNode("Natural Spawning!", "Slime", "#").setComment("Number of Slime to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Snowman");
                    config3.getNode("Natural Spawning!", "Snowman", "#").setComment("Number of Snowman to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Spider");
                    config3.getNode("Natural Spawning!", "Spider", "#").setComment("Number of Spider to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Squid");
                    config3.getNode("Natural Spawning!", "Squid", "#").setComment("Number of Squid to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Witch");
                    config3.getNode("Natural Spawning!", "Witch", "#").setComment("Number of Witch to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Wither");
                    config3.getNode("Natural Spawning!", "Wither", "#").setComment("Number of Wither to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Wolf");
                    config3.getNode("Natural Spawning!", "Wolf", "#").setComment("Number of Wolf to attempt").setValue("1");                  
                    config3.getNode("Natural Spawning!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config3.getNode("Natural Spawning!", "Zombie");
                    config3.getNode("Natural Spawning!", "Zombie", "#").setComment("Number of Zombie to attempt").setValue("1");
                    config3.getNode("Natural Spawning!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    config3.getNode("Spawning Bonuses!").setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    config3.getNode("Spawning Bonuses!", "Ender Dragon");
                    config3.getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    config3.getNode("Spawning Bonuses!", "Ender Dragon", "#").setComment("Number of Ender Dragons to attempt").setValue("1");
                    config3.getNode("Spawning Bonuses!", "Ender Dragon", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config3.getNode("Spawning Bonuses!", "Ghast");
                    config3.getNode("Spawning Bonuses!", "Ghast", "Enabled").setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    config3.getNode("Spawning Bonuses!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config3.getNode("Spawning Bonuses!", "Ghast", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config3.getNode("Spawning Bonuses!", "Giant");
                    config3.getNode("Spawning Bonuses!", "Giant", "Enabled").setComment("If value is set to True, Giant may spawn.").setValue("False");
                    config3.getNode("Spawning Bonuses!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config3.getNode("Spawning Bonuses!", "Giant", "%").setComment("The Chance for each Giant to be spawned 1-100").setValue("1");
                    //the below is for the CustomProperties
		    		config3.getNode("Custom Properties!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config3.getNode("Custom Properties!", "Bat");
                    config3.getNode("Custom Properties!", "Bat", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Blaze");
                    config3.getNode("Custom Properties!", "Blaze", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "CaveSpider");
                    config3.getNode("Custom Properties!", "CaveSpider", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Chicken");
                    config3.getNode("Custom Properties!", "Chicken", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Cow");
                    config3.getNode("Custom Properties!", "Cow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Creeper");
                    config3.getNode("Custom Properties!", "Creeper", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "EnderDragon");
                    config3.getNode("Custom Properties!", "EnderDragon", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Enderman");                             
                    config3.getNode("Custom Properties!", "Enderman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Ghast");
                    config3.getNode("Custom Properties!", "Ghast", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Giant");
                    config3.getNode("Custom Properties!", "Giant", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Guardian");
                    config3.getNode("Custom Properties!", "Guardian", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Horse");
                    config3.getNode("Custom Properties!", "Horse", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "IronGolemn");
                    config3.getNode("Custom Properties!", "IronGolemn", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "MagmaCube");
                    config3.getNode("Custom Properties!", "MagmaCube", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "MushroomCow");
                    config3.getNode("Custom Properties!", "MushroomCow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Ocelot");
                    config3.getNode("Custom Properties!", "Ocelot", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Pig");
                    config3.getNode("Custom Properties!", "Pig", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "PigZombie");
                    config3.getNode("Custom Properties!", "PigZombie", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Rabbit");
                    config3.getNode("Custom Properties!", "Rabbit", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Sheep");
                    config3.getNode("Custom Properties!", "Sheep", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "SilverFish");
                    config3.getNode("Custom Properties!", "SilverFish", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Skeleton");
                    config3.getNode("Custom Properties!", "Skeleton", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Slime");
                    config3.getNode("Custom Properties!", "Slime", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Snowman");
                    config3.getNode("Custom Properties!", "Snowman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Spider");
                    config3.getNode("Custom Properties!", "Spider", "Enabled").setComment("Number of Spider to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Squid");
                    config3.getNode("Custom Properties!", "Squid", "Enabled").setComment("Number of Squid to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Witch");
                    config3.getNode("Custom Properties!", "Witch", "Enabled").setComment("Number of Witch to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Wither");
                    config3.getNode("Custom Properties!", "Wither", "Enabled").setComment("Number of Wither to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Wolf");
                    config3.getNode("Custom Properties!", "Wolf", "Enabled").setComment("Number of Wolf to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config3.getNode("Custom Properties!", "Zombie");
                    config3.getNode("Custom Properties!", "Zombie", "Enabled").setComment("Number of Zombie to attempt").setValue("True");
                    config3.getNode("Custom Properties!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    
                                                    
		    		save3();
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
	    	if(!Week4.isFile()){
	    		try{
		    		Week4.createNewFile();
		    		load4();
		    		config4.getNode("Natural Spawning!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config4.getNode("Natural Spawning!", "Bat");
                    config4.getNode("Natural Spawning!", "Bat", "#").setComment("Number of bats to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Blaze");
                    config4.getNode("Natural Spawning!", "Blaze", "#").setComment("Number of Blazes to Attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "CaveSpider");
                    config4.getNode("Natural Spawning!", "CaveSpider", "#").setComment("Number of CaveSpider to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Chicken");
                    config4.getNode("Natural Spawning!", "Chicken", "#").setComment("Number of Chicken to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Cow");
                    config4.getNode("Natural Spawning!", "Cow", "#").setComment("Number of Cow to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Creeper");
                    config4.getNode("Natural Spawning!", "Creeper", "#").setComment("Number of Creeper to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "EnderDragon");
                    config4.getNode("Natural Spawning!", "EnderDragon", "#").setComment("Number of EnderDragon to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Enderman");                             
                    config4.getNode("Natural Spawning!", "Enderman", "#").setComment("Number of Enderman to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Ghast");
                    config4.getNode("Natural Spawning!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Giant");
                    config4.getNode("Natural Spawning!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Guardian");
                    config4.getNode("Natural Spawning!", "Guardian", "#").setComment("Number of Guardian to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Horse");
                    config4.getNode("Natural Spawning!", "Horse", "#").setComment("Number of Horse to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "IronGolemn");
                    config4.getNode("Natural Spawning!", "IronGolemn", "#").setComment("Number of IronGolemn to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "MagmaCube");
                    config4.getNode("Natural Spawning!", "MagmaCube", "#").setComment("Number of MagmaCube to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "MushroomCow");
                    config4.getNode("Natural Spawning!", "MushroomCow", "#").setComment("Number of MushroomCow to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Ocelot");
                    config4.getNode("Natural Spawning!", "Ocelot", "#").setComment("Number of Ocelot to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Pig");
                    config4.getNode("Natural Spawning!", "Pig", "#").setComment("Number of Pig to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "PigZombie");
                    config4.getNode("Natural Spawning!", "PigZombie", "#").setComment("Number of PigZombie to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Rabbit");
                    config4.getNode("Natural Spawning!", "Rabbit", "#").setComment("Number of Rabit to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Sheep");
                    config4.getNode("Natural Spawning!", "Sheep", "#").setComment("Number of Sheep to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "SilverFish");
                    config4.getNode("Natural Spawning!", "SilverFish", "#").setComment("Number of SilverFish to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Skeleton");
                    config4.getNode("Natural Spawning!", "Skeleton", "#").setComment("Number of Skeleton to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Slime");
                    config4.getNode("Natural Spawning!", "Slime", "#").setComment("Number of Slime to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Snowman");
                    config4.getNode("Natural Spawning!", "Snowman", "#").setComment("Number of Snowman to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Spider");
                    config4.getNode("Natural Spawning!", "Spider", "#").setComment("Number of Spider to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Squid");
                    config4.getNode("Natural Spawning!", "Squid", "#").setComment("Number of Squid to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Witch");
                    config4.getNode("Natural Spawning!", "Witch", "#").setComment("Number of Witch to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Wither");
                    config4.getNode("Natural Spawning!", "Wither", "#").setComment("Number of Wither to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Wolf");
                    config4.getNode("Natural Spawning!", "Wolf", "#").setComment("Number of Wolf to attempt").setValue("1");                  
                    config4.getNode("Natural Spawning!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config4.getNode("Natural Spawning!", "Zombie");
                    config4.getNode("Natural Spawning!", "Zombie", "#").setComment("Number of Zombie to attempt").setValue("1");
                    config4.getNode("Natural Spawning!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    config4.getNode("Spawning Bonuses!").setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    config4.getNode("Spawning Bonuses!", "Ender Dragon");
                    config4.getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    config4.getNode("Spawning Bonuses!", "Ender Dragon", "#").setComment("Number of Ender Dragons to attempt").setValue("1");
                    config4.getNode("Spawning Bonuses!", "Ender Dragon", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config4.getNode("Spawning Bonuses!", "Ghast");
                    config4.getNode("Spawning Bonuses!", "Ghast", "Enabled").setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    config4.getNode("Spawning Bonuses!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config4.getNode("Spawning Bonuses!", "Ghast", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config4.getNode("Spawning Bonuses!", "Giant");
                    config4.getNode("Spawning Bonuses!", "Giant", "Enabled").setComment("If value is set to True, Giant may spawn.").setValue("False");
                    config4.getNode("Spawning Bonuses!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config4.getNode("Spawning Bonuses!", "Giant", "%").setComment("The Chance for each Giant to be spawned 1-100").setValue("1");
                    //the below is for the CustomProperties
		    		config4.getNode("Custom Properties!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config4.getNode("Custom Properties!", "Bat");
                    config4.getNode("Custom Properties!", "Bat", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Blaze");
                    config4.getNode("Custom Properties!", "Blaze", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "CaveSpider");
                    config4.getNode("Custom Properties!", "CaveSpider", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Chicken");
                    config4.getNode("Custom Properties!", "Chicken", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Cow");
                    config4.getNode("Custom Properties!", "Cow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Creeper");
                    config4.getNode("Custom Properties!", "Creeper", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "EnderDragon");
                    config4.getNode("Custom Properties!", "EnderDragon", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Enderman");                             
                    config4.getNode("Custom Properties!", "Enderman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Ghast");
                    config4.getNode("Custom Properties!", "Ghast", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Giant");
                    config4.getNode("Custom Properties!", "Giant", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Guardian");
                    config4.getNode("Custom Properties!", "Guardian", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Horse");
                    config4.getNode("Custom Properties!", "Horse", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "IronGolemn");
                    config4.getNode("Custom Properties!", "IronGolemn", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "MagmaCube");
                    config4.getNode("Custom Properties!", "MagmaCube", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "MushroomCow");
                    config4.getNode("Custom Properties!", "MushroomCow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Ocelot");
                    config4.getNode("Custom Properties!", "Ocelot", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Pig");
                    config4.getNode("Custom Properties!", "Pig", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "PigZombie");
                    config4.getNode("Custom Properties!", "PigZombie", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Rabbit");
                    config4.getNode("Custom Properties!", "Rabbit", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Sheep");
                    config4.getNode("Custom Properties!", "Sheep", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "SilverFish");
                    config4.getNode("Custom Properties!", "SilverFish", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Skeleton");
                    config4.getNode("Custom Properties!", "Skeleton", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Slime");
                    config4.getNode("Custom Properties!", "Slime", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Snowman");
                    config4.getNode("Custom Properties!", "Snowman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Spider");
                    config4.getNode("Custom Properties!", "Spider", "Enabled").setComment("Number of Spider to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Squid");
                    config4.getNode("Custom Properties!", "Squid", "Enabled").setComment("Number of Squid to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Witch");
                    config4.getNode("Custom Properties!", "Witch", "Enabled").setComment("Number of Witch to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Wither");
                    config4.getNode("Custom Properties!", "Wither", "Enabled").setComment("Number of Wither to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Wolf");
                    config4.getNode("Custom Properties!", "Wolf", "Enabled").setComment("Number of Wolf to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config4.getNode("Custom Properties!", "Zombie");
                    config4.getNode("Custom Properties!", "Zombie", "Enabled").setComment("Number of Zombie to attempt").setValue("True");
                    config4.getNode("Custom Properties!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    
                                                    
		    		save4();
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
	    	if(!Week5.isFile()){
	    		try{
		    		Week5.createNewFile();
		    		load5();
		    		config5.getNode("Natural Spawning!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config5.getNode("Natural Spawning!", "Bat");
                    config5.getNode("Natural Spawning!", "Bat", "#").setComment("Number of bats to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Blaze");
                    config5.getNode("Natural Spawning!", "Blaze", "#").setComment("Number of Blazes to Attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "CaveSpider");
                    config5.getNode("Natural Spawning!", "CaveSpider", "#").setComment("Number of CaveSpider to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Chicken");
                    config5.getNode("Natural Spawning!", "Chicken", "#").setComment("Number of Chicken to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Cow");
                    config5.getNode("Natural Spawning!", "Cow", "#").setComment("Number of Cow to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Creeper");
                    config5.getNode("Natural Spawning!", "Creeper", "#").setComment("Number of Creeper to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "EnderDragon");
                    config5.getNode("Natural Spawning!", "EnderDragon", "#").setComment("Number of EnderDragon to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Enderman");                             
                    config5.getNode("Natural Spawning!", "Enderman", "#").setComment("Number of Enderman to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Ghast");
                    config5.getNode("Natural Spawning!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Giant");
                    config5.getNode("Natural Spawning!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Guardian");
                    config5.getNode("Natural Spawning!", "Guardian", "#").setComment("Number of Guardian to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Horse");
                    config5.getNode("Natural Spawning!", "Horse", "#").setComment("Number of Horse to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "IronGolemn");
                    config5.getNode("Natural Spawning!", "IronGolemn", "#").setComment("Number of IronGolemn to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "MagmaCube");
                    config5.getNode("Natural Spawning!", "MagmaCube", "#").setComment("Number of MagmaCube to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "MushroomCow");
                    config5.getNode("Natural Spawning!", "MushroomCow", "#").setComment("Number of MushroomCow to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Ocelot");
                    config5.getNode("Natural Spawning!", "Ocelot", "#").setComment("Number of Ocelot to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Pig");
                    config5.getNode("Natural Spawning!", "Pig", "#").setComment("Number of Pig to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "PigZombie");
                    config5.getNode("Natural Spawning!", "PigZombie", "#").setComment("Number of PigZombie to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Rabbit");
                    config5.getNode("Natural Spawning!", "Rabbit", "#").setComment("Number of Rabit to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Sheep");
                    config5.getNode("Natural Spawning!", "Sheep", "#").setComment("Number of Sheep to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "SilverFish");
                    config5.getNode("Natural Spawning!", "SilverFish", "#").setComment("Number of SilverFish to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Skeleton");
                    config5.getNode("Natural Spawning!", "Skeleton", "#").setComment("Number of Skeleton to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Slime");
                    config5.getNode("Natural Spawning!", "Slime", "#").setComment("Number of Slime to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Snowman");
                    config5.getNode("Natural Spawning!", "Snowman", "#").setComment("Number of Snowman to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Spider");
                    config5.getNode("Natural Spawning!", "Spider", "#").setComment("Number of Spider to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Squid");
                    config5.getNode("Natural Spawning!", "Squid", "#").setComment("Number of Squid to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Witch");
                    config5.getNode("Natural Spawning!", "Witch", "#").setComment("Number of Witch to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Wither");
                    config5.getNode("Natural Spawning!", "Wither", "#").setComment("Number of Wither to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Wolf");
                    config5.getNode("Natural Spawning!", "Wolf", "#").setComment("Number of Wolf to attempt").setValue("1");                  
                    config5.getNode("Natural Spawning!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config5.getNode("Natural Spawning!", "Zombie");
                    config5.getNode("Natural Spawning!", "Zombie", "#").setComment("Number of Zombie to attempt").setValue("1");
                    config5.getNode("Natural Spawning!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
config5.getNode("Spawning Bonuses!").setComment("This controls any Mobs you wish to spawn...in additon to the Natural Spawning.  However These spawn whenever any entity is spawned. So be weary.");
                    config5.getNode("Spawning Bonuses!", "Ender Dragon");
                    config5.getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").setComment("If value is set to True, Ender Dragons may spawn in the outside the End").setValue("False");
                    config5.getNode("Spawning Bonuses!", "Ender Dragon", "#").setComment("Number of Ender Dragons to attempt").setValue("1");
                    config5.getNode("Spawning Bonuses!", "Ender Dragon", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config5.getNode("Spawning Bonuses!", "Ghast");
                    config5.getNode("Spawning Bonuses!", "Ghast", "Enabled").setComment("If value is set to True, Ghast may spawn in the outside the Nether").setValue("False");
                    config5.getNode("Spawning Bonuses!", "Ghast", "#").setComment("Number of Ghast to attempt").setValue("1");
                    config5.getNode("Spawning Bonuses!", "Ghast", "%").setComment("The Chance for each Ghast to be spawned 1-100").setValue("1");
                    config5.getNode("Spawning Bonuses!", "Giant");
                    config5.getNode("Spawning Bonuses!", "Giant", "Enabled").setComment("If value is set to True, Giant may spawn.").setValue("False");
                    config5.getNode("Spawning Bonuses!", "Giant", "#").setComment("Number of Giant to attempt").setValue("1");
                    config5.getNode("Spawning Bonuses!", "Giant", "%").setComment("The Chance for each Giant to be spawned 1-100").setValue("1");
                    //the below is for the CustomProperties
		    		config5.getNode("Custom Properties!").setComment("This controls the number of Creatures that spawn and the percentile of those spawns.");
                    config5.getNode("Custom Properties!", "Bat");
                    config5.getNode("Custom Properties!", "Bat", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Bat", "%").setComment("Chances for each Bat's Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Blaze");
                    config5.getNode("Custom Properties!", "Blaze", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Blaze", "%").setComment("Chances for each Blazes Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "CaveSpider");
                    config5.getNode("Custom Properties!", "CaveSpider", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "CaveSpider", "%").setComment("Chances for each CaveSpider Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Chicken");
                    config5.getNode("Custom Properties!", "Chicken", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Chicken", "%").setComment("Chances for each Chicken Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Cow");
                    config5.getNode("Custom Properties!", "Cow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Cow", "%").setComment("Chances for each Cow Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Creeper");
                    config5.getNode("Custom Properties!", "Creeper", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Creeper", "%").setComment("Chances for each Creeper Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "EnderDragon");
                    config5.getNode("Custom Properties!", "EnderDragon", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "EnderDragon", "%").setComment("Chances for each EnderDragon Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Enderman");                             
                    config5.getNode("Custom Properties!", "Enderman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Enderman", "%").setComment("Chances for each Enderman Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Ghast");
                    config5.getNode("Custom Properties!", "Ghast", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Ghast", "%").setComment("Chances for each Ghast Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Giant");
                    config5.getNode("Custom Properties!", "Giant", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Giant", "%").setComment("Chances for each Giant Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Guardian");
                    config5.getNode("Custom Properties!", "Guardian", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Guardian", "%").setComment("Chances for each Guardian Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Horse");
                    config5.getNode("Custom Properties!", "Horse", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Horse", "%").setComment("Chances for each Horse Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "IronGolemn");
                    config5.getNode("Custom Properties!", "IronGolemn", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "IronGolemn", "%").setComment("Chances for each IronGolemn Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "MagmaCube");
                    config5.getNode("Custom Properties!", "MagmaCube", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "MagmaCube", "%").setComment("Chances for each MagmaCube Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "MushroomCow");
                    config5.getNode("Custom Properties!", "MushroomCow", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "MushroomCow", "%").setComment("Chances for each MushroomCow Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Ocelot");
                    config5.getNode("Custom Properties!", "Ocelot", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Ocelot", "%").setComment("Chances for each Ocelot Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Pig");
                    config5.getNode("Custom Properties!", "Pig", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Pig", "%").setComment("Chances for each Pig Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "PigZombie");
                    config5.getNode("Custom Properties!", "PigZombie", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "PigZombie", "%").setComment("Chances for each PigZombie Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Rabbit");
                    config5.getNode("Custom Properties!", "Rabbit", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Rabbit", "%").setComment("Chances for each Rabit Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Sheep");
                    config5.getNode("Custom Properties!", "Sheep", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Sheep", "%").setComment("Chances for each Sheep Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "SilverFish");
                    config5.getNode("Custom Properties!", "SilverFish", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "SilverFish", "%").setComment("Chances for each SilverFish Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Skeleton");
                    config5.getNode("Custom Properties!", "Skeleton", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Skeleton", "%").setComment("Chances for each Skeleton Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Slime");
                    config5.getNode("Custom Properties!", "Slime", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Slime", "%").setComment("Chances for each Slime Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Snowman");
                    config5.getNode("Custom Properties!", "Snowman", "Enabled").setComment("Number of bats to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Snowman", "%").setComment("Chances for each Snowman Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Spider");
                    config5.getNode("Custom Properties!", "Spider", "Enabled").setComment("Number of Spider to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Spider", "%").setComment("Chances for each Spider Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Squid");
                    config5.getNode("Custom Properties!", "Squid", "Enabled").setComment("Number of Squid to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Squid", "%").setComment("Chances for each Squid Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Witch");
                    config5.getNode("Custom Properties!", "Witch", "Enabled").setComment("Number of Witch to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Witch", "%").setComment("Chances for each Witch Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Wither");
                    config5.getNode("Custom Properties!", "Wither", "Enabled").setComment("Number of Wither to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Wither", "%").setComment("Chances for each Wither Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Wolf");
                    config5.getNode("Custom Properties!", "Wolf", "Enabled").setComment("Number of Wolf to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Wolf", "%").setComment("Chances for each Wolf Spawn.  1-100%").setValue("75");
                    config5.getNode("Custom Properties!", "Zombie");
                    config5.getNode("Custom Properties!", "Zombie", "Enabled").setComment("Number of Zombie to attempt").setValue("True");
                    config5.getNode("Custom Properties!", "Zombie", "%").setComment("Chances for each Zombie Spawn.  1-100%").setValue("75");
                    
                                                    
		    		save5();
	    		}catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}

	    	//load the stored mails
	    	this.config1 = this.configLoader1.load();
	    	this.config2 = this.configLoader2.load();
	    	this.config3 = this.configLoader3.load();
	    	this.config4 = this.configLoader4.load();
	    	this.config5 = this.configLoader5.load();
	    	this.TimeTracker = this.TimeTrackLoader.load();
	    }catch (IOException e){
	    	return;
	    }
	  }

	private void loadTime() {
		try{
			TimeTracker = TimeTrackLoader.load();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void load1(){
		  try{
			  config1 = configLoader1.load();
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void load2(){
		  try{
			  config2 = configLoader2.load();
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void load3(){
		  try{
			  config3 = configLoader3.load();
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void load4(){
		  try{
			  config4 = configLoader4.load();
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void load5(){
		  try{
			  config5 = configLoader5.load();
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  private void saveTime() {
		  try{
			  TimeTrackLoader.save(TimeTracker);
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void save1(){
		  try{
			  configLoader1.save(config1);
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void save2(){
		  try{
			  configLoader2.save(config2);
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void save3(){
		  try{
			  configLoader3.save(config3);
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void save4(){
		  try{
			  configLoader4.save(config4);
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  public void save5(){
		  try{
			  configLoader5.save(config5);
		  }catch(IOException e){
			  e.printStackTrace();
		  }
	  }
	  
	  public CommentedConfigurationNode getConfig1(){
		  return config1;
	  }
	  public CommentedConfigurationNode getConfig2(){
		  return config2;
	  }
	  public CommentedConfigurationNode getConfig3(){
		  return config3;
	  }
	  public CommentedConfigurationNode getConfig4(){
		  return config4;
	  }
	  public CommentedConfigurationNode getConfig5(){
		  return config5;
	  }
	  public CommentedConfigurationNode getTimeTrack(){
		  return TimeTracker;
	  }
}