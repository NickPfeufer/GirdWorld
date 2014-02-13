import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

import java.awt.Color;
import java.util.ArrayList;

class RockLauncher extends Critter {
	private Actor target;
	private Actor flyingRock;

	boolean hunt = true;

	public RockLauncher(Actor a){
		target = a;
	}
	public void processActors(ArrayList<Actor>  actors){
		if (hunt) {
			for (Actor a : actors) {
				if (a instanceof Rock && hunt) {
					Location goal = target.getLocation();
					target.removeSelfFromGrid();
					flyingRock = a
					hunt = false;
				}
			}			
		}
	}

}