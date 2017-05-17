package core;

public class User {
	
	private String pseudo;
	private String mdp;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User(String pseudo, String mdp, String type)
	{
		this.pseudo = pseudo;
		this.mdp = mdp;
	}
	
	public String getMdp()
	{
		return mdp;
	}
	public String getPseudo()
	{
		return pseudo;
	}
}
