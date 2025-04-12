class Outer{
    void display(){
        System.out.println("Outer class");
    }
    class Inner{
        void display(){
        System.out.println("Inner class");
        }
    }
}
public class OutNer {
    public static void main(String[] args){
    Outer outobj = new Outer();
    Outer.Inner innobj = outobj.new Inner();
    outobj.display();
    innobj.display();
    }    
}
