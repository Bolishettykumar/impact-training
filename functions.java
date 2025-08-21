// import java.util.*;
// public class functions {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);//call funtions is called 
//     }
// }

import java.util.*;
public class functions {
    // public static int calculateProduct(int a, int b){
        
    //     return a * b;
    // }

    public static void printFactorial(int n){
        //loop
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        
        }
        System.out.println(factorial);
        return;
    }
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

        

    }

}
