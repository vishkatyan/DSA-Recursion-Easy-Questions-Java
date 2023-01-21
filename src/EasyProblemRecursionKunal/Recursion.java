public class Recursion {
    // nested recursion
//    static int fun(int n){
//        if(n>100){
//            return n-10;
//        }
//        else
//            return fun(fun(n+11));
//    }
//    public static void main(String[] args) {
//        System.out.println(fun(91));
//    }

    // sum of natural numbers
//    static int res=0;
//    static int sum(int n){
//        if(n==0)
//        {
//            return res;
//        }
//        res  = sum(n-1)+ n;
//       // res= sum(n-1)+sum/return res;
//        return res;
//    }
//public static void main(String[] args) {
//    System.out.println(sum(6));
//}
    static boolean is_power_of_Three(long n){
        if(n<=0)
            return false;
        if(n%3==0)
            return is_power_of_Three(n/3);
        if(n==1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        if(is_power_of_Three(243))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

