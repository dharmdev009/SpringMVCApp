package mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvcproject.dao.UserDetailDao;
import mvcproject.model.UserDetail;


@Service
public class UserService {
	
	@Autowired
	UserDetailDao userDetailDao;
	
	public List<UserDetail> getUserDetail() {
		return userDetailDao.getUserDetail();
	}
	
}
