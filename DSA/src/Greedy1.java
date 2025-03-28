import java.util.Arrays;

public class Greedy1 {
    //int [] Q-->greed factor-->qualities of Cookie
//    int[] S-->choices -->children min satisfaction level
//    greed factor should be at least equal or maximum
    //allocation
    public static int maxAllocation(int []Q,int []S){
        Arrays.sort(Q);
        Arrays.sort(S);
        int m=0; int n =0;//pointers for 2 arrays
        int counter=0;//        greed condition applies-->g[i]>=s[i]//        int []Q = {1,2,3};-->cookie//        int []S = {1,1,2,3};--->children        //allocate cookies to max children
//        1 in Q and 1 in S//        pointer moves to 2 in Q       //first //1 in Q is allocated to 1 in S(children)//allocated to 1 in children satisfaction
        //move pointer from 2 ->3//in child array child with satisafacton 2// is allocated cookie of quality 3,as its greater
        while(m<Q.length && n<S.length){
            if(S[n]>=Q[m]){//choice should always be greater or equal                           // than tha given
                counter++;
                m++;
            }
            n++;
        }
                return counter;
    }
//cookie problem
    public static void main(String[] args) {
        int []Q = {1,2,3};
        int []S = {1,1,2,3};
        System.out.println(maxAllocation(Q,S));
    }
}
//+-