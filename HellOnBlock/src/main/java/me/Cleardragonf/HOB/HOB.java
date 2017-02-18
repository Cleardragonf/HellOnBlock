package me.Cleardragonf.HOB;

import java.io.File;
import java.util.logging.Logger;

import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;
import org.spongepowered.api.event.entity.DestructEntityEvent;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.event.filter.cause.First;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.text.Text;

import com.google.inject.Inject;

import me.Cleardragonf.HOB.Commands.CommandManager;
import me.Cleardragonf.HOB.MobMechanics.CustomMobProperties;
import me.Cleardragonf.HOB.Spawning.BonusSpawning;
import me.Cleardragonf.HOB.Spawning.NaturalSpawning;

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
  
  private static HOB instance;
  
  public static HOB getInstance(){
	  return instance;
  }
  @Inject public  PluginContainer pluginContainer;
  public  PluginContainer getPluginContainer() {
     return pluginContainer;
  }

  @Inject
	@ConfigDir(sharedRoot = false)
	private File configDir;
  

	  
  @Listener
  public void allhands(GamePreInitializationEvent event){
	  ConfigurationManager.getInstance().ConfigurationManager2(configDir);
	  ConfigurationManager.getInstance().enable();
	  instance = this;
	  //setting the Commands here.
	  CommandSpec TimeCommand = CommandSpec.builder()
			  .description(Text.of("Tells the time and day of the month"))
			  .executor(new CommandManager())
			  .build();
	  game.getCommandManager().register(this, TimeCommand, "time");
	  CommandSpec SetDayCommand = CommandSpec.builder()
			  .description(Text.of("Set the Date in Minecraft"))
			  .executor(new CommandManager())
			  .build();
	  game.getCommandManager().register(this, SetDayCommand, "setday");
	 
  }
  	  //the below portion of the code calls the methods for This game upon each Entity being spawned
	  @Listener
	  public void entityData(SpawnEntityEvent event){
		  NaturalSpawning spawn1 = new NaturalSpawning();
		  BonusSpawning spawn2 = new BonusSpawning();
		  CustomMobProperties spawn3 = new CustomMobProperties();
  		  DayCounter labelTest = new DayCounter(); 		  
  		  
  		  spawn1.onEntitySpawn(event);
		  spawn2.checkEntitySpawn(event);
		  spawn3.entityData(event);
  		  labelTest.Days();
  	  }

	  @Listener
	  public void daytracker3(GameStartedServerEvent event){
		  Sponge.getScheduler().createTaskBuilder().execute(task -> {
			  DayCounter getStarted = new DayCounter();
			  getStarted.Days();
		  }).intervalTicks(20).submit(this);
	  }
	  @Listener
	  public void onEntityDeath(DestructEntityEvent.Death event, @First EntityDamageSource src){
		  EcoRewards eco = new EcoRewards();
		  eco.MobDeath(event, src);
	  }
	  
  }
	  
