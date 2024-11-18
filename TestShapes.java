public class TestShapes {
    public static void main(String[] args) {
        Shape shape1 = new Circle(); 
        Shape shape2 = new Triangle(); 
        Shape shape3 = new Square();
        // Calling drhods 
        shape1.draw();
        shape1.erase();
        shape2.draw(); shape2.erase();
        shape3.draw(); shape3.erase();
    }
    }class Shape {
    public void draw() { System.out.println("Drawing a shape");
    }
    public void erase() { System.out.println("Erasing a shape");
    }
    }
    class Circle extends Shape { @Override
    public void draw() { System.out.println("Drawing a circle");
    }
    @Override
    public void erase() { System.out.println("Erasing a circle");
    }
    }
    class Triangle extends Shape { @Override
    public void draw() { System.out.println("Drawing a triangle");
    }
    @Override
    public void erase() { System.out.println("Erasing a triangle");
    }
    }
    class Square extends Shape { @Override
    public void draw() { System.out.println("Drawing a square");
    }
    @Override
    public void erase() { System.out.println("Erasing a square");
    }
    }