import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("conf/beans.xml");
        HelloBean hello = (HelloBean) context.getBean("hellobean");
        System.out.println(hello.getHello());
    }
}
