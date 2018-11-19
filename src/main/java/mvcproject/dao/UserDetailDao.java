package mvcproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import mvcproject.model.UserDetail;

@Component
public class UserDetailDao {

	public List<UserDetail> getUserDetail() {
	ArrayList<UserDetail> arr =  new ArrayList<UserDetail>();
	
	UserDetail a = new UserDetail();
	a.setId(1l);
	a.setName("Dharm Dev");
	
	UserDetail b = new UserDetail();
	b.setId(2l);
	b.setName("Ajay Singh");
	
	
	UserDetail c = new UserDetail();
	c.setId(3l);
	c.setName("Vijay Singh");
	
	arr.add(a);
	arr.add(b);
	arr.add(c);
	
	
	return arr;
		
	}
}
