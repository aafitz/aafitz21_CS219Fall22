package InterfaceExample;

public interface Distance {

    double distance(Point p);

    static double distance(Point p1, Point p2) {
        return p1.distance(p2);
    }


}
