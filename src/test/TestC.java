package test;

public class TestC {
    public static void main(String[] args) {
        int n=4;
        myMethod(n);
    }
    public static void myMethod(int n){
        int count=1;
        for(int j=0;j<n;j++){
            for (int i=n;i>0;i--){
                System.out.print((int)Math.pow(i,count)+" ");
            }
            count++;
            System.out.println();
        }
    }
}
