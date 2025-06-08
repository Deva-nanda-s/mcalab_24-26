<<<<<<< HEAD
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
=======
package geometry.shapes3D;

import geometry.shapes2D.Rectangle;

public class Cuboid extends Rectangle{
    public double he;
    public Cuboid(double len,double wid,double he){
        super(len,wid);
        this.he=he;
    }
    public double volume(){
        return area()*he;
    }
}
>>>>>>> 561fe2c9bb201a720103b02d58c3eb0feb900056
