import java.util.*;
public class Scan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        
        //for single word (next)
        //for string (nextLine)
        //nextInt
        //next float
        //next double

        String name = sc.next();
        sc.nextLine(); ////////////////// IIIIIIIMMMMMPPPPPPPPPPPPPPPPPPPPPPP
        System.out.println("enter your full name: ");
        String fulname = sc.nextLine();
        System.out.println("your name is: ");
        System.out.println(name);
        System.out.println("your full name is: ");
        System.out.println(fulname);
        sc.close();
    }
}