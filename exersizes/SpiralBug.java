import info.gridworld.actor.Bug;


class SpiralBug extends Bug {

	private int csteps = 0;
	private int csidelength = 0;


	public SpiralBug(int clength){
		csidelength = clength;
	}


	public void act(){
        	if (csteps < csidelength && canMove()){
            	move();
        	    csteps++;
	        }
    	    else{
    	    	if (csteps == csidelength) {
    	    		csidelength -= 1;
    	    	}
    	        turn();
    	        turn();
            	csteps =0;
            	
	        }
	    }
}