package hashmaps;

import java.util.HashMap;

public class Rev
{

    public static void main(String[] args) {
        HashMap<String, Integer> name = new HashMap<String, Integer>();
        name.put("vijay", 435);
        name.put("dhruv", 234);
        name.put("aakash", 345);
        name.put("rahul", 435);
//        for (String s : name.keySet()) {
//            System.out.println(s);
//        }
//        char[] ch = new char[0];
//        String rev = new String();
        String rev = " ";
        for (int i = name.size()-1; i >= 0; i--) {

            rev = rev + name.get(i);
        }
        ;
        System.out.println(" reverse of name is->" + rev);
    }
}
