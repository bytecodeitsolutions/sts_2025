package com.itm.collection;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(101, "Raja");
		map.put(1, "Raja");
		map.put(10, "Rani");
		System.out.println(map);

	}

}
