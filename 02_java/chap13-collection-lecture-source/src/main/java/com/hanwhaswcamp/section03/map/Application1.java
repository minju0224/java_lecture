package com.hanwhaswcamp.section03.map;

import java.sql.SQLOutput;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashMap을 이해하고 활용할 수 있다 */
        HashMap map = new HashMap();
        /* 키와 값을 쌍으로 저장한다. 키와 값은 반드시 객체여야 한다. */
        map.put("one", new Date());
        map.put(12, "red apple");
        map.put(33, 123);       //integer로 자동 변환

        System.out.println("map : " + map);

        /* 키 값은 중복 저장할 수 없다. 새로운 값으로 덮어쓰기 된다 */
        map.put(12, "yellow banana");
        System.out.println("map : " + map);

        /* 값 객체는 중복 저장할 수 있다.*/
        map.put(9, "yellow banana");
        System.out.println("map : " + map);

        /* 값 객체를 가져올 때 키를 통해 가져온다 */
        System.out.println("key 9에 대한 값 객체 : "+map.get(9));

        /* 키를 통해 값을 삭제한다 */
        map.remove(9);
        System.out.println("map : " + map);


        /*문자열 키, 값을 갖는 HashMap 생성 */
        HashMap<String,String> map2 = new HashMap<>();
        map2.put("one", "java");
        map2.put("two", "mysql");
        map2.put("three", "jdbc");
        map2.put("four", "html");
        map2.put("five", "css");

        /* Map 저장 된 값을 순회하는 방법 */
        /*1. keySet()*/
        Iterator<String> keyIter = map2.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = map2.get(key);
            System.out.println("key : " + key + " = value : " + value);
        }

        for (String key : map2.keySet()) {
            String value = map2.get(key);
            System.out.println("key : " + key + " = value : " + value);
        }

        /* 2. values() */
        Collection<String> values = map2.values();
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println("values : "+valueIter.next());
        }

        for (String key : map2.keySet()) {
            System.out.println("value : "+ values);
        }

        /* 3. entrySet() */
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String,String>> entryIter = set.iterator();
        while (entryIter.hasNext()) {
            Map.Entry<String,String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
