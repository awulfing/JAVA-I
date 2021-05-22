package lab6_problem2;
import java.util.Scanner;

public class Lab6_Problem2 {
    Scanner scan = new Scanner(System.in);
    public void input() {
        int i = 0;
        while(i == 0){
           System.out.println("Please input your first int");
            int x = scan.nextInt();
            System.out.println("Please input your second int");
            int y = scan.nextInt();
            if(x>y){
                int z = y;
                y = x;
                x = z;
            }
            System.out.println("");
            int div = x;
            SCD(x, y, div); 
            System.out.println("Would you like to go again?(Enter Int)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int redo = scan.nextInt();
            if(redo == 1){
                input();
            }
            else{
                System.exit(0);
            }
            
        }
        
        
            
    }
    
    public int SCD(int x, int y,int div){
        int xRem = x%div;
        int yRem = y%div;
        if(xRem==0 && yRem ==0){
            System.out.println("The smallest common denominator of "+ x +" and " + y + " is " + div);
            
            return 0;
        }
        div--;
        SCD(x, y, div); 
        return 0;
    }
    public static void main(String[] args) {
        Lab6_Problem2 lab = new Lab6_Problem2();
        lab.input();
    }
    
}
