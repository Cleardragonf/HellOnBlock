package me.Cleardragonf.HOB;

import java.math.BigDecimal;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.cause.NamedCause;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;
import org.spongepowered.api.event.entity.DestructEntityEvent;
import org.spongepowered.api.event.filter.cause.First;
import org.spongepowered.api.event.service.ChangeServiceProviderEvent;
import org.spongepowered.api.service.economy.EconomyService;
import org.spongepowered.api.text.Text;

public class EcoRewards {
	private EconomyService economyService;
	@Listener
	public void onChangeServiceProvider(ChangeServiceProviderEvent event){
		if(event.getService().equals(EconomyService.class)){
			economyService = (EconomyService) event.getNewProviderRegistration().getProvider();
		}
	}
	
	@Listener
	public void MobDeath(DestructEntityEvent.Death event, @First EntityDamageSource src){
		Entity killer = src.getSource();
		if ((killer instanceof Player)){
			Player player = (Player)killer;
			String player2 = player.getUniqueId().toString();
			
			if(event.getTargetEntity().getType().equals(EntityTypes.BAT)){
				player.sendMessage(Text.of("You Killed a chicken & earned some Money"));
				Cause cause = Cause.of(NamedCause.source(((HOB) HOB.getInstance()).getPluginContainer()));
				BigDecimal bd = new BigDecimal("50");
				this.economyService.getOrCreateAccount(player2).get().deposit(economyService.getDefaultCurrency(), bd, cause);
			}
		}
	}
}
