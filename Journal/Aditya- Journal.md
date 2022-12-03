## Week 1

It was important to pick the right topic that could fit enough design patterns. It would be challenging to implement design patterns without adequate knowledge and POC.

Explored multiple projects and tried to understand if it was possible to fit in the design patterns.

Tic-Tac-Toe
Although it seems like a game with minimal features there is a scope to introduce multiple design patterns on the backend.

With advance features like undo and redo, it felt appropriate to go with this game.

## Week 2 - 3

Memento Design Pattern

We need to design the pattern in a way that it is coupled with Command Pattern to store the details of every move. We need to store undo and redo in the arraylist and on every button click we need to change the object state to the previous state.

Complications: To couple this with command pattern was not an easy thing to do. Had to ensure that the functionality remained the same for both the design patterns without breaking the application behaviour.

It took considerable amount of time as both the features had to be integrated together and had to spend time in understanding how memento works.

## Week 4

State and Singleton
Singleton implementation was straightforward. Had to ensure that the primary class could be instantiated only once. 

The game could essentially have 3 states:
Win
Draw
Continue

For each state, had to define the behaviour and change the state based on the conditions.

Although this could be done without state diagram - it helps to show how to implement the state design pattern.