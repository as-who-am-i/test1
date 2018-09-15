package com.dao;

import com.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    public int insert(StudentEntity student){
        student.setName("jerry");
        student.setAge(19);
        try{
            hibernateTemplate.save(student);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }


    }
}
