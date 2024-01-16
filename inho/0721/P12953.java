//[2,6,8,14] 168
// [1,2,3] 6
class Solution {
    public int solution(int[] arr) {
        int a = arr[0];
        int num = 0;
        for (int i=1;i<arr.length;i++){
            for(int j=a*arr[i];j>0;j--){
                if(j%a==0&&j%arr[i]==0){
                    num=j;
                }
            }
            a = num;
        }
        return num;
    }
}
public class P12953 {
}
