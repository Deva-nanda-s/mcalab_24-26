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
