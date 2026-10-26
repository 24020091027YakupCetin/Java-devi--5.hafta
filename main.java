package GeometricObjecttest;

import java.util.Scanner;

public class main {
     
    public static void Main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        
        double side1 = s1.nextDouble();
        double side2 = s1.nextDouble();
        double side3 = s1.nextDouble();
        String renk = s1.next();          
        boolean değer = s1.nextBoolean();
        
        Triangle t1 = new Triangle(side1, side2, side3, renk, değer);
        
        t1.setFilled(değer);
        t1.setRenk(renk);
        
        System.out.println("üçgenin alanı:" + t1.getArea());
        System.out.println("üçgenin çevresi:" + t1.getPerimeter());
        System.out.println("üçgenin iç durumu:" + t1.isFilled());
        
        s1.close();
    }
}