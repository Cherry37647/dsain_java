package Arrays;
import java.util.ArrayList;
public class Arraylistsss {
    public static void main (String[] args){
        ArrayList<Integer> arrl= new ArrayList<>();
        arrl.add(7);
        arrl.add(3);
        arrl.add(2);
        System.out.println(arrl);
        System.out.println(arrl.get(2));//aal[2]
        System.out.println(arrl.set(2,45));//aal[2]
        arrl.set(2,45);
        System.out.println(arrl);
        int n= arrl.size();
        System.out.println(n);


    }
}
