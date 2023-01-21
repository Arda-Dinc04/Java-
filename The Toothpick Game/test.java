import java.util.Scanner;
/**
 * The Toothpick Game is the the most amazing game EVER!
 * 
 * @author Arda Dinc
 */
public class TheToothpickGame{

    private static boolean computerOpponent = false;
    private static String player1 = "", player2 = "";
    private static int compSkillLevel = 0, totalWinsNeeded = 0, maxNumOfToothpicks = 0, toothpicksRemaining = 0;
    private static int player2Wins = 0, player1Wins = 0, currentPlayer = 0;
    public static final int EASY = 1, MEDIUM = 2, HARD = 3;


public static void main(String[] args){
 
displayWelcomeBanner();
        getStartingInformation(); 
 while (player1Wins != totalWinsNeeded && player2Wins != totalWinsNeeded)
            playOneGame();

        displayFinalStats();
             
    }

    /**
     * The displayWelcomeBanner method should be your take on a welcome message.
     * 
     * Be creative.
     */
private static void displayWelcomeBanner(){                                                                                        
        System.out.println("    _,                     ______                            ,___                ");
        System.out.println("   / |         /   o      (  /     _/_ /        o     /     /   /                "); 
        System.out.println("  /--|  _   __/ __,' (      /__ __ /  /_   ,_  ,  _, /<    /  ____,  _ _ _   _   ");
        System.out.println("_/   |_/ (_(_/_(_/(_/_)_  _/(_)(_)(__/ /__/|_)_(_(__/ |_  (___/(_/(_/ / / /_(/_  ");
        System.out.println("                                          /|                                     ");
        System.out.println("                                         (/                                    2  ");
    }

    /**
     * The getStartingInformation method, um, gets the starting information.
     * 
     * In the course of running, setGameParameters uses three helper
     * methods -- choosePlayers(), getWinsNeeded(), and choooseMaxToothpicksPerTurn()
     */
    private static void getStartingInformation(){
        choosePlayers();    

        System.out.println();

        totalWinsNeeded = getWinsNeeded();   

        System.out.println();

        chooseMaxToothpicksPerTurn();
    }

    /**
     * The choosePlayers method gets player 1's name, determines whether the 
     * second player is human or computer.
     * 
     * If the second player is human, ask for their name and set that variable.
     * 
     * If the second player is a computer, have them choose a skill level to 
     * set that variable, and then set player 2's name variable to be the name
     * of that particular skill level for the computer.
     * 
     * Postcondition:  computerOpponent gets properly set;  
     * 
     *                 The player 1's name and player 2's name varaibles are set properly;  
     *                 
     *                 If playing against a computer then compSkillLevel is also
     *                 set properly.
     */
    private static void choosePlayers(){
        String humanOrComputer = "", choice = "";
        int flag = 0;
        Scanner userInput = new Scanner(System.in); 

        System.out.println("Please type in player 1's name: ");    //Enter player1's name, set as global variable
        player1 = userInput.nextLine().trim();      //trim the name in case of user ireggularities

        while(flag == 0){
            System.out.println(player1 + " is player 1!");
            System.out.println("Player 1 is " + player1 +  ", Is player 2 human or computer?");    //Determine whether player 2 is human or computer 
            humanOrComputer = userInput.nextLine();
            if(humanOrComputer.equalsIgnoreCase("human")){
                System.out.println("Welcome player 2, what is your name?");
                player2 = userInput.nextLine().trim();
                computerOpponent = false;
                flag = 1;
            }
            else if(humanOrComputer.equalsIgnoreCase("computer")){
                System.out.println("Please type in level of difficulty easy, medium, or hard");
                System.out.println("---------------------------------------------------------");
                System.out.println("1.) easy or e");
                System.out.println("2.) medium or m");
                System.out.println("3.) hard or h");
                choice = userInput.nextLine();
                computerOpponent = true;
                flag = 1;
                if (choice.equalsIgnoreCase("easy") || choice.equalsIgnoreCase("e")){
                    player2 = "Jakob"; // player 2 becomes Jakob when player chooses easy
                    System.out.println("Player 2 is Jakob");
                    compSkillLevel = 1;
                }
                else if(choice.equalsIgnoreCase("medium") || choice.equalsIgnoreCase("m")){
                    player2 = "Willy";      // player 2 becomes Willy when player chooses meduim
                    System.out.println("Player 2 is Willy");
                    compSkillLevel = 2;
                }
                else if(choice.equalsIgnoreCase("hard") || choice.equalsIgnoreCase("h")){
                    player2 = "Schmidt";    // player 2 becomes Schmidt when player chooses hard
                    System.out.println("Player 2 is Schmidt");
                    compSkillLevel = 3;
                }
                else{
                    System.out.println("Something Wrong");
                }
            }

            else{   // if user types in something other than human or computer, make them do it again
                System.out.println("**Error** Wrong input. \nPlease type in \"human\" if you would like to choose human or \"computer\" if you would like to choose computer.");
            }   
        }
    }

