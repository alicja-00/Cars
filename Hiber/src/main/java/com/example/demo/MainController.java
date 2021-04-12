package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // To oznacza, że klasa to Controller
@ComponentScan
@RequestMapping(path="/demo") // To oznacza, że URL zaczyna się na /demo (pościeżce do aplikacji)
public class MainController {
	@Autowired // Pobranie bean o nazwie carRepository,
	 // który jest automatycznie generowany przez Spring, używany do obsługidanych
	 private CarRepository carRepository;
	@Autowired // Pobranie bean o nazwie carRepository,
	 // który jest automatycznie generowany przez Spring, używany do obsługidanych
	 private CustomerRepository customerRepository;
	@Autowired // Pobranie bean o nazwie carRepository,
	 // który jest automatycznie generowany przez Spring, używany do obsługidanych
	 private OrderRepository orderRepository;
	
	 @PostMapping(path="/add") // Mapuje tylko żądania POST 
	 public @ResponseBody String addNewCar (@RequestParam String name
	 , @RequestParam String vin, @RequestParam Integer productionYear, @RequestParam Integer horsePower, @RequestParam Integer dailyPayment ) {
	 // @ResponseBody oznacza, że zwracany String jest odpowiedzią, a nie podglądemnazwy
	 // @RequestParam oznacza, że jest to parametr z żądania GET lub POST
	 Car n = new Car();
	 
	 n.setName(name);
	 n.setVIN(vin);
	 n.setProductionYear(productionYear);
	 n.setDailyPayment(dailyPayment);
	 n.setHorsePower(horsePower);
	 carRepository.save(n);
	 return "Zapisane";
	 }
	 @GetMapping(path="/all")
	 public @ResponseBody Iterable<Car> getAllCars() {
	 // To zwraca JSON lub XML z danymi samochodow
	 return carRepository.findAll();
	 }
	 @PostMapping(path="/customer") // Mapuje tylko żądania POST 
	 public @ResponseBody String addNewCustomer (@RequestParam String name,@RequestParam Integer brithday, @RequestParam Integer drivingLicence) {
		 Customer r = new Customer();
		 r.setBirthday(name);
		 r.setDrivingLicenceId(drivingLicence);
		 r.setName(name);
		 customerRepository.save(r);
		 return "zapisane";
	 }
}
