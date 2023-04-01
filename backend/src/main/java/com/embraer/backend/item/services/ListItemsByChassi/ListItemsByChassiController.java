package com.embraer.backend.item.services.ListItemsByChassi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/items/list/{chassi}")
public class ListItemsByChassiController {
		
	@Autowired
	ListItemsByChassiService itemsByChassiService;
	
	@GetMapping
	public void listItemsByChassy(@PathVariable("chassi") Long chassi) {
		
	}

}
