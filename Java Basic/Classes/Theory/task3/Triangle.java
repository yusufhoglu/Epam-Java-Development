package task3;

public class Triangle {
    public static void main(String[] args) {
        double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);
    }

    Point a;
    Point b;
    Point c;
    Triangle(Point a, Point b,Point c){
        this.a = a;
        this.b = b;
        this.c = c;

        double ab = length(a,b);
        double ac = length(a,c);
        double bc = length(b,c);

        if(!(ab+bc > ac && ab+ac > bc && ac + bc > ab ))
            throw new IllegalArgumentException();
    }

    public double length(Point a,Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(),2)+Math.pow(a.getY() - b.getY(),2));
    }

    public double area(){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        return ((double) 1/2)*(Math.abs((x1*y2)+(x2*y3)+(x3*y1)-(x1*y3)-(x2*y1)-(x3*y2)));
    }

    public Point centroid(){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        return new Point(((x1+x2+x3)/3),((y1+y2+y3)/3));
    }


}