    /**
     * The getWinsNeeded method asks player 1 how many games they are playing
     * in their series, and returns how many wins are needed for one player
     * to win the series.
     * 
     * @return an integer representing the number of wins needed in order for
     *         one player to win the whole series
     */
    private static int getWinsNeeded(){
        int totalRound = 0, temp = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println(player1 + " and " + player2 + " how many games will you be playing 1, 3, 5, or 7?");
        totalRound = userInput.nextInt();
        while (temp == 0){
            if(totalRound != 1 && totalRound != 3 && totalRound != 5 && totalRound != 7) {
                System.out.println("**Error**  That is an invalid choice, choose 1, 3, 5, or 7.");
                System.out.println(player1 + " and " + player2 + ", how many games will you be playing 1, 3, 5, or 7?");
                totalRound = userInput.nextInt();
            }
            else{
                System.out.println("You will be playing " + totalRound + " rounds. Best of " + totalRound + " wins!");
                temp = 1;
            }
            totalWinsNeeded = (int)((totalRound/2) + 1);
            System.out.println( "You need to win " + totalWinsNeeded + " games !");
        }
        return totalWinsNeeded;
    }

    /**
     * The chooseMaxToothpicksPerTurn method asks player 1 how many toothpicks will be
     * the maximum number that they can choose per turn, or whether they
     * want the maximum randomly determined before the start of each game.
     * 
     * Postcondition:  A global boolean variable is set showing whether or not the max 
     *                 toothpicks per turn should be randomly determined before each
     *                 game.
     *                 
     *                 A global max toothpicks per turn variable is set with the 
     *                 correct maximum, but only if it is NOT being randomly determined
     *                 before each game.
     */
    private static void chooseMaxToothpicksPerTurn(){
        int check = 0;
        Scanner userInputNum = new Scanner(System.in);
        System.out.println(player1 + ", what is maximum number of toothpicks that you can take per turn?");

        while(check == 0){
            System.out.println("Enter 3, 4, 5, or 6 (or 0 to have it randomly chosen before each game):");
            maxNumOfToothpicks = userInputNum.nextInt(); 
            if(maxNumOfToothpicks != 0 && maxNumOfToothpicks != 3 && maxNumOfToothpicks != 4 && maxNumOfToothpicks != 5 && maxNumOfToothpicks != 6){         
                System.out.println("**Error**  That is an invalid choice, choose 0, 3, 4, 5, 6");
                System.out.println(player1 + ", what is maximum number of toothpicks that you can take per turn?"); 
            }
            else if(maxNumOfToothpicks == 0){
                maxNumOfToothpicks = (int)(Math.random() * 3) +3; //  random 3,4,5,6
                check = 1;
            }
            else{
                check = 1;
            }
        }
    }

    /**
     * The playOneGame method plays a single round of the Toothpick Game from
     * start to finish.
     */
    private static void playOneGame(){
        initializeGame();           
        while (toothpicksRemaining > 0){
            if (toothpicksRemaining == 1){
                System.out.println("\nThere is 1 toothpick remaining.");
            }
            else{
                System.out.println("\nThere are " + toothpicksRemaining + " toothpicks remaining.");        
            }
            currentPlayerTakesTurn();
            if (toothpicksRemaining != 0){
                currentPlayer = (currentPlayer % 2) + 1; //switch the current player
            }
        }
        congratulateWinner();
    }

