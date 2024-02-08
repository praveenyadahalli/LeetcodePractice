package test;

public class TestD {
    public static void main(String[] args) {
        int arr[]={5,13,17,21};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){
        int diff1=0,diff2=0;
        int c1=0,c2=0;
        int d=0;
        boolean bool=true;
        for(int i=0;i<arr.length-1;i++){
            if(bool){
                diff1=arr[i+1]-arr[i];
                bool=false;
                c1++;
                continue;
            }
            diff2=arr[i+1]-arr[i];
            if(diff2==diff1){
                c1++;
            }else{
                c2++;
            }
        }
        if(c1>c2){
            d=diff1;
        }else{
            d=diff2;
        }
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+d)!=arr[i+1]){
                ans=arr[i]+d;
            }
        }
        return ans;
    }
}
