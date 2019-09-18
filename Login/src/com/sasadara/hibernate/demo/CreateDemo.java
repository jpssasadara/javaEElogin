package com.sasadara.hibernate.demo;

import com.sasadara.service.RegistrationService;

public class CreateDemo {

	public static void main(String[] args) {
		boolean bb = RegistrationService.registerStudent("fdg","rt","fe","et","rtre","etrt","rr","salt".getBytes());
		System.out.println(bb);
	}

}





