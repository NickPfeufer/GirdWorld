import info.gridworld.actor.Bug;


class Zbug extends Bug {

	private int csteps = 0;
	private int csidelength = 0;
    private boolean z = true;
    private int side = 0;


	public Zbug(int clength){
		csidelength = clength;
	}


	public void act(){
            if (z && canMove()) {
                if (side == 6) {
                    z = false;
                }else if (side == 0) {
                    turn();
                    turn();
                    side++;
                }else if (side == 2) {
                    turn();
                    turn();
                    turn();
                    side++;
                }else if (side == 4) {
                    for (int i = 0; i<5; i++) {
                        turn();
                    }
                    side++;
                }else {
                    moveLine();
                }
                
            }else{
                z = false;
            }

	}

    private void moveLine(){
            if (csteps < csidelength){
                move();
                csteps++;
            }else{
                csteps = 0;
                side++;
            }
    }
    // three difrences from Josh Sparks
    // 1) I used my seperate moveLine function to draw the diagonal
    // 2) all my movement is determined by if statements, his goes 
    // in order called from the builder
    // 3) I use a boolean z to determin if z was run
}