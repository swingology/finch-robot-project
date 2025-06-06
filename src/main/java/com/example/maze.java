package com.example;

import com.birdbrain.Finch;

public class maze {
    public static void main(String[] args) {
        finchMethods f = new finchMethods();
        int moveDistance = 0; // gets the next amount needed to move 
        /*
        First set of moves
        Moves through first alley and U turn
        */
           
            moveDistance = f.getDistance() + 5; 
            f.MTLeft(moveDistance); 

            moveDistance = f.getDistance() - 4; 
            f.MTLeft(moveDistance);

        /* 
            Navigates through the maze 
            Will stop at the wall
        */
            f.setMove("F", 30, 70);
            f.setTurn("R", 90, 70);
            
            f.setMove("F", 50, 70); 

            f.setTurn("R", 95, 70); // turn at Wall


            /* 
            Will not complete the maze by moving to teh final wall next to the end 
            and around the corner in order to reach the end
            */
           
           f.setMove("F", 115, 70);
           f.setTurn("R", 90, 70);
            moveDistance = f.getDistance()- 10;
            f.MTLeft(moveDistance);
            moveDistance = f.getDistance() - 4;
            f.MTLeft(moveDistance);  
            moveDistance = f.getDistance();
            f.setMove("F", moveDistance, 70);

        /* 
        Stops Robot Finch and disconnects it from the code. 
        */
        f.stopAll();
        f.disconnect();


    }

}