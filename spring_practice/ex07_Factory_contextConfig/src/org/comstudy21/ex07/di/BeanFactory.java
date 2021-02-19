package org.comstudy21.ex07.di;

public class BeanFactory {

	public Object getBean(String beanName) {
		Object bean = null;
		switch(beanName) {
		case "lg" : bean= new LgTV(); break;
		case "samsung" : bean= new SamsungTV(); break;
		}
		
		return bean;
	}

}
