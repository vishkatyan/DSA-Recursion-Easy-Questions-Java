package EasyProblemRecursionKunal;
public class Nto1Problem {
    public static void print(int n){
        // base case
        if(n==1){
            System.out.println(1);
            return;
        }
        // OR base case
//        if(n==0)
//            return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
      print(5);
    }
}
