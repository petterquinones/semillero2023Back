public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String s = "100";

        boolean isNumeric = (s != null && s.matches("[0-9]"));

        System.out.println("IsNumeric: " + isNumeric);


    }
}