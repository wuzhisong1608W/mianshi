package com.a.mianshi.december.twentyfive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-25
 */
public class Num7 {
	public static void main(String[] args) {
		int arr[] = new int[]{1,6,2,9,5};
		int temp;//定义一个临时变量
		for(int i=0;i<arr.length-1;i++){//冒泡趟数
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j+1]<arr[j]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
