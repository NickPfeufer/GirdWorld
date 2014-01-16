import info.gridworld.actor.Bug;

class Jumper extends Bug {
	private int jumpsTaken = 0;
	private int jumps = 0;

	public Jumper(){
		Jumper(1);
	}

	public Jumper(int jumps){
		this.jumps = jumps;
	}

	public void jump(){
		Location current = super.getLocation();
		Location nextLocation = current.adjacentLocation(getDirection());
		Location afterNext = nextLocation.adjacentLocation(getDirection());

		if(canJump(afterNext)){
			moveTo(afterNext);
		}else{
			turn();
		}	
	}
	public boolean canJump(Location xy){
		if (xy.isValid()) {
			if (get(xy) != null) {
				return false;
			}else{
				return true;
			}
		}
		return false;
	}

	public void act(){
		
	}





}
