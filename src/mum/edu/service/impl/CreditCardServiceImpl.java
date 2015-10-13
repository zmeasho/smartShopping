package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.Services.CreditCardService;
import mum.edu.domain.CreditCard;
import mum.edu.repository.CreditCardRepository;


@Service
public class CreditCardServiceImpl implements CreditCardService {


	@Autowired
	CreditCardRepository creditCardRepo;
	
	public CreditCard findCreditCard(String creditCardNumber) {
		
		return creditCardRepo.findByNumber(creditCardNumber);
	}


	public void saveCreditCard(CreditCard creditCard) {
       creditCardRepo.save(creditCard);
	}
	

}
