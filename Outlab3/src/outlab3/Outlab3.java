package outlab3;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Outlab3 {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    public void game() {
        int game = 1;
        while(game == 1){
            System.out.println("Would you like to roll the dice?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = scan.nextInt();
            if (choice==1){
                play();
            }
            else{
                game = 0;
            }
        }
    }
        
    public void play(){
        //change below to change # of rolls
	int countRolls = 1000;
        int countYahtzees = 0;
        int countFullHouses = 0;
        int countStraights = 0;
        int countFours = 0;
        int countThrees = 0;
        int[] roll = new int[5];
        for(int n = 0; n < countRolls; n++){ 
            for(int i = 0; i < 4; i++){ 
                roll[i]  = rand.nextInt(6)+1;
            }
            Arrays.sort(roll);
            //System.out.println(Arrays.toString(roll));
            if(yahtzee(roll)==1){
                countYahtzees = countYahtzees + 1;
            }
            else if(four(roll)== 1){
                countFours = countFours + 1;
            }
            else if(fullHouse(roll)== 1){
                countFullHouses = countFullHouses + 1;
            }
            else if(three(roll)== 1){
                countThrees = countThrees + 1;
            }
            countStraights = countStraights + straight(roll);
        }
        int lose = countRolls - countYahtzees - countFullHouses - countFours - countThrees;
        double perYahtzee = 100.0*countYahtzees/countRolls;
        double perFullHouse = 100.0*countFullHouses/countRolls;
        double perStraight = 100.0*countStraights/countRolls;
        double perFour = 100.0*countFours/countRolls;
        double perThree = 100.0*countThrees/countRolls;
        double perLoser = 100.0*lose/countRolls;
        System.out.println("Number of Rolls: "+ countRolls);
        System.out.println("----------------------------");
        System.out.println("Number of Yahtzees: " + countYahtzees);
        System.out.println("Yahtzee Percentage: " + perYahtzee+"%");
        System.out.println("");
        System.out.println("Number of Full Houses: " + countFullHouses);
        System.out.println("Full House Percentage: " + perFullHouse+"%");
        System.out.println("");
        System.out.println("Number of Straights: " + countFullHouses);
        System.out.println("Straight Percentage: " + perStraight+"%");
        System.out.println("");
        System.out.println("Number of Four of a kind: " + countFours);
        System.out.println("Four of a kind percentage: " + perFour+"%");
        System.out.println("");
        System.out.println("Number of Three of a kind: " + countThrees);
        System.out.println("Three of a kind percentage: " + perThree+"%");
        System.out.println("");
        System.out.println("Number of Losers: "+ lose);
        System.out.println("Percentage Losers: " + perLoser+"%");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public int yahtzee(int [] roll){
        if (roll[0]==roll[1] && roll[1] ==roll[2] && roll[2] ==roll[3]&& roll[3] ==roll[4]) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public int fullHouse(int [] roll){
	if (roll[0]==roll[1] && roll[1] ==roll[2] && (roll[3]==roll[4])) {
            return 1;
        } 
        else if (roll[4]==roll[3] && roll[3] == roll[2] && roll[1]==roll[0]) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public int straight(int [] roll){
	
        if (roll[0]== 1 && roll[1] == 2 && roll[2] == 3 && roll[3] == 4 && roll[4] == 5){
            return 1;
        } 
        else if (roll[0]== 2 && roll[1] == 3 && roll[2] == 4 && roll[3] == 5 && roll[4] == 6) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public int four(int [] roll){
	if (roll[0]==roll[1] && roll[1] ==roll[2] && roll[2] ==roll[3]) {
            return 1;
        } 
        else if (roll[1] ==roll[2] && roll[2] ==roll[3]&& roll[3] ==roll[4]) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public int three(int [] roll){
	if (roll[0]==roll[1] && roll[1] ==roll[2]) {
            return 1;
        } 
        else if (roll[2] ==roll[3]&& roll[3] ==roll[4]) {
            return 1;
        }
        else if (roll[1] ==roll[2]&& roll[2] ==roll[3]) {
            return 1;
        }
        else {
            return 0;
        }
    }
	
    public static void main(String[] args) {
        Outlab3 lab= new Outlab3();
        lab.game();
    }
    
}
