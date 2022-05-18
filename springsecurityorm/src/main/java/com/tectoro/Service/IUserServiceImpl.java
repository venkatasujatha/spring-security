package com.tectoro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.Model.Users;
import com.tectoro.Repository.UserRepository;
@Service
public class IUserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public Integer save(Users user) {
		
		Users save = repository.save(user);
//		return ((Users) repository).getUid();
		return null;
		
		
		
	}
	

}
