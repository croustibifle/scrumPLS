package core;

import java.util.*;

class Specie {
  /**
   * Name of the specie
   */
  private String name;

  public Specie(String n) {
	if(!n.isEmpty())
	{
		n = n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase();
	}
	name = n;
  }

  public final String getName() {
    return name;
  }

}