    /**
     * The initializeGame method will get a Toothpick Game ready to go.
     * 
     * A random number from 20 to 39 is generated for the number of toothpicks remaining.  
     * The result is printed to the screen.
     * 
     * A coin is flipped to see who will go first.  The result of the coin flip is 
     * output to the screen.
     * 
     * ***IF*** they have chosen to have a random amount of max toothpicks per turn, 
     * then that value needs to be generated and stored in the correct variable.
     * Only if that value was randomly generated will something be output to the screen.
     * 
     * Postcondition:  toothpicksRemaining, currentPlayer, and whatever you named the
     *                 variable holding the maximum number per turn are all properly set
     */
    private static void initializeGame(){
        int coin = 0;
        toothpicksRemaining = (int)((Math.random() * 20) + 20);
        coin = (int)(Math.random() * 2) + 1;  // coin is either 1 or 2 
        System.out.println("\nThe Dutch is having the game play with " + toothpicksRemaining + " toothpicks.");
        if (coin == 1){
            System.out.println("Houdini has flipped the coin, " + player1 + " goes first.");
            System.out.println("The max amount of toothpicks a player can take is " + maxNumOfToothpicks + " toothpicks per turn.");
            currentPlayer = 1;
        }
        else {
            System.out.println("Houdini has flipped the coin, " + player2 + " goes first.");
            System.out.println("The max amount of toothpicks a player can take is " + maxNumOfToothpicks + " toothpicks per turn.");
            currentPlayer = 2;
        }
    }

    /**
     * The congratulateWinner method will congratulate the winner!
     * 
     * Postcondition:  After printing to the screen a relevant congratulations,
     *                 the appropriate player's win total has been incremented.
     */
    private static void congratulateWinner(){
        System.out.println("|-------------------|");
        System.out.println("|--CONGRATULATIONS--|");
        System.out.println("|-------------------|");
        if (currentPlayer == 1){
            player1Wins++;
            System.out.println(player1 + " has won. Good Try " + player2 + ".");
        }
        else{
            player2Wins++;
            System.out.println(player2 + " has won. Good Try " + player1 + ".");
        }
    }

    /**
     * The current player takes turn method determines who is supposed to be going
     * right now, and calls the appropriate method to make that happen.
     */
    private static void currentPlayerTakesTurn(){
        if (currentPlayer == 1){
            player1TakesTurn();
        }
        else if (computerOpponent == false){
            player2TakesTurn();
        }
        else if (compSkillLevel == EASY){
            easyComputerTakesTurn();
        }
        else if (compSkillLevel == MEDIUM){
            mediumComputerTakesTurn();
        }
        else if (compSkillLevel == HARD){
            hardComputerTakesTurn();
        }
        else{
            System.out.println("It should have been impossible to get here");
            System.out.println("Something is definitely wrong.");
        }
    }    

    /**
     * The player1TakesTurn method lets player 1, um, take a turn.
     * 
     * Postcondition:  The pile of toothpicks does not go negative.
     */
    private static void player1TakesTurn(){
        int toothpickPicked = 0, flag = 0;
        Scanner userNum = new Scanner(System.in);

        System.out.println(player1 + " how many toothpicks will you pick?");
        toothpickPicked = userNum.nextInt();
        while (flag == 0){          
            if (toothpickPicked < 1 || toothpickPicked > maxNumOfToothpicks || toothpickPicked > toothpicksRemaining){
                if (toothpickPicked == 0){
                    System.out.println("You can't pick 0 toothpicks.");    
                }
                else if(toothpickPicked < 0){
                    System.out.println("You can't pick a negative amount of toothpicks.");
                }
                else if (toothpickPicked > maxNumOfToothpicks){
                    System.out.println("You can't pick more toothpicks than the max amout of toothpicks per turn.");
                }
                else if (toothpickPicked > toothpicksRemaining){
                    System.out.println("You can't pick more toothpicks than what is remaining.");
                }
                System.out.println(player1 + ", how many toothpicks will you pick?");
                toothpickPicked = userNum.nextInt();
            }
            else{
                flag = 1;
                toothpicksRemaining -= toothpickPicked;
            }   
        }
    }

