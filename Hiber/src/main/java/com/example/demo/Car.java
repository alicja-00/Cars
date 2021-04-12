package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // Dzięki temu Hibernate utworzy tabelę z tej klasy
//@Table(name ="Car")
public class Car {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer id;
	 private String name;
	 private String VIN;
	 @Column(name = "productionYear")
	 private Integer productionYear;
	 @Column(name = "horsePower")
	 private Integer  horsePower ;
	 @Column(name = "dailyPayment")
	 private  Integer dailyPayment ;
		
	 
	 public Integer getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(Integer productionYear) {
		this.productionYear = productionYear;
	}
	
	public Integer getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}
	public Integer getDailyPayment() {
		return dailyPayment;
	}
	public void setDailyPayment(Integer dailyPayment) {
		this.dailyPayment = dailyPayment;
	}
	
	
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
	 public String getVIN() {
	 return VIN;
	 }
	 public void setVIN(String vin) {
	 this.VIN = vin;
	 }

}
