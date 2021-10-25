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

  /*Return a string in the format: (x, y)
  *where x and y are the values from the Point.
* e.g.  "(0.0, 1.23)"  or  "(-1.02, 21.45)"
  */
  public String toString(){
    String res = "";
    res += "(";
    res += x + ", " + y;
    res += ")";
    return res;
  }
}
