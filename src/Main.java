import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int rowIndex=3;
        for (int i:getRow(rowIndex)){
            System.out.println(i);
        }
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer>res=new ArrayList<>();
        res.add(1);
        long prev=1;
        for(int i=1;i<=rowIndex;i++){
            long next_val=prev*(rowIndex-i+1)/i;
            res.add((int)next_val);
            prev=next_val;
        }
        return res;
    }
}
