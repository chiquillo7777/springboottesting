package carlos.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
       // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) factory.getBean("alien");
        obj1.code();
        //obj1.setAge(15);
        System.out.println(obj1.getAge());




    }
}