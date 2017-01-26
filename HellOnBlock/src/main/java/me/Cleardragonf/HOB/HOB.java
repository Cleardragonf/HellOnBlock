package me.Cleardragonf.HOB;

import java.io.File;
import java.util.logging.Logger;

import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.config.DefaultConfig;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.event.game.state.GameStartingServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;

import com.google.inject.Inject;

import me.Cleardragonf.HOB.ConfigurationManager;
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
  
		  //this is the working code V
		  String a = event.getEntities().iterator().next().getType().getName();
		  
		  Entity entity = event.getEntities().iterator().next();
			  	if(entity.getType().equals(EntityTypes.CREEPER)){
				  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));
			  	}		  	
			  	else if(entity.getType().equals(EntityTypes.BAT)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.BLAZE)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.CAVE_SPIDER)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.CHICKEN)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.COW)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.ENDER_CRYSTAL)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.ENDER_DRAGON)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.ENDERMAN)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.ENDERMITE)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.GHAST)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.GIANT)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.GUARDIAN)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.HORSE)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.IRON_GOLEM)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.MAGMA_CUBE)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.MUSHROOM_COW)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.OCELOT)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.PIG)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.PIG_ZOMBIE)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.POLAR_BEAR)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.RABBIT)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SHEEP)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SHULKER)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SILVERFISH)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SKELETON)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SLIME)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SNOWMAN)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SPIDER)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.SQUID)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.VILLAGER)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.WITCH)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.WITHER)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.WOLF)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
			  	else if(entity.getType().equals(EntityTypes.ZOMBIE)){
					  Sponge.getGame().getServer().getBroadcastChannel().send(Text.of("A " + a + " Just Spawned"));

			  	}
	  }
	  
	  @Listener
	  public void enable(GameStartingServerEvent event)
	  {
	    ConfigurationManager.getInstance().setup(this.configFile, this.configManager);
	  }
	  
	}
