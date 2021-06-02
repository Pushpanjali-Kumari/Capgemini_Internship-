package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Vegetable;

public class VegetableIdComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable vegetable1, Vegetable vegetable2) {
		// TODO Auto-generated method stub
		if(vegetable1.getVegId()==vegetable2.getVegId()) 
		    return 0;
				else if(vegetable1.getVegId()>vegetable2.getVegId()) 
					return 1;
				else 
					return -1;
	}

}

