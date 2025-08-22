//Butterfly pattern
// public class adpattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }

//             int spaces = 2 * (n-i);
//             for(int j = 1; j<=spaces; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//          for(int i = n; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }

//             int spaces = 2 * (n-i);
//             for(int j = 1; j<=spaces; j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }




        
//     }
    
// }




//solid Rhombus
// public class adpattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i = 1; i<=n; i++){
//             for(int j =1; j<= n-i; j++ ) {
//                 System.out.print(" ");

//             }
//             for(int j = 1; j<=5; j++){
//                 System.out.print("*");
//             }

//             System.out.println();

//         }


//     }
// }


//number pyramid
// public class adpattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i = 1; i<=n; i++){
//             for(int j =1; j<=n-i;j++){
//                 System.out.print(" ");
        
//             }
//             //numbers
//             for(int j = 1; j<=i; j++){
//                 System.out.print(i + " ");
//             }
//             System.out.println();

//         }
//     }
// }

//palindromic pattern
// public class adpattern {
//     public static void main(String[] args) {
//         int n  = 5;

//         for(int i =1; i<=n; i++){
//             //spaces
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             //first half
//             for(int j = i; j>=1; j--){
//                 System.out.print(j);
//             }

//             //2nd half
//             for(int j = 2; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//Diamond pattern

public class adpattern{
    public static void main(Strings[] args) {
        int n = 4;

        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>=1; i--){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

