package pl.keruzam.springinaction;

import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();
		helloWorld2.getMessage();
		
		
		//ApplicationContext facesCtx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
	}

}
