/** 
 * The Toothpick Game is the the most amazing game EVER!
 * 
 * @author Rocky lee
 */
import java.util.Scanner;
public class EXAMPLE{
    private static String player1 = "", player2 = "";
    private static int winsNeeded = 1, currentPlayer = 0, player1Wins, player2Wins, toothpicksRemaining =  1, max = 0, compSkillLevel = 0;
    private static boolean computerOpponent = false;
    public static final int EASY = 1, MEDIUM = 2, HARD = 3;

    /**
     * The displayWelcomeBanner method should be your take on a welcome message.
     * 
     * Be creative.
     */
    private static void displayWelcomeBanner(){
        System.out.println("**************************************************");
        System.out.println("***WELCOME TO ROCKY'S AWESOME TOOTHPICK GAME!!!***");
        System.out.println("**************************************************");
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

        winsNeeded = getWinsNeeded();

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
     * Postcondition:  computerOpponent gets properly set;  
     * 
     *                 The player 1's name and player 2's name varaibles are set properly;  
     *                 
     *                 If playing against a computer then compSkillLevel is also
     *                 set properly.
     */
    private static void choosePlayers(){
        Scanner userInput = new Scanner(System.in);
        int num = 0;
        System.out.print("Player 1, please enter your name: ");
        player1 = userInput.nextLine();
        player1 = player1.trim();
        System.out.println(player1 + ", is player 2 going to be a human or computer opponent?");
        String answer = userInput.nextLine();
        if (answer.equalsIgnoreCase("human")){
            computerOpponent = false;
            System.out.println("Player 2, please enter your name: ");
            player2 = userInput.nextLine();
            player2 = player2.trim();
        }
        else if (answer.equalsIgnoreCase("computer")){
            computerOpponent = true;
            System.out.println("************************");
            System.out.println("* Computer Skill Level *");
            System.out.println("************************");
            System.out.println("* 1) Devin             *");
            System.out.println("* 2) Jayden            *");
            System.out.println("* 3) David             *");
            System.out.println(player1 + ", which computer do you want to take on? ");
            num = userInput.nextInt();
            if (num == 1){
                player2 = "Devin";
                compSkillLevel = 1;
            }
            else if (num == 2){
                player2 = "Jayden";
                compSkillLevel = 2;
            }
            else if (num == 3){
                player2 = "David";
                compSkillLevel = 3;
            }
            else{
                System.out.println("************************");
                System.out.println("* Computer Skill Level *");
                System.out.println("************************");
                System.out.println("* 1) Devin             *");
                System.out.println("* 2) Jayden            *");
                System.out.println("* 3) David             *");
                System.out.println(player1 + ", which computer do you want to take on? ");
                num = userInput.nextInt();
            }
        }
        else{
            
            System.out.println("I'm sorry, " + player1 + ", but that is an invalid choice");
            System.out.println("Please choose \"human\" or \"computer\".");
            System.out.println(player1 + ", is player 2 going to be a human or computer opponent?");
            answer = userInput.nextLine();
        }

    }

    /**
     * The getWinsNeeded method asks player 1 how many games they are playing
     * in their series, and returns how many wins are needed for one player
     * to win the series.
     * 
     * @return an integer representing the number of wins needed in order for
     *         one player to win the whole series
     */

    private static int getWinsNeeded()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(player1 + ", will you be playing best out of 1, 3, 5, or 7?");
        int rounds = userInput.nextInt();
        while (rounds != 1 && rounds != 3 && rounds != 5 && rounds != 7)
        {
            System.out.println("I'm sorry, " + player1 + ", but that is an invalid choice. Please choose 1, 3, 5, or 7.");
            System.out.println(player1 + ", will you be playing best out of 1, 3, 5, or 7?");
            rounds = userInput.nextInt();
        }
        winsNeeded = (int)((rounds/2) + 1);
        return winsNeeded;
    }

