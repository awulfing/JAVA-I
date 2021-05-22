package outlab4;
public class order {

    
    //Control pointer
    
    private candidate pointer;
    setup MAN;
    boolean Clockwise;
    int Counter = 0;
    order(boolean clock){
	this.Clockwise = clock;
    }	
    public void setManager(setup MAN) {
	this.MAN = MAN;
    }
    public void setCounter(int num) {
	this.Counter = num;
    }
    public void setPointer(candidate data) {
	this.pointer = data;
    }
    public candidate getPointer() {
	return pointer;
    }
    public void rotate() {
	for(int i=0; i<(Counter%MAN.getNumRemaining()); i++) {
            if(Clockwise) {
                this.pointer = pointer.goNext();
            }
            else {
                this.pointer = pointer.goBack();
            }
        }
    }

}
