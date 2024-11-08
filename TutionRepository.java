package com.Tution.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Tution.Entity.Tution1;
import com.Tution.Response.Response;

public interface TutionRepository extends JpaRepository<Tution1, Integer> {
	
	@Query("select t1.age as age,t1.study as study,t1.name as name,t2.city as city,t2.adress as adress from Tution1 as t1 inner join Tution2 as t2 on t1.id=t2.id")
	 public List<Response> commonData();
	
	//native query
	@Query(value="select t1.age as age,t1.study as study,t1.name as name,t2.city as city,t2.adress as adress from tution_1 as t1 inner join tution_2 as t2 on t1.id=t2.id",nativeQuery=true)
	public List<Response> commonData2();



	public List<Tution1> findAll();

	
	
}
