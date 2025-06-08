//main outside geometery
//import geometery.shape3d.*; 
import java.util.Scanner;
import geometry.shapes3D.Cuboid;
import geometry.shapes3D.Sphere;
public class ShapesDemo
 {
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         Cuboid c = new Cuboid(l,w,h);
         Sphere s = new Sphere(r);
        
         System.out.println("Enter length ,width and height of cuboid:");
         double l = sc.nextDouble();
         double w = sc.nextDouble();
         double h = sc.nextDouble();
         System.out.println("Enter the radius of sphere:");
         double r = sc.nextDouble();
        
        System.out.println("Area of c: " + c.area());
        System.out.println("Perimeter of c: " + c.perimeter());
        System.out.println("Volume of c: " + c.volume());

        System.out.println("Area of s: " + s.area());
        System.out.println("Perimeter of s: " + s.perimeter());
        System.out.println("Volume of s: " + s.volume());
        sc.close();
    }
}
//output
// Enter length ,width and height of cuboid:
// 2
// 2
// 2
// Enter the radius of sphere:
// 2
// Area of c: 4.0
// Perimeter of c: 8.0
// Volume of c: 8.0
// Area of s: 12.56
// Perimeter of s: 12.56
// Volume of s: 33.49333333333333