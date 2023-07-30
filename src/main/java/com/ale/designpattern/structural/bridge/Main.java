package com.ale.designpattern.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Model circleModelRed = new CircleModel(new RedColor());
        System.out.println(circleModelRed.getModel());

        Model rectangleModelRed = new RectangleModel(new RedColor());
        System.out.println(rectangleModelRed.getModel());

        Model circleModelYellow = new CircleModel(new YellowColor());
        System.out.println(circleModelYellow.getModel());

        Model rectangleModelYellow = new RectangleModel(new YellowColor());
        System.out.println(rectangleModelYellow.getModel());
    }
}
