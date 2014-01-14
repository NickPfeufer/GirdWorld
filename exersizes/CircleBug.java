import info.gridworld.actor.Bug;


class CircleBug extends Bug {

	private int csteps = 0;
	private int csidelength = 0;


	public CircleBug(int clength){
		csidelength = clength;
	}


	public void act(){
        	if (csteps < csidelength && canMove()){
            	move();
        	    csteps++;
	        }
    	    else{
    	        turn();
            	csteps =0;
	        }
	    }
}