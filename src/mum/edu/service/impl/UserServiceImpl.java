package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.repository.CredentialsRepository;
import mum.edu.repository.UserRepository;

import mum.edu.Services.UserService;
import mum.edu.domain.Credentials;
import mum.edu.domain.User;
import mum.edu.repository.CredentialsRepository;
import mum.edu.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	CredentialsRepository credentialRepository;
	
	@Autowired
	UserRepository userRepository;
	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		credentialRepository.save(user.getCredentials());
		userRepository.save(user);
		
		
	}

	@Override
	public User getUserBycredentials(Credentials userCredentials) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getLoggedInUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
