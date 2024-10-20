import java.util.*;
public class if_con {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("an adult");
        }
        else{
            System.out.println("Not an adult");
            sc.close();
        }
    }
}
