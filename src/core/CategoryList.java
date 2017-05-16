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
			if(theName == t.getName())
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
	
	
	public void addSpecie(String theName, String theCateg)
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
				if(theName == t2.getName())
				{
					b = false;
					break;
				}
			}
			if(b==false)
			{
				break;
			}
		}
		if(b)
		{
			int i=0;
			boolean b2;
			for(SpecieCategory t : liste)
			{
				if(t.getName() == theCateg)
				{
					break;
				}
				i++;
			}
			if(i < liste.size())
			{
				liste.get(i).addSpecie(new Specie(theName));
			}
		}
	}
	
}
