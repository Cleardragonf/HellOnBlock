package me.Cleardragonf.HOB.Spawning;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class SpawnDecision {
	public void newCreeper(Location<World> spawnLocation) {

		List<String> list = Arrays.asList("Hostile", "Peaceful", "Neutral");
		Random rand = new Random();
		String ListResults = list.get(rand.nextInt(list.size()));
		if(ListResults =="Hostile"){
		    NaturalSpawning hostileSpawns = new NaturalSpawning();
		    hostileSpawns.Hostiles(spawnLocation);
	    }
		if(ListResults == "Peaceful"){
			NaturalSpawning peacefulSpawns = new NaturalSpawning();
			peacefulSpawns.Hostiles(spawnLocation);

		}
		if(ListResults == "Neutral"){
			NaturalSpawning neutralSpawns = new NaturalSpawning();
			neutralSpawns.Hostiles(spawnLocation);

		}
	}
}

