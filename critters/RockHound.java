import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;

import java.awt.Color;
import java.util.ArrayList;

class RockHound extends Critter{
	public void processActors(ArrayList<Actor> actors){
		for (Actor n: actors) {
			if(n instanceof Rock){
				n.removeSelfFromGrid();
			}
		}
	}
}