import java.util.ArrayList;
import java.util.Scanner;

public class Adventure
{
    public static final int NO_EXIT = -1;
    public static final int START = 0;
    public static final int MERCHANT_LIFE = 1;
    public static final int CABIN = 2;
    public static final int TIE_BARRELS  = 3;
    public static final int DONT_TIE_BARRELS = 4;
    public static final int STORMY_WATERS = 5;
    public static final int GET_SWEPT_AWAY = 25;
    public static final int BAD_STORMY_WATERS = 6;
    public static final int BELOW_DECK = 7;
    public static final int STAY_ON_DECK = 8;
    public static final int THROWN_OVERBOARD = 10;
    public static final int JOIN_PIRATES = 9;
    public static final int PIRATE_LIFE = 11;
    public static final int SAIL_WEST = 12;
    public static final int LEFT_BEHIND = 26;
    public static final int SAIL_SOUTH = 13;
    public static final int CHASE_BRITISH = 14;
    public static final int IGNORED = 15;
    public static final int CHASE_MERCHANTS = 16;
    public static final int ROB_BRITISH = 17;
    public static final int ROB_MERCHANTS = 18;
    public static final int PILLAGE = 19;
    public static final int SURVIVED = 20;
    public static final int DEFENSELESS = 21;
    public static final int A_TRUE_PIRATE = 22;
    public static final int FIND_FOUNTAIN = 23;
    public static final int FOUNTAIN_OF_YOUTH = 24;
    public static final int DENY_ORDERS = 27;
    public static final int FALL_OVERBOARD = 28;
    public static final int KILL_PARROT = 29;

    //Add constants here for ALL of your rooms -- they should be descriptive
    //Something like public static final int SPAWN_POINT = 1; for room #1

    private static boolean gameOver = false;
    private static String command = "";
    private static String phrase = "";
    private static ArrayList<String> playerInventory = new ArrayList<String>();
    private static int score = 0;
    private static int currentArea = START;     //Need to initialize this one to your constant name of your starting area
    private static Area[] world = new Area[31];        //Initialize this to be the size of your world

    static
    {
        //In the static block, you need to attach Area objects to every spot in the world array
        for(int i = 0; i < world.length; i++){
            world[i] = new Area();
        }
    }    

    public static void main(String[] args) 
    {  
        initializeWorld();  

        while (!gameOver) 
        { 
            world[currentArea].displayArea();

            getUserInput(); 
            parseUserInput(); 
        } 

        displayFarewellMessageAndScore(); 
    }

