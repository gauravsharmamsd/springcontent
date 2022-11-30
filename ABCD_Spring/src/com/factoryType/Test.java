package com.factoryType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx =new ClassPathXmlApplicationContext("fact3.xml");
SingleTon st=	(SingleTon) ctx.getBean("heer");
st.displyMsg();

//SingleTon s=new SingleTon();
//s.displyMsg();
//SingleTon.getSingleTon();
}
}
