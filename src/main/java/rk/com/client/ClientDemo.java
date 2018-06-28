package rk.com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import rk.com.beans.Organization;
import rk.com.beans.Pic;

public class ClientDemo {
    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Pic pic=applicationContext.getBean(Pic.class);
        Organization organization=applicationContext.getBean(Organization.class);
        System.out.println(organization);
        System.out.println(pic);
    }
}
