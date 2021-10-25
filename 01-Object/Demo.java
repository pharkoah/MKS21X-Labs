public class Demo{
  /* more methods can go here*/
  public static double distance(Point pp, Point p) {            //static method
    double ypart = (p.getY()*p.getY()) - (pp.getY()*pp.getY());
    double xpart = (p.getX()*p.getX()) - (pp.getX()*pp.getX());
    return Math.sqrt(ypart + xpart);
  }


  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
    System.out.println(P1.toString());    //test case for toString
    System.out.println(P2.toString());
  }
 }
