interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    @Override
    public void resizeWidth(int width){
        this.width=width;
    }

    @Override
    public void resizeHeight(int height){
        this.height=height;
    }
}
public class TestResizeable1{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("OG width "+rectangle.getWidth());
        System.out.println("OG height "+rectangle.getHeight());
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);
        System.out.println("af width "+rectangle.getWidth());
        System.out.println("af height "+rectangle.getHeight());
    }
}