    /**
     * The player2TakesTurn method lets player 2, well, take a turn.
     * 
     * Postcondition:  The pile of toothpicks does not go negative.
     */
    private static void player2TakesTurn(){
        int toothpickPicked = 0, flag = 0;
        Scanner userNum = new Scanner(System.in);

        while (flag == 0){   
            System.out.println(player2 + " how many toothpicks will you pick?");
            toothpickPicked = userNum.nextInt();
            if(toothpickPicked < 1 || toothpickPicked > maxNumOfToothpicks || toothpickPicked > toothpicksRemaining){
                if (toothpickPicked == 0){
                    System.out.println("You can't pick 0 toothpicks.");    
                }
                else if(toothpickPicked < 0){ 
                    System.out.println("You can't pick a negative amount of toothpicks.");
                }
                else if (toothpickPicked > maxNumOfToothpicks){
                    System.out.println("You can't pick more toothpicks than the max amout of toothpicks per turn.");
                }
                else if (toothpickPicked > toothpicksRemaining){
                    System.out.println("You can't pick more toothpicks than what is remaining.");
                }
            }
            else{
                flag = 1;
                toothpicksRemaining -= toothpickPicked;
            }
        }  
    }

    /**
     * The getRandomChoice method will return a random number of toothpicks
     * between 1 and the max per turn.  It will also never pick a random
     * number which will make the pile go negative.
     * 
     * @return an integer representing a randomly selected amount of toothpicks 
     *         from 1 to the max per turn (inclusive).  The number returned must
     *         also NOT be greater than the number of toothpicks left in the pile.
     */
    private static int getRandomChoice(){
        int randomChoice = 0;
        randomChoice = (int)(Math.random() * maxNumOfToothpicks) + 1;

        while (randomChoice > toothpicksRemaining){
            randomChoice = (int)(Math.random() * maxNumOfToothpicks) + 1;
        }
        if (toothpicksRemaining < maxNumOfToothpicks){
            randomChoice = (int)(Math.random() * toothpicksRemaining) + 1;
        }
        return randomChoice;
    }

    /**
     * The getOptimalChoice method will return the number of toothpicks that
     * needs to be taken to force a win, if it exists.
     * 
     * @return an integer representing the optimal number of toothpicks to take
     *         in order to force a win, if it exists;
     *         this will return -1 if it is impossible to force a win at this time
     */
    private static int getOptimalChoice(){
        int bestChoice = 0;
        if(toothpicksRemaining % (maxNumOfToothpicks + 1) == 0){
            bestChoice = -1;
        } 
        else{
            bestChoice = toothpicksRemaining % (maxNumOfToothpicks + 1);
        }
        return bestChoice;
    }

    /**
     * The easyComputerTakesTurn method will always take a random number of 
     * toothpicks and then output their choice to the screen after calling
     * getEasyTurnDescription.
     * 
     * Reminder!  In the The Toothpick Game.pdf file, I told you this method
     * (and the next five methods after it!!) should not be using any global
     * variables.  Only local is needed due to the paramater lists.
     */
    private static void easyComputerTakesTurn(){
        int randomNum = 0;
        String sentence = "";

        randomNum = getRandomChoice();
        sentence = getEasyTurnDescription(randomNum);

        System.out.println(sentence);
    }

    /**
     * getEasyTurnDescription will return a randomly selected String showing
     * what the Easy Computer decided to do this turn.  The method will be 
     * randomly choosing from at least four different possible Strings.
     * 
     * The String returned will reflect the easy computer's personality. 
     * 
     * @param  num  an integer representing the number of toothpicks which
     *              is supposed to be taken this turn
     * @return a String which describes what the easy computer does this turn
     */
    private static String getEasyTurnDescription(int num){
        int choicePhrase = 0;
        String phrase = "";

        choicePhrase = (int)(Math.random()*5);  // random int values choicePhrase = 0,1,2,3,4
        toothpicksRemaining -= num;
        if (num >= 1){
            if(num>1){
                if (choicePhrase == 0){
                    phrase = "Jakob is tired, he missed his dailiy coffee so he picks " + num + " toothpicks.";
                }
                else if (choicePhrase == 1){
                    phrase = "Jakob ended up being busy with his car repair, wasn't focused so he picked " + num + " toothpicks.";
                }
                else if (choicePhrase == 2){
                    phrase = "Jakob has done his morning pushup's he picked the right mount of " + num + " toothpicks.";
                }
                else{
                    phrase = "Jakob needs his sleep, he closed his eyes and picked " + num + " toothpicks.";
                }
            }   
            else{   
                if (choicePhrase <2){       
                    phrase = "Jakob has done his morning pushup's so he picked only " + num + " toothpick."; //single toothpicks
                }
                else {
                    phrase = "Jakob needs his sleep, he closed his eyes and picked " + num + " toothpick.";
                } 
            }
        }
        return phrase;
    }

