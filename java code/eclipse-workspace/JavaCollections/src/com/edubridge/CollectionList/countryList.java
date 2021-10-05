package com.edubridge.CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.edubridge.modal.country;

public class countryList {

	public static void main(String[] args) {
	ArrayList<country> counList = new ArrayList<>();
	counList.add(new country(3,"India",  91));
	counList.add(new country(1,"UAE",  971));
	counList.add(new country(2,"Brazil",  55));
	System.out.println(counList);
	
	Collections.sort(counList);
	System.out.println(counList);
	
	
	counList.sort(Comparator.comparing(country::getCode));
	System.out.println(counList);
	}
}
	
	
	
	


