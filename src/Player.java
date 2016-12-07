
public class Player {
	
	
public Player(String name){
		
		this.playerName = name;
	}
	
	
  
	private String playerName;
	
	private Pokemon[] pokemons;
	
	private int level=1;

	public String getPlayerName() {
		return playerName;
	}
    
	
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	
	public Pokemon[] getPokemons() {
		return pokemons;
	} 

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = this.level+level;
	}
	

}
