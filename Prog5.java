public class Prog5{

    public static void main(String[] args) {
        String inStr = "night";

        char out = inStr.charAt(0);

        //System.out.println(out);

        String outStr = inStr.substring(1);

        //System.out.println(outStr);

        outStr = outStr + out +"ay";

        System.out.println("Input: " + inStr);
        System.out.println("Output: " + outStr);
    }

}