    /**
     * The chooseMaxToothpicksPerTurn method asks player 1 how many toothpicks will be
     * the maximum number that they can choose per turn, or whether they
     * want the maximum randomly determined before the start of each game.
     * 
     * Postcondition:  A global boolean variable is set showing whether or not the max 
     *                 toothpicks per turn should be randomly determined before each
     *                 game.
     *                 
     *                 A global max toothpicks per turn variable is set with the 
     *                 correct maximum, but only if it is NOT being randomly determined
     *                 before each game.
     */
    private static void chooseMaxToothpicksPerTurn()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(player1 + ", what is the maximum number of toothpicks that a player can take per turn? ");
        System.out.println("Enter 3, 4, 5, or 6 (or 0 to have it randomly chose before each game)");
        max = userInput.nextInt();
        while (max != 0 && max != 3 && max != 4 && max != 5 && max != 6)
        {
            System.out.println("I'm sorry, " + player1 + ", but that is an invalid choice. Please choose 3, 4, 5, 6, or 0.");
            System.out.println(player1 + ", what is the maximum number of toothpicks that a player can take per turn? ");
            System.out.println("Enter 3, 4, 5, or 6 (or 0 to have it randomly chose before each game)");
            max = userInput.nextInt();
        }
        if (max == 0)
        {
            max = (int)((Math.random() * 3) + 3);
        }
    }

    /**
     * The playOneGame method plays a single round of the Toothpick Game from
     * start to finish.
     */
    private static void playOneGame()
    {
        initializeGame();           
        while (toothpicksRemaining > 0)
        {
            if (toothpicksRemaining == 1)
            {
                System.out.println("\nThere is 1 toothpick remaining.");
            }
            else
            {
                System.out.println("\nThere are " + toothpicksRemaining + " toothpicks remaining.");        
            }
            currentPlayerTakesTurn();
            if (toothpicksRemaining != 0)
            {
                currentPlayer = (currentPlayer % 2) + 1; //switch current player
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
     * A coin is flipped to see who will go first.  The result of the coin flip is 
     * output to the screen.
     * 
     * ***IF*** they have chosen to have a random amount of max toothpicks per turn, 
     * then that value needs to be generated and stored in the correct variable.
     * Only if that value was randomly generated will something be output to the screen.
     * 
     * Postcondition:  toothpicksRemaining, currentPlayer, and whatever you named the
     *                 variable holding the maximum number per turn are all properly set
     */
    private static void initializeGame()
    {
        toothpicksRemaining = (int)((Math.random() * 20) + 20);
        int coin = (int)((Math.random() * 2) + 1);
        System.out.println("The random gnome has decided this game will be played with " + toothpicksRemaining + " toothpicks.");
        if (coin == 1)
        {
            System.out.println("The Rock Man has flipped a coin and ... " + player1 + " will go first.");
            System.out.println("The Rock Man has determined that each player may take up to " + max + " toothpicks per turn.");
            currentPlayer = 1;
        }
        else if (coin == 2)
        {
            System.out.println("The Rock Man has flipped a coin and ... " + player2 + " will go first.");
            System.out.println("The Rock Man has determined that each player may take up to " + max + " toothpicks per turn.");
            currentPlayer = 2;
        }
    }

    /**
     * The congratulateWinner method will congratulate the winner!
     * 
     * Postcondition:  After printing to the screen a relevant congratulati2ns,
     *                 the appropriate player's win total has been incremented.
     */
    private static void congratulateWinner()
    {
        if (currentPlayer == 1)
        {
            player1Wins++;
            System.out.println("*******************");
            System.out.println("**CONGRATULATIONS**");
            System.out.println("*******************");
            System.out.println(player1 + " has snatched the win this round from " + player2 + ". Better luck next time " + player2 + ".");
        }
        else
        {
            player2Wins++;
            System.out.println("*******************");
            System.out.println("**CONGRATULATIONS**");
            System.out.println("*******************");
            System.out.println(player2 + " has snatched the win this round from " + player1 + ". Better luck next time " + player1 + ".");
        }
        System.out.println();
    }

    /**
     * The current player takes turn method determines who is supposed to be going
     * right now, and calls the appropriate method to make that happen.
     */
    private static void currentPlayerTakesTurn()
    {
        if (currentPlayer == 1)
            player1TakesTurn();
        else if (computerOpponent == false)
            player2TakesTurn();
        else if (compSkillLevel == EASY)
            easyComputerTakesTurn();
        else if (compSkillLevel == MEDIUM)
            mediumComputerTakesTurn();
        else if (compSkillLevel == HARD)
            hardComputerTakesTurn();
        else
        {
            System.out.println("It should have been impossible to get here");
            System.out.println("Something is definitely wrong.");
        }
    }    

    /**
     * The player1TakesTurn method lets player 1, um, take a turn.
     * 
     * Postcondition:  The pile of toothpicks does not go negative.
     */
    private static void player1TakesTurn()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(player1 + ", how many toothpicks would you like to pick? ");
        int pick = userInput.nextInt();
        while (pick < 1 || pick > max || pick > toothpicksRemaining)
        {
            if (pick < 1)
            {
                System.out.println("You cannot pick negative amounts of toothpicks.");
                System.out.println(player1 + ", how many toothpicks would you like to pick? ");
                pick = userInput.nextInt();
            }
            else if (pick > max)
            {
                System.out.println("You cannot pick more toothpicks than the max amout of toothpicks per turn.");
                System.out.println(player1 + ", how many toothpicks would you like to pick? ");
                pick = userInput.nextInt();
            }
            else if (pick > toothpicksRemaining)
            {
                System.out.println("You cannot pick more toothpicks than what is left.");
                System.out.println(player1 + ", how many toothpicks would you like to pick? ");
                pick = userInput.nextInt();
            }
        }
        toothpicksRemaining -= pick;
    }

    /**
     * The player2TakesTurn method lets player 2, well, take a turn.
     * 
     * Postcondition:  The pile of toothpicks does not go negative.
     */
    private static void player2TakesTurn()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(player2 + ", how many toothpicks would you like to pick? ");
        int pick = userInput.nextInt();
        while (pick < 1 || pick > max || pick > toothpicksRemaining)
        {
            if (pick < 1)
            {
                System.out.println("You cannot pick negative amounts of toothpicks.");
                System.out.println(player2 + ", how many toothpicks would you like to pick? ");
                pick = userInput.nextInt();
            }
            else if (pick > max)
            {
                System.out.println("You cannot pick more toothpicks than the max amout of toothpicks per turn.");
                System.out.println(player2 + ", how many toothpicks would you like to pick? ");
                pick = userInput.nextInt();
            }
            else if (pick > toothpicksRemaining)
            {
                System.out.println("You cannot pick more toothpicks than what is left.");
                System.out.println(player2 + ", how many toothpicks would you like to pick? ");
                pick = userInput.nextInt();
            }
        }
        toothpicksRemaining -= pick;
    }

    /**
     * The getRandomChoice method will return a random number of toothpicks
     * between 1 and the max per turn.  It will also never pick a random
     * number which will make the pile go negative.
     * 
     * @return an integer representing a randomly selected amount of toothpicks 
     *         from 1 to the max per turn (inclusive).  The number returned must
     *         also NOT be greater than the number of toothpicks left in the pile.
     */
    private static int getRandomChoice()
    {
        int rand = (int)((Math.random() * max) + 1);
        while (rand > toothpicksRemaining)
        {
            rand = (int)((Math.random() * max) + 1);
        }
        if (toothpicksRemaining < max)
        {
            rand = (int)((Math.random() * toothpicksRemaining) + 1);
        }
        return rand;
    }

    /**
     * The getOptimalChoice method will return the number of toothpicks that
     * needs to be taken to force a win, if it exists.
     * 
     * @return an integer representing the optimal number of toothpicks to take
     *         in order to force a win, if it exists;
     *         this will return -1 if it is impossible to force a win at this time
     */
    private static int getOptimalChoice()
    {
        int sub = 0;
        if (toothpicksRemaining > max && toothpicksRemaining <= 2*max)
        {
            for (sub = 1; sub <= max; sub++)
            {
                if (toothpicksRemaining - sub == max + 1)
                {
                    return sub;
                }
            }
        }
        if (toothpicksRemaining <= max)
        {
            return toothpicksRemaining;
        }
        else
        {
            return -1;
        }
    }

    /**
     * The easyComputerTakesTurn method will always take a random number of 
     * toothpicks and then output their choice to the screen after calling
     * getEasyTurnDescription.
     */
    private static void easyComputerTakesTurn()
    {
        System.out.println(getEasyTurnDescription(getRandomChoice()));
    }

    /**
     * getEasyTurnDescription will return a randomly selected String showing
     * what the Easy Computer decided to do this turn.  The method will be 
     * randomly choosing from at least four different possible Strings.
     * 
     * The String returned will reflect the easy computer's personality. 
     * 
     * @param  num  an integer representing the number of toothpicks which
     *              is supposed to be taken this turn
     * @return a String which describes what the easy computer does this turn
     */
    private static String getEasyTurnDescription(int num)
    {
        int phrase = (int)(Math.random() * 5);
        toothpicksRemaining -= num;
        if (num > 1)
        {
            if (phrase == 0)
            {
                return "Devin's brain is overheating from making the best choice so he picks " + num + " toothpicks.";
            }
            else if (phrase == 1)
            {
                return "Devin's brain exploded from pouring water on his overheating brain so he picks " + num + " toothpicks.";
            }
            else if (phrase == 2)
            {
                return "Devin's brain has malfunctioned because of an unknown error so he picks " + num + " toothpicks.";
            }
            else if (phrase == 3)
            {
                return "Devin's arm spasms and acidentally picks " + num + " toothpicks.";
            }
            else 
            {
                return "Devin has been RKOed by John Cena so John Cena helps Devin pick " + num + " toothpicks.";
            }
        }
        else if (num == 1)
        {
            if (phrase == 0)
            {
                return "Devin's brain is overheating from making the best choice so he picks " + num + " toothpick.";
            }
            else if (phrase == 1)
            {
                return "Devin's brain exploded from pouring water on his overheating brain so he picks " + num + " toothpick.";
            }
            else if (phrase == 2)
            {
                return "Devin's brain has malfunctioned because of an unknown error so he picks " + num + " toothpick.";
            }
            else if (phrase == 3)
            {
                return "Devin's arm spasms and acidentally picks " + num + " toothpick.";
            }
            else 
            {
                return "Devin has been RKOed by John Cena so John Cena helps Devin pick " + num + " toothpick.";
            }
        }
        return "something is wrong";
    }

    /**
     * The mediumComputerTakesTurn method will sometimes take a random amount
     * of toothpicks and sometimes take the optimal amount.  Once determined,
     * it will use getMediumTurnDescription in order to determine what to 
     * print to the screen.
     */
    private static void mediumComputerTakesTurn()
    {
        int chance = (int)(Math.random() * 13);
        if (chance <= 7)
        {
            System.out.println(getMediumTurnDescription(getRandomChoice()));
        }
        if (chance > 7)
        {
            System.out.println(getMediumTurnDescription(getOptimalChoice()));
        }
    }

    /**
     * getMediumTurnDescription will return a randomly selected String showing
     * what the Medium Computer decided to do this turn.  The method will be 
     * randomly choosing from at least four different possible Strings.
     * 
     * The String returned will reflect the easy computer's personality. 
     * 
     * @param  num  an integer representing the number of toothpicks which
     *              is supposed to be taken this turn
     * @return a String which describes what the medium computer does this turn
     */
    private static String getMediumTurnDescription (int num)
    {
        int phrase = (int)(Math.random() * 5);
        if (num == -1)
        {
            num = getRandomChoice();
            toothpicksRemaining -= num;
        }
        else
        {
            toothpicksRemaining -= num;
        }
        if (num > 1)
        {
            if (phrase == 0)
            {
                return "Jayden's brain is overheating from making the best choice so he picks " + num + " toothpicks.";
            }
            else if (phrase == 1)
            {
                return "Jayden's brain exploded from pouring water on his overheating brain so he picks " + num + " toothpicks.";
            }
            else if (phrase == 2)
            {
                return "Jayden's brain has malfunctioned because of an unknown error so he picks " + num + " toothpicks.";
            }
            else if (phrase == 3)
            {
                return "Jayden's arm spasms and acidentally picks " + num + " toothpicks.";
            }
            else 
            {
                return "Jayden has been RKOed by John Cena so John Cena helps Jayden pick " + num + " toothpicks.";
            }
        }
        else if (num == 1)
        {
            if (phrase == 0)
            {
                return "Jayden's brain is overheating from making the best choice so he picks " + num + " toothpick.";
            }
            else if (phrase == 1)
            {
                return "Jayden's brain exploded from pouring water on his overheating brain so he picks " + num + " toothpick.";
            }
            else if (phrase == 2)
            {
                return "Jayden's brain has malfunctioned because of an unknown error so he picks " + num + " toothpick.";
            }
            else if (phrase == 3)
            {
                return "Jayden's arm spasms and acidentally picks " + num + " toothpick.";
            }
            else 
            {
                return "Jayden has been RKOed by John Cena so John Cena helps Jayden pick " + num + " toothpick.";
            }
        }
        return "something is wrong";
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
    private static void hardComputerTakesTurn()
    {
        System.out.println(getHardDescription(getOptimalChoice()));
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
     * computer.  Will it gloat?  Trash talk?  Be smug?  Brush you off like you
     * are a peon?  Be nice about it?  It is up to you.
     * 
     * Similarly, you can decide how frustrated, indifferent, angry, etc. you want
     * your Hard computer to be if he is having to choose randomly.
     * 
     * @param  num  an integer representing the number of toothpicks which
     *              is supposed to be taken this turn
     * @param  happy  a boolean representing whether the computer is happy with its
     *                selection this turn (it is forcing a win) or not (it had to 
     *                pick randomly).
     * @return a String which describes what the hard computer does this turn
     */
    private static String getHardDescription(int num)
    {
        boolean happy = false;
        int phrase = (int)(Math.random() * 4);
        if (num == -1)
        {
            num = getRandomChoice();
            happy = false;
            toothpicksRemaining -= num;
        }
        else 
        {
            happy = true;
            toothpicksRemaining -= num;
        }
        if (num > 1)
        {
            if (happy == true)
            {
                if (phrase == 0)
                {
                    return "David is overjoyed that he can force the win this turn and snatched " + num + " toothpicks.";
                }
                else if (phrase == 1)
                {
                    return "David is stoked that he can force the win this round and picked " + num + " toothpicks.";
                }
                else if (phrase == 2)
                {
                    return "David is has passed out due to excitment that he can force the win so Steve Carell came and picked " + num + " toothpicks for David.";
                }
                else  
                {
                    return "David's hand is shaking from excietment so he knocks over " + num + " toothpicks off the table.";
                }
            }
            else if (happy == false)
            {
                if (phrase == 0)
                {
                    return "David did not get to force a win so he snaps " + num + " toothpicks off the table.";
                }
                else if (phrase == 1)
                {
                    return "David could not see into the future to force the win so he slams his fists on the table, breaking " + num + " toothpicks.";
                }
                else if (phrase == 2)
                {
                    return "David was fustrated that he could no see a way to win this round so he hits his head on the table, knocking " + num + " toothpicks off a table.";
                }
                else  
                {
                    return "David's nostrils are flaring from anger because he is not able to force a win this round so he blows " + num + " toothpicks off the table.";
                }
            }
        }
        else if (num == 1)
        {
            if (happy == true)
            {
                if (phrase == 0)
                {
                    return "David is overjoyed that he can force the win this turn and snatched " + num + " toothpick.";
                }
                else if (phrase == 1)
                {
                    return "David is stoked that he can force the win this round and picked " + num + " toothpick.";
                }
                else if (phrase == 2)
                {
                    return "David is has passed out due to excitment that he can force the win so Steve Carell came and picked " + num + " toothpick for David.";
                }
                else  
                {
                    return "David's hand is shaking from excietment so he knocks over " + num + " toothpick off the table.";
                }
            }
            else if (happy == false)
            {
                if (phrase == 0)
                {
                    return "David did not get to force a win so he snaps " + num + " toothpick off the table.";
                }
                else if (phrase == 1)
                {
                    return "David could not see into the future to force the win so he slams his fists on the table, breaking " + num + " toothpick.";
                }
                else if (phrase == 2)
                {
                    return "David was fustrated that he could no see a way to win this round so he hits his head on the table, knocking " + num + " toothpick off a table.";
                }
                else  
                {
                    return "David's nostrils are flaring from anger because he is not able to force a win this round so he blows " + num + " toothpick off the table.";
                }
            }
        }
        return "something went wrong";
    }

    /**
     * The displayFinalStats method shows the results of the series of games.
     */
    private static void displayFinalStats()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println(displayFinalStatsBanner());
        if (player1Wins > 1 && player2Wins > 1)
        {
            if (!computerOpponent)
            {
                if (player1Wins > player2Wins)
                {
                    System.out.println(player1 + "won " + player1Wins + " games.");
                    System.out.println(player2 + "won " + player2Wins + " games.");
                    System.out.println(player1 + " is the overall winner. Fantasic job absolutly demolishing " + player2 + " like a nuke on a small house. How does it feel to loose " + player2 + "?");
                    String reply1 = userInput.nextLine();
                    System.out.println("Great, but guess what?");
                    String reply2 = userInput.nextLine();
                    System.out.println("IT DOESN'T MATTER WHAT YOU THINK!!!\n Have a good rest of your day...\n SIKE... just kidding. Have a good day.");
                }
                else if (player2Wins > player1Wins)
                {
                    System.out.println(player2 + " won " + player2Wins + " games.");
                    System.out.println(player1 + " won " + player1Wins + " games.");
                    System.out.println(player2 + " is the overall winner. Fantasic job absolutly demolishing " + player1 + " like a nuke on a small house. How does it feel to loose " + player1 + "?");
                    String reply1 = userInput.nextLine();
                    System.out.println("Great, but guess what?");
                    String reply2 = userInput.nextLine();
                    System.out.println("IT DOESN'T MATTER WHAT YOU THINK!!!\n Have a good rest of your day...\n SIKE... just kidding. Have a good day:)");
                }
            }
            else if (computerOpponent)
            {
                if (player1Wins > player2Wins)
                {
                    System.out.println(player1 + " won " + player1Wins + " games.");
                    System.out.println(player2 + " won " + player2Wins + " games.");
                    System.out.println(player1 + " is the overall winner. Fantasic job absolutly demolishing " + player2 + " like a nuke on a small house.");
                }
                else if (player2Wins > player1Wins)
                {
                    System.out.println(player2 + " won " + player2Wins + " games.");
                    System.out.println(player1 + " won " + player1Wins + " games.");
                    System.out.println(player2 + " is the overall winner. Fantasic job absolutly demolishing " + player1 + " like a nuke on a small house.");
                }
            }
        }
        else if (player1Wins <=1 || player2Wins <= 1)
        {
            if (player1Wins <= 0 && player2Wins <= 1)
            {
                if (!computerOpponent)
                {
                    if (player1Wins > player2Wins)
                    {
                        System.out.println(player1 + "won " + player1Wins + " game.");
                        System.out.println(player2 + "won " + player2Wins + " game.");
                        System.out.println(player1 + " is the overall winner. Fantasic job absolutly demolishing " + player2 + " like a nuke on a small house. How does it feel to loose " + player2 + "?");
                        String reply1 = userInput.nextLine();
                        System.out.println("Great, but guess what?");
                        String reply2 = userInput.nextLine();
                        System.out.println("IT DOESN'T MATTER WHAT YOU THINK!!!\n Have a good rest of your day...\n SIKE... just kidding. Have a good day.");
                    }
                    else if (player2Wins > player1Wins)
                    {
                        System.out.println(player2 + " won " + player2Wins + " game.");
                        System.out.println(player1 + " won " + player1Wins + " game.");
                        System.out.println(player2 + " is the overall winner. Fantasic job absolutly demolishing " + player1 + " like a nuke on a small house. How does it feel to loose " + player1 + "?");
                        String reply1 = userInput.nextLine();
                        System.out.println("Great, but guess what?");
                        String reply2 = userInput.nextLine();
                        System.out.println("IT DOESN'T MATTER WHAT YOU THINK!!!\n Have a good rest of your day...\n SIKE... just kidding. Have a good day:)");
                    }
                }

                else if (computerOpponent)
                {
                    if (player1Wins > player2Wins)
                    {
                        System.out.println(player1 + " won " + player1Wins + " game.");
                        System.out.println(player2 + " won " + player2Wins + " game.");
                        System.out.println(player1 + " is the overall winner. Fantasic job absolutly demolishing " + player2 + " like a nuke on a small house.");
                    }
                    else if (player2Wins > player1Wins)
                    {
                        System.out.println(player2 + " won " + player2Wins + " game.");
                        System.out.println(player1 + " won " + player1Wins + " game.");
                        System.out.println(player2 + " is the overall winner. Fantasic job absolutly demolishing " + player1 + " like a nuke on a small house.");
                    }
                }
            }
            else if (player1Wins <=1)
            {
                if (!computerOpponent)
                {

                    System.out.println(player2 + " won " + player2Wins + " games.");
                    System.out.println(player1 + " won " + player1Wins + " game.");
                    System.out.println(player2 + " is the overall winner. Fantasic job absolutly demolishing " + player1 + " like a nuke on a small house. How does it feel to loose " + player1 + "?");
                    String reply1 = userInput.nextLine();
                    System.out.println("Great, but guess what?");
                    String reply2 = userInput.nextLine();
                    System.out.println("IT DOESN'T MATTER WHAT YOU THINK!!!\n Have a good rest of your day...\n SIKE... just kidding. Have a good day:)");
                }

                else if (computerOpponent)
                {
                    System.out.println(player2 + " won " + player2Wins + " games.");
                    System.out.println(player1 + " won " + player1Wins + " game.");
                    System.out.println(player2 + " is the overall winner. Fantasic job absolutly demolishing " + player1 + " like a nuke on a small house.");
                }
            }
            else if (player2Wins<= 1)
            {
                if (!computerOpponent)
                {
                    System.out.println(player1 + "won " + player1Wins + " games.");
                    System.out.println(player2 + "won " + player2Wins + " game.");
                    System.out.println(player1 + " is the overall winner. Fantasic job absolutly demolishing " + player2 + " like a nuke on a small house. How does it feel to loose " + player2 + "?");
                    String reply1 = userInput.nextLine();
                    System.out.println("Great, but guess what?");
                    String reply2 = userInput.nextLine();
                    System.out.println("IT DOESN'T MATTER WHAT YOU THINK!!!\n Have a good rest of your day...\n SIKE... just kidding. Have a good day.");
                }
                else if (computerOpponent)
                {
                    System.out.println(player1 + " won " + player1Wins + " games.");
                    System.out.println(player2 + " won " + player2Wins + " game.");
                    System.out.println(player1 + " is the overall winner. Fantasic job absolutly demolishing " + player2 + " like a nuke on a small house.");
                }
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
    private static String displayFinalStatsBanner()
    {
        return "*************\n**GAME OVER**\n*FINAL STATS*\n*************";
    }

    public static void main (String [] args)
    {
        displayWelcomeBanner();
        getStartingInformation();           
        while (player1Wins != winsNeeded && player2Wins != winsNeeded)
        {
            playOneGame();
        }
        displayFinalStats();
    }
}

