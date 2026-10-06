package rs.ac.university.gradjevinaAplikacija.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.university.gradjevinaAplikacija.Service.ItemService;


@RestController
@RequestMapping(path = "/api/item")
public class ItemController
{

	private final ItemService itemservice;

	@Autowired
	public ItemController(ItemService itemservice)
	{
		this.itemservice = itemservice;
	}


}