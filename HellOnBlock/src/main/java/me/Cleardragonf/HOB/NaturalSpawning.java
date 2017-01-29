package me.Cleardragonf.HOB;

import java.util.Random;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class NaturalSpawning {
	  @Listener
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

		  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
			  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Bat", "Bat#").getInt()); i++){
			  			  Random roll = new Random();
			  			  int answer = roll.nextInt(100) + 1;
			  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Bat", "Bat%").getInt())){
			  				  Location<World> location = spawnedEntity.getLocation();
			  				  World world = location.getExtent();
			  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
			  				  	event.getEntities().add(newEntity);
			  			  }
			   		  }
		  }  	
		  	  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Blaze", "Blaze#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Blaze", "Blaze%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.BLAZE, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "CaveSpider", "CaveSpider#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  		  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "CaveSpider", "CaveSpider%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.CAVE_SPIDER, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	 }  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Chicken", "Chicken#").getInt()); i++){
		  			  Random roll = new Random();
		  		  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Chicken", "Chicken%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.CHICKEN, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Cow", "Cow#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Cow", "Cow%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.COW, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.CREEPER)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Creeper", "Creeper#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Creeper", "Creeper%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.CREEPER, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	 }  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "EnderDragon", "EnderDragon#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "EnderDragon", "EnderDragon%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	 }  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Enderman", "Enderman#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Enderman", "Enderman").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.ENDERMAN, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Ghast", "Ghast#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Ghast", "Ghast%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	 }  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Giant", "Giant#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Giant", "Giant%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Guardian", "Guardian#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Guardian", "Guardian%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.GUARDIAN, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Horse", "Horse#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Horse", "Horse%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.HORSE, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "IronGolemn", "IronGolemn#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "IronGolemn", "IronGolemn%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.BAT, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "MagmaCube", "MagmaCube#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "MagmaCube", "MagmaCube%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.MAGMA_CUBE, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "MushroomCow", "MushroomCow").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "MushroomCow", "MushroomCow%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.MUSHROOM_COW, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Ocelot", "Ocelot#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Ocelot", "Ocelot%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.OCELOT, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		 	  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Pig", "Pig#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Pig", "Pig%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.PIG, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		 	 }  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "PigZombie", "PigZombie#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "PigZombie", "PigZombie%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.PIG_ZOMBIE, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Rabbit", "Rabbit#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Rabbit", "Rabbit%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.RABBIT, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Sheep", "Sheep#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Sheep", "Sheep%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.SHEEP, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Skeleton", "Skeleton#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Skeleton", "Skeleton%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.SKELETON, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Slime", "Slime#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Slime", "Slime%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.SLIME, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Snowman", "Snowman#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Snowman", "Snowman%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.SNOWMAN, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Spider", "Spider#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Spider", "Spider%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.SPIDER, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Squid", "Squid#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Squid", "Squid%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.SQUID, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Witch", "Witch#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Witch", "Witch%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.WITCH, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	 }  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Wither", "Wither").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Wither", "Wither%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.WITHER, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Wolf", "Wolf#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Wolf", "Wolf%").getInt())){
		  				  Location<World> location = spawnedEntity.getLocation();
		  				  World world = location.getExtent();
		  				  Entity newEntity = world.createEntity(EntityTypes.WOLF, location.getPosition());
		  				  	event.getEntities().add(newEntity);
		  			  }
		  		  }
		  	}  
		  	  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
		  		  for (int i = 0; i< (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Zombie", "Zombie#").getInt()); i++){
		  			  Random roll = new Random();
		  			  int answer = roll.nextInt(100) + 1;
		  			  if (answer <= (ConfigurationManager.getInstance().getConfig().getNode("Spawning!", "Zombie", "Zombie%").getInt())){
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
