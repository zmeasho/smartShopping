package mum.edu.repository;

import mum.edu.domain.CreditCard;
import mum.edu.domain.MyFinance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MyfinanceRepository  extends CrudRepository<MyFinance, Long>{
}

	