    /**
     * The mediumComputerTakesTurn method will sometimes take a random amount
     * of toothpicks and sometimes take the optimal amount.  Once determined,
     * it will use getMediumTurnDescription in order to determine what to 
     * print to the screen.
     */
    private static void mediumComputerTakesTurn(){
        int probability = 0, getRandomOrGetOptimal = 0; 
        String sentenceRandom = "", sentenceOptimal = "";

        probability = (int)(Math.random() * 100); // random values probability=0,1,2...99 any of this

        sentenceRandom = getMediumTurnDescription(getRandomChoice());
        sentenceOptimal = getMediumTurnDescription(getOptimalChoice());

        if (probability <= 50){
            System.out.println(sentenceRandom);
        }
        if (probability > 50){
            System.out.println(sentenceOptimal);
        }
    }

    /**
     * getMediumTurnDescription will return a randomly selected String showing
     * what the Medium Computer decided to do this turn.  The method will be 
     * randomly choosing from at least four different possible Strings.
     * 
     * The String returned will reflect the easy computer's personality. 
     * 
     * @param  num  an integer representing the number of toothpicks which
     *              is supposed to be taken this turn
     * @return a String which describes what the medium computer does this turn
     */
    private static String getMediumTurnDescription (int num){
        int choicePhrase;
        String phrase = "";
        choicePhrase = (int)(Math.random()*4); // choicePhrase = 0,1,2,3
        if (num == -1){
            num = getRandomChoice();
            toothpicksRemaining -= num;
        }
        else{
            toothpicksRemaining -= num;
        }
        if (num >= 1){
            if(num > 1){
                if (choicePhrase == 0){
                    phrase = "Willy has gotten his preworkout today, he's feeling good with his choice of " + num + " toothpicks.";
                }
                else if (choicePhrase == 1){
                    phrase = "Willy's eyes are soar he needed " + num + " toothpicks to treat them.";
                }
                else if (choicePhrase == 2){
                    phrase = "Willy is getting his C game on, he was ablt to pick " + num + " toothpicks.";
                }
                else{
                    phrase = "Willy is failing life he ended up picking " + num + " toothpicks.";
                }
            }
            else{
                if (choicePhrase < 2){
                    phrase = "Willy has gotten his preworkout today, he's feeling good with his choice of " + num + " toothpick.";
                }
                else {
                    phrase = "Willy's eyes are soar he needed " + num + " toothpick to treat them.";
                } 
            }
        }
        return phrase;
    }

    /**
     * The hardComputerTakesTurn method will always try to do the optimal choice.
     * 
     * Sometimes there is no optimal choice, so it will resort to a random
     * amount instead.  
     * 
     * Once the method determines what its choice is, it will use 
     * getHardTurnDescription in order to determine what to print to the screen.
     * Unlike the Easy Computer and the Medium Computer, this computer player will
     * know whether it is playing optimally or not, so when it calls
     * getHardTurnDescription, it will also include a boolean variable 
     * relaying whether this turn he will be forcing a win or not.
     */
    private static void hardComputerTakesTurn(){
        boolean statement = false;

        if(getOptimalChoice()>0){
            statement = true;
        }
        else{
            statement = false;
        }
        System.out.println(getHardDescription(getOptimalChoice(), statement));
    }

