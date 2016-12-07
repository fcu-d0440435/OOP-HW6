
public class Pokemon {
	

	private int cp;
	
	private final String name; 
	private final PokemonType type;

	
	public Pokemon(String name, PokemonType type, int cp) {
		
		this.name = name;
		this.type=type;
		this.cp = cp;
	}


	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public PokemonType getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	

	

}
