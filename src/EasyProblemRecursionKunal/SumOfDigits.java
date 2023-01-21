package EasyProblemRecursionKunal;
public class SumOfDigits {
    static int sumOfDigits(int n){
        // base case
        if(n==0){
            return 0;
        }
            int res = n%10;
        return res+ sumOfDigits(n/10);

    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
    }
}
