import info.gridworld.actor.Bug;



class DancingBug extends Bug {
	int[] dance;
	int step = 0;

	public DancingBug(int[] dan){
		dance = dan;
	}	

	public void act(){
		for (int i = 0; i < dance[step]; i++) {
			turn();
		}
		step++;
		if (step == dance.length) {
			step = 0;
		}
		super.act();
	}
}