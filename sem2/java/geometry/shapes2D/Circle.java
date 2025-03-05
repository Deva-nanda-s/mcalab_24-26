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
