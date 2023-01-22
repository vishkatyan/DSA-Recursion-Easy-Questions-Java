package EasyProblemRecursionKunal;
public class PrintingOddEvenSeries {
    static void print(int n){
        // base case
        if(n==0){
            return;
        }
        int value=n%10;
        if(value%2!=0){
            System.out.println(value);
        }
        print(n/10);
        if(value%2==0){
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        print(12345);
    }
}
