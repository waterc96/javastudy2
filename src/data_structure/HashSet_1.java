package data_structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet_1 {

	public static void main(String[] args) {
	
		HashMap <Integer,String> wcup=new HashMap<>();
		wcup.put(1930, "乌拉圭");
        wcup.put(1934, "意大利");
        wcup.put(1938, "意大利");
        wcup.put(1950, "乌拉圭");
        wcup.put(1954, "西德");
        wcup.put(1958, "巴西");
        wcup.put(1962, "巴西");
        wcup.put(1966, "英格兰");
        wcup.put(1970, "巴西");
        wcup.put(1974, "西德");
        wcup.put(1978, "阿根廷");
        wcup.put(1982, "意大利");
        wcup.put(1986, "阿根廷");
        wcup.put(1990, "西德");
        wcup.put(1994, "巴西");
        wcup.put(1998, "法国");
        wcup.put(2002, "巴西");
        wcup.put(2006, "意大利");
        wcup.put(2010, "西班牙");
        wcup.put(2014, "德国");
        wcup.put(2018,"法国");
        wcup.put(2088, "中国");
        System.out.println("请输入一个年份");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(wcup.containsKey(year)) {
        	System.out.println(wcup.get(year)+"在"+year+"年获得了世界杯冠军");
        	if(wcup.get(year).equals(2088)) {
        		System.out.println("梦");
        	}
        }else {
        	System.out.println("no worldcup!!");
        }
        System.out.println("请输入一个国家");
        Scanner sc1=new Scanner(System.in);
        String  country=sc.next();
        if(wcup.containsValue(country)) {
        	for( Integer i:wcup.keySet()) {
        		if(wcup.get(i).equals(country)) {
        			System.out.println(i+"获得过世界杯冠军");
        		}
        	}
        }else {
        	System.out.println("没有世界杯冠军");
        }
        
		
		
	
	}

}
