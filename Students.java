package com.te.assingments.students;

import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Students implements Serializable {
    @Id
	private int rollno;
	private String name;
	private double phnno;
	private long address;
	
}
