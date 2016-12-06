
public class Player {
	
	
public Player(String name){
		
		this.playerName = name;
	}
	
	

	public String playerName;
	
	public Pokemon pokemons;
	
	public int level=1;

	public String getPlayerName() {
		return playerName;
	}
    public setPokemons (Pokemon p1){
		
    	return p1;
		
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Pokemon getPokemons() {
		return pokemons;
	}

	public void setPokemons(Pokemon pokemons) {
		this.pokemons = pokemons;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

}
