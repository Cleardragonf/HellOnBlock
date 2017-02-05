package me.Cleardragonf.HOB;

import java.io.File;
import java.util.logging.Logger;

import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;

import com.google.inject.Inject;

@Plugin (id="hellonblock", name="HOBs", version="Beta 1.0.0")
public class HOB {
	
    /**/
    public static final String FILE_LOCATION = "mods/HellOnSpoangee/portals.dat";
    public static final String NAME = "[HOS]";

@Inject
  private Logger logger;

  @Inject
  Game game;
  
  @Inject
  private void setLogger(Logger logger)
  {
    this.logger = logger;
  }
  
  public Logger getLogger()
  {
    return this.logger;
  }
  
  @Inject
	@ConfigDir(sharedRoot = false)
	private File configDir;
  
  
  @Listener
  public void allhands(GamePreInitializationEvent event){
	  DayCounter.config = 1;
	  ConfigurationManager.getInstance().ConfigurationManager2(configDir);
	  ConfigurationManager.getInstance().enable();
  }
  	  //the below portion of the code calls the methods for This game upon each Entity being spawned
	  @Listener
	  public void entityData(SpawnEntityEvent event){
		  NaturalSpawning spawn1 = new NaturalSpawning();
		  BonusSpawning spawn2 = new BonusSpawning();
		  CustomMobProperties spawn3 = new CustomMobProperties();
  		  DayCounter labelTest = new DayCounter();
  		  int ofDays = DayCounter.getCustDays();
  		  
		  spawn1.onEntitySpawn(event);
		  spawn2.checkEntitySpawn(event);
		  spawn3.entityData(event);
  		  labelTest.Days();
  		  
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
	  		  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("Today's Date: " + ofDays));
		  }


	  }
  }
	  
