package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Phone;


@Repository
public interface Phonerepo extends JpaRepository<Phone, Integer> {

	
	@Query("delete from Phone where uid=:i")
	void deleteByUid(int i);

}
