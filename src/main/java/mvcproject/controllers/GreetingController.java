package mvcproject.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import mvcproject.model.Greeting;
import mvcproject.model.UserDetail;
import mvcproject.service.UserService;

@RestController
public class GreetingController {
	
	@Autowired
	UserService userService;
	
	private static final String templates = "Hello , %s";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(value="name", defaultValue="Dharm Dev") String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(templates, name));
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public ResponseEntity <List<UserDetail>> getDetail(HttpServletRequest req, HttpServletResponse res )
	{
		List<UserDetail> userDetailList =  userService.getUserDetail();
		return new ResponseEntity<List<UserDetail>>(userDetailList, new HttpHeaders(), HttpStatus.OK);
	}

}
