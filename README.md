# Team Project (SPARTANS #Journal)

## Game Tic Tac Toe

Our project is to implement a well-known game, Tic Tac Toe, but having advance features such as Undo and Redo and have implemented the complete game using multiple design patterns.

## Team Members

1. Praneet Bang
2. Aditya Kopalli
3. Vishwa pernapatti
4. Hardik Ghori

## Game screenshots

### Advance Mode - 

![](images/Advance1.png)
![](images/Advance2.png)
![](images/Advance3.png)
![](images/Advance4.png)

### Standard Mode -

![](images/Standard1.png)
![](images/Standard2.png)
![](images/Standard3.png)
![](images/Standard4.png)

## UML Diagrams

### UseCase Diagram
![](images/UseCaseDiagram.jpg)

### State Diagram
![](images/StatemachineDiagram.jpg)

### Class Diagram
![](images/Class%20Diagram.png)

### Sequence Diagram
![](images/Sequence%20Diagram.jpg)

### Design Patterns used in the project

#### Strategy Pattern 
#### A behavioral design pattern called strategy enables you to construct a family of algorithms, separate them into distinct classes, and make their objects interchangeable.

## Memento

Memento is used to capture and externalize an object's internal state so that the object can be restored to this state later. In this project, we have used Memento along with Command pattern in order to undo-redo the moves of Tic-Tac-Toe.

We can undo and redo multiple times without losing the state of the object. We would be storing the object state everytime the move is made. This allows us to move back to the previous state as we have the details of the previous state.

## State Pattern

State allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

The Tic-Tac-Toe game can have 3 states based on each move.

1. Draw
2. Win
3. Next Move - Continue

The states continue to work until the game ends. We check the current state and update the state of the machine by checking the game status on every move.

## Singleton

Ensure a class only has one instance, and provide a global point of access to it.

Singleton has a private constuctor as we do not want the object to be created multiple times. The global access of the object is done using a static method which checks if the object creation is done and returns the current state of the object.

We can only have one instance of the object.

