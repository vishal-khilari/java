class DivisionByZeroException{
    public class DivisionByZeroException(String message){
        super(message);
    }
}
public class Exc {
    public static void main(String[] args){
        try{
            int num = 10;
            int den = 0;
            if(den == 0){
                throw new DivisionByZeroException("Division by zero is not allowed");
            }
            int result = num/den;
            System.out.println("result: "+result);
        }catch(DivisionByZeroException e){
            System.out.println("custem exception caught: "e.getMessage());
        }finally{
            System.out.println("Finally block executed!!");
        }
    }
}
