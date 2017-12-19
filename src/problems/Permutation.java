package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permuation("", "ABCD");

    }

    public static void permuation(String prefix, String st){
        int n = st.length();

        if(n==0){
            System.out.println(prefix);
        }else{
            for(int i=0; i < n; i++){
                permuation(prefix + st.charAt(i), st.substring(0, i) + st.substring(i+1,n));
            }
        }
    }

}
