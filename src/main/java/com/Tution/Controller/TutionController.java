package com.Tution.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Tution.Entity.Tution1;
import com.Tution.Response.Response;
import com.Tution.Service.TutionService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class TutionController {
	
	@Autowired
	TutionService tutionService;
	//logger
	Logger logger=LoggerFactory.getLogger(TutionController.class);
	
	@GetMapping("/api/all")
	public List<Tution1> ControllerData(HttpServletRequest request, HttpServletResponse response){
		System.out.println(request.getRequestURL());
		List<Tution1> find=tutionService.serviceFindAll();
		System.out.println(find);
		logger.info(find.toString());
		return find;
	}
	
	
	
	@GetMapping("/api/common")
	public List<Response> ControllerCommonData(){
		return tutionService.serviceCommonData();
	}
	

	
	@GetMapping("/api/common2")
	public List<Response> ControllerCommonData2(){
		logger.error("No Error Occur");
		return tutionService.serviceCommonData2();
	}
	
	//pagination
	
	@GetMapping(value ="api/page/{pagesize}")
	public Page<Tution1> controllerPagination(@PathVariable int pagesize){
		
		return tutionService.servicePagination(pagesize);
	}
	
	
	
	//sort
	@GetMapping("/api/pagesort/{pageno}/{pagesize}")
	public Page<Tution1> controllerSortPage(@PathVariable int pageno, @PathVariable int pagesize){
		return tutionService.serviceSortPage(pageno,pagesize);
	}
	
	
	@PostMapping("/api/add")
	public void ControllerAdd(@RequestBody Tution1 tution1 ,HttpServletRequest request, HttpServletResponse response ){

	System.out.println(request.getRequestURL());
	logger.error("Full Wanting");
	logger.info(tution1.toString());
		tutionService.addData(tution1);
	}

}
