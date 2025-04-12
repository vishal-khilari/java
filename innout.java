class Outer{
    void display(){
        System.out.println("Outer");
    }
    class Inner{
        void display(){
        System.err.println("Inner");
        }
    }
}
public class innout {
    public static void main(String[] args){
        Outer outobj = new Outer();
        Outer.Inner inerobj = outobj.new Inner();
        outobj.display();
        inerobj.display();
    }
}
