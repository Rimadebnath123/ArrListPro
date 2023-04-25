package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Item;
import com.example.demo.Service.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;
		
//		@PostMapping(value="/items/{id}")
//		public int addItem(@PathVariable int id) {
//			return id;	
//		}
	@GetMapping(value="/items/{id}")
	public Item getItem(@PathVariable int id) {
		return itemService.getitem(id);	
	}
		
		
	@GetMapping(value="/items")
	public List<Item> getItems(){
		return itemService.getAllItems();
	}
		
	@PostMapping(value="/items")
	public Item addItem(@RequestBody Item item) {
		return itemService.addNewItem(item);
		}

	}

