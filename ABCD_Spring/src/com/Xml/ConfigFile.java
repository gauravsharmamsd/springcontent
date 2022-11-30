package com.Xml;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration

public class ConfigFile {
	@Bean
	public Teacher mathBeanTeacher() {
		return new MathTeacher();
	}
	@Bean
	public Principal principalBeam() {
		return new Principal();
	}
	@Bean
public College collegeBean() {
	//College c=new College(principalBeam());
		College c =new College();
		c.setP(principalBeam() );
		c.setT(mathBeanTeacher());
	return c;
}
}
