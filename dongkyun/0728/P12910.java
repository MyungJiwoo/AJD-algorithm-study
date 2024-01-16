package level_1;

import java.util.*;
public class P12910 {
    public static ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {  
        	if(arr[i] % divisor == 0) 
        		a.add(arr[i]);
        }
        if(a.size() == 0)  // 요소가 없으면 -1 삽입
        	a.add(-1);
        
        Collections.sort(a);
        return a;
    }
	public static void main(String[] args) {
		int arr[] = {3, 2, 6};
		System.out.println(solution(arr, 10));
	}

}
