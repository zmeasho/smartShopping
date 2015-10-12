package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.Services.UserService;
import mum.edu.domain.CreditCard;
import mum.edu.domain.User;
@Controller
public class SignUpController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp(Model model, User user) {
		model.addAttribute("newUser", user);
		return "signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String processSignUp(@Valid @ModelAttribute("newUser") User user,
			@ModelAttribute("creditCard") CreditCard creditCard,BindingResult result, RedirectAttributes redirectAttribute,
			Model model) {
		if (result.hasErrors()) {
			return "signup";
		}
		User ur = new User();
		if(user.getUserType().equals("customer"))
				{
			  userService.addNewUser(user);
			
			  model.addAttribute("message",
						
						"RegistrationSuccessfully done");
				return "messagePage";
			}
		else{
			model.addAttribute("message2",
					
					" this is vender Registration will done after we buil webservice ");
			return "messagePage";
		}
				}


}
