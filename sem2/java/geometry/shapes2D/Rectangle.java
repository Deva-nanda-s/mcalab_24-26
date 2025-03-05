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
    
}
