import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

class KingCrab extends CrabCritter {
	public void processActors(ArrayList<Actor> actors){
		for (Actor a : actors) {
			Location loc = a.getLocation().getAdjacentLocation(getDirection());
			if (getGrid().isValid(loc) && getGrid().get(loc) == null){
				a.moveTo(loc);
            }else{
            	a.removeSelfFromGrid();
            }

		}

	}
}