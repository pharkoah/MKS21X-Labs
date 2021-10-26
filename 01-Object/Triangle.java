public class Triangle{
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c) {
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

  public double getPerimeter() {
    double l1 = (v1.distanceTo(v2));
    double l2 = (v2.distanceTo(v3));
    double l3 = (v3.distanceTo(v1));
    return l1 + l2 + l3;
  }

  public Point getVertex(int vert) {
    if (vert == 1) {
      return v1;
    }
    if (vert == 2) {
      return v2;
    }
    return v3;
    }


}
