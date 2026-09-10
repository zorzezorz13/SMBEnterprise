package rs.ac.university.gradjevinaAplikacija.Controller;




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