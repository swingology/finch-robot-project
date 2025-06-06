package com.example;

import com.birdbrain.Finch;

public class finchMethods extends Finch{

        
       // Function should move to wall and turn right 

        public void MTRight(int dist){
            int distNeeded = 0; 
            setMove("F", dist, 70); 


            if(getDistance() < 5){
                 distNeeded = 10 - getDistance();
                setMove("B", distNeeded, 70);
             setTurn("R", 90, 70);
            } else if(getLight("L") > 80){
                setTurn("R", 90, 70);                

            } else if(getDistance() > 5){
                distNeeded = getDistance() - 7 ;
                setMove("F", distNeeded, 70);
                setTurn("R", 90, 70);
            } else {
                setTurn("R", 90, 70);                
            }
 

        }
        // Function should move to wall and turn left
            public void MTLeft(int dist){
            int distNeeded = 0; 
            setMove("F", dist, 70); 


            if(getDistance() < 5){
                 distNeeded = 10 - getDistance();
                setMove("B", distNeeded, 70);
             setTurn("L", 90, 70);
            } else if(getLight("L") > 80){
                setTurn("L", 90, 70);                

            } else if(getDistance() > 5){
                distNeeded = getDistance() - 7;
                setMove("F", distNeeded, 70);
                setTurn("L", 90, 70);
            } else {
                setTurn("L", 90, 70);                
            }
 
        }


}