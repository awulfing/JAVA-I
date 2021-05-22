package lab2_java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Point{
    private Double x;
    private Double y;
    
    public Point(Double x, Double y) {
        this.x=x;
        this.y=y;
    }
    
    public Double getX(){
        return x;
    }
    
    public Double getY(){
        return y;
    }
    
    public Point reflectY(Point p){
        Point yReflect= new Point(-p.getX(),p.getY());
        return yReflect;
    }
    
    public Point reflectX(Point p){
        Point xReflect= new Point(p.getX(),-p.getY());
        return xReflect;
    }
    
    public void printPoint(){
        System.out.println("X:"+getX()+" Y:"+getY());
    }
    
    public String get_line_to(Point a, Point b){
        Double rise=b.getY()-a.getY();
        Double run=b.getX()-a.getX();
        Double slope= rise/run;
        
        Double offset= b.getY() - slope*b.getX();
        String line= new String();
        line = "Exercise 4:" +slope.toString()+"x +"+offset.toString();
        
        return line;
    }

    public static void main(String[] args) {
        Point first =new Point(3.0,-5.0);
        Point second= first.reflectX(first);
        System.out.print("Reflect:");
        second.printPoint();
        
        Point exercise4=new Point(4.0,11.0);
        System.out.println(exercise4.get_line_to(exercise4, new Point(6.0,15.0)));

    }
}
