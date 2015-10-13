package mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.domain.CreditCard;

@Controller
public class PaymentController {
	@RequestMapping(value = "/payment")
	public String getCreditCard(
			@ModelAttribute("creditCard") CreditCard creditCard, Model model) {
	return "payment";
	}
}
