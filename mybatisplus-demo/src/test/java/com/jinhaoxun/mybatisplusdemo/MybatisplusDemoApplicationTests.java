package com.jinhaoxun.mybatisplusdemo;

import com.jinhaoxun.mybatisplusdemo.entity.User;
import com.jinhaoxun.mybatisplusdemo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
// 获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
@SpringBootTest
class MybatisplusDemoApplicationTests {

	@Resource
	private IUserService iUserService;

	@Test
	void sqlTest() {
		User user = iUserService.getById("1");
		log.info(user.toString());
	}

	@Test
	void customSqlTest() {
		User user = iUserService.selectByName("Jack");
		log.info(user.toString());
	}

	@BeforeEach
	void testBefore(){
		log.info("测试开始!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	@AfterEach
	void testAfter(){
		log.info("测试结束!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
