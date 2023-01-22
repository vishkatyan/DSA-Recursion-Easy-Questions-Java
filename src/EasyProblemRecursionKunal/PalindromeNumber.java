package EasyProblemRecursionKunal;

public class PalindromeNumber {
        static int s=0;
        static boolean armStrong(int original, int sum , int rem){
            // base case
            if(original==0){
                return false;
            }
            int num = original;
            int r = original%10;
            s= s*10+r;
            armStrong(original/10,s,r);
            if(num==s){
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            System.out.println(armStrong(545,0,0));
        }
    }


