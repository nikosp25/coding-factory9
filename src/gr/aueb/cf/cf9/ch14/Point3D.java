package gr.aueb.cf.cf9.ch14;

public class Point3D extends Point2D {
    private double z;

   public Point3D() {
//        super(); // constructor chaining
//        z = 0.0;
    }

    public Point3D(double x, double y, double z) {
       super(x,y);
       this.z = z;
    }

}
