package app.injection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionContext.xml");
        Properties properties = context.getBean(Connection.class).getProperties();
        System.out.println(properties.getProperty("url"));

        IntegerSet set = context.getBean(IntegerSet.class);
        System.out.println(set.getSet());

        Set<Integer> myset = new TreeSet<>();
        myset.add(1);
        myset.add(2);
        myset.add(2);
        myset.add(3);
        System.out.println(myset);
    }
}
