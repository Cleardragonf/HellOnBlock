package me.Cleardragonf.HOB;

import java.io.File;
import java.util.logging.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.config.DefaultConfig;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import com.google.inject.Inject;
import me.Cleardragonf.HOB.Spawning.BonusSpawning;
import me.Cleardragonf.HOB.Spawning.CustomMobProperties;
import me.Cleardragonf.HOB.Spawning.NaturalSpawning;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;

@Plugin (id="hellonblock", name="HOBs", version="Beta 1.0.0")
public class HOB {
	
    /**/
    public static final String FILE_LOCATION = "mods/HellOnSpoangee/portals.dat";
    public static final String NAME = "[HOS]";

@Inject
  private Logger logger;



	@Inject
	@ConfigDir(sharedRoot = false)
	private File configDir;
	
  @Inject
  @DefaultConfig(sharedRoot=false)
  private File configFile;
  @Inject
  @DefaultConfig(sharedRoot=false)
  ConfigurationLoader<CommentedConfigurationNode> configManager;

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
  
  @Listener
  public void enable(GamePreInitializationEvent event)
  {
    ConfigurationManager.getInstance().setup(this.configFile, this.configManager);
  }
  
  /*@Listener
  public void trial(SpawnEntityEvent event){

	  int a = 0000;
	  long b = Sponge.getGame().getServer().getWorld("world").get().getProperties().getWorldTime();
	  if(a < b){
		  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of(b));
	  }
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
	  long c =+ b;
  	  if(spawnedEntity.getType().equals(EntityTypes.BAT)){
		Sponge.getGame().getServer().getBroadcastChannel().send(Text.of(c));
  	  }
  }
*/	  	  
  
  	  //the below portion of the code calls the methods for This game upon each Entity being spawned
	  @Listener
	  public void entityData(SpawnEntityEvent event){
		  NaturalSpawning spawn1 = new NaturalSpawning();
		  BonusSpawning spawn2 = new BonusSpawning();
		  CustomMobProperties spawn3 = new CustomMobProperties();
		  
		  spawn1.onEntitySpawn(event);
		  spawn2.checkEntitySpawn(event);
		  spawn3.entityData(event);
	  }
  }
	  

