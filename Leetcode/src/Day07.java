import java.util.ArrayList;

public class Day07 {
    //将偶数排在前面奇数排在后面
    public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i < A.length;i++){
            if(i == 0){
                list.add(A[i]);
            }else if(A[i] % 2 == 0){
                list.add(0,A[i]);
            }else{
                list.add(A[i]);
            }
        }
        for(int i = 0;i < A.length;i++){
            A[i] = list.get(i);
        }
        return A;
    }
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,7,8,9};
        i = sortArrayByParity(i);
        for(int ii: i){
            System.out.println(ii);
        }
    }
}
