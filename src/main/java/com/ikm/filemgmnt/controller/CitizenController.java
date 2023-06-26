package com.ikm.filemgmnt.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikm.filemgmnt.model.CitizenModel;
import com.ikm.filemgmnt.repository.CitizenRepository;

@RestController
@Validated
@RequestMapping("api/v1")
public class CitizenController {

    @Autowired
    private CitizenRepository citizenRepository;

    @PostMapping("/citizencreate")
    public ResponseEntity <String> createCitizen(@Valid @RequestBody  CitizenModel citizen) {
        if (citizen.getName() == null || citizen.getName() == "" ){
           return new ResponseEntity("Name cant be blank",HttpStatus.BAD_REQUEST);           
        }
        else if (citizen.getAddress() == null || citizen.getAddress() == "" ){
            return new ResponseEntity("Address cant be blank",HttpStatus.BAD_REQUEST);           
         }
        
        else{
            citizenRepository.save(citizen);
            return new ResponseEntity("Citizen Created"  +  "id"  +  citizen.getId(),HttpStatus.OK);
        }

		
        
	}
    
}
