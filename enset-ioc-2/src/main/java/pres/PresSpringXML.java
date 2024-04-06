package pres;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml ");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
