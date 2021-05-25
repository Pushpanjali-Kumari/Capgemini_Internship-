package com.capgemini.collectionsexamples;

public class Student {
private int stdId;
private String stdName;

public Student() {
	super();
}
public Student(int stdId, String stdName) {
	super();
	this.stdId = stdId;
	this.stdName = stdName;
}
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}

}
