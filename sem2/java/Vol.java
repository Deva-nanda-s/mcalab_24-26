import java.util.*;

interface Comparable{
    public int compareByVolume(Comparable other);
    public double volume();
}
class Cuboid implements Comparable{
    public double l,w,h;
    public Cuboid(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public double volume(){
        return l*w*h;
    }
    public int compareByVolume(Comparable other){
        if(this.volume() > other.volume()){
            return 1;
        }
        else if(this.volume() < other.volume()){
            return -1;
        }
        else{
            return 0;
            }
    }
    public String area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
    public String perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeter'");
    }
}
class Cylinder implements Comparable{
    public double r,h;
    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }
    public double volume(){
        return Math.PI * r * r * h;
    }
    public int compareByVolume(Comparable other){
        if(this.volume() > other.volume()){
            return 1;
        }
        else if(this.volume() < other.volume()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
public class Vol{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the cuboid: ");
    double l = sc.nextDouble();
    System.out.println("Enter the width of the cuboid: ");
    double w = sc.nextDouble();
    System.out.println("Enter the height of the cuboid: ");
    double h = sc.nextDouble();
    System.out.println("Enter the radius of the cylinder: ");
    double r = sc.nextDouble();
    System.out.println("Enter the height of the cylinder: ");
    double cylinderH = sc.nextDouble();
    Cuboid cuboid = new Cuboid(l, w, h);
    Cylinder cylinder = new Cylinder(r, cylinderH);
    System.out.println("The volume of the cuboid is: " + cuboid.volume());
    System.out.println("The volume of the cylinder is: " + cylinder.volume());    
    int comparison = cuboid.compareByVolume(cylinder);
    if (comparison > 0) {
       System.out.println("Cuboid is greater than Cylinder.");
    } 
    else if (comparison < 0) {
        System.out.println("Cylinder is greater than Cuboid.");
    } 
    else {
        System.out.println("Cuboid and Cylinder have the same volume.");    
    }
    sc.close();
    }
}

