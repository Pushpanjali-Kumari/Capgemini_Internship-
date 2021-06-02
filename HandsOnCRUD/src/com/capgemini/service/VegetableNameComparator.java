package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Vegetable;

public class VegetableNameComparator implements Comparator<Vegetable>{

	@Override
	public int compare(Vegetable vegetable1,Vegetable vegetable2) {
		// TODO Auto-generated method stub
	
		return vegetable1.getVegName().compareTo(vegetable2.getVegName());
}
}
