package outlab4;
public class candidate {
    //control order
    int num;
    private candidate next;
    private candidate back;
    candidate(int num){
	this.num = num;
    }
    public candidate goNext() {
	return next;
    }
    public candidate goBack() {
	return back;
    }
    public void setNext(candidate data) {
	this.next = data;
    }
    public void setPrevious(candidate data) {
    	this.back = data;
    }
    	
    public int getNumber() {
    	return num;
    }
}

