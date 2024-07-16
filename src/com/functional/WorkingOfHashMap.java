package com.functional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WorkingOfHashMap {
    public static void main(String args[]){
        Set<Student> map = new HashSet<>();
        Student student = new Student("Srushti", 3);
        Student student1 = new Student("Srushti", 3);
        Student student2 = new Student("Ayami", 6);
        Student student3 = new Student("Rekha", 8);
        map.add(student);
        map.add(student1);
        map.add(student2);
        map.add(student3);
        map.forEach((v)->System.out.println(v));
    }
}

class Student{
    private String name;
    private int rollNo;
    public Student(String name, int rollNo) {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public int hashCode(){
        return rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
