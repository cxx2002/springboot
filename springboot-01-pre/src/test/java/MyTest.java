import com.cxx.config.SpringConfig;
import com.cxx.pojo.Cat;
import com.cxx.pojo.Student;
import com.cxx.pojo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈喜喜
 * @date 2022-08-03 10:59
 */
public class MyTest {
    /**
     * 使用xml作为容器配置文件
     */
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }
    /**
     * 使用JavaConfig
     */
    @Test
    public void test02() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ac.getBean("createStudent");
        System.out.println(student);
    }
    @Test
    public void test03() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ac.getBean("liSiStudent");
        System.out.println(student);
    }
    @Test
    public void test04() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) ac.getBean("myCat");
        System.out.println(cat);
    }
    @Test
    public void test05() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ac.getBean("myTiger");
        System.out.println(tiger);
    }
}
