
public class Pokemon {
	

	public int cp;
	
	private final String name;
	public enum  PokemonType {
		  FIRE, WATER, GRASS
		}
	public Pokemon(String name, PokemonType type, int cp) {
		
		this.name = name;
		this.type=type;
		this.cp = cp;
	}
	
	
	private PokemonType type;
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public PokemonType getType() {
		return type;
	}
	public void setType(PokemonType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	
	
	
	

	

}
