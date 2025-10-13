package fpt_udemy.academy;

public class Factory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        switch (shapeType.toLowerCase()) {
            case "circle": return new Circle();
            case "square": return new Square();
            case "triangle": return new Triangle();
            default: throw new RuntimeException("Unknown shape : " + shapeType);
        }
    }
}
