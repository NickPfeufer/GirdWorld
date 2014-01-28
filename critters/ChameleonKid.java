import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;

class ChameleonKid extends ChameleonCritter {
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location location = getLocation();
		for (int i = 0; i<181; i=i+180) {
			Grid gr = getGrid();
			Location tile = location.getAdjacentLocation(getDirection() + i);
			if (gr.isValid(tile)) {
				Actor actor = getGrid().get(tile);
				if (actor != null) {
					actors.add(actor);
				}
			}
		}
		return actors;
		
	}
}