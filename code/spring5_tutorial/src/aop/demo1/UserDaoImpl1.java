package aop.demo1;

import org.springframework.stereotype.Repository;

public class UserDaoImpl1 implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了.....");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了.....");
        return id;
    }
}
