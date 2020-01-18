package com.company.lesson14;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListex {

    public static void main(String[] args) {
        LinkedList<Student>students = new LinkedList<>();
        Student student = new Student("Vasia", 18, "+380");

        students.add(student);
        students.add(new Student("Kolya", 17, "+3802"));
        students.add(new Student("Misha", 19, "+3803"));

        //System.out.println(students);

        students.addFirst(new Student("Ira", 16, "+3800"));
        students.addLast(new Student("Vera", 16, "+3804"));

        students.remove(student);
        System.out.println(students);

        students.remove(1);
        System.out.println(students);

        students.removeFirst();
        System.out.println(students);
    }
}