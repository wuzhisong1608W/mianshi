package com.a.mianshi.december.fourteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-14
 */
public class Num3 {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		for (String s : list){
//			if ("1".equals(s)){
//				list.add("4");
//				list.remove("1");
//			}
//		}

//		List<String> list = new ArrayList<>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			if ("1".equals(iterator.next())) {
//				iterator.remove();
//				list.add("4");
//				list.remove("1");
//			}
//		}

		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.size());
			if ("1".equals(list.get(i))){
				list.add("4");
				list.remove("1");
			}
		}
//		List<String> list = new ArrayList<String>();
//		for (Iterator<String> it = list.iterator(); it.hasNext();) {
//			String val = it.next();
//			if (val.equals("5")) {
//				it.remove();
//			}
//		}
//
//		List<String> newList = new ArrayList<String>();
//		for (Iterator<String> it = list.iterator(); it.hasNext();) {
//			String val = it.next();
//			if (val.equals("5")) {
//				newList.add(val);
//			}
//		}
//		list.addAll(newList);
	}
}
