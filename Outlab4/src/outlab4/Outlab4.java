package outlab4;
import java.io.File;
import java.util.Scanner;
public class Outlab4 {
    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("What is the name of the input file?");
	String in = console.nextLine();
	console.close();
	output out = new output("LinkedListProgram.txt");
	order clockwise = new order(true);
	order counterclockwise = new order(false);
	setup MAN = new setup(in, out, clockwise, counterclockwise);
	while(MAN.readInput()) {
            MAN.createList();
            while(MAN.getNumRemaining()>0) {
                System.out.println("NumRemaining"+MAN.getNumRemaining());
		MAN.nextRound();
            }
		MAN.writeWinners();
	}
		out.writer("End of Program 4");
    }
}
