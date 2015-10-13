package mum.edu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.domain.CreditCardTransaction;


@Repository
public interface CreditCardTransactionRepo extends CrudRepository<CreditCardTransaction, Long> {

}
