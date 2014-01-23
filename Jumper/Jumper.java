import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;

class Jumper extends Bug {
	private int jumpsTaken = 0;
	private int jumps = 0;
	private Grid<Actor> grid;



	public Jumper(int jumps){
		// for custom jump limits
		this.jumps = jumps;
	}

	public Jumper(){
		// for lazy progamers
		this(1);
	}

	public void jump(){
		// find location two squares ahead of the bug for testing and moveing
		Location current = getLocation();
		Location nextLocation = current.getAdjacentLocation(getDirection());
		Location afterNext = nextLocation.getAdjacentLocation(getDirection());
		// then we get the grid
		this.grid = getGrid();
		// test jumping/ jump limit
		if(canJump(afterNext) && jumpsTaken < jumps){
			// leaves no flowers when we use move to
			moveTo(afterNext);
			// count jumps until limit
			jumpsTaken++;
		}else{
			// if it can't jump, it turns
			turn();
			// when ever it turns reset jumps taken
			jumpsTaken = 0;
		}	
	}
	public boolean canJump(Location xy){
		// if the point is not on the grid, it dosen't matter
		if (grid.isValid(xy)) {
			// check for other actors
			if (grid.get(xy) != null) {
				return false;
			}else{
				return true;
			}
		}
		return false;
	}

	public void act(){
		jump();
	}





}
