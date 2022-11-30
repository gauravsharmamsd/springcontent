package com.example.worldline_spring_boot_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@ImportResource("app-config.xml")
@ComponentScan(basePackages = "com.rkit")
public class WorldlineSpringBootPracticeApplication {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public static void main(String[] args) throws Exception {
		SpringApplication bootStrapApplication = new SpringApplication(WorldlineSpringBootPracticeApplication.class);
		ApplicationContext ctx = bootStrapApplication.run(WorldlineSpringBootPracticeApplication.class, args);
		WorldlineSpringBootPracticeApplication myobj = ctx.getBean(WorldlineSpringBootPracticeApplication.class);
		String[] beanNames = ctx.getBeanDefinitionNames();
//		myobj.jdbcTemplate.execute("create table Customer (custId int primary key, name varchar(20))");
//		myobj.jdbcTemplate.execute("create table Address (custid int , city varchar(100), pin int, foreign key(custid) references Customer(custId))");
	//	myobj.jdbcTemplate.update("insert into Customer values (?,?)",3,"vivek");
	//	myobj.jdbcTemplate.update("insert into Address values (?,?,?)",1,"Pune",411004);
		Runnable r1 = ()->{myobj.save1();};
		Runnable r2 = ()->{myobj.save2();};
		new Thread(r1).start();
	//	new Thread(r2).start();
		System.out.println("WebApplicationType is "+bootStrapApplication.getWebApplicationType());
		System.out.println(ctx.getClass().getName());

	}
	
	@Transactional(isolation=Isolation.SERIALIZABLE)
	public void save1() {
		
		this.jdbcTemplate.update("insert into Customer values (?,?)",99,"Krishna");//Trasanction-1 This will run in its own transaction and commit if no exception
		System.out.println(" Transaction has begun for save1 ");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.jdbcTemplate.update("insert into Address values (?,?,?)",2,"Kolkata",411004);//This runs in its own transaction . If this Txn2 fails Transaction-1 can not be rolleback
		System.out.println("END Transaction of save1 ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Transactional(isolation=Isolation.SERIALIZABLE)
	public void save2 (){
	
		this.jdbcTemplate.update("insert into Customer values (?,?)",56,"Ram2");//Trasanction-1 This will run in its own transaction and commit if no exception
		System.out.println("Transaction for save2 has begun ");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.jdbcTemplate.update("insert into Address values (?,?,?)",3,"Bangalore",411004);//This runs in its own transaction . If this Txn2 fails Transaction-1 can not be rolleback
		System.out.println("END Transaction of save2 ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
