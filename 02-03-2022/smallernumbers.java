import java.util.Scanner;

public class smallernumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int output[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                    output[i] = count;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i =0; i<10; i++)
        {
            a[i]=sc.nextInt();
        }
        int[] output = smallerNumbersThanCurrent(a);
        for(int i=0; i<10;i++)
        {
            System.out.println(output[i]);
        }
    }
}
