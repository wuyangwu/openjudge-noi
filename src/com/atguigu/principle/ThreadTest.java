package com.atguigu.principle;

import java.util.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/13 9:13
 */
public class ThreadTest {
  public   String  a(){
        return "";
    }

    private static Map<String, Object> grouping(List<Map> list, String key) {
        // 使用TreeMap存放元素并排序
        Map<String, Object> newMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        List<Map> l = new ArrayList<>();
        list.forEach(m -> {
//            l.add(m);
            newMap.replace(m.get(key).toString(), l);
            if (m.containsKey(key)) {
                if (newMap.containsKey(m.get("cubicleId").toString())){
                    l.add(m);
                    newMap.replace(m.get(key).toString(), l);
                }else {
                    l.clear();
                    l.add(m);
                    newMap.put(m.get(key).toString(), l);
                }
            }});
        return newMap;
    }

    public static void main(String[] args) {
            Map map = new HashMap();
            map.put("cubicleId",1);
            map.put("lineid",1);
        Map map1 = new HashMap();
        map1.put("cubicleId",2);
        map1.put("lineid",1);
        Map map2 = new HashMap();
        map2.put("cubicleId",1);
        map2.put("lineid",2);
        Map map3 = new HashMap();
        map3.put("cubicleId",2);
        map3.put("lineid",2);
        List<Map> list =new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        Map<String, Object> map4 = grouping(list,"cubicleId");
        System.out.println();
     }
}
