package mum.edu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.domain.Credentials;
import mum.edu.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public User getUserBycredentials(Credentials userCredntials);
	

}
