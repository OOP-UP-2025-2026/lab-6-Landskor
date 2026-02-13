package ua.opnu.model;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedRectangle extends DrawShape {
    private double arcWidth = 55.0;
    private double arcHeight = 55.0;

    public RoundedRectangle() {
        super();
    }

    public RoundedRectangle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    // новий метод (без параметрів)
    @Override
    public Shape getShape() {
        return new RoundRectangle2D.Double(
                Math.min(startPoint.getX(), endPoint.getX()),
                Math.min(startPoint.getY(), endPoint.getY()),
                Math.abs(startPoint.getX() - endPoint.getX()),
                Math.abs(startPoint.getY() - endPoint.getY()),
                arcWidth, arcHeight
        );
    }

    // старий метод
    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        return getShape();
    }

    public void setArc(double width, double height) {
        this.arcWidth = width;
        this.arcHeight = height;
    }
}