package com.stackroute.domain;

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
        Movie movie=context.getBean("movie", Movie.class);
        movie.movieDisplay();

        BeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
                  //getBean() returns instance
        Movie movie1=beanfactory.getBean("movie", Movie.class);
        movie1.movieDisplay();

        DefaultListableBeanFactory defaultListableBeanFactory=new DefaultListableBeanFactory();
        BeanDefinitionRegistry beanDefinitionRegistry=new GenericApplicationContext(defaultListableBeanFactory);
        BeanDefinitionReader beanDefintionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefintionReader.loadBeanDefinitions("bean.xml");
        Movie movie2=defaultListableBeanFactory.getBean("movie",Movie.class);
        movie2.movieDisplay();
    }
}
