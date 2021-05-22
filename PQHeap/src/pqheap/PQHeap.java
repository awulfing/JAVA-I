package pqheap;
/**
 *
 * @author Hunter Lloyd
 * Edited by Adam Wulfing
 */
public class PQHeap {
    private int back;
    private int heap[];
    private int sizeIndex = 0;
    public PQHeap(int amount){
        heap = new int[amount];
        back = 0;
    }
    public boolean isEmpty(){     
	if(heap[1] == 0){
            return true;
        }
        return false;
    }
    public boolean isFull(){      
	for(int i = 1; i<heap.length; i++){
            if(heap[i] == 0){
                return false;
            }
        }
        return true;
    }
    public void add(int x){
        if(isFull()== true){
            System.out.println("Did not add " + x + " array is full");
        }     
        else{
             if(isEmpty()== true){
                 heap[1] = x;
                 sizeIndex = sizeIndex +1;
             }
             else{
            sizeIndex = sizeIndex +1;
            int childIndex = sizeIndex;
            int parentIndex;
            int buffer;
            heap[sizeIndex] = x;
                 boolean check = true;
                 while(check == true){
                     parentIndex = childIndex / 2;
                     if(heap[childIndex] < heap[parentIndex]){
                         buffer = heap[parentIndex];
                         heap[parentIndex] = heap[childIndex];
                         heap[childIndex] = buffer;
                     }
                     
                     if(parentIndex != 1){
                         childIndex = parentIndex;
                     }
                     else{
                         check = false;
                     }
                 }
             }
             
        }
    }
    public void print(){
        for(int i = 1; i< sizeIndex+1; i++){
            System.out.println(i+". " + heap[i]);
        }
    }
    public static void main(String[] args) {
        int myArray[] = {15, 5, 8, 4, 9, 22, 17, 2, 14, 1};
        PQHeap heap = new PQHeap(myArray.length);
        for(int i = 0; i<myArray.length; i++){
            heap.add(myArray[i]);
            heap.print();
            System.out.println("");
        }
    }
}
