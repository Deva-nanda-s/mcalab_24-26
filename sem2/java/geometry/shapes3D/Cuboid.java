//geometery/shape3d/Cuboid.java
package geometry.shapes3D;
import geometry.shapes2D.Rectangle;
public class Cuboid extends Rectangle
{
public double h;
public Cuboid (double l,double w,double h)
{
super(l,w);
this.h=h;
}
public double volume()
{
return area()*h;
}
}