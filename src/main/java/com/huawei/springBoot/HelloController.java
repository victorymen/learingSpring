package com.huawei.springBoot;

import com.huawei.jdbc.Student;
import com.huawei.jdbc.StudentJDBCTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbcBean.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        List<Student> students = studentJDBCTemplate.listStudents();
        String result = "";
        for (Student record : students) {
            result = result + String.format("id:%d    name:%s    age:%d   ", record.getId(), record.getName(), record.getAge());
        }
        return result;
    }

    @GetMapping("/books")
    public ModelAndView getbook() {
        List<Book> books=new ArrayList<>();
        Book book=new Book("spring",108);
        Book book1=new Book("spring boot",0);
        books.add(book);
        books.add(book1);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("books",books);
        modelAndView.setViewName("books");
        return modelAndView;
    }
}