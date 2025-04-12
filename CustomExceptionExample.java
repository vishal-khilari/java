class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}
public class CustomExceptionExample {
    public static void main(String[] args){
        try{
            int num = 10;
            int den = 0;
            if (den == 0){
            throw new DivisionByZeroException("Zero division is not allowed");
        }
        int result = num/den;
        System.out.println("Result: "+result);
        }catch(DivisionByZeroException e){
            System.out.println("Custom Exception got caught:"+e.getMessage());
        }
        finally{
        System.out.println("Finally block executed!!");
        }
    }
}