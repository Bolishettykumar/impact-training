import java.util.*;
public class bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;//update
        // int bitMask = 1<<pos;

        int bitMask = 1<<pos;
        if(oper == 1){
            //SET
            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }else{
            //clear
            int newbitMask = ~(bitMask);
            int newNumber = newbitMask & n;
            System.out.println(newNumber);
        }
       
        

        // int notbitMask = ~(bitMask);----CLEAR BIT

        //GET BITS

        // if((bitMask & n)==0){
        //     System.out.println("bit was zero");

        // } else{
        //     System.out.println("bit was one");
        // }

        //SET BITS

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        //CLEAR BIT

        // int newNumber = notbitMask & n;
        // System.out.println(newNumber);


        //UPDATEBIT

        




        






    }
}