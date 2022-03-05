import java.util.Scanner;
public class validstring {
    private static boolean checkString(String input) {
        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            }
        }
        if(numberPresent && upperCasePresent && lowerCasePresent)
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s =sc.nextLine();
        Boolean flag = checkString(s);
        if(flag)
            System.out.println("Valid");
        else
            System.out.println("Invalid");

    }
}
