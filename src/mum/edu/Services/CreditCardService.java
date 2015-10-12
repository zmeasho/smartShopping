package mum.edu.Services;

import mum.edu.domain.CreditCard;

public interface CreditCardService {
	public CreditCard findCreditCard(String creditCardNumber);
	public void saveCreditCard(CreditCard creditCard);


}
