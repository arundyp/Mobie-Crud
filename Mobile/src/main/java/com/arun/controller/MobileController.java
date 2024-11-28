package com.arun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arun.entity.Mobile;
import com.arun.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	private MobileService service;

	@PostMapping("/mobile")
	ResponseEntity<Mobile> createMobile(@RequestBody Mobile mob) {

		Mobile createMobile = this.service.CreateMobile(mob);
		
		return new ResponseEntity<>(createMobile, HttpStatus.CREATED);

	}
	
	@GetMapping("/mob/{id}")
	ResponseEntity<Mobile> getMobileById(@PathVariable int id){
		
		Mobile singleMobile = this.service.singleMobile(id);
		return new ResponseEntity<Mobile>(singleMobile, HttpStatus.OK);
	}
	
	@DeleteMapping("/mob/{id}")
	public void delete(@PathVariable int id) {
		this.service.deleteMobile(id);
		
	}
	@GetMapping("/mob")
	ResponseEntity<List<Mobile>> getAll(){
		List<Mobile> allMobile = this.service.getAllMobile();
		return  new ResponseEntity<List<Mobile>>(allMobile,HttpStatus.OK);
	}
	
	
	@PutMapping("/mob/update/{id}")
	ResponseEntity<Mobile> updateMobile(@RequestBody Mobile mob, @PathVariable int id){
		
		Mobile updateMobile = this.service.updateMobile(mob, id);
		return  new ResponseEntity<Mobile>(updateMobile,HttpStatus.ACCEPTED);
	}
	
}
