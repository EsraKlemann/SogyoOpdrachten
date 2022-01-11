package nl.sogyo.javaopdrachten.roborally;

import java.util.*;

public class Robot {
    
    int x;
    int y;
    direction towards;
    int speed;

    enum direction {
    NORTH, 
    EAST, 
    WEST, 
    SOUTH; 
    }

    
    public interface commandsList {
        void move();
    }
    List<commandsList> commands = new ArrayList<commandsList>();
    
    
    
    
    public Robot () {
        this.x = 0;
        this.y = 0;
        this.towards = direction.NORTH;
    }

    public Robot (int x, int y, String towards) {
        this.x = x;
        this.y = y;
        this.towards = direction.valueOf(towards);
    }
        

    public void turnRight () {						
        switch (towards){
            case NORTH:
                this.towards = direction.EAST; 
                break;
            case EAST:
                this.towards = direction.SOUTH;
                break;
            case WEST: 
                this.towards = direction.NORTH;
                break;     
            case SOUTH:
                this.towards = direction.WEST;
                break;
            
        }
    }

    
    public void turnLeft () {
        switch (towards){
            case NORTH:
                this.towards = direction.WEST; 
                break; 
            case EAST:
                this.towards = direction.NORTH;
                break;
            case WEST:
                this.towards = direction.SOUTH;
                break;     
            case SOUTH:
                this.towards = direction.EAST;
                break;
        }   
    }
    
    
    
    
    
    public void move (int speed) {
    	if (speed >=1 || speed <=3){ 
    		switch(towards) {
    		
    		case NORTH -> this.y += speed; 
    		case EAST -> this.x += speed;
    		case WEST -> this.x -= speed;
    		case SOUTH -> this.y-= speed;
    			}	
    	}
    		
    }
    
    
	public void forward() {
	    	move(1); 
	    }
	    
	    public void forward(int speed) {
	    	move(speed);
	    }
	    
	  public void backward() {
	    	move(-1);
	    }
	    
	    public void backward(int speed) {
	    	move(-speed);
	    }
   
    
    public void execute() {
        commands.add(()-> turnLeft () ); 
        commands.add(()-> turnRight () );
        commands.add(()-> forward () );
        commands.add(()-> backward () );
		for (int i = 0; i < commands.size(); i++) {						
			commands.get(i).move();
			
        }
    }

   
    public void callRobotLocation() {
    	
    	System.out.println("I am facing " + this.towards + ", at location: (" + this.x + ", " + this.y + ").");
    }
      
    
    
    
  
    public static void main(String[] args) {
        Robot firstRobot = new Robot(0,1, "EAST");
        Robot secondRobot = new Robot(1,0, "WEST");
        													
        firstRobot.turnLeft();
        firstRobot.turnRight();
        firstRobot.forward(3);
   //     firstRobot.backward();
        firstRobot.execute();
        firstRobot.callRobotLocation();

    //    secondRobot.turnLeft();
        secondRobot.turnRight();
        secondRobot.forward(3);
        secondRobot.backward();
        secondRobot.execute();
        secondRobot.callRobotLocation();
        
    }
}


