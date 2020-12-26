# Snake & Ladder 

Note:

 - This is a comandline based program
 - Implemented for single as well as multi player
 - Supports 2 types of dice - Normal and Crooked
 - Test cases written
 - Singleton and Factory design pattern used
 - **Some files are improvised accross multiple commits**

# Schema 

To better understand, attached below short schema of this program.
![image](https://raw.githubusercontent.com/akashanita/snake-ladder/main/basic_schema.jpg)

Here I made Board as singleton class. This singleton class will be used accross application. We can create multiple Game object and all Game objects can use same Board object.

I did mulitple inheritance of Jumper class, in case in future if we plan to add some new different kind of snake/ladder then we have to make one more implementation of it.

Player objects are being stored in TreeMap, so that the inserting order will be maintained and playing order can be derived from there only. To use the capabilities of TreeNode, I implementated hashCode and compareTo functions

## Design Pattern

For now, I just used singleton and factory pattern. There was a change to use builder pattern as well, but I avoided as it was not that much needed.

![image](https://raw.githubusercontent.com/akashanita/snake-ladder/main/factory_pattern.jpg)

As you can see about, I have used factory pattern to get different implementations of PlayService and Dice.

And singleton is used for Board and CommonUtils class.

## Exception Handling
Created a custom exception called **SLException** and also defined exception constants to provided proper messages.
Exceptions are properly thrown wherever neccessary.

## Coding Standard

 - Used layer architecture to properly segregate the code.
 - Proper naming conventions used
 - Design Patterns used
 - Proper Exception handling done.
 - Tried to maintain open-close principle 
