import java.util.*;
public class Scan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your full name: ");
        
        //for single word (next)
        //for string (nextLine)
        //nextInt
        //next float
        //next double
        String fulname = sc.nextLine();
        System.out.println("your full name is: ");
        System.out.println(fulname);
    }
}