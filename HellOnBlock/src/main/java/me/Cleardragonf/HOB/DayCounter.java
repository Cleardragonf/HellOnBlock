package me.Cleardragonf.HOB;

import org.spongepowered.api.Sponge;

public class DayCounter {
	
	  public static int days = 6;
	  public static int getCustDays(){
		  return days;
	  }
	  public static int CustWeek = 1;
	  public static int getCustWeek(){
		  return CustWeek;
	  }
	  public static int config = 1;
	  public static int getWeeklyConfig(){
		  return config;
	  }
	  
	  public void Days(){
	  		  long currentTime = Sponge.getGame().getServer().getDefaultWorld().get().getWorldTime();
	  		  long base = 23000;
	  		  if (base <= currentTime){
	  			  if(24000 >= currentTime){
	  	  			  DayCounter.days = DayCounter.days + 1;
	  				  Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(24001);
	  			  }
	  			  else if(46000 <= currentTime){
	  				  if(48000 >= currentTime){
	  	  				DayCounter.days = DayCounter.days + 1;
		  				  Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(48001);
	  				  }
	  			  }
	  			  else if(69000 <= currentTime){
	  				  if(72000 >= currentTime){
	  	  				DayCounter.days = DayCounter.days + 1;
		  				  Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(72001);
	  				  }
	  			  }
	  			  else if(92000 <= currentTime){
	  				  if(96000 >= currentTime){
	  	  				DayCounter.days = DayCounter.days + 1;
		  				  Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(96001);
	  				  }
	  			  }
	  			  else if(70000 <= currentTime){
	  				  if(120000 >= currentTime){
	  	  				DayCounter.days = DayCounter.days + 1;
		  				  Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(120001);
	  				  }
	  			  }
	  			  else if(138000 <= currentTime){
	  				  if(144000 >= currentTime){
	  	  				DayCounter.days = DayCounter.days + 1;
		  				  Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(144001);
	  				  }
	  			  }
	  			  else if(161000 <= currentTime){
	  				  if(168000 >= currentTime){
	  	  				DayCounter.days = DayCounter.days + 1;
		  				  Sponge.getGame().getServer().getDefaultWorld().get().setWorldTime(0);
	  				  }
	  			  }
	  		  }  		  
	  	  }
	  public void weeks(){
		  int week = DayCounter.days;
		  if (7 >= week){
			  DayCounter.CustWeek = 1;
			  DayCounter.config= 1;
		  }
		  else if(14 >= week){
			  if(8 <= week){
				  DayCounter.CustWeek = 2;
				  DayCounter.config= 2;

			  }
		  }
		  else if(21 >= week){
			  if(15 <= week){
				  DayCounter.CustWeek = 3;
				  DayCounter.config= 3;

			  }
		  }
		  else if(28 >= week){
			  if(22 <= week){
				  DayCounter.CustWeek = 4;
				  DayCounter.config= 4;

			  }
		  }
		  else if(30 >= week){
			  if(29 <= week){
				  DayCounter.CustWeek = 5;
				  DayCounter.config= 5;

			  }
		  }
	  }
	  public void reset(){
		  if(30 < DayCounter.getCustDays()){
			  DayCounter.days = 1;
			  DayCounter.CustWeek = 1;
			  
		  }
	  }
}