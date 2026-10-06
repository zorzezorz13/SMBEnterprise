package rs.ac.university.gradjevinaAplikacija.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ac.university.gradjevinaAplikacija.Repository.ItemRepository;


@Service
public class ItemService
{

	private final ItemRepository itemRepository;

	@Autowired
	public ItemService(ItemRepository itemRepository)
	{
		this.itemRepository = itemRepository;                                    
	}


}