package core;

import java.util.*;

class SpecieCategory {
  /**
   * Set of species that belong to this category
   */
  private ArrayList<Specie> species;

  /**
   * Description of a group for the species. For example, "birds"
   */
  private String name;

  /**
   * Creates a new SpecieCategory
   */
  public SpecieCategory(String theName) {
	  if(!theName.isEmpty())
	  {
		  theName = theName.substring(0,1).toUpperCase() + theName.substring(1).toLowerCase();
	  }
	  name = theName;
	  species = new ArrayList<Specie>();
  }

  public final String getName() {
    return name;
  }

  public final ArrayList<Specie> getSpecies() {
    return species;
  }

  /**
   * Add a specie in the category
   */
  public void addSpecie(Specie specie) {
	species.add(specie);
  }

}