    private static void initializeWorld()
    {

        //This method needs to set the exits for the areas so your world map works
        //These exits are the *initial* state of the world (before doors are unlocked and such)
        //
        //This method also needs to set the description of each area
        //
        //Finally, this method also needs to put the items that are *initially* laying on the 
        //ground in areas around your world.

        //START
        world[START].setNortheast(PIRATE_LIFE);
        world[START].setNorthwest(MERCHANT_LIFE);
        world[START].setDescription("You wake up, swinging in a hammock and you look around. You're next to a pier, large merchant ships are being\nloaded with many riches to be shipped back to England. It is the year 1738, and you are wanted for a robbery.\nYou must flee, the coppers are after you! Two ships are about to take off, a small merchant ship to the northwest,\nand a massive pirate’s ship to the northeast.\n\nType in help for help");

        //MERCHANT_LIFE
        world[MERCHANT_LIFE].setNorth(CABIN);
        world[MERCHANT_LIFE].addItem("twine");
        world[MERCHANT_LIFE].setDescription("You have successfully boarded a merchant ship, immediately as you board you are handed a rope to tie the barrels in the cabin.\nThe ship sails North and you are now heading to the Commonwealth of Massachusetts.\n**Take the Twine**");

        //CABIN
        world[CABIN].setNorth(TIE_BARRELS);
        world[CABIN].setSouth(DONT_TIE_BARRELS);
        world[CABIN].setDescription("You enter the tight pitch black cabin. It stenches of dead rats and rotten vegetables. You try to find the barrels,\nbut then you think to yourself, should I spend my time in the dark trying to tie barrels that no one sees anyway.");

        //TIE_BARRELS 
        world[TIE_BARRELS].setSouth(CABIN);
        world[TIE_BARRELS].setDescription("You decide it’s best not to take anymore attention and find the barrels in about 30 minutes and tie them together.\n\n**type in \"tie barrels\" with the twine you picked up**");

        //DONT_TIE_BARRELS
        world[DONT_TIE_BARRELS].setSouth(BAD_STORMY_WATERS);
        world[DONT_TIE_BARRELS].setDescription("It smells horrible and you quickly leave the attic and go on deck.");

        //STORMY_WATERS
        world[STORMY_WATERS].setNorth(BELOW_DECK);
        world[STORMY_WATERS].setWest(GET_SWEPT_AWAY);
        world[STORMY_WATERS].setDescription("You climb above deck and all of a sudden there's a storm approaching. An hour passes and now\n10 feet waves pound the small ship in the open ocean. The captain orders everyone to go below deck and take shelter.");

        //GET_SWEPT_AWAY
        world[GET_SWEPT_AWAY].setDescription("You take too long to go below deck and get swept away by the waves.\nThe merchant life isn’t for everyone. You die.");

        //BAD_STORMY_WATERS
        world[BAD_STORMY_WATERS].setNorth(BELOW_DECK);
        world[BAD_STORMY_WATERS].setSouth(STAY_ON_DECK);
        world[BAD_STORMY_WATERS].setDescription("You climb above deck and all of a sudden there's a storm approaching.\nAn hour passes and now 10 feet waves pound the small ship in the open ocean. The captain orders everyone\nto go below deck and take shelter.");

        //BELOW_DECK
        world[BELOW_DECK].addItem("burnt twine");
        world[BELOW_DECK].setDescription("You go downstairs with the rest of the crew and bring a lantern to light up the dark hull.\nThe crewmembers start screaming at you to get rid of the lantern. You're confused and scared, as they grab you.\nYou drop the lantern and BOOM! The ship explodes into bits, chunks flying everywhere in the storm.\nThe barrels were filled with gunpowder, and you had just boarded an illegal\ntrading ship. You die.");

        //STAY_ON_DECK
        world[STAY_ON_DECK].setEast(FALL_OVERBOARD);
        world[STAY_ON_DECK].setDescription("You stay above deck as the waves pound the ship. To not fall overboard you hold on to the mast for dear life! Hours pass and you eventually faint from exhaustion. You wake up to find yourself in calm waters with another\nmassive ship adjacent to the merchant ship. Pirates board the ship and slaughter the rest of the crew.\nThey ask you, “Ayyy Rr you a capturRred piRrate”.");

        //THROWN_OVERBOARD
        world[THROWN_OVERBOARD].addItem("wet twine");
        world[THROWN_OVERBOARD].setDescription("You respond “No sir, I’m a distinguished gentleman, and a proud crew member of this ship you are trespassing.”\nThey tie you with the twine and throw you overboard. You die.");

        //JOIN_PIRATES
        world[JOIN_PIRATES].setWest(PIRATE_LIFE);
        world[JOIN_PIRATES].setDescription("You respond “Ayy, these pesky merchants catpured and tortured me.”\nThey free you and let you join their ship becuase you showed them your hidden musket.\nYou are now a pirate, a part of the infamous Black Beard crew. Congratulations?");

        //PIRATE_LIFE
        world[PIRATE_LIFE].setWest(SAIL_WEST);
        world[PIRATE_LIFE].setSouth(SAIL_SOUTH);
        world[PIRATE_LIFE].addItem("sword");
        world[PIRATE_LIFE].setDescription("You are now considered a pirate by the Crown and the Thirteen Colonies.\nOne of the crew throws a sword at you, and you catch it. You set sail west in search of english trading ships.\n*take sword*");

        //KILL_PARROT
        world[KILL_PARROT].setEast(SAIL_WEST);
        world[KILL_PARROT].setNorthwest(PIRATE_LIFE);
        world[KILL_PARROT].setSouth(SAIL_SOUTH);
        world[KILL_PARROT].setDescription("You got pirate rabbies, and your thirst for blood is insane. You go after a random parrot. Kill the parot.\n*kill parrot*");

        //SAIL_WEST
        world[SAIL_WEST].setWest(CHASE_BRITISH);
        world[SAIL_WEST].setNorth(LEFT_BEHIND);
        world[SAIL_WEST].setSouth(SAIL_SOUTH);
        world[SAIL_WEST].setDescription("You sail westward with the crew, doing your duties as demanded by your captain.\nYou keep your head down and give respect to be accepted.");

        //LEFT_BEHIND
        world[LEFT_BEHIND].setDescription("You went for a dip while the ship was idle, but they forgot about you. Your left alone in the ocean. You die.");

        //SAIL_SOUTH
        world[SAIL_SOUTH].setWest(IGNORED);
        world[SAIL_SOUTH].setSouth(CHASE_MERCHANTS);
        world[SAIL_SOUTH].setDescription("You tell the captain to go south because you believe the majority of merchant ships went through the North Atlantic Current.");

        //CHASE_BRITISH
        world[CHASE_BRITISH].setWest(ROB_BRITISH);
        world[CHASE_BRITISH].setDescription("As you sail westward you see a british ship. The crew change course and begin chasing the British.\nThe ship prepares for battle mode as the crew sets the cannons, you are scared,\nwith no experience in battle you are about to rob a British ship.");

        //IGNORED
        world[IGNORED].setWest(CHASE_BRITISH);
        world[IGNORED].setSouth(THROWN_OVERBOARD);
        world[IGNORED].setDescription("The captain ignores your idea and praises you for your bravery to command a ship.\nThey take away your sword because they believe you're untrustworthy.");

        //CHASE_MERCHANTS
        world[CHASE_MERCHANTS].setWest(ROB_MERCHANTS);
        world[CHASE_MERCHANTS].setDescription("You sail westward with the crew, doing your duties as demanded by your captain.\nYou keep your head down and give respect to be accepted.");

        //ROB_BRITISH
        world[ROB_BRITISH].setWest(SURVIVED);
        world[ROB_BRITISH].setSouth(DEFENSELESS);
        world[ROB_BRITISH].addItem("magical cup");
        world[ROB_BRITISH].setDescription("As you approach the large british ship you see a white flag. The British are retreating and will comply.\nYou board the british vessel and all of a sudden they ambush the pirates. There is a battle happening on the ship.\n*take magical cup*");

        //ROB_MERCHANTS
        world[ROB_MERCHANTS].setNorth(PILLAGE);
        world[ROB_MERCHANTS].setSouth(DENY_ORDERS);
        world[ROB_MERCHANTS].setDescription("You approach the merchant ship, but it is a tiny boat. Captain asks you to go pillage them by yourself.");

        //DENY_ORDERS
        world[DENY_ORDERS].setDescription("You just denied a direct order from the captain. They through you overboard with rocks tied to your feet. You die.");

        //PILLAGE
        world[PILLAGE].setEast(FIND_FOUNTAIN);
        world[PILLAGE].addItem("map");
        world[PILLAGE].setDescription("You jump down into the small boat and demand for their gold and riches. While looking through\ntheir chest you find a map. A map to find the fountain of youth titled La Fountain Of Nunca Aging.\n*Pick up the Map*");

        //SURVIVED
        world[SURVIVED].setWest(A_TRUE_PIRATE);
        world[SURVIVED].addItem("dead man's sword");
        world[SURVIVED].setDescription("While the battle was happening you stole a dead man's sword and ended up killing their captain. You're a hero!\n*take dead man's sword*");

        //DEFENSELESS
        world[DEFENSELESS].setDescription("While running away from the clashing swords, a cannon is set off and you take a\ncannonball to the chess and fly backwards overboard. You die.");

        //A_TRUE_PIRATE
        world[A_TRUE_PIRATE].setSouth(SAIL_SOUTH);
        world[A_TRUE_PIRATE].setDescription("You are considered a true pirate and a very good fit for Black Beard’s crew. Captain promotes you to Quartermaster.\nYour journeys shall be grand as you sail the vast ocean and hunt for treasure.\nIf you would like to end your jounry type \"quit\", but beware there is greater treasures to be found.");

        //FIND_FOUNTAIN
        world[FIND_FOUNTAIN].setEast(CHASE_BRITISH);
        world[FIND_FOUNTAIN].setDescription("You show the map to the captain and he praises you. The map shows the fountain of youth being in a cave beneath an island.\nOn your way to the island you spot a British ship.\ntype in **show map** you might find the path");

        //FOUNTAIN_OF_YOUTH
        world[FOUNTAIN_OF_YOUTH].setDescription("You have successfully led the infamous Black Beard crew to the fountain of youth to achieve\nimmortality the crew insist you be the first to try the water.\nDo you have the magical cup? If so use the cup if not the crew will force you to drink with your hands.\n**use magical cup**  ||  **drink water**");

        //FALL_OVERBOARD
        world[FALL_OVERBOARD].setDescription("You fell overboard because you didn't have rope to tie yourself to the mast");

    }   

