package outlab4;
import java.io.*;
public class output{
   PrintStream fout; 
   //control ouput
   output(String filename){
     try{
       fout= new PrintStream ( new FileOutputStream(filename));
     }catch(IOException fo){
         System.out.println(fo); 
      }
    }
   public void writer(String out){
         fout.println(out);
   }
   public void writer(int out){
         fout.println(out);
   }
   public void writer(char out){
         fout.println(out);
   }
   public void writer(double out){
         fout.println(out);
   }
   public void writer(float out){
         fout.println(out);
   }
   public void write(String out){
         fout.print(out);   
   }

   public void write(int out){
         fout.print(out);  
   }
   public void write(char out){
         fout.print(out);
   }

   public void write(float out){
         fout.print(out);  
   }
   public void write(double out){
         fout.print(out);  
   }
}