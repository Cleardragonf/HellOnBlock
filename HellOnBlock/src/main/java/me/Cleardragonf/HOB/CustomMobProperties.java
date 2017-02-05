package me.Cleardragonf.HOB;

import java.util.Optional;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.text.Text;


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


			  if (spawnedEntity.getType().equals(EntityTypes.CREEPER)){
					  Optional<Integer>blast = Optional.of(25);
					  spawnedEntity.offer(Keys.EXPLOSION_RADIUS, blast);
					  spawnedEntity.offer(Keys.CREEPER_CHARGED, true);
					  spawnedEntity.offer(Keys.DISPLAY_NAME, Text.of("Fred The Almighty!"));
			  }else{
			  	return;
			  }
		  }

}