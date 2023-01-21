package EasyProblemRecursionKunal;
public class ReverseNumbers {
    static int reverseNumbers(int n){
        // base case
        if(n%10 ==n){
            return n;
        }
        System.out.print(n%10);
        return reverseNumbers(n/10);
    }
    public static void main(String[] args) {
        System.out.print(reverseNumbers(1832));
    }
}
