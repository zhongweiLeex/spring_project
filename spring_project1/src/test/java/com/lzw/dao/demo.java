package com.lzw.dao;
import com.lzw.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/18 14:32
 * @Version 1.0
 **/
public class demo {
    /*
    * 开发步骤
    * 1. 导入坐标 全类名
    * 2. 创建bean
    * 3. 创建application.xml
    * 4. 在配置文件中配置
    * */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        UserDao userDao1 = (UserDao) context.getBean("userDao");
        /*
        *
        *   1. scope = singleton
                save.... 单例 scope 单例 [默认]
                com.lzw.dao.UserDaoImpl@793f29ff
                com.lzw.dao.UserDaoImpl@793f29ff
             2. scope = prototype
                save.... 多例 prototype模式
                com.lzw.dao.UserDaoImpl@173ed316
                com.lzw.dao.UserDaoImpl@25ce9dc4
        * */
        userDao.save();
        System.out.println(userDao);
        System.out.println(userDao1);



    }





}
