import java.util.*;
public class switchs {
    public static void main(String[] args){
        System.out.println("select language\n1.HINDI\n2.ENGLISH\n3.ITALY\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
            System.out.println("NAMESTE");
            break;
            case 2:
            System.out.println("HELLO");
            break;
            case 3:
            System.out.println("BONJORE");
            break;
            default: System.out.println("INVALID EXPRESSION");
            sc.close();
        }
    }
}
