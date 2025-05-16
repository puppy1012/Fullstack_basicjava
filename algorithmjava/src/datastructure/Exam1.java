package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Exam1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("oracle");
        list.add("servlet");
        list.add("jsp");
        list.add("spring");

        //List -> Map으로 변환
        // => map의 key : "mymap"+i
        HashMap<String,String> map= new HashMap<String,String>();
        for(int i=0;i<list.size();i++) {
        	map.put("mymap"+i, list.get(i));
        }
        Set<String> keylist=map.keySet();
        for(String j:keylist) {
        	System.out.println("key=>"+j+",value=>"+map.get(j));
        }
    }
}