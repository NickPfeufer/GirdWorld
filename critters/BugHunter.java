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

	public ArrayList<Location> getMoveLocations(){
		ArrayList<Location> move = new ArrayList<Location>();
		if(hunt){
			ArrayList<Location> nodes = getGrid().getEmptyAdjacentLocations(getLocation());
			Location curentNode = new Location(0,0);
			
			int cost = 0;
			Location goal = target.getLocation();
			int curentNodeCost;
		
			for (Location node: nodes) {
				if (cost != 0) {
					curentNodeCost = getCost(node, goal); 
					if ( curentNodeCost < cost) {
						cost = curentNodeCost;
						curentNode = node;
					}
				}else{
					curentNode = node;
					cost = getCost(node, goal);
				}					
			}
			move.add(curentNode);			
		}
		return move;
	}

	private int getCost(Location a, Location b){
		int row = 0;
		int col = 0;

		if (a.getRow() >= b.getRow()) {
			row = a.getRow()-b.getRow();
			
		}else {
			row = b.getRow() - a.getRow();
		}
		if (a.getCol() >= b.getCol()) {
			col = a.getCol()-b.getCol();
			
		}else {
			col = b.getCol() - a.getCol();
		}
		return row + col + 1;
	}


	


}