package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.beans.Phone;
import com.example.demo.beans.User;
import com.example.demo.repo.Phonerepo;
import com.example.demo.repo.UserRepo;

@SpringBootApplication
public class SpringDatJpaRelationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDatJpaRelationsApplication.class, args);
		// UserRepo urepo = ctx.getBean(UserRepo.class);
		Phonerepo prepo = ctx.getBean(Phonerepo.class);

//in this program one user having one or more mobile numbers.

		// insert values purpose
		User u = new User();
		u.setUname("santu");
		// urepo.save(u);

		Phone p1 = new Phone();
		p1.setPhoneNo(8498869680L);
		p1.setProvider("jio");
		p1.setUid(u);

		Phone p2 = new Phone();
		p2.setPhoneNo(7680827938L);
		p2.setProvider("Airtel");
		p2.setUid(u);

		prepo.save(p1);
		// prepo.save(p2);

		/*
		 * // retrive purpose List<User> find = urepo.findAll(); for (User a : find) {
		 * System.out.println(a.getUid() + "\t" + a.getUname() + "\t" + a.getPhone()); }
		 */

	}

}
