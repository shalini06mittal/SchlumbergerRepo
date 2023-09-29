package com.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.payment.PaymentProject.PaymentService;
import com.spring.SpringDemo.basic01.MyService;
import com.spring.SpringDemo.basic01.SmsNotifications;

//there are spring specific configurations in this project
@Configuration 
@ComponentScan 
// to look for beans [ java classes ] with 
//@Component/ @Service /@Repository/ @Bean / @Controller to load and instantiate them
// it will default scan within the com.spring.SpringDemo and its sub packages
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(App.class);
        //SmsNotifications ob = new SmsNotifications();
        
//        for(String bean : context.getBeanDefinitionNames())
//        	System.out.println(bean);
        
        MyService service = context.getBean(MyService.class);
        service.generateBill();
        
    }
    @Bean // spring managed bean
    public PaymentService paymentService()
    {
    	System.out.println("payment service object...");
    	return new PaymentService();
    }
}
