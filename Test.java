import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            list.add(i);
        }

        list.remove(5);
        System.out.println(list);

        list = new LinkedList<Integer>();
    }
}
