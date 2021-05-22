package outlab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class setup {
    
String in;
	output results;
	order clockwise;
	order counterclockwise;
	
	int n;
	int k;
	int m;
	
	candidate first;
	candidate firstWinner;
	candidate lastWinner;
	
	int rounds = 1;
	
        setup(String in, output results, order clockwise, order counterclockwise){
		this.in = in;
		this.results = results;
		this.clockwise = clockwise;
		this.counterclockwise = counterclockwise;
		
		first = null;
		firstWinner = null;
		lastWinner = null;
	}
	
	public boolean readInput() {
		try {   
			Scanner scan = new Scanner(new File(in));
			for(int i=0; i<rounds; i++) {
				//scan.nextLine();
			}
			n = scan.nextInt();
                        System.out.println(n);
			k = scan.nextInt()-1;
                        System.out.println(k);
			m = scan.nextInt()-1;
                        System.out.println(m);
			scan.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
                if(n==0 && k==0 && m==0) {
			return false;
		}else {

			return true;
		}
	}
	
	public int getNumRemaining() {
		return n;
	}
	
	public void createList() {
		results.writer("Next Election:");
		for(int i=0; i<n; i++) {
			this.add(new candidate(i+1));
		}
		clockwise.setPointer(first);
		clockwise.setCounter(k);
		counterclockwise.setPointer(first.goBack());
		counterclockwise.setCounter(m);
		clockwise.setManager(this);
		counterclockwise.setManager(this);
	}
	
	public void add(candidate data) {
		if(first == null){
            first = data;
            data.setNext(data);
            data.setPrevious(data);
        } else {
        candidate before = first.goBack();
        candidate after = first;
        
        before.setNext(data);
        after.setPrevious(data);
        data.setNext(after);
        data.setPrevious(before);
        }
	}
	
	public void nextRound() {
		clockwise.rotate();
		counterclockwise.rotate();
		if(clockwise.getPointer()==counterclockwise.getPointer()) {
			if(first.goNext()==first) {
				this.setAside(first);
				first = null;
				n--;
			}
                        else {
				clockwise.setPointer(clockwise.getPointer().goNext());
				counterclockwise.setPointer(counterclockwise.getPointer().goBack());
				this.setAside(clockwise.getPointer().goBack());
				this.remove(clockwise.getPointer().goBack());
			}
		} else {
			results.writer(clockwise.getPointer().getNumber()+" "+counterclockwise.getPointer().getNumber());
			clockwise.setPointer(clockwise.getPointer().goNext());
			this.remove(clockwise.getPointer().goBack());
			if(clockwise.getPointer()==counterclockwise.getPointer()) {
				clockwise.setPointer(clockwise.getPointer().goNext());
			}
			counterclockwise.setPointer(counterclockwise.getPointer().goBack());
			this.remove(counterclockwise.getPointer().goNext());
		}
	}
	
	public void setAside(candidate data) {
		if(firstWinner==null) {
			firstWinner = data;
			lastWinner = data;
			data.setNext(null);
		}else {
			lastWinner.setNext(data);
			data.setPrevious(lastWinner);
			data.setNext(null);
			lastWinner = data;
		}
	}
	
	public void remove(candidate data) {
                candidate before = data.goBack();
		candidate after = data.goNext();
                before.setNext(after);
                after.setPrevious(before);
		
                n--;
	}
	
	public void writeWinners() {
		if(firstWinner==null) {
			return;
		}else if(firstWinner==lastWinner) {
			results.writer(firstWinner.getNumber());
			return;
		}
		results.writer(firstWinner.getNumber());
		while(firstWinner.goNext() != null) {
			firstWinner = firstWinner.goNext();
			results.writer(firstWinner.getNumber());
		}
	}
}

