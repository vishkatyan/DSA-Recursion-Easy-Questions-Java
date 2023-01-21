package EasyProblemRecursionKunal;
public class ProductNTo1 {
    public static int product(int n){

        // base case
        if(n==1 || n==0){
            return 1;
        }
         return n*product(n-1);
    }
    public static void main(String[] args) {
        System.out.println(product(2));
    }
}
