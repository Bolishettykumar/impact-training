public class pattern {
    public static void main(Strings[] args) {
        int n = 5;
        // int number = 1;

        // //1.rectangle with Nested loops
        // //outer loop
        // for(int i = 1; i<=n; i++){
        //     //inner loop
        //     for(int j = 1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //output:-*****
        //        *****
        //        *****
        //        *****


        //2.Hollow Rectangle *****
        //                 *   *
        //                 *   *
        //                 *****

        // //outer loop
        // for(int i = 1; i<=n; i++){
        //     //inner loop
        //     for(int j = 1; j<=m; j++){
        //         //cell -> (i,j)
        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        

        //3.Half Pyramid  *
        //              **
        //              ***
        //              ****

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        //4.Inverted half pyramid  ****
        //                         ***
        //                         **
        //                         *

        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }


        //5.Inverted half pyramid(rotated by 180 deg)

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1;j<=n-i; j++){
    
        //         System.out.print(" ");
        //     }
            
        //     //innerloop ->star print
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        //6.half pyramid with numbers

        // for(int i = 1; i<=n;i++){
        //     for(int j = 1; j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //7.Floyd's Triangle

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        //     System.out.println();
        // }


        //8.0-1 triangle

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                

                
            }
            System.out.println();   

        }




    }
}

