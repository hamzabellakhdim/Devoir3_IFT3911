import java.util.Set;

public abstract class Location {

	protected String idLocation;
	protected String ville;

	public Location(String id,String ville){
		this.idLocation = id;
		this.ville = ville;
	}

	private void changeId(String newId){
		this.idLocation = newId;
	}

	private void changeVille(String newVille){
		this.ville = newVille;
	}

	private String getID(){
		return this.idLocation;
	}
	
	private String getVille(){
		return this.ville;
	}

}