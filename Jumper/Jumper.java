import info.gridworld.actor.Bug;

class Jumper extends Bug {
	private int jumpsTaken = 0;
	private int jumps = 0;
	private Location spot;

	public Jumper(){
		Jumper(1);
	}

	public Jumper(int jumps){
		this.jumps = jumps;
		self.spot = super.getLocation();
	}

	public void act(){
		if (jumpsTaken<jumps) {
			jump();
			jumpsTaken++;
		}else {
			turn();
			jumpsTaken = 0;
		}
	}

	public void jump(){

	}





}