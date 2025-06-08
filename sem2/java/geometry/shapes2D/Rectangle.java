
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
}
