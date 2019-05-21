package com.td.pattern.prototype.deepclone;

public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {


    School school=School.getInstance();

        Teacher teacher=new Teacher();
        teacher.setAge(30);
        teacher.setName("张老师");

        Student xiaoming=new Student();
        xiaoming.setName("xiaoming");
        xiaoming.setSex("男");
        xiaoming.setTeacher(teacher);
        xiaoming.setSchool(school);



        Student clone= (Student) xiaoming.clone();


        System.out.println(clone);

        System.out.println(clone.getSchool() + "_" + xiaoming.getSchool());

    }
}
