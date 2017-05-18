package core;
import java.util.ArrayList;


public class CategoryList {
	private ArrayList<SpecieCategory> liste;
	
	public CategoryList()
	{
		liste = new ArrayList<SpecieCategory>();
	}
	
	public void addCategory(String theName)
	{
		if(!theName.isEmpty())
		{
			theName = theName.substring(0,1).toUpperCase() + theName.substring(1).toLowerCase();
		}
		boolean b = true;
		for(SpecieCategory t : liste)
		{
			if(t.getName().equals(theName))
			{
				b = false;
				break;
			}
		}
		if(b)
		{
			liste.add(new SpecieCategory(theName));
		}
	}
	
	
	public boolean addSpecie(String theName, String theCateg)
	{
		if(!theName.isEmpty())
		{
			theName = theName.substring(0,1).toUpperCase() + theName.substring(1).toLowerCase();
		}
		boolean b = true;
		for(SpecieCategory t : liste)
		{
			for(Specie t2 : t.getSpecies())
			{
				if(t2.getName().equals(theName))
				{
					return false;
				}
			}
		}
		if(b)
		{
			int i=0;
			for(SpecieCategory t : liste)
			{
				if(t.getName().equals(theCateg))
				{
					return false;
				}
				i++;
			}
			if(i < liste.size())
			{
				liste.get(i).addSpecie(new Specie(theName));
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<SpecieCategory> getListe(){
		return liste;
	}
	
}
