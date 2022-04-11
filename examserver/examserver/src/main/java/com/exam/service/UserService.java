package com.exam.service;

import java.io.UnsupportedEncodingException;
import java.util.Set;

import javax.mail.MessagingException;

import com.exam.entities.User;
import com.exam.entities.UserRole;

public interface UserService {
	User getUser(String username);

	void deleteUser(long id);
  	     
	    public void sendVerificationEmail(User user, String siteURL) throws UnsupportedEncodingException, MessagingException;

		User createUser(User user, Set<UserRole> userRoles, String siteURL) throws Exception;
}
