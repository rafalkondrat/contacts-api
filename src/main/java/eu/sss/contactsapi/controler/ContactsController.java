package eu.sss.contactsapi.controler;

import eu.sss.contactsapi.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContactsController {

	List<Contact> contacts = new ArrayList<Contact>() {{
		add(new Contact("Rafal Kondrat", "rafal.kondrat@solidsoftware.pl", "456-345-234"));
		add(new Contact("Jacob Wojteloo", "j.cob@solidsoftware.pl", "444-444-444"));
		add(new Contact("Pitero Sombrero", "pit.som@solidsoftware.pl", "666-555-444"));
		add(new Contact("Luka Kondrat", "rafal.kondrat@solidsoftware.pl", "456-345-234"));
		add(new Contact("Tamoato Ketczupao", "j.cob@solidsoftware.pl", "444-444-444"));
		add(new Contact("John Rambo", "pit.som@solidsoftware.pl", "666-555-444"));
	}};

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}

	@GetMapping("contacts")
	public List<Contact> findAll() {
		return contacts;
	}

	@GetMapping("contacts/{id}")
	public Contact findById(@PathVariable Long id) {
		return contacts.get(0);
	}
}
