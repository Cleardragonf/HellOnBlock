package me.Cleardragonf.HOB;

import java.util.Random;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class BonusSpawning {
	  @Listener
	  public void checkEntitySpawn(SpawnEntityEvent event){
	  	  //This is the testing code v
	  	  Entity spawnedEntity = null;
	  	  for(Entity entity : event.getEntities()){//
	  		  if(entity != null){
	  			  spawnedEntity = entity;
	  			  break;
	  		  }
	  	  }
	  	  if(spawnedEntity == null){
	  		  return;
	  	  }
	  	  if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
	  		  return;
	  	  }  		 
	  	  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
	  		  return;
	  	  }
	  	  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
	  		  return;
	  	  }
	  	  else if(spawnedEntity.getType().equals(EntityTypes.CHESTED_MINECART)){
	  		  return;
	  	  }
	  	  else if(spawnedEntity.getType().equals(EntityTypes.FALLING_BLOCK)){
	  		  return;
	  	  }
	  	  else if(spawnedEntity.getType().equals(EntityTypes.ITEM)){
	  		  return;
	  	  }
	  	  else if(spawnedEntity.getType().equals(EntityTypes.UNKNOWN)){
	  		  return;
	  	  }
	  	  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
	  		  return;
	  	  }else{
	  		if(DayCounter.getWeeklyConfig()==1){
	  			if(ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").getString().equals("True")){
		  			  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Ender Dragon", "#").getInt()); i++){
		  				  Random roll = new Random();
		  				  int answer = roll.nextInt(100)+1;
		  				  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Ender Dragon", "%").getInt())){
		  					  Location<World> location = spawnedEntity.getLocation();
		  					  World world = location.getExtent();
		  					  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
		  					  	event.getEntities().add(newEntity);
		  				  }
		  			  }
		  		  } else {
					ConfigurationManager.getInstance();
					if(ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Ghast", "Enabled").getString().equals("True")){
						  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Ghast", "#").getInt()); i++){
							  Random roll = new Random();
							  int answer = roll.nextInt(100)+1;
							  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Ghast", "%").getInt())){
								  Location<World> location = spawnedEntity.getLocation();
								  World world = location.getExtent();
								  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
								  	event.getEntities().add(newEntity);
							  }
						  }
					  } else {
						ConfigurationManager.getInstance();
						if(ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Giant", "Enabled").getString().equals("True")){
							  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Giant", "#").getInt()); i++){
								  Random roll = new Random();
								  int answer = roll.nextInt(100)+1;
								  if (answer <= (ConfigurationManager.getInstance().getConfig1().getNode("Spawning Bonuses!", "Giant", "%").getInt())){
									  Location<World> location = spawnedEntity.getLocation();
									  World world = location.getExtent();
									  Entity newEntity = world.createEntity(EntityTypes.GIANT, location.getPosition());
									  	event.getEntities().add(newEntity);
								  }
							  }
						  }
					}
				}
		  		  
		  	  }
	  	  	else if(DayCounter.getWeeklyConfig()==2){
		  			if(ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").getString().equals("True")){
			  			  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Ender Dragon", "#").getInt()); i++){
			  				  Random roll = new Random();
			  				  int answer = roll.nextInt(100)+1;
			  				  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Ender Dragon", "%").getInt())){
			  					  Location<World> location = spawnedEntity.getLocation();
			  					  World world = location.getExtent();
			  					  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
			  					  	event.getEntities().add(newEntity);
			  				  }
			  			  }
			  		  } else {
						ConfigurationManager.getInstance();
						if(ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Ghast", "Enabled").getString().equals("True")){
							  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Ghast", "#").getInt()); i++){
								  Random roll = new Random();
								  int answer = roll.nextInt(100)+1;
								  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Ghast", "%").getInt())){
									  Location<World> location = spawnedEntity.getLocation();
									  World world = location.getExtent();
									  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
									  	event.getEntities().add(newEntity);
								  }
							  }
						  } else {
							ConfigurationManager.getInstance();
							if(ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Giant", "Enabled").getString().equals("True")){
								  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Giant", "#").getInt()); i++){
									  Random roll = new Random();
									  int answer = roll.nextInt(100)+1;
									  if (answer <= (ConfigurationManager.getInstance().getConfig2().getNode("Spawning Bonuses!", "Giant", "%").getInt())){
										  Location<World> location = spawnedEntity.getLocation();
										  World world = location.getExtent();
										  Entity newEntity = world.createEntity(EntityTypes.GIANT, location.getPosition());
										  	event.getEntities().add(newEntity);
									  }
								  }
							  }
						}
					}
			  		  
			  	  }
	  	  		else if(DayCounter.getWeeklyConfig()==3){
			  			if(ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").getString().equals("True")){
				  			  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Ender Dragon", "#").getInt()); i++){
				  				  Random roll = new Random();
				  				  int answer = roll.nextInt(100)+1;
				  				  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Ender Dragon", "%").getInt())){
				  					  Location<World> location = spawnedEntity.getLocation();
				  					  World world = location.getExtent();
				  					  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
				  					  	event.getEntities().add(newEntity);
				  				  }
				  			  }
				  		  } else {
							ConfigurationManager.getInstance();
							if(ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Ghast", "Enabled").getString().equals("True")){
								  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Ghast", "#").getInt()); i++){
									  Random roll = new Random();
									  int answer = roll.nextInt(100)+1;
									  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Ghast", "%").getInt())){
										  Location<World> location = spawnedEntity.getLocation();
										  World world = location.getExtent();
										  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
										  	event.getEntities().add(newEntity);
									  }
								  }
							  } else {
								ConfigurationManager.getInstance();
								if(ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Giant", "Enabled").getString().equals("True")){
									  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Giant", "#").getInt()); i++){
										  Random roll = new Random();
										  int answer = roll.nextInt(100)+1;
										  if (answer <= (ConfigurationManager.getInstance().getConfig3().getNode("Spawning Bonuses!", "Giant", "%").getInt())){
											  Location<World> location = spawnedEntity.getLocation();
											  World world = location.getExtent();
											  Entity newEntity = world.createEntity(EntityTypes.GIANT, location.getPosition());
											  	event.getEntities().add(newEntity);
										  }
									  }
								  }
							}
						}
				  		  
				  	  }
	  	  			else if(DayCounter.getWeeklyConfig()==4){
				  			if(ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").getString().equals("True")){
					  			  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Ender Dragon", "#").getInt()); i++){
					  				  Random roll = new Random();
					  				  int answer = roll.nextInt(100)+1;
					  				  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Ender Dragon", "%").getInt())){
					  					  Location<World> location = spawnedEntity.getLocation();
					  					  World world = location.getExtent();
					  					  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
					  					  	event.getEntities().add(newEntity);
					  				  }
					  			  }
					  		  } else {
								ConfigurationManager.getInstance();
								if(ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Ghast", "Enabled").getString().equals("True")){
									  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Ghast", "#").getInt()); i++){
										  Random roll = new Random();
										  int answer = roll.nextInt(100)+1;
										  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Ghast", "%").getInt())){
											  Location<World> location = spawnedEntity.getLocation();
											  World world = location.getExtent();
											  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
											  	event.getEntities().add(newEntity);
										  }
									  }
								  } else {
									ConfigurationManager.getInstance();
									if(ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Giant", "Enabled").getString().equals("True")){
										  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Giant", "#").getInt()); i++){
											  Random roll = new Random();
											  int answer = roll.nextInt(100)+1;
											  if (answer <= (ConfigurationManager.getInstance().getConfig4().getNode("Spawning Bonuses!", "Giant", "%").getInt())){
												  Location<World> location = spawnedEntity.getLocation();
												  World world = location.getExtent();
												  Entity newEntity = world.createEntity(EntityTypes.GIANT, location.getPosition());
												  	event.getEntities().add(newEntity);
											  }
										  }
									  }
								}
							}
					  		  
					  	  }
	  	  				else if(DayCounter.getWeeklyConfig()==5){
					  			if(ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Ender Dragon", "Enabled").getString().equals("True")){
						  			  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Ender Dragon", "#").getInt()); i++){
						  				  Random roll = new Random();
						  				  int answer = roll.nextInt(100)+1;
						  				  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Ender Dragon", "%").getInt())){
						  					  Location<World> location = spawnedEntity.getLocation();
						  					  World world = location.getExtent();
						  					  Entity newEntity = world.createEntity(EntityTypes.ENDER_DRAGON, location.getPosition());
						  					  	event.getEntities().add(newEntity);
						  				  }
						  			  }
						  		  } else {
									ConfigurationManager.getInstance();
									if(ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Ghast", "Enabled").getString().equals("True")){
										  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Ghast", "#").getInt()); i++){
											  Random roll = new Random();
											  int answer = roll.nextInt(100)+1;
											  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Ghast", "%").getInt())){
												  Location<World> location = spawnedEntity.getLocation();
												  World world = location.getExtent();
												  Entity newEntity = world.createEntity(EntityTypes.GHAST, location.getPosition());
												  	event.getEntities().add(newEntity);
											  }
										  }
									  } else {
										ConfigurationManager.getInstance();
										if(ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Giant", "Enabled").getString().equals("True")){
											  for (int i = 0; i < (ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Giant", "#").getInt()); i++){
												  Random roll = new Random();
												  int answer = roll.nextInt(100)+1;
												  if (answer <= (ConfigurationManager.getInstance().getConfig5().getNode("Spawning Bonuses!", "Giant", "%").getInt())){
													  Location<World> location = spawnedEntity.getLocation();
													  World world = location.getExtent();
													  Entity newEntity = world.createEntity(EntityTypes.GIANT, location.getPosition());
													  	event.getEntities().add(newEntity);
												  }
											  }
										  }
									}
								}
						  		  
						  	  }
				  		  }
			
			
					
				
	  	  
	    }
}