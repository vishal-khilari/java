package mypack;
public class MyClass {
    public void displayMessage() {
    System.out.println("This is a message from mypack.MyClass");
    }
    }
    ///////////////////////////// import mypack.MyClass;
    public class TestPackage {
    public static void main(String[] args) { MyClass myObject = new MyClass(); myObject.displayMessage();
    }
    }