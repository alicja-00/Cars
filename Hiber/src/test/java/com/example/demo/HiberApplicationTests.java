package com.example.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.Car;
import com.example.demo.CarRepository;
import com.example.demo.Customer;
import com.example.demo.CustomerRepository;
import com.example.demo.Order;
import com.example.demo.OrderRepository;

@SpringBootTest
class HiberApplicationTests {
	@Autowired
	CarRepository repository;
	@Autowired
	CustomerRepository repository1;
	@Autowired
	OrderRepository repository2;
	@Test
	public void contextLoads() {
	}
	@Test
	public void testCreate() {
	 Car car = new Car(); 
	 Customer customer = new Customer();
	 Order order = new Order();
	
	 car.setId(1);
	 car.setName("Toyota Yaris ");
	 car.setVIN("1GMDH72JXMN235782");
	 car.setDailyPayment(333);
	 car.setHorsePower(144);
	 car.setProductionYear(2000);
	 customer.setBirthday("22");
	 order.setRentalCar(2);
	 repository1.save(customer);
	 repository2.save(order);
	 repository.save(car);
	}
	@Test
	public void testRead() {
	if (repository.existsById(1)) {
	Car car = repository.findById(1).get();
	assertNotNull(car);
	assertEquals("Toyota Yaris", car.getName());
	System.out.println(">>>>>>>>>>>>>>>>>" + car.getVIN());
	}
	}
	@Test
	public void testUpdate() {
	if (repository.existsById(1)) {
	Car car = repository.findById(1).get();
	car.setVIN("1GMDH72JXMN235782");
	repository.save(car);
	}
	}
	@Test
	public void testDelete() {
	if (repository.existsById(1)) {
	System.out.println("Deleting a car");
	repository.deleteById(1);
	}
	}
	@Test
	public void testCount() {
	 System.out.println("Number of records:" + repository.count());
	}

}
