public class stringbuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Srinivas");
        // System.out.println(sb);


        // //char at index 0
        // System.out.println(sb.charAt(0));

        // //set Char at index 0
        // sb.setCharAt(0, 's');
        // System.out.println(sb);

        // //insert char at index 0
        // sb.insert(2,'N');
        // System.out.println(sb);

        // //Delet char at index 0
        // sb.delete(2,3);
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);

        // //length
        // System.out.println(sb.length());

        StringBuilder sb = new StringBuilder("Srinivas");

        for(int i = 0; i<sb.length() / 2; i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }

        System.out.println(sb);

    }
}
