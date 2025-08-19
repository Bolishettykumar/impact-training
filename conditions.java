import java.util.*;
public class conditions{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        

        // if(a == b){
        //     System.out.println("Equal");
        // }else if(a > b){
        //     System.out.println("a is greater");2
        // }else{
        //     System.out.println("a is lower");
        // }

        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("how are you");
            break;
            default:System.out.println("Invalid");
        }

       
    }
}
