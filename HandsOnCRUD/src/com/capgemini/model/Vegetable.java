package com.capgemini.model;

public class Vegetable implements Comparable<Vegetable>{
private int vegId;
private String vegName;
private float vegPrice;

public Vegetable() {
	super();
}

public Vegetable(int vegId, String vegName, float vegPrice) {
	super();
	this.vegId = vegId;
	this.vegName = vegName;
	this.vegPrice = vegPrice;
}

public int getVegId() {
	return vegId;
}

public void setVegId(int vegId) {
	this.vegId = vegId;
}

public String getVegName() {
	return vegName;
}

public void setVegName(String vegName) {
	this.vegName = vegName;
}

public float getVegPrice() {
	return vegPrice;
}

public void setVegPrice(float vegPrice) {
	this.vegPrice = vegPrice;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + vegId;
	result = prime * result + ((vegName == null) ? 0 : vegName.hashCode());
	result = prime * result + Float.floatToIntBits(vegPrice);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vegetable other = (Vegetable) obj;
	if (vegId != other.vegId)
		return false;
	if (vegName == null) {
		if (other.vegName != null)
			return false;
	} else if (!vegName.equals(other.vegName))
		return false;
	if (Float.floatToIntBits(vegPrice) != Float.floatToIntBits(other.vegPrice))
		return false;
	return true;
}

@Override
public int compareTo(Vegetable vegetable) {
	// TODO Auto-generated method stub
	return vegName.compareTo(vegetable.vegName);
}


}
