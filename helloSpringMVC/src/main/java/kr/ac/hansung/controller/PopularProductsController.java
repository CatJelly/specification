package kr.ac.hansung.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.dao.Products;
import kr.ac.hansung.service.PopularProductsService;

@Controller //���� �ڵ� Ŭ���� �� ���
public class PopularProductsController {
	
	private PopularProductsService popularProductsService;

	@Autowired //auto-wiring by type to OfferService //���� ������ DI ����
	public void setOfferService(PopularProductsService popularProductsService) {
		this.popularProductsService = popularProductsService;
	}
	
	@RequestMapping("/PopularProducts")
	public String createOffer(Model model){	
		
/*		List<Offer> offers = offerService.getCurrent();
		model.addAttribute("offers", offers);
		*/
		List<Products> products = popularProductsService.getCurrent();
		
		System.out.println("����"+products.get(0));

		model.addAttribute("PopularProducts", products);	
		model.addAttribute("PopularProductsTop1", products.get(0));
		model.addAttribute("PopularProductsTop2", products.get(1));

		
		
		return "PopularProducts";
		
	}
	
	
	

}
