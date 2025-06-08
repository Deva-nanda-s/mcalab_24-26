//geometery/shape3d/Sphere.java
package geometry.shapes3D;
import geometry.shapes2D.Circle;
public class Sphere extends Circle
{
double r;
public Sphere (double r)
{
super(r);
}
public double volume()
{
    return (4 / 3.0) * 3.14 * r * r * r;
}
}