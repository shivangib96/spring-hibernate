package one2one;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name="student")
public class Student {
@Id
@Column
private int rno;
@Column(length=20)
private String name;
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
