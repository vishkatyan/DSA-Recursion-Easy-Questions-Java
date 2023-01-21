package EasyProblemRecursionKunal;
public class SumNTo1 {
    static int sumNTo1(int n){
        // base case
        if(n==1){
            return 1;
        }
        return n+sumNTo1(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumNTo1(6));
    }
}
