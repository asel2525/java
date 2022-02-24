import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test1 {
    public static void main(String[] args){
        LinkedList<Integer> linkedlist = new LinkedList<>();
        // head -> [1] ->[2] ->[3]
        ArrayList<Integer> arraylist = new ArrayList<>();
        // [7][6][1][2][3][4][5]
        measureTime(linkedlist);
        measureTime(arraylist);
    }
    private static void measureTime(List<Integer> list){
        for(int i=0; i<100000; i++){
            list.add(0, i);
            //[] ->[0] -> [1][0]
            // [] -> [0][1] -> [0][1][2] - add(index)
        }
        long start = System.currentTimeMillis();
        
        for(int i=0; i<100000; i++){
            list.get(i);
        }
        
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