    private static void getUserInput()
    {
        Scanner userInput = new Scanner(System.in);
        String input = "";

        System.out.print("--> ");
        input = userInput.nextLine();
        input = StringParser.formatString(input);
        command = StringParser.getCommand(input);
        phrase = StringParser.getPhrase(input);
    }

    private static void parseUserInput()
    {
        if (command.equals("q") || command.equals("quit"))
            gameOver = true;

        if (command.equals("i") || command.equals("inv") || command.equals("inventory"))
        {
            if (playerInventory.size() == 0)
                System.out.println("Your backpack is empty.");
            else
            {
                System.out.println("Your backpack contains:");
                for (String item: playerInventory)
                    System.out.println(item);
            }
        }

        if (command.equals("score"))
        {
            System.out.println("You currently have " + score + " points.");
        }

        //CrapTon(tm) of if statements here
        if (command.equals("n") || command.equals("north")) 
        { 
            move("north"); 
        }  
        if (command.equals("s") || command.equals("south")) 
        { 
            move("south"); 
        }  
        if (command.equals("e") || command.equals("east")) 
        { 
            move("east"); 
        }  
        if (command.equals("w") || command.equals("west")) 
        { 
            move("west"); 
        }  
        if (command.equals("ne") || command.equals("northeast")) 
        { 
            move("northeast"); 
        }  
        if (command.equals("nw") || command.equals("northwest")) 
        { 
            move("northwest"); 
        }  
        if (command.equals("se") || command.equals("southeast")) 
        { 
            move("southeast"); 
        }  
        if (command.equals("sw") || command.equals("southwest")) 
        { 
            move("southwest"); 
        }  
        if (command.equals("u") || command.equals("up")) 
        { 
            move("up"); 
        }  
        if (command.equals("d") || command.equals("down")) 
        { 
            move("down"); 
        }  
        if(command.equals("go") || command.equals("walk") || command.equals("move") || command.equals("run") || command.equals("sail") || command.equals("proceed") || command.equals("advance") || command.equals("progress") || command.equals("travel") || command.equals("journey") || command.equals("pass") || command.equals("depart") || command.equals("leave") || command.equals("voyage") ){
            if (phrase.equals("n") || phrase.equals("north")) 
            { 
                move("north"); 
            }  
            if (phrase.equals("s") || phrase.equals("south")) 
            { 
                move("south"); 
            }  
            if (phrase.equals("e") || phrase.equals("east")) 
            { 
                move("east"); 
            }  
            if (phrase.equals("w") || phrase.equals("west")) 
            { 
                move("west"); 
            }  
            if (phrase.equals("ne") || phrase.equals("northeast")) 
            { 
                move("northeast"); 
            }  
            if (phrase.equals("nw") || phrase.equals("northwest")) 
            { 
                move("northwest"); 
            }  
            if (phrase.equals("se") || phrase.equals("southeast")) 
            { 
                move("southeast"); 
            }  
            if (phrase.equals("sw") || phrase.equals("southwest")) 
            { 
                move("southwest"); 
            }  
            if (phrase.equals("u") || phrase.equals("up")) 
            { 
                move("up"); 
            }  
            if (phrase.equals("d") || phrase.equals("down")) 
            { 
                move("down"); 
            }  
        }

        if(command.equals("take") || command.equals("get") || command.equals("grab") || command.equals("steal") || command.equals("grasp") || command.equals("grip") || command.equals("squeeze") || command.equals("hold")){
            if(world[currentArea].removeItem(phrase)){
                playerInventory.add(phrase);
                System.out.println("You have taken the " + phrase + ".");
                if(world[currentArea] == world[PIRATE_LIFE]){
                    world[PIRATE_LIFE].setSouthwest(KILL_PARROT);
                    System.out.println("A new path has open, the path of a true bloodthirsty pirate");
                }
                if(world[currentArea] == world[ROB_BRITISH]){
                    score += 10;
                    System.out.println("You found the magic cup, don't lose it!\n+10 points awarded");
                }
            }
            else{
                System.out.println("The "+phrase+ " is not in the area.");
            }
        }

        if(command.equals("drop") || command.equals("release") || command.equals("let go") || command.equals("relinquish") || command.equals("put") || command.equals("place") || command.equals("rest") || command.equals("set")){
            if(playerInventory.indexOf(phrase) >= 0){
                playerInventory.remove(phrase);
                world[currentArea].addItem(phrase);
                System.out.println("You have " + command + " the " + phrase + " to the area.");
            }
            else{
                System.out.println("This item is not present in your inventory.");
            }
        }

        if(command.equals("tie") || command.equals("t")){
            if (phrase.equals("barrels") && currentArea == TIE_BARRELS) {
                playerInventory.remove("twine");
                world[TIE_BARRELS].setNorth(STORMY_WATERS);  
                world[TIE_BARRELS].addItem("musket"); 
                System.out.println("\nWhen moving the barrels you find a musket on the ground.\n*take musket*");
            } 

            else{
                System.out.println("Nothing to tie right now");
            }
        }

        if(command.equals("show")){
            if (phrase.equals("map") && currentArea == FIND_FOUNTAIN && (playerInventory.indexOf("map") >= 0)) {
                world[FIND_FOUNTAIN].setWest(FOUNTAIN_OF_YOUTH); 
            } 

            else{
                System.out.println("You dont have the map.");
            }
        }

        if(command.equals("kill") || command.equals("k")){
            if (phrase.equals("parrot") && currentArea == KILL_PARROT && (playerInventory.indexOf("sword") >= 0)) {
                System.out.println("You killed a parrot!!! What did it ever do to you, savage! +15 points though for the 360 slash kill.");
                world[PIRATE_LIFE].setWest(KILL_PARROT); 
                score += 15;
            } 

            else{
                System.out.println("You dont have the sword to kill the parrot.");
            }
        }
        if(command.equals("drink water") || command.equals("drink")){
            System.out.println("You drank the water without the magical cup, and the water is poisonus without it. Your journies will be forgotten becuase no one knew your name, but you had an adventurous life. You die.");
            gameOver = true;       
        } 
        if(command.equals("use") || command.equals("u")){
            if((phrase.equals("magical cup") || phrase.equals("magic cup")|| phrase.equals("cup")) && currentArea == FOUNTAIN_OF_YOUTH && (playerInventory.indexOf("magical cup") >= 0)){
                System.out.println("The pirate gods are with you and you are now considered a deity amongst mortals.\nIMORTALITY HAS BEEN ACHIEVED!");
                System.out.println("Gained +30 points!");
                score += 30; 
                gameOver = true;
            }
            else
                System.out.println("You don't have the magical cup");
        }
        if(command.equals("help")){
            System.out.println("You are in 1738 as a peasant you must choose your life path carefully as it will determine whether you shall live or die.\nTo move around the world type in the first letter/s of which direction you want to go.\nIf you want to pick up an item type in \"take item\", if you want to check your score \"score\",\nif you want to check your invenotry \"inv\". Good Luck!\n\nYou can never achieve any points as a merchant because that life is too mundane, make sure to have an exciting life.\n***ACHIEVABLE RANKS***\n - Peasant\n - Merchant\n - Quartermaster\n - Captain\n - Immortal Legend");
        }

    }    

