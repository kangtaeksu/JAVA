package kosta.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ListMission2 {

	public static void main(String[] args) {
		// 1~45 중복안되게 6개 골라서

		// 배열로만들기
		Random rd = new Random();
//		int arr[] = new int[6];
//		for(int i =0;i<arr.length;i++) {
//		
//			arr[i] =(rd.nextInt(44)+1);
//			for(int j=0;j<i;j++) {
//				if(arr[i]==arr[j]) {
//					i-=1;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		// list(contains 중복잡아내기 활용)
//
		ArrayList<Integer> rt = new ArrayList<Integer>();
		while (true) {
			int n = rd.nextInt(45) + 1;
			if (rt.contains(n)) {
				continue;
			} else {
				rt.add(n);
				if (rt.size() == 6) {
					break;
				}
				for (int n : rt) {

					System.out.println(n + ",");
				}
			}
//		

		// set 구현
	
//Set<Integer> set = new HashSet<Integer>();
//
//for(int i=0;set.size()<6;i++) {
//	set.add(rd.nextInt(45)+1);
//}
//System.out.println(set);
}
}