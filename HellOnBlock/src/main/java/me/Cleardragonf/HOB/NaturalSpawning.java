package me.Cleardragonf.HOB;

import java.util.Random;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class NaturalSpawning {
	 	  public void onEntitySpawn(SpawnEntityEvent event){
		  //This is the testing code v
		  Entity spawnedEntity = null;
		  for(Entity entity : event.getEntities()){
			  if(entity != null){
				  spawnedEntity = entity;
				  break;
			  }
		  }
		  if(spawnedEntity == null){
			  return;
		  }
		  if(DayCounter.getWeeklyConfig() == 1){
			  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Bat", "#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Bat", "%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		   		  }
			  }  	
	  	  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Blaze", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.BLAZE, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	  }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
	  			  Random roll = new Random();
	  	  int answer = roll.nextInt(100) + 1;
	  		  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.CAVE_SPIDER, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	  }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Chicken", "#").getInt()); i++){
	  			  Random roll = new Random();
	  		  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Chicken", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.CHICKEN, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	  }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
	  		  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Cow", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Cow", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.COW, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Creeper", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.CREEPER, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	 }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	 }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Enderman", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.ENDERMAN, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Ghast", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	 }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Giant", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Guardian", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Guardian", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.GUARDIAN, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Horse", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Horse", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.HORSE, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "IronGolemn", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "IronGolemn", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.MAGMA_CUBE, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "MushroomCow", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "MushroomCow", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.MUSHROOM_COW, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Ocelot", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Ocelot", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.OCELOT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	 	  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Pig", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Pig", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.PIG, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	 	 }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.PIG_ZOMBIE, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Rabbit", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Rabbit", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.RABBIT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Sheep", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Sheep", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.SHEEP, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.SKELETON, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Slime", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.SLIME, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Snowman", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Snowman", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.SNOWMAN, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Spider", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.SPIDER, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Squid", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Squid", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.SQUID, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Witch", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.WITCH, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	 }  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Wither", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.WITHER, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Wolf", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Wolf", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.WOLF, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	}  
	  	  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Natural Spawning!", "Zombie", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.ZOMBIE, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	  		  }
	  	  }  
	  	 	  else{
	  	 	}
	    }
		  else if(DayCounter.getWeeklyConfig() == 2){
		  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Bat", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Bat", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	   		  }
  }  	
  	  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Blaze", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BLAZE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  		  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CAVE_SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Chicken", "#").getInt()); i++){
  			  Random roll = new Random();
  		  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Chicken", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CHICKEN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Cow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Cow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Creeper", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CREEPER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Enderman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDERMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Ghast", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Giant", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Guardian", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Guardian", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GUARDIAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Horse", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Horse", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.HORSE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "IronGolemn", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "IronGolemn", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MAGMA_CUBE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "MushroomCow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "MushroomCow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MUSHROOM_COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Ocelot", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Ocelot", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.OCELOT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
 	  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Pig", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Pig", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
 	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG_ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Rabbit", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Rabbit", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.RABBIT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Sheep", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Sheep", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SHEEP, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SKELETON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Slime", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SLIME, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Snowman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Snowman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SNOWMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Spider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Squid", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Squid", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SQUID, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Witch", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITCH, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Wither", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITHER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Wolf", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Wolf", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WOLF, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Natural Spawning!", "Zombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	  }  
  	 	  else{
  	 	}
    }
	  else if(DayCounter.getWeeklyConfig() == 3){
		  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Bat", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Bat", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	   		  }
  }  	
  	  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Blaze", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BLAZE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  		  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CAVE_SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Chicken", "#").getInt()); i++){
  			  Random roll = new Random();
  		  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Chicken", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CHICKEN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Cow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Cow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Creeper", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CREEPER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Enderman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDERMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Ghast", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Giant", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Guardian", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Guardian", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GUARDIAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Horse", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Horse", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.HORSE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "IronGolemn", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "IronGolemn", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MAGMA_CUBE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "MushroomCow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "MushroomCow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MUSHROOM_COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Ocelot", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Ocelot", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.OCELOT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
 	  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Pig", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Pig", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
 	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG_ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Rabbit", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Rabbit", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.RABBIT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Sheep", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Sheep", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SHEEP, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SKELETON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Slime", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SLIME, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Snowman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Snowman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SNOWMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Spider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Squid", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Squid", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SQUID, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Witch", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITCH, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Wither", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITHER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Wolf", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Wolf", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WOLF, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Natural Spawning!", "Zombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	  }  
  	 	  else{
  	 	}
    }
	  else if(DayCounter.getWeeklyConfig() == 4){
		  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Bat", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Bat", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	   		  }
  }  	
  	  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Blaze", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BLAZE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  		  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CAVE_SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Chicken", "#").getInt()); i++){
  			  Random roll = new Random();
  		  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Chicken", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CHICKEN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Cow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Cow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Creeper", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CREEPER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Enderman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDERMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Ghast", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Giant", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Guardian", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Guardian", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GUARDIAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Horse", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Horse", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.HORSE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "IronGolemn", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "IronGolemn", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MAGMA_CUBE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "MushroomCow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "MushroomCow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MUSHROOM_COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Ocelot", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Ocelot", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.OCELOT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
 	  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Pig", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Pig", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
 	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG_ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Rabbit", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Rabbit", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.RABBIT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Sheep", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Sheep", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SHEEP, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SKELETON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Slime", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SLIME, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Snowman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Snowman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SNOWMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Spider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Squid", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Squid", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SQUID, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Witch", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITCH, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Wither", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITHER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Wolf", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Wolf", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WOLF, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Natural Spawning!", "Zombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	  }  
  	 	  else{
  	 	}
    }
	  else if(DayCounter.getWeeklyConfig() == 5){
		  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
	  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Bat", "#").getInt()); i++){
	  			  Random roll = new Random();
	  			  int answer = roll.nextInt(100) + 1;
	  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Bat", "%").getInt())){
	  				  Location<World> location = spawnedEntity.getLocation();
	  				  World world = location.getExtent();
	  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
	  				  	event.getEntities().add(newEntity);
	  			  }
	   		  }
  }  	
  	  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Blaze", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Blaze", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BLAZE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "CaveSpider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  		  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "CaveSpider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CAVE_SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Chicken", "#").getInt()); i++){
  			  Random roll = new Random();
  		  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Chicken", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CHICKEN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Cow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Cow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Creeper", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Creeper", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.CREEPER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "EnderDragon", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "EnderDragon", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Enderman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Enderman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ENDERMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Ghast", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Ghast", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Giant", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Giant", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Guardian", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Guardian", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.GUARDIAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Horse", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Horse", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.HORSE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "IronGolemn", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "IronGolemn", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "MagmaCube", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "MagmaCube", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MAGMA_CUBE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "MushroomCow", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "MushroomCow", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.MUSHROOM_COW, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Ocelot", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Ocelot", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.OCELOT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
 	  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Pig", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Pig", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
 	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "PigZombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "PigZombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.PIG_ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Rabbit", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Rabbit", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.RABBIT, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Sheep", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Sheep", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SHEEP, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Skeleton", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Skeleton", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SKELETON, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Slime", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Slime", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SLIME, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Snowman", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Snowman", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SNOWMAN, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Spider", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Spider", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SPIDER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Squid", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Squid", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.SQUID, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Witch", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Witch", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITCH, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	 }  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Wither", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Wither", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WITHER, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Wolf", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Wolf", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.WOLF, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	}  
  	  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Zombie", "#").getInt()); i++){
  			  Random roll = new Random();
  			  int answer = roll.nextInt(100) + 1;
  			  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Natural Spawning!", "Zombie", "%").getInt())){
  				  Location<World> location = spawnedEntity.getLocation();
  				  World world = location.getExtent();
  				  Entity newEntity = world.createEntity(EntityTypes.ZOMBIE, location.getPosition());
  				  	event.getEntities().add(newEntity);
  			  }
  		  }
  	  }  
  	 	  else{
  	 	}
    }
}
		  
		    
}