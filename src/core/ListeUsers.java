package core;
import java.util.ArrayList;

public class ListeUsers {
	private ArrayList<User> liste;
	
	public ListeUsers()
	{
		liste = new ArrayList<User>();
	}
	
	public void addUser(String name, String mdp, String type)
	{
		if(!name.isEmpty() && ! mdp.isEmpty())
		{
			boolean b = true;
			for(User u : liste)
			{
				if(u.getPseudo() == name)
				{
					b = false;
					break;
				}
			}
			
			if(b)
			{
				liste.add(new User(name,mdp, type));
			}
		}
	}
	
	public ArrayList<User> getListe()
	{
		return liste;
	}
}
