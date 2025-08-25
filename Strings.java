import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // // String name = sc.next();
        // String name = sc.nextLine();
        // //output of the line print one first of name eg:- Srinivas kumar but the terminal prt only Srinivas
        // //then add sc.nextLine() to the input then it print full output
        // System.out.println("your name is :"+ name);



        // Adding of two strs is called concatenation 
        // String firstname = "Srinivas";
        // String lastname = "Kumar";
        // String fullname = firstname +"@"+lastname;
        // System.out.println(fullname);
        // //for length of the str
        // System.out.println(fullname.length());

        //charAt
        // for(int i = 0; i<fullname.length(); i++){
        //     System.out.println(fullname.charAt(i));
        

        // } 
        //this are primitative type

        // String name1 = "Srinivas";
        // String name2 = "Srinivas";

        // if(name1.compareTo(name2) == 0){
        // if(name1 == name2){
        //     System.out.println("String are equal");

        // }else{
        //     System.out.println("String are not equal");
        // }

        //non primitative 
        // if(new String("Sinivas") == new String("Srinivas")){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        //using Sub String

        String sentence = "Me srinivas";
        String name = sentence.substring(3, sentence.length());
        System.out.println(name);


        //strings are immutable
    }
}
