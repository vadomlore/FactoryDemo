package com.zyl.beginning.collections;

import java.util.*;

public class ListDemo {
    final static int aConst = 11;

    final static boolean[] bitSets = {true, false};

    List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    List<Integer> b = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
    Map<String, String> map = new HashMap<>(); //线程不安全 //HashTable 线程安全
    Set<String> s = new HashSet<>();
    //TreeSet
    //LinkedList
    //Queue<String> q = new ArrayListBlockingQueue
    //LinkedHashMap //有序的hash表

    //ConcurrentSkipListMap//
    //StringBuilder  thread unsafe
    //StringBuffer thread safe

    //java 8 stream//
    public void testAdd() {
        bitSets[0] = false;
        System.out.println(Arrays.toString(bitSets));
//        a.add(1);
//        a.add(4);
//        for (Integer integer : a) {
//            System.out.println(integer);
//        }
//        a.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new ListDemo().testAdd();
    }
}
