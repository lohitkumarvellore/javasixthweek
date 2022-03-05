import java.util.Scanner;

public class truncatestring {

    public static String truncateSentence(String s, int k)
    {
        String[] arr = s.split(" ");
        String res="";
        for(int i=0;i<k;i++)
            res=res+arr[i]+" ";
        return res.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String truncate = truncateSentence(s,k);
        System.out.println(truncate);
    }
}

