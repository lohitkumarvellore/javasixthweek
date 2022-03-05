import java.util.Scanner;

public class ReverseandToggle {
    public static void main(String[] args) {
        String input = "my name is khan";
        String[] array = input.split(" ");
        String output = "";
        for (String elem : array) {
            for (int i = elem.length()-1; i >= 0; i--) {
                if(i==elem.length()-1){
                    output += elem.charAt(i);
                }
                else if (elem.charAt(i) != Character.toLowerCase(elem.charAt(i))) {
                    output += Character.toLowerCase(elem.charAt(i));
                }
                else {
                    output += Character.toUpperCase(elem.charAt(i));
                }
            }
            output += " ";
        }
        System.out.println(output);
    }
}
