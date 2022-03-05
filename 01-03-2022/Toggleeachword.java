import java.util.Scanner;
public class Toggleeachword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        String New = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                New = New + Character.toLowerCase(s.charAt(i));
            else
                New=New+Character.toUpperCase(s.charAt(i));
        }
        System.out.println("Toggle String is : "+New);
    }

}