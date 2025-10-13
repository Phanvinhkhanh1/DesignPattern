package fpt_udemy.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factory factory = new Factory();

        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape square = factory.getShape("square");
        square.draw();

        Shape triangle = factory.getShape("triangle");
        triangle.draw();
    }
}