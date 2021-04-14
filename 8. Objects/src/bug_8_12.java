/**
 * Write a class Bug that models a bug moving along a horizontal line. The bug
 * moves either to the right or left. Initially, the bug moves to the right, but
 * it can turn to change its direction. In each move, its position changes by
 * one unit in the current direction. Provide a constructor 
 * public Bug(int initialPosition) and methods 
 * public void turn() 
 * public void move() 
 * public int
 * getPosition() 
 * Sample usage: Bug bugsy = new Bug(10); 
 * bugsy.move(); // Now theposition is 11 
 * bugsy.turn(); 
 * bugsy.move(); // Now the position is 10 
 * Your main method should construct a bug, make it move and turn a few times, and
 * print the actual and expected positions.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class bug_8_12 {
	private int position;
	private int move = 1;	//this is the move variabel, which will be positive 
	//or negative, depending on if the user, commanded the turn() constructor
	
	public bug_8_12(int position){	
	    this.position = position;
	}
	public void turn(){	//if the move variabel is positive, it will turn negative. 
		//And the other way around
	    if(move == 1){
	       move = -1;
	    } else {
	       move = 1;
	    }
	}
	public void move(){	//this constructor will move the bug in the 
		//direction the code wants it to move
	    position += move;

	}
	public int getPosition(){	//returning a position of the bug
	    return position;
	} 

}
