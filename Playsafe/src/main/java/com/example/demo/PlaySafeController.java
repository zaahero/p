package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaySafeController {


	 @GetMapping("/conversions/ktoc/{num}")
	 public Double getCelcius(@PathVariable String k){

		 Double temp = Double.valueOf(k);
		 Double c = temp - 273.15;
	     return c;    
	 }
	 
	 @GetMapping("/conversions/ctoc/{cel}")
	 public Double getKelvin String c){

		 Double temp = Double.valueOf(num);
		 Double k= temp + 273.15;
	     return k;    
	 }
	 
	 @GetMapping("/conversions/mtok/{num}")
	 public double getKilometers(@PathVariable String miles){

		 double temp = Double.valueOf(miles);
		 double km= temp / 1.609;
	     return km;    
	 }
	 
	 @GetMapping("/conversions/ktom/{num}")
	 public double getMiles(@PathVariable String km){

		 double temp = Double.valueOf(km);
		 double miles= temp *1.609;
	     return miles;    
	 }

}
