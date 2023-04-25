package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;


@Service
public class ItemService {
	public static int itemcount=5;
	private static List<Item> items= new ArrayList<>();
	static {
		items.add(new Item(1,"mobile"));
		items.add(new Item(2,"Chair"));
		items.add(new Item(3,"Table"));
		items.add(new Item(4,"LED Tv"));
		items.add(new Item(5,"Car"));
		}
	public List<Item> getAllItems(){
		return items;
		}
	public Item getitem(int id) {
	for(Item i:items)
		{
		if(i.getId()==id)
			return i;
		}
		return null;
		}
	public Item addNewItem(Item item) {
		item.setId(++itemcount);
		items.add(item);
		return item;
		}

	}

