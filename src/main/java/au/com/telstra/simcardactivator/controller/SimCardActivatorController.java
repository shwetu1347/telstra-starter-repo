package au.com.telstra.simcardactivator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import au.com.telstra.simcardactivator.model.SimCardActivatorModel;
import au.com.telstra.simcardactivator.service.SimCardActivatorService;
import lombok.RequiredArgsConstructor;

@RestController
@ControllerAdvice
@RequiredArgsConstructor


public class SimCardActivatorController {
	
	private SimCardActivatorService simCardActivatorService ;
	

	@PostMapping

	public void savesimDetails(@RequestBody SimCardActivatorModel simCardActivatorModel) {
		this.simCardActivatorService.savesimDetails(simCardActivatorModel);
	}

	
}