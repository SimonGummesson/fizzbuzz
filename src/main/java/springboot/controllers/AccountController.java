package springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import springboot.services.AccountService;

@RestController
public class AccountController {
 
    @Autowired
    private AccountService acc_service;
	
	@RequestMapping("/")
	public String index() {
	return "Greetings from Spring Boot!";
	}

    // Get an account by id
    //@GetMapping(value="/getAccount/{username}")
    //public Account getAccount(@PathVariable(name="username") String username) {
	//	Account account_data = acc_service.getAccount(username);
		
	//	Account a = new Account();
	//	a.setUsername("Simon");
	//	a.setPassword("eeeeee");
		
	//	return account_data;
	//} 
	//@PostMapping("/")
	//public String readCookie(@CookieValue(value = "username", defaultValue = "Atta") String username) {
	//	return "Hey! My username is " + username;
	//}


	@PostMapping("/login/{username}/{password}")
  	int login(@PathVariable String username, @PathVariable String password) {
		  acc_service.login(username, password);
		  return 1;
	}

	@PutMapping("/logout/{session_id}")
	void logout(@PathVariable int session_id) {
		acc_service.logout(session_id);
	  }
	  
	@GetMapping("/is-authenticated/{session_id}")
		void is_authenticated(@PathVariable int session_id) {
		acc_service.is_authenticated(session_id);
  	}
}


// Get an account by id
//@RequestMapping(value="/getAccount/{id}", method=RequestMethod.GET, headers="Accept=application/json")
//public Account getAccountById(@PathVariable(name="id") int id) {
//	Account a = new Account();
//	a.setUsername("Simon");
//	a.setPassword("eeeeee");
	
//	return a;