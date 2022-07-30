package com.rqiang;



import com.rqiang.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resources = new ClassPathResource("applicationContext.xml"); //延迟加载Bean而 ApplicationContext是立即加载Bean
        BeanFactory bf = new XmlBeanFactory(resources);
//        BookDao bookDao = bf.getBean(BookDao.class);
//        bookDao.save();

    }
}
