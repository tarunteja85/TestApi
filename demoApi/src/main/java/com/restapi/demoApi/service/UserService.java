package com.restapi.demoApi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.restapi.demoApi.entity.User;
import com.restapi.demoApi.entity.UserData;

@Service
public class UserService {
	
	public UserData getUserById(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		User[] users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[].class);
		
		UserData userData = new UserData();
		
		for(User user : users) {
			if(user.getId() == id) {
				if(user.getAddress() != null) {
					userData.setGeo(user.getAddress().getGeo());
				} 
				userData.setCompany(user.getCompany());
			}
		}
		return userData ;
	}
}
