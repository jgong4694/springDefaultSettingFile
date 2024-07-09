package kbar3.amkor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kbar3.amkor.dto.testDto;
import kbar3.amkor.service.AmkorService;


@RestController
public class AmkorController {
	
	@Autowired
	AmkorService amcorService;
	
	@GetMapping("/machine")
	public List<testDto> getMachine() {
		return amcorService.testFind();
	}	
}
