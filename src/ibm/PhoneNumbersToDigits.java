package ibm;

import java.util.HashMap;

public class PhoneNumbersToDigits {
    public static void main(String[] args) {
        String str="triple one two three double four five six";
        System.out.println(numbersToDigits(str));
    }
    public static String numbersToDigits(String str){
        HashMap<String,String>map=new HashMap<>();
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        map.put("zero","0");

        String arr[]=str.split(" ");
        String ans="";
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("double")){
                k=2;
                continue;
            }
            if(arr[i].equals("triple")){
                k=3;
                continue;
            }
            if(k==2){
                ans+=map.get(arr[i])+map.get(arr[i]);
                k=0;
                continue;
            }
            if(k==3){
                ans+=map.get(arr[i])+map.get(arr[i])+map.get(arr[i]);
                k=0;
                continue;
            }
            if(map.containsKey(arr[i])){
                ans+=map.get(arr[i]);
            }
        }

        return ans;
    }
}
