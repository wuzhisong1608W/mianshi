package com.a.mianshi.december.fourteen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-14
 */
public class Num1 {
	public static void main(String[] args) {
//		TreeMap treeMapOne = new TreeMap();
//		treeMapOne.put("1",1);
//		treeMapOne.put(null,12);

//		TreeMap treeMapTwo = new TreeMap(new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				if (o1 == null) {
//					return 1;
//				} else {
//					return 2;
//				}
//			}
//		});
//		treeMapTwo.put(null, 123);
//		System.out.println(treeMapTwo.get(null));
//		Iterator titer = treeMapTwo.entrySet().iterator();
//		while (titer.hasNext()) {
//			Map.Entry ent = (Map.Entry) titer.next();
//			System.out.println(ent.getKey() + ":" + ent.getValue());
//		}


		TreeMap treeOne = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if (o1 == null) {
					return 1;
				} else {
					return 2;
				}
			}
		});
		treeOne.put("1",null);
//		System.out.println(treeOne.get("1"));
		treeOne.put(null,"2");
		System.out.println(treeOne.get(null));
		Iterator titer = treeOne.entrySet().iterator();
		while (titer.hasNext()) {
			Map.Entry ent = (Map.Entry) titer.next();
			System.out.println(ent.getKey() + ":" + ent.getValue());
		}
//		ConcurrentHashMap

	}
}
