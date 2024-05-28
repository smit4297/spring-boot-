package org.java.backend;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
//        List<Integer> ll = new LinkedList<>();
//        ll.add(23);
//        ll.add(11);
//        ll.add(0,22);
//        System.out.println(ll);
//        Integer i = ll.get(1);
//        System.out.println("hello " + i);
//
//        Integer[] arr = {1,2,3};
//        List<Integer> ll = new java.util.ArrayList<>(List.of(arr));
//
//        for (int i = 0; i < ll.size(); i++) {
//            System.out.println(ll.get(i));
//        }
//        ll.forEach(number -> System.out.println(number));
//
//        ll.forEach(System.out::println);
//
//
//        Iterator iter = ll.iterator();
//
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//
//        ListIterator lIter = ll.listIterator();
//        while(lIter.hasNext()){
//            System.out.println(lIter.next());
//        }
//
//
//        for (int i = 0; i < ll.size(); i++) {
//            if(ll.get(i) == 1){
//                ll.remove(i);
//            }
//        }
//        System.out.println(ll);

        List<String> list = new ArrayList(Arrays.asList("s", "sr", "srikanth"));
        for(int i = list.size() - 1; i >= 0; --i)
        {
            if(list.get(i).equals("s"))
            {
                list.remove(i);
            }
        }
        System.out.println(list);


        Set set = new TreeSet();
        set.add("sun");
        set.add("mon");
        set.add("tue");
        set.add("wed");
        set.add("thu");
        set.add("fri");
        set.add("sat");
        System.out.println(set);
    }
}
