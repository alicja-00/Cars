package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
@Entity 
@Table(name="Order1")
@SecondaryTable (name="Order")
public class Order {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer rentDate;
	private Integer rentalCar;
	
	private Integer customer;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRentDate() {
		return rentDate;
	}
	public void setRentDate(Integer rentDate) {
		this.rentDate = rentDate;
	}
	public Integer getRentalCar() {
		return rentalCar;
	}
	public void setRentalCar(Integer rentalCar) {
		this.rentalCar = rentalCar;
	}
	public Integer getCustomer() {
		return customer;
	}
	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

}
