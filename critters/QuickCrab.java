import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

class QuickCrab extends CrabCritter{
	public ArrayList<Location> getMoveLocations()
    	{
        	ArrayList<Location> locs = new ArrayList<Location>();
        	ArrayList<Location> locson = new ArrayList<Location>();
       		locs.add(getLocation().getAdjacentLocation(getDirection()-90).getAdjacentLocation(getDirection()-90));
       		locs.add(getLocation().getAdjacentLocation(getDirection()+90).getAdjacentLocation(getDirection()+90));
        	for (Location loc : locs)
            	if (getGrid().isValid(loc) && getGrid().get(loc) == null){
					locson.add(loc);
            	}
                

        	return locson;
    }
	
}