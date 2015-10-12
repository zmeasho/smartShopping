package mum.edu.Services;

import org.springframework.stereotype.Service;

import mum.edu.domain.Credentials;
import mum.edu.domain.User;

@Service
public interface UserService  {
	void addNewUser(User user);
	public User getUserBycredentials(Credentials userCredentials);
	public User getLoggedInUser();
	public User getUserByID(Long id);

}
