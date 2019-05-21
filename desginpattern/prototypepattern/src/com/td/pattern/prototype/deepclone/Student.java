package com.td.pattern.prototype.deepclone;

import java.io.*;

public class Student implements Cloneable , Serializable {

    private String name;
    private String sex;
    private Teacher teacher;
    private School school;


    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", teacher=").append(teacher);
        sb.append(", school=").append(school);
        sb.append('}');
        return sb.toString();
    }

    private Object deepClone(){


        Object obj= null;
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream boi=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(boi);
            obj = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }
}
