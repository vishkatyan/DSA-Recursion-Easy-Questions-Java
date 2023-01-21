package EasyProblemRecursionKunal;
public class ProductOfDigits {
    static int digitProduct(int n){
        // base case
        if(n==0
        ){
            return 1;
        }
        int res = n%10;
        return res* digitProduct(n/10);
    }
    public static void main(String[] args) {
        System.out.println(digitProduct(133));
    }
}
