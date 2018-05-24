package cn.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springboot.pojo.User;


/**
 * spring-boot domo controller
 * @author Administrator
 *
 */
@RestController
public class HelloWordController {

	@RequestMapping("hello")
	public User hello(){
		User user = new User();
		user.setId(1);
		user.setName("hello");
		user.setCreateTime(new Date()); 
		return user;
	}

}
