package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Dzięki temu Hibernate utworzy tabelę z tej klasy
public class Customer {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer id;
	 private String name;
	 private Integer drivingLicenceId;
	 private String  birthday ;
	 
	 public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDrivingLicenceId() {
		return drivingLicenceId;
	}
	public void setDrivingLicenceId(Integer drivingLicenceId) {
		this.drivingLicenceId = drivingLicenceId;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
		
}
