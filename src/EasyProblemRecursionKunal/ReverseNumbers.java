package EasyProblemRecursionKunal;
import java.util.ArrayList;
public class ReverseNumbers {
    // Approach 1 Brute Force
//    static int reverseNumbers(int n){
//        // base case
//        if(n%10 ==n){
//            return n;
//        }
//        System.out.print(n%10);
//        return reverseNumbers(n/10);
//    }
    public static void main(String[] args) {
//        System.out.print(reverseNumbers(1832));
        System.out.print(reverse(15472));
    }

    // Approach 2
   static int sum=0;
    static int reverse(int num){
        // base case
        if(num==0){
            return sum;
        }
        if(num>0){
            int temp=num%10;
            sum=sum*10+temp;
            reverse(num/10);
        }
        return sum;
    }
}
