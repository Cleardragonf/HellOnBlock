package me.Cleardragonf.HOB.MobMechanics;

import java.util.Optional;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.text.Text;

import me.Cleardragonf.HOB.ConfigurationManager;
import me.Cleardragonf.HOB.DayCounter;


public class CustomMobProperties {
	  @Listener
	  public void entityData(SpawnEntityEvent event){
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


	  	  if(DayCounter.getWeeklyConfig() == 1){
			  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "Bat", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "BLAZE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "CAVE_SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "CHICKEN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if (spawnedEntity.getType().equals(EntityTypes.CREEPER)){
				  Optional<Integer>blast = Optional.of(5);
				  spawnedEntity.offer(Keys.EXPLOSION_RADIUS, blast);
				  spawnedEntity.offer(Keys.CREEPER_CHARGED, true);
				  spawnedEntity.offer(Keys.DISPLAY_NAME, Text.of("Fred The Almighty!"));
	  		  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "ENDER_DRAGON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "ENDERMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMITE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "ENDERMITE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "HORSE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "IRON_GOLEM", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "MAGMA_CUBE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "MUSHROOM_COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "OCELOT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "PIG", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "PIG_ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.POLAR_BEAR)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "POLAR_BEAR", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "RABBIT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SHEEP", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHULKER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SHULKER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SILVERFISH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SILVERFISH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SKELETON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SLIME", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SNOWMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "SQUID", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.VILLAGER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "VILLAGER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "WITCH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "WITHER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "WOLF", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig1().getNode("Custom Properties", "ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
				  spawnedEntity.offer(Keys.CAN_GRIEF, true);
				  spawnedEntity.offer(Keys.OPEN, true);
				  double a = 10;
				  spawnedEntity.offer(Keys.WALKING_SPEED, a);
			  }
			  
		  }
	  	  else if(DayCounter.getWeeklyConfig() == 2){
			  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "Bat", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "BLAZE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "CAVE_SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "CHICKEN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if (spawnedEntity.getType().equals(EntityTypes.CREEPER)){
				  Optional<Integer>blast = Optional.of(5);
				  spawnedEntity.offer(Keys.EXPLOSION_RADIUS, blast);
				  spawnedEntity.offer(Keys.CREEPER_CHARGED, true);
				  spawnedEntity.offer(Keys.DISPLAY_NAME, Text.of("Fred The Almighty!"));
	  		  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "ENDER_DRAGON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "ENDERMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMITE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "ENDERMITE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "HORSE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "IRON_GOLEM", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "MAGMA_CUBE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "MUSHROOM_COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "OCELOT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "PIG", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "PIG_ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.POLAR_BEAR)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "POLAR_BEAR", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "RABBIT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SHEEP", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHULKER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SHULKER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SILVERFISH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SILVERFISH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SKELETON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SLIME", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SNOWMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "SQUID", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.VILLAGER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "VILLAGER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "WITCH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "WITHER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "WOLF", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig2().getNode("Custom Properties", "ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
				  spawnedEntity.offer(Keys.CAN_GRIEF, true);
				  spawnedEntity.offer(Keys.OPEN, true);
				  double a = 10;
				  spawnedEntity.offer(Keys.WALKING_SPEED, a);
			  }
			  
		  }
	  	  else if(DayCounter.getWeeklyConfig() == 3){
			  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "Bat", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "BLAZE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "CAVE_SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "CHICKEN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if (spawnedEntity.getType().equals(EntityTypes.CREEPER)){
				  Optional<Integer>blast = Optional.of(5);
				  spawnedEntity.offer(Keys.EXPLOSION_RADIUS, blast);
				  spawnedEntity.offer(Keys.CREEPER_CHARGED, true);
				  spawnedEntity.offer(Keys.DISPLAY_NAME, Text.of("Fred The Almighty!"));
	  		  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "ENDER_DRAGON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "ENDERMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMITE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "ENDERMITE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "HORSE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "IRON_GOLEM", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "MAGMA_CUBE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "MUSHROOM_COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "OCELOT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "PIG", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "PIG_ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.POLAR_BEAR)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "POLAR_BEAR", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "RABBIT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SHEEP", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHULKER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SHULKER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SILVERFISH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SILVERFISH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SKELETON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SLIME", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SNOWMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "SQUID", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.VILLAGER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "VILLAGER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "WITCH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "WITHER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "WOLF", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig3().getNode("Custom Properties", "ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
				  spawnedEntity.offer(Keys.CAN_GRIEF, true);
				  spawnedEntity.offer(Keys.OPEN, true);
				  double a = 10;
				  spawnedEntity.offer(Keys.WALKING_SPEED, a);
			  }
			  
		  }
	  	  else if(DayCounter.getWeeklyConfig() == 4){
			  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "Bat", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "BLAZE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "CAVE_SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "CHICKEN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if (spawnedEntity.getType().equals(EntityTypes.CREEPER)){
				  Optional<Integer>blast = Optional.of(5);
				  spawnedEntity.offer(Keys.EXPLOSION_RADIUS, blast);
				  spawnedEntity.offer(Keys.CREEPER_CHARGED, true);
				  spawnedEntity.offer(Keys.DISPLAY_NAME, Text.of("Fred The Almighty!"));
	  		  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "ENDER_DRAGON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "ENDERMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMITE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "ENDERMITE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "HORSE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "IRON_GOLEM", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "MAGMA_CUBE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "MUSHROOM_COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "OCELOT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "PIG", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "PIG_ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.POLAR_BEAR)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "POLAR_BEAR", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "RABBIT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SHEEP", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHULKER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SHULKER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SILVERFISH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SILVERFISH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SKELETON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SLIME", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SNOWMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "SQUID", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.VILLAGER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "VILLAGER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "WITCH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "WITHER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "WOLF", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig4().getNode("Custom Properties", "ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
				  spawnedEntity.offer(Keys.CAN_GRIEF, true);
				  spawnedEntity.offer(Keys.OPEN, true);
				  double a = 10;
				  spawnedEntity.offer(Keys.WALKING_SPEED, a);
			  }
			  
		  }
	  	  else if(DayCounter.getWeeklyConfig() == 5){
			  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "Bat", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.BLAZE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "BLAZE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CAVE_SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "CAVE_SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.CHICKEN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "CHICKEN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if (spawnedEntity.getType().equals(EntityTypes.CREEPER)){
				  Optional<Integer>blast = Optional.of(5);
				  spawnedEntity.offer(Keys.EXPLOSION_RADIUS, blast);
				  spawnedEntity.offer(Keys.CREEPER_CHARGED, true);
				  spawnedEntity.offer(Keys.DISPLAY_NAME, Text.of("Fred The Almighty!"));
	  		  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDER_DRAGON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "ENDER_DRAGON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "ENDERMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ENDERMITE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "ENDERMITE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.HORSE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "HORSE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GHAST)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "GHAST", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GIANT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "GIANT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.GUARDIAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "GUARDIAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.IRON_GOLEM)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "IRON_GOLEM", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MAGMA_CUBE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "MAGMA_CUBE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.MUSHROOM_COW)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "MUSHROOM_COW", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.OCELOT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "OCELOT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "PIG", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.PIG_ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "PIG_ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.POLAR_BEAR)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "POLAR_BEAR", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.RABBIT)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "RABBIT", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHEEP)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SHEEP", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SHULKER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SHULKER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SILVERFISH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SILVERFISH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SKELETON)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SKELETON", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SLIME)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SLIME", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SNOWMAN)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SNOWMAN", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SPIDER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SPIDER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.SQUID)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "SQUID", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.VILLAGER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "VILLAGER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITCH)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "WITCH", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WITHER)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "WITHER", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.WOLF)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "WOLF", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
			  }
			  else if(spawnedEntity.getType().equals(EntityTypes.ZOMBIE)){
				  Boolean AngryValue = ConfigurationManager.getInstance().getConfig5().getNode("Custom Properties", "ZOMBIE", "Angry").getBoolean();
				  spawnedEntity.offer(Keys.ANGRY, AngryValue);
				  spawnedEntity.offer(Keys.CAN_GRIEF, true);
				  spawnedEntity.offer(Keys.OPEN, true);
				  double a = 10;
				  spawnedEntity.offer(Keys.WALKING_SPEED, a);
			  }
			  
		  }
	  }
	  
}