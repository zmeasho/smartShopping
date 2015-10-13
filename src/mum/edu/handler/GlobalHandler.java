package mum.edu.handler;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import mum.edu.enumerations.CardType;

@ControllerAdvice
public class GlobalHandler {
/*
	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;
	
	@Autowired
	AppSettingsService appSettingsService;

	@ModelAttribute("imagePath")
	public String getImagePath(Model model,
								HttpServletRequest request){
		String rootDirectory = request.getSession().getServletContext().getRealPath("/").replace("\\", "/") + "resources/images/";
		return rootDirectory;
	}
	
	@ModelAttribute("categories")
	public List<Category> intializeModel(Model model) {
		return categoryService.getAllCategory();
	}

	@ModelAttribute("mainCategories")
	public List<Category> initializeModelMainCategory(Model model){
		return this.categoryService.getAllMainCategory();
	}
	
	@ModelAttribute("subCategories")
	public List<Category> initializeModelSubCategory(Model model){
		return this.categoryService.getAllSubCategory();
	}
	
	@ModelAttribute("products")
	public List<Product> intializeModelProduct(Model model) {
		return productService.findAll();
	}
*/
	@ModelAttribute("creditCardTypes")
	public List<String> initializeCreditCardType(Model model) {

		List<String> creditCardTypes = new ArrayList<String>();
		creditCardTypes.add((CardType.VISA).toString());
		creditCardTypes.add((CardType.MASTER).toString());
		return creditCardTypes;

	}

	@ModelAttribute("months")
	public List<String> initMonths() {
		List<String> months = new ArrayList<String>();
		for (int i = 0; i < 12; i++) {
			months.add(new DateFormatSymbols().getShortMonths()[i]);
		}
		return months;
	}
	/*
	@ModelAttribute("cartSessionId")
	public String getCartSessionId(HttpServletRequest request){
		return request.getSession(true).getId();
		}
	
	public void initIessages(Model model){
		model.addAttribute("ErrorBalance",appSettingsService.appSettings("ErrorBalance").getParamValue().toString());
		model.addAttribute("ErrorCard",appSettingsService.appSettings("ErrorCard").getParamValue().toString());
	}
*/
}
