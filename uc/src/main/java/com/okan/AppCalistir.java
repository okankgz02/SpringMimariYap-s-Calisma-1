package com.okan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AppCalistir {

	public static void main(String[] args) {
		 //Araba araba=new Araba();
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("SpringBeansConfig.xml"));
		Araba araba=(Araba) beanFactory.getBean("araba");
		araba.hareketeGec();
	}

}
