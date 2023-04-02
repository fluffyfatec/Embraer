package com.embraer.backend.item.services.ListItemsByChassi;

import com.embraer.backend.item.services.ListItemsByChassi.dto.ListItemsResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<ListItemsResponseDTO> listItemsByChassy(@PathVariable("chassi") Long chassi) {
		
		ListItemsResponseDTO listItems = itemsByChassiService.execute(chassi);
		
		return ResponseEntity.status(HttpStatus.OK).body(listItems);
	}

}
