interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable { 
    private int width;
    private int height;
    public Rectangle(int width, int height) { 
        this.width = width;
        this.height = height;
    }
    public int getWidth() { 
        return width;
    }
    public int getHeight() { 
        return height;
    }
    public void resizeWidth(int width) { 
        this.width = width;
    }
    public void resizeHeight(int height) { 
        this.height = height;
    }
}
public class TestResizable{
    public static void main(String[] args) { 
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Original Width: " + rectangle.getWidth()); 
        System.out.println("Original Height: " + rectangle.getHeight());
        rectangle.resizeWidth(15); 
        rectangle.resizeHeight(25);
        System.out.println("\nResized Width: " + rectangle.getWidth()); 
        System.out.println("Resized Height: " + rectangle.getHeight());
    }
}