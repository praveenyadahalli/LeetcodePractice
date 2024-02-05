package CodingPatterns20.TwoPointers;

import java.util.*;

public class PairsOfNumbersUnsortedArray {
    public static void main(String[] args) {
        int arr[]={5,2,3,8,3,9,2};
        int k=11;
        for (int[] pair:unsortedPairs(arr,k)){
            System.out.println(pair[0]+" "+pair[1]);
        }
    }
    public static List<int[]> unsortedPairs(int arr[],int k){
        List<int[]> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment=k-arr[i];
            if(map.containsKey(compliment)){
                list.add(new int[]{compliment,arr[i]});
            }
            map.put(compliment,arr[i]);
        }
        return list;
    }
}
