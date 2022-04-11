package com.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		try {
		System.out.println("Starting code");
//		
//		User user = new User();
//		
//		user.setFirstname("Ashwini");
//		user.setLastname("Moolya");
//		user.setUsername("AshwiniMoolya35");
//		user.setPassword(this.bCryptPasswordEncoder.encode("password"));
//		user.setEmail("ashwini.moolya@isteer.com");
//		user.setProfile("default.png");
//		user.setPhone("9148742542");
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//		}catch (UserFoundException e) {
//			e.printStackTrace();
//		}
	}

}
