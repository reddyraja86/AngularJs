package com.features.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("e");
		l.add("d");
		l.add("b");
		l.add("c");

		Collections.sort(l, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		
		Collections.sort(l,(String o1,String o2) -> o1.compareTo(o2) );

		for (String x : l) {
			System.out.println(x);
		}

	}

}
