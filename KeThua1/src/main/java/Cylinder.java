public class Cylinder extends Circle {
    private double height = 1.0;

   public Cylinder(){

   }

   public Cylinder(double radius){
       super(radius);
   }

   public Cylinder(double radius,double height){
       super(radius);
       this.height = height;
   }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){ // V
       return PI*getRadius()*getRadius()*this.height;
    }

    @Override
    public double getArea() {
        return 2*super.getArea() + 2*PI*getRadius()*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder["+super.toString()+",height="+this.height+"]";
    }

   /* public static void main(String[] args) {
        Cylinder test = new Cylinder();
        System.out.println(test.getArea()) ;
    }*/
}