    private static void move(String direction)
    {
        if (direction.equals("north") || direction.equals("n"))
        {
            if (world[currentArea].getNorth() == NO_EXIT)
                System.out.println ("There is no exit to the north.");
            else
                currentArea = world[currentArea].getNorth();
        }

        if (direction.equals("south") || direction.equals("s"))
        {
            if (world[currentArea].getSouth() == NO_EXIT)
                System.out.println ("There is no exit to the south.");
            else
                currentArea = world[currentArea].getSouth();
        }

        if (direction.equals("east") || direction.equals("e"))
        {
            if (world[currentArea].getEast() == NO_EXIT)
                System.out.println ("There is no exit to the east.");
            else
                currentArea = world[currentArea].getEast();
        }

        if (direction.equals("west") || direction.equals("w"))
        {
            if (world[currentArea].getWest() == NO_EXIT){
                System.out.println ("There is no exit to the west.");
                if(world[currentArea] == world[IGNORED])
                    playerInventory.remove("sword");
            }
            else
                currentArea = world[currentArea].getWest();
        }

        if (direction.equals("southeast") || direction.equals("se"))
        {
            if (world[currentArea].getSoutheast() == NO_EXIT)
                System.out.println ("There is no exit to the southeast.");
            else
                currentArea = world[currentArea].getSoutheast();
        }

        if (direction.equals("southwest") || direction.equals("sw"))
        {
            if (world[currentArea].getSouthwest() == NO_EXIT)
                System.out.println ("There is no exit to the southwest.");
            else
                currentArea = world[currentArea].getSouthwest();
        }

        if (direction.equals("northwest") || direction.equals("nw"))
        {
            if (world[currentArea].getNorthwest() == NO_EXIT)
                System.out.println ("There is no exit to the northwest.");
            else
                currentArea = world[currentArea].getNorthwest();
        }

        if (direction.equals("northeast") || direction.equals("ne"))
        {
            if (world[currentArea].getNortheast() == NO_EXIT)
                System.out.println ("There is no exit to the northeast.");
            else
                currentArea = world[currentArea].getNortheast();
        }

        if (direction.equals("up") || direction.equals("u"))
        {
            if (world[currentArea].getUp() == NO_EXIT)
                System.out.println ("There is no exit up.");
            else
                currentArea = world[currentArea].getUp();
        }

        if (direction.equals("down") || direction.equals("d"))
        {
            if (world[currentArea].getDown() == NO_EXIT)
                System.out.println("There is no exit down.");
            else
                currentArea = world[currentArea].getDown();
        }
        
        if(world[currentArea] == world[STAY_ON_DECK]){
            if((playerInventory.indexOf("musket") >= 0)) {
                world[STAY_ON_DECK].setNorth(JOIN_PIRATES);
            }
            world[STAY_ON_DECK].setSouth(THROWN_OVERBOARD); 
        }   
        if(world[currentArea] == world[JOIN_PIRATES]){
            score +=10;
            System.out.println("Gained +10 points!");
        }
        if(world[currentArea] == world[GET_SWEPT_AWAY]){
            world[currentArea].displayArea();
            gameOver = true;
        }
        if(world[currentArea] == world[A_TRUE_PIRATE]){
            score += 25;
            System.out.println("Gained +25 points!");
        }
        if(world[currentArea] == world[PILLAGE]){
            System.out.println("While pillaging you were awarded 10 points for your ruthlessness!");
            score += 10;
        }
        if(world[currentArea] == world[BELOW_DECK]){
            world[currentArea].displayArea();
            gameOver = true;  
        }
        if(world[currentArea] == world[LEFT_BEHIND]){
            world[currentArea].displayArea();
            gameOver = true; 
        }
        if(world[currentArea] == world[TIE_BARRELS ]){
            world[currentArea].displayArea();
        }
        if(world[currentArea] == world[THROWN_OVERBOARD]){
            world[currentArea].displayArea();
            gameOver = true;
        }
        if(world[currentArea] == world[DEFENSELESS]){
            world[currentArea].displayArea();
            gameOver = true;
        }
        if(world[currentArea] == world[DENY_ORDERS]){
            world[currentArea].displayArea();
            gameOver = true;
        }
        if(world[currentArea] == world[FALL_OVERBOARD]){
            world[currentArea].displayArea();
            gameOver = true;
        }
        if(world[currentArea] == world[IGNORED]){
            playerInventory.remove("sword");
        }

    }

