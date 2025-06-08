<<<<<<< HEAD

//geometery/shape2d/Rectangle.java
package geometry.shapes2D;

import geometry.interfaces.calcArea;
import geometry.interfaces.calcPerimeter;

public class Rectangle implements calcArea,calcPerimeter
{
public double l,w;
public Rectangle(double l,double w)
{
this.l=l;
this.w=w;
}
public double area()
{
return l*w;
}
public double perimeter()
{
return 2*(l+w);
}
public String toString()
{
return "R("+l+","+w+")";
}
=======
package geometry.shapes2D;

import geometry.interfaces.*;

public class Rectangle implements calcArea,calcPerimeter {
    public double len,wid;
    public Rectangle(double len,double wid){
        this.len=len;
        this.wid=wid;
    }
    public String toString(){
        return "R("+len+","+wid+")";
    }
    public double area(){
        return len*wid;
    }
    public double perimeter(){
        return 2*(len+wid);
    }
    
>>>>>>> 561fe2c9bb201a720103b02d58c3eb0feb900056
}