    /**
     * getHardTurnDescription will return a randomly selected String showing
     * what the Hard Computer decided to do this turn.
     * 
     * You are supposed to be giving each of your computer skill levels personality,
     * and that will continue here.
     * 
     * Unlike the Easy and Medium computers, however, we are building in a little 
     * extra here because the Hard computer knows whether or not it is forcing a
     * win.  
     * 
     * The computer will have four random Strings to choose from if he is happy, 
     * and four random Strings to choose from if happy is false.
     * 
     * You get to have creative license for what being happy means for your hard
     * computer.  Will it gloat?  Trash talk?  Be smug?  Brush you off like you
     * are a peon?  Be nice about it?  It is up to you.
     * 
     * Similarly, you can decide how frustrated, indifferent, angry, etc. you want
     * your Hard computer to be if he is having to choose randomly.
     * 
     * @param  num  an integer representing the number of toothpicks which
     *              is supposed to be taken this turn
     * @param  happy  a boolean representing whether the computer is happy with its
     *                selection this turn (it is forcing a win) or not (it had to 
     *                pick randomly).
     * @return a String which describes what the hard computer does this turn
     */
    private static String getHardDescription(int num, boolean happy)
    {
        int choicePhrase = 0;
        String phrase = "";

        choicePhrase = (int)(Math.random() * 4); // choice = is a random number from 0,1,2,3
        if (num == -1){
            num = getRandomChoice();
            happy = false;
            toothpicksRemaining -= num;
        }
        else {
            happy = true;
            toothpicksRemaining -= num;
        }
        if (num >= 1){
            if (happy == true){
                if(num>1){
                    if (choicePhrase == 0){
                        phrase = "Schmidt is using extra brain power to pick " + num + " toothpicks.";
                    }
                    else if (choicePhrase == 1){
                        phrase = "Schmidt is using his genius superpowers to pick " + num + " toothpicks.";
                    }
                    else if (choicePhrase == 2){
                        phrase = "Schmidt is cheating he picked " + num + " toothpicks.";
                    }
                    else  {
                        phrase = "Schmidt is overblown by the amount of choices so he chooses " + num + " toothpicks.";
                    }
                }
                else{
                    if (choicePhrase < 2){
                        phrase = "Schmidt is tired and only chooses " + num + " toothpick.";
                    }
                    else{
                        phrase = "Schmidt has not worked out so he only chooses " + num + " toothpick.";
                    }              
                }          
            }
            else if (happy == false){
                if(num>1){
                    if (choicePhrase == 0){
                        phrase = "Schmidt was not able to use his computer powers so he was only able to pick " + num + " toothpicks.";
                    }
                    else if (choicePhrase == 1){
                        phrase = "Schmidt is frustated, he is overheating and picked " + num + " toothpicks.";
                    }
                    else if (choicePhrase == 2){
                        phrase = "Schmidt asked Jakob to pick for him, they picked " + num + " toothpicks, what a terrible idea.";
                    }
                    else  {
                        phrase = "Schmidt will never be able to win like this he is forced to pick " + num + " toothpicks.";
                    }
                }
                else{
                    if (choicePhrase < 2){
                        phrase = "Schmidt will never be able to win like this he is forced to pick " + num + " toothpick.";
                    }
                    else{
                        phrase = "Schmidt asked Willy for advide, he told him to only pick " + num + " toothpick.";
                    }
                }
            }
        }
        return phrase;
    }

    /**
     * The displayFinalStats method calls displayFinalStatsBanner and then
     * shows the results of the series of games and declare a winner.
     */
    private static void displayFinalStats(){
        displayFinalStatsBanner();
        if (player1Wins >= 0 && player2Wins >= 0){
            if (player1Wins > player2Wins){
                System.out.println(player1 + " has won " + player1Wins + " games.");
                System.out.println(player2 + " has won " + player2Wins + " games.");
                System.out.println(player1 + " is the overall winner.");
            }
            else if (player2Wins > player1Wins){
                System.out.println(player2 + " has won " + player2Wins + " games.");
                System.out.println(player1 + " has won " + player1Wins + " games.");
                System.out.println(player2 + " is the overall winner.");
            }
        } 
    }

    /**
     * The displayFinalStatsBanner method displays a nice-looking banner to be used at the top
     * of the output for displayFinalStats.
     * 
     * That's all.
     * 
     * Be creative.
     */
    private static void displayFinalStatsBanner(){
        System.out.println("   ,___    _,  _ _ _  ______     ___  _,   _ ______ _ __                 "); 
        System.out.println("  /   /   / | ( / ) )(  /       /  ()( |  / (  /   ( /  )                ");
        System.out.println(" /  __   /--|  / / /   /--     /   /   | /    /--   /--<                 ");
        System.out.println("(___/  _/   |_/ / (_ (/____/  (___/    |/   (/____//    \\_              ");
        System.out.println("\n\n"+" ______  ___  _ __     _,   __      __, ______    _,  ______  __, ");
        System.out.println("(  /    ( /  ( /  )   / |  ( /     (   (  /      / | (  /    (      /    ");
        System.out.println(" -/--    /    /  /   /--|   /       `.   /      /--|   /      `.   /     ");
        System.out.println("_/     _/_   /  (_ _/   |_(/___/  (___)_/     _/   |__/     (___) '      ");
    }
}