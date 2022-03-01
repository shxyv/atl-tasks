package com.atl.task1;

import com.atl.task1.dao.model.Book;
import com.atl.task1.dao.model.Employee;
import com.atl.task1.dao.model.Salary;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task1Application {

    public static void main(String[] args) {
       ApplicationContext applicationContext = SpringApplication.run(Task1Application.class, args);
//        Employee employee = applicationContext.getBean(Employee.class);
//        Salary salary = applicationContext.getBean(Salary.class);
//        System.out.println(employee.getSalary());
//        employee.setName("Ilqar");

//        String [] beans = applicationContext.getBeanDefinitionNames();
//        for (String i: beans){
//            System.out.println(i);
//        }
        Book book = (Book) applicationContext.getBean("bookBean");
        book.setTitle("Title");
        System.out.println(book.bookBean());
        System.out.println(book);


    }
}
