package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaySafeController {


	 @GetMapping("/conversions/ktoc/{num}")
	 public int getCelcius(@PathVariable String num){

		 int temp = Integer.valueOf(num);
		 int value= (int) (temp * 1.8);
	     return value;    
	 }
	 
	 @GetMapping("/conversions/ctoc/{cel}")
	 public int getFarenheight(@PathVariable String num){

		 int temp = Integer.valueOf(num);
		 int value= (int) (temp * 1.8);
	     return value;    
	 }
	 
	 @GetMapping("/conversions/mtok/{num}")
	 public int getKilometers(@PathVariable String num){

		 int temp = Integer.valueOf(num);
		 int value= (int) (temp * 1.6);
	     return value;    
	 }
	 
	 @GetMapping("/conversions/ktom/{num}")
	 public int getMiles(@PathVariable String num){

		 int temp = Integer.valueOf(num);
		 int value= (int) (temp / 1.8);
	     return value;    
	 }

}
