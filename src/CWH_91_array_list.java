import java.util.ArrayList;

public class CWH_91_array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(7,6);
        System.out.println(list.contains(27));
        System.out.println(list.contains(7));
//        list.addAll(0,7);
//        list.clear();
        for(int i =0 ; i<list.size();i++){
            System.out.println(list.get(i));
            System.out.println(", ");
        }
    }
}
