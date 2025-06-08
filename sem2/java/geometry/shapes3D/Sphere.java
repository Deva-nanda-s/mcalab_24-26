<<<<<<< HEAD
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
=======
package geometry.shapes3D;

import geometry.shapes2D.Circle;

public class Sphere extends Circle{
    public Sphere(double r){
        super(r);
        }
    public double volume(){
        return (4/3.0)*Math.PI*Math.pow(r,3);
    }
}
>>>>>>> 561fe2c9bb201a720103b02d58c3eb0feb900056
