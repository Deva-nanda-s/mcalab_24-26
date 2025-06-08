<<<<<<< HEAD
//geometery/shape2d/Circle.java
package geometry.shapes2D;
import geometry.interfaces.calcArea;
import geometry.interfaces.calcPerimeter;
public class Circle implements calcArea,calcPerimeter
{
double r;
public Circle(double r)
{
this.r=r;
}
public double area()
{
return 3.14*r*r;
}
public double perimeter()
{
return 2*3.14*r;
}
public String toString()
{
return "C("+r+")";
}
}
=======
package geometry.shapes2D;

import geometry.interfaces.*;

public class Circle implements calcArea,calcPerimeter {
    public double r;
    public Circle(double r){
        this.r=r;

    }
    public String toString(){
        return "R("+r+")";
    }
    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter(){
        return 2*(Math.PI*r);
    }
    
}
>>>>>>> 561fe2c9bb201a720103b02d58c3eb0feb900056
