

public class GYM {
	
	  public static  Player fight(Player player1,Player player2){
		  
		 
		  
		 Pokemon pok1[] = player1.getPokemons();
		  
		 Pokemon pok2[]= player2.getPokemons();
		  
		  int i,win1=0,win2=0;
		  
		  
		  for(i=0;i<3;i++){
		  if(pok1[i].getType()==PokemonType.FIRE){
			  
			  if(pok2[i].getType()==PokemonType.FIRE){
				  
				  double temp;
				  temp = (double) (Math.random());
				  if(temp<0.5){
					  win1++;			  
				  }
				  else win2++;
			  }
			  else if(pok2[i].getType()==PokemonType.GRASS){
				  win1++;
			  }
			  else if(pok2[i].getType()==PokemonType.WATER){
				  win2++;
			  }
			  
		  }
		  else if(pok1[i].getType()==PokemonType.GRASS){
			  
			  if(pok2[i].getType()==PokemonType.FIRE){
				  win2++;
			  }
			  else if(pok2[i].getType()==PokemonType.GRASS){
				  double temp;
				  temp = (double) (Math.random());
				  if(temp<0.5)
					  win1++;
					  else win2++;	  
			  }
			  else if(pok2[i].getType()==PokemonType.WATER){
					win1++;  
				  }
				  
		  }
		  else if(pok1[i].getType()==PokemonType.WATER){
			  
			  if(pok2[i].getType()==PokemonType.FIRE){
				  
				  win1++;
			  }
			  else if(pok2[i].getType()==PokemonType.GRASS){
				  win2++;
			  }
			  else if(pok2[i].getType()==PokemonType.WATER){
				  double temp;
				  temp = (double) (Math.random());
				  if(temp<0.5)
					  win1++;
					  else win2++;
			  }
		  }
		  
		  }
		  if(win1==2){
			  
			  player1.setLevel(1);
			 System.out.printf("Winner is [%s], and his/her level becomes [%d].",player1.getPlayerName(),player1.getLevel());
		  }
		  else{
			  player2.setLevel(1);
			  System.out.printf("Winner is [%s], and his/her level becomes [%d].",player2.getPlayerName(),player2.getLevel());
		  }
		return null;
		
		  
		  
	  }
	  

}
