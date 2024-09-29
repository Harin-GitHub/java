class Circle {
    
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}


public class CircleReg {
    public static void main(String[] arg) {

        double ri = 7.5;
        double ro = 12.4;

        Circle circleIn = new Circle(ri);
        Circle circleOut = new Circle(ro);

        double areaIn = circleIn.computeArea();
        double areaOut = circleOut.computeArea();

        System.out.println("Shaded Area = " + (areaOut - areaIn));
    }
}
