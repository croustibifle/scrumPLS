package core;

public class User {
	
	private String pseudo;
	private String mdp;
	
	public User(String pseudo, String mdp)
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
