package com.company;

public class Figure {
    private Point[] points;
    public Figure(int count) {
        points = new Point[count];
        for(int i=0;i<count;i++) {
            points[i] = new Point();
       }
    }
    public void setCoord(int n, int x, int y) throws PointIndexException {
        if(n>=0 && n<points.length) {
            points[n].setCoord(x,y);
        } else {
            throw new PointIndexException(n);
        }
    }
}
