public class Triangle{
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point C) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double ax, double ay, double bx, double by,
                  double cx, double cy) {
    v1 = new Point(ax, ay);
    v2 = new Point(bx, by);
    v3 = new Point(cx, cy);
  }

}
