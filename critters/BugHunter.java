import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

class BugHunter extends Critter {
	private Actor target;
	private boolean hunt = true;

	public BugHunter(Actor a){
		target = a;
	}

	public void processActors(ArrayList<Actor>  actors){
		for (Actor a : actors) {
			if (a == target) {
				a.removeSelfFromGrid();
				hunt = false;
			}
		}
	}

	


}