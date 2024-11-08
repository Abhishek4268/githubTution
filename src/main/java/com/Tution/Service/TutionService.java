package com.Tution.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.Tution.Entity.Tution1;
import com.Tution.Repository.TutionRepository;
import com.Tution.Response.Response;

@Service
public class TutionService {
	
	@Autowired
	TutionRepository tutionRepository;
	
	public List<Response> serviceCommonData(){
		return tutionRepository.commonData();
	}
	
	public List<Response> serviceCommonData2(){
		return tutionRepository.commonData2();
	}

	
	//Page able object
	
	public Page<Tution1> servicePagination(int pagesize) {
		
		Pageable pageable=PageRequest.ofSize(pagesize);
		return tutionRepository.findAll(pageable);
	}

	//page nation sorting
	public Page<Tution1> serviceSortPage(int pageno, int pagesize) {
		Sort sort=Sort.by(Direction.ASC, "age");
		Pageable pageable=PageRequest.of(pageno, pagesize, sort);
		return tutionRepository.findAll(pageable);
	}

	public List<Tution1> serviceFindAll() {
		// TODO Auto-generated method stub
		return tutionRepository.findAll();
	}

	//add data in table
	public void addData(Tution1 tution1) {
	 tutionRepository.save(tution1);
	}
	
	
	
	
	
	

}
