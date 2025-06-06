  * Project description and objectives
    My project is trying to get my Finch Robot to complete the maze. It does this in a sequential pattern and uses the sensors a the to detect the next wall in front of it. Once it does this it will change the amount needed to move to the distance that it says to has to then make the correct turn for each stop. 

  * Description of design choices
My project was made to be sequential. I chose this method because I was struggling to implement other parts due to the finch robot being limited to a sensor only in front of the robot. I also did this because it was the most straightforward solution to  the maze. 

  * Challenges faced and solutions
  A challenge I faced was the get Distance taking me farther than I needed to go crashing into walls. I fixed this problem through 2 meathods. My first method was to subtract a small amount from get Distance keeping it just from the wall. The second method was to take an exact measurement using the get Distance function to complete the maze. 

  * Future enhancements
  A future enhancement I would make the next time I did this was to use a for loop to track amount of turns and an array to keep every turn. I would then use this to travel through and use an if conditional to track how far I would need the robot to move. To add on this I would also need to figure out a way to mae an if condition for a turn that is not at a wall in order to complete the maze.  

  * Video or images of your robot in action ([Maze completion video](https://youtu.be/9rP144nIGFE))
  