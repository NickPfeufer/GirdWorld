import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

import java.awt.Color;

class BlusterCritter extends Critter {
	
	private int c = 4;

	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location bob = getLocation();
		ArrayList<Location> locations = new ArrayList<Location>();

		int x = bob.getRow() + 2;
		int y = bob.getCol() + 2;
		int tempX;
		int tempy;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				tempX = x - i;
				tempy = y - j;
				if (tempX >= 0 && tempy >= 0) {
					if (!(i == 2) && !(j == 2)) {
						locations.add(new Location(x,y));
					}
					
				}
			}
		}

		for (Location n : locations) {
			if (getGrid().isValid(n)) {
				Actor actor = getGrid().get(n);
				
				if (actor != null) {
					actors.add(actor);
				}
			}
		}


		return actors;
	}

	public void processActors(ArrayList<Actor> actors){
		int fear = 0;
		for (Actor n : actors) {
			fear++;
		}
		if (fear <= c) {
			lighten();
		}else if (fear > c) {
			darken();
		}

	}





    private void lighten(){
        Color color = getColor();
        int r = (int) (color.getRed() * 2);
        if (r > 255) {
        	r = 255;
        }
        int g = (int) (color.getGreen() * 2);
        if (g > 255) {
        	g = 255;
        }
        int b = (int) (color.getBlue() * 2);
        if (b > 255) {
        	b = 255;
        }
        setColor(new Color(r,g,b));
    }

	private void darken(){
        Color color = getColor();
        int r = (int) (color.getRed() * 0.2);
        if (r < 0) {
        	r = 0;
        }
        int g = (int) (color.getGreen() * 0.2);
        if (g < 0) {
        	g = 0;
        }
        int b = (int) (color.getBlue() * 0.2);
        if (b < 0) {
        	b = 0;
        }
        setColor(new Color(r,g,b));
    }
}