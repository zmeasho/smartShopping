package mum.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import mum.edu.Services.CreditCardService;
import mum.edu.domain.CreditCard;
import mum.edu.repository.CreditCardRepository;

public class CreditCardServiceImpl implements CreditCardService {
	  @Autowired
      CreditCardRepository creditCardRepository;
	@Override
	public CreditCard findCreditCard(String creditCardNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCreditCard(CreditCard creditCard) {
		creditCardRepository.save(creditCard);
		
	}

}
