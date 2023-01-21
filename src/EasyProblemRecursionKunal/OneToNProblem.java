package EasyProblemRecursionKunal;

public class OneToNProblem {
    public static void print(int n){
        // base case
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
    }
}
