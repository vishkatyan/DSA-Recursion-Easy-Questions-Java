package EasyProblemRecursionKunal;
public class PassingNumbers {
    static void fun(int n){
        // base case
        if(n==0) {
            return;
        }
        System.out.println(n);
        fun(n--);
    }
    public static void main(String[] args) {
     fun(5);
    }
}
