import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;

import java.awt.Color;

public class JumperRunner{ 
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        // add jumper
		Jumper joseph = new Jumper(6);
		joseph.setColor(Color.BLUE);
		world.add(new Location(5, 5), joseph);
		//build test track
		world.add(new Location(4,5), new Rock());
		world.add(new Location(1,5), new Rock());
		world.add(new Location(3,9), new Flower());
		world.add(new Location(8,9), new Flower());
		world.add(new Location(6,2), new Rock());
		world.add(new Location(6,3), new Rock());
		world.add(new Location(6,4), new Rock());
		world.add(new Location(7,2), new Rock());
		world.add(new Location(7,3), new Bug());
		world.add(new Location(7,4), new Rock());
		world.add(new Location(8,2), new Rock());
		world.add(new Location(8,3), new Rock());
		world.add(new Location(8,4), new Rock());
		world.add(new Location(5,3), new Rock());
		world.add(new Location(3,3), new Rock());
		// if you let it run for some time, Joseph will get in greens way
		// and green will turn
		Jumper green = new Jumper(5);
		green.setColor(Color.green);
		world.add(new Location(9,9), green);				
        world.show();
    }
}
