package rs.ac.university.gradjevinaAplikacija.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.springframework.stereotype.Service;
import rs.ac.university.gradjevinaAplikacija.Entity.Item;
import rs.ac.university.gradjevinaAplikacija.Repository.ItemRepository;


@Service
public class ItemService
{

	private final itemRepository;

	@Autowired
	public ItemService(ItemRepository ItemRepository)
	{
		this.itemRepository                                                
	}


}