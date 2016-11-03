/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

import java.util.HashMap;
import java.util.Set;

public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
//    private Room northExit;
//    private Room southExit;
//    private Room eastExit;
//    private Room westExit;
//    private Room upExit;
//    private Room downExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

//    /**
//     * Define the exits of this room.  Every direction either leads
//     * to another room or is null (no exit there).
//     * @param north The north exit.
//     * @param east The east east.
//     * @param south The south exit.
//     * @param west The west exit.
//     * @param up The up exit.
//     * @param down The down exit.
//     */
//    public void setExits(Room north, Room east, Room south, Room west) 
//    {
//        if(north != null)
//            exits.put("north", north);
//        if(east != null)
//            exits.put("east", east);
//        if(south != null)
//            exits.put("south", south);
//        if(west != null)
//            exits.put("west", west);
//        if(up != null)
//            upExit = up;
//        if(down != null)
//            downExit = down;
//    }
    
    /**
    * Define an exit from this room.
    * @param direction The direction of the exit.
    * @param neighbor The room in the given direction.
    */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }
    
    public Room getExit(String direction)
    {
        return exits.get(direction);
//        if(direction.equals("north"))
//        {
//            return northExit;
//        }
//        if(direction.equals("east"))
//        {
//            return eastExit;
//        }
//        if(direction.equals("south"))
//        {
//            return southExit;
//        }
//        if(direction.equals("west"))
//        {
//            return westExit;
//        }
//        if(direction.equals("up"))
//        {
//            return upExit;
//        }
//        if(direction.equals("down"))
//        {
//            return downExit;
//        }
//        return null;
    }

//        /**
//        * Return a description of the room’s exits,
//        * for example, "Exits: north west".
//        * @return A description of the available exits.
//        */
//        public String getExitString()
//        {
//        return
//        }
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
    * Return a long description of this room, of the form:
    *     You are in the kitchen.
    *     Exits: north west
    * @return A description of the room, including exits.
    */
    
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
    
        public String getExitString()
    {
//        String exitString = "Exits: ";
//        if(northExit != null)
//            exitString += "north "; 
//        if(eastExit != null)
//            exitString += "east "; 
//        if(southExit != null)
//            exitString += "south "; 
//        if(westExit != null)
//            exitString += "west ";
//        return exitString;
        
        String returnString = "Exits: ";
        Set<String> keys = exits.keySet();
        for(String exit : keys) 
        {
            returnString += " " + exit;
        }
        return returnString;
    }
}
