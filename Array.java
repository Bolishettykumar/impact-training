import java.util.*;
public class Array{
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        // int number[] = {92,94,39};
        // marks[0] = 67;
        // marks[1] = 97;
        // marks[2] = 94;
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        for(int i = 0; i<size;i++){

            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();



        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        //output
        // for(int i = 0; i<size; i++){
        for(int i = 0; i<number.length; i++) {
            if(number[i] == x){

                System.out.println("x index value is: "+ i);

            }
            
        }

    }
}