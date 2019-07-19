package com.stackroute.domain;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String args[]){
//intializing applicationcontext object with classpath file
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Movie  movieA=context.getBean("movieA",Movie.class);
        movieA.movieDisplay();
//getBean returns instance

        Movie  movieB=context.getBean("movieB",Movie.class);
        movieB.movieDisplay();

        System.out.println(movieA == movieB);


    }
}

