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

    public static boolean closeEnough(double a, double b) {
      if (a == 0) {
        return (b == 0);
      }
      if (b == 0) {
        return (a == 0);
      }
      return (Math.abs(a - b)) / b) * 100;
    }

    public boolean equals(Triangle other){
      if (v1 != other.getVertex(1)) {
        return false;
      }
      if (v2 != other.getVertex(2)) {
        return false;
      }
      if (v3 != other.getVertex(3)) {
        return false;
      }
      return true;
  }

    public double getPerimeter() {
      double line1 = (v1.distanceTo(v2));
      double line2 = (v2.distanceTo(v3));
      double line3 = (v3.distanceTo(v1));
      return line1 + line2 + line3;
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

  public void setVertex(int vert2, Point vnew) {
    if (vert2 == 1) {
      v1 = vnew;
    }
    if (vert2 == 2) {
      v2 = vnew;
    }
    if (vert2 == 3) {
      v3 = vnew;
    }
  }

  public String toString() {
    String res = "";
    res += "{";
    res += v1.toString() + ", " + v2.toString() + ", " + v3.toString();
    res += "}";
    return res;
  }
}
