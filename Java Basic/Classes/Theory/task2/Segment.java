package task2;

import java.awt.*;

 class Segment {
    Point a;
    Point b;
    Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
        if(a.x==b.x && a.y==b.y)
            throw new IllegalArgumentException();
    }


    public double length(){
        return Math.sqrt(Math.pow(a.x - b.x,2)+Math.pow(a.y - b.y,2));
    }

    public Point middle(){
        return new Point((a.x+b.x)/2,(a.y+b.y)/2);
    }
    public int slope(Point a,Point b){
        return ((a.y-b.y)/(a.x-b.x));
    }
    public Point linearEquation(Point p1, Point p2){
        int x1 = p1.x;
        int y1 = p1.y;
        int m = slope(p1,p2);
        // maybe double
        int a = m;
        int b = (-m*x1) + y1;

        return new Point(a,b);
    }
    public Point intersection(Segment another){
        try{
            if((slope(this.a,this.b) == slope(another.a,another.b))){
                return null;
            }
            int x1 = linearEquation(this.a,this.b).x;
            int y1 = linearEquation(this.a,this.b).y;
            int x2 = linearEquation(another.a,another.b).x;
            int y2 = linearEquation(another.a,another.b).y;

            int x = ((y1-y2)/(x2-x1));
            int y = x*(x1)+y1;

            if(x >= Math.min(a.getX(), b.getX())
                && x <= Math.max(a.getX(), b.getX())
                && y >= Math.min(a.getY(), b.getY())
                && y <= Math.max(a.getY(), b.getY())&&
                another.a.x >= Math.min(another.a.getX(), another.b.getX())
                    && x <= Math.max(another.a.getX(), another.b.getX())
                    && y >= Math.min(another.a.getY(), another.b.getY())
                    && y <= Math.max(another.a.getY(), another.b.getY()))
                return new Point(x,y);

        }catch (Exception e){
            return null;
        }
        return null;
    }
}