    private static void displayFarewellMessageAndScore()
    {
        System.out.println("  _______ _                 _           __                   _             _             ");
        System.out.println(" |__   __| |               | |         / _|                 | |           (_)            ");
        System.out.println("    | |  | |__   __ _ _ __ | | _____  | |_ ___  _ __   _ __ | | __ _ _   _ _ _ __   __ _ ");
        System.out.println("    | |  | '_ \\ / _` | '_ \\| |/ / __| |  _/ _ \\| '__| | '_ \\| |/ _` | | | | | '_ \\ / _` |");
        System.out.println("    | |  | | | | (_| | | | |   <\\__ \\ | || (_) | |    | |_) | | (_| | |_| | | | | | (_| |");
        System.out.println("    |_|  |_| |_|\\__,_|_| |_|_|\\_\\___/ |_| \\___/|_|    | .__/|_|\\__,_|\\__, |_|_| |_|\\__, |");
        System.out.println("                                                      | |             __/ |         __/ |");
        System.out.println("                                                      |_|            |___/         |___/ ");
        System.out.println("You scored " + score + " points out of 100.");
        if(score <= 10 && score >= 0)
            System.out.println("This means you have achieved the rank of NOOB");
        else if(score <= 30 && score > 10)
            System.out.println("This means you have achieved the rank of Merchant");
        else if(score <= 60 && score > 30)
            System.out.println("This means you have achieved the rank of Quartermaster");
        else if(score <= 70 && score > 60)
            System.out.println("This means you have achieved the rank of Captain");
        else
            System.out.println("This means you have achieved the rank of Immortal Legend");
        if(playerInventory.indexOf("dead man's sword") >= 0)
            System.out.println("You have gained a special title next to your rank\n--> Dead Man Walking");
    }

}
