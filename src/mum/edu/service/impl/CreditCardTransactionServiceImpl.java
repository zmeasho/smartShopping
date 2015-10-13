package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.Services.CreditCardTransactionService;
import mum.edu.domain.CreditCardTransaction;
import mum.edu.repository.CreditCardTransactionRepo;


@Service
public class CreditCardTransactionServiceImpl implements CreditCardTransactionService {

	@Autowired 
	CreditCardTransactionRepo ccTransactionRepo;
	
	public void saveCreditCardTransaction(CreditCardTransaction ccTransaction) {
		ccTransactionRepo.save(ccTransaction);
	}

	

}
