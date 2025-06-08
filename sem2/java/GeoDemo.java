import geometry.shapes3D.*;

public class GeoDemo {
    public static void main(String[] args){
        Cuboid c=new Cuboid(2,3,4);
        Sphere s=new Sphere(10);
        System.out.println("Area:"+c.area()+"\nPerimeter:"+c.perimeter()+"\nVolume:"+c.volume());
        System.out.println("Area:"+s.area()+"\nPerimeter:"+s.perimeter()+"\nVolume:"+s.volume());
    }   
}
