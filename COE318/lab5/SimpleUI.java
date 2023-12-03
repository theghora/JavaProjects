package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        //Displays the House's and your cards
        System.out.println("House holds:");
        System.out.println(game.getHouseCards().getCards());
        System.out.println("You hold:");
        System.out.println(game.getYourCards().getCards());
        System.out.println("");
        
        
    }

  @Override
    public boolean hitMe() {

        String input;
        //If either your or the house's score is over 20, the game will end. (Note that if anyone has a score of 21,
        // the game assumes that you will not hit any more cards.
        if ((game.score(game.getYourCards()) > 20) || (game.score(game.getHouseCards()) > 20)){
            game.end();
        }
        //Program asks the user if the user wants to hit a card.
        System.out.println("Another card? Input 'y' for YES or 'n' for NO.");
        input = user.nextLine();
        boolean runtime = true;
        
        while (runtime == true){
            //Code is put into a while loop until 'y' or 'n' is inputted, and returns true or false, respectively.
            if(input.equals("y"))
                return true;
            else if (input.equals("n"))
                return false;
            else{
                System.out.println("Error you did not tye the specified inputs!");
                System.out.println("Another card? Input 'y' for YES or 'n' for NO.");
                input = user.nextLine();
            }
        }
        return false;
    }

  @Override
    public void gameOver() {
        //Cards and score are displayed. If your score is greater than the house's score and your value is less than 22, then you win.
        //Otherwise, the House wins.
        this.display();
        int hvalue = game.score(game.getHouseCards());
        int yvalue = game.score(game.getYourCards());
        System.out.println("Your score: " + yvalue + ",");
        System.out.println("House score: " + hvalue + ".");
        if ((yvalue > hvalue || hvalue > 21) && (yvalue < 22))
            System.out.println("You win");
        else
            System.out.println("The House wins");
        System.exit(0);
        
        
    }

}