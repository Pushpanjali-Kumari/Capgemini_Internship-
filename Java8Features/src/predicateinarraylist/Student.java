package predicateinarraylist;

public class Student {
private int stdId;
private String stdName;
public Student(int stdId, String stdName) {
	
	super();
	this.stdId = stdId;
	this.stdName = stdName;
}
public Student() {
	super();
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

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + stdId;
	result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
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
	Student other = (Student) obj;
	if (stdId != other.stdId)
		return false;
	if (stdName == null) {
		if (other.stdName != null)
			return false;
	} else if (!stdName.equals(other.stdName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Student [stdId=" + stdId + ", stdName=" + stdName + "]";
}


}
