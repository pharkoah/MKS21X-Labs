public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public static double distance(Point pp, Point p) {              //static method
    double ypart = (p.getY()*p.getY()) - (pp.getY()*pp.getY());
    double xpart = (p.getX()*p.getX()) - (pp.getX()*pp.getX());
    return Math.sqrt(ypart + xpart);
  }

  public double distanceTo(Point p) {                            //non static method
    double ypart = (p.getY()*p.getY()) - (y*y);
    double xpart = (p.getX()*p.getX()) - (x*x);
    return Math.sqrt(ypart + xpart);
  }
}
