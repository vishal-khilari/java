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
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }
    @Override
    public void resizeHeight(int height) {
        this.height=height;
    }
}

public class Testresize{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10,15);
        System.out.println("orihinal Weidth "+rectangle.getWidth());
        System.out.println("orihinal Height "+rectangle.getHeight());
        rectangle.resizeWidth(30);
        rectangle.resizeHeight(40);
        System.out.println("resize Weidth "+rectangle.getWidth());
        System.out.println("resize Height "+rectangle.getHeight());


    }
}