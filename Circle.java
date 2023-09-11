/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engg1420_w23;

/**
 *
 * @author fattanezarrinkalam
 */
public class Circle {

    private int r;
    private String name;
    private static int count; 
    private int x;
    private static final double PI = 3.14;
    int y;

    

    
    public Circle(int r) {
        //setR(r);
        count++;
        setName("Circle" + count);
    }
    
    public String toString(){
        return "r in circle is " + this.r ;
    }
   
    public static int getCount() {
        return count;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getY() {
        return y;
    }

    public double circumference() {
        return 2 * r * PI;
    }

    public double area() {
        return r * r * PI;
    }
/*
    public void setR(int r) {
        if (r < 0) {
            this.r = -1 * r;
        } else {
            this.r = r;
        }

    }
 */ 
    /*
    public boolean setR(int r) {
        if (r < 0) {
            return false;
        } else {
            this.r = r;
            return true;
        }
    }
    */
    
    public void setR(int r) throws NegativeRadiousException{
        if (r < 0) {
            throw new NegativeRadiousException();
        } else {
            this.r = r;
        }
    }

    public int getR() {
        return r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Circle c = new Circle();
        
        Circle c = new Circle(3);
        System.out.println(c);
        //c.r = 3;
        //c.x = 2;
        
        //double circum = c.circumference();
        //double area = c.area();
        
        //System.out.println("area is: " + area);
        //System.out.println("circumference is: " + circum);
        
        /*
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
*/
        
        //final int count = 100; 
        //count++;
    }

}
