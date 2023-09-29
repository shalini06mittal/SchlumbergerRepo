package com.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.payment.PaymentProject.PaymentService;
import com.spring.SpringDemo.basic01.MyService;
import com.spring.SpringDemo.basic01.SmsNotifications;
import com.spring.SpringDemo.database.CustomerDatabase;
import com.spring.SpringDemo.entities.Customer;
import com.spring.SpringDemo.scope.Employee;
import com.spring.SpringDemo.service.CustomerService;

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
        
        System.out.println("\nService");
        MyService service = context.getBean(MyService.class);
        service.generateBill();
        
        System.out.println("\n********************Scoping********************");
        
        // No matter how many times u ask spring to get the object of type employee ,
        // it is the same instance
        // singleton
        Employee emp1 = context.getBean(Employee.class);
        System.out.println(emp1.hashCode());
        System.out.println(emp1); // id and name
        emp1.setEname("Manisha");
        System.out.println(emp1.getEname());
       
        System.out.println();
        
        Employee emp2 = context.getBean(Employee.class);
        System.out.println(emp1.hashCode());
        System.out.println(emp2); // id and name
        
        System.out.println();
        CustomerDatabase db = context.getBean(CustomerDatabase.class);
        System.out.println("Total count "+db.getCustomerCount());
        
        System.out.println("\n******************** CUSTOMER SERVICE ********************");
        CustomerService customerService = context.getBean(CustomerService.class);
        Customer customer = new Customer("het@gmail.com", "Het", "Patel", "New York", "USA", "5656456567", "het");
//        System.out.println(customer.getEmail().isBlank());
//        try {
//			System.out.println(customerService.addCustomer(customer));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
        
        try {
			System.out.println(customerService.findCustomerByEmail("ankit@gmail.com"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			System.out.println(customerService.findCustomerByEmail("sapna@gmail.com"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
        System.out.println();
        for(Customer cust : customerService.getAllCustomers())
        	System.out.println(cust);
    }
    @Bean // spring managed bean
    public PaymentService paymentService()
    {
    	System.out.println("payment service object...");
    	return new PaymentService();
    }
}
