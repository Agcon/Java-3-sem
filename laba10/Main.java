package ru.agcon.new_labs.laba10;

import java.util.Scanner;

public class Main {
    public static Student[] instertionSort(Student student[]) {
        for (int i = 1; i < student.length; i++) {
            Student current = student[i];
            int j = i - 1;
            while(j >= 0 && current.getiDNumber() < student[j].getiDNumber()) {
                student[j+1] = student[j];
                j--;
            }
            student[j+1] = current;
        }
        return student;
    }

    public static Student[] sortArray(Student[] arrayA){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        Student[] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }

    public static Student[] mergeArray(Student[] arrayA, Student[] arrayB) {

        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA].getGPA() < arrayB[positionB].getGPA()) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }
        return arrayC;
    }

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Student[] students = new Student[x];
        for (int i = 0; i < x; i++) {
            students[i] = new Student(scanner.nextInt(), scanner.nextInt());
        }
        for (int i = 0; i < x; i++) {
            System.out.print(students[i].getiDNumber() + " ");
        }
        System.out.println();
        students = instertionSort(students);
        for (int i = 0; i < x; i++) {
            System.out.print(students[i].getiDNumber() + " ");
        }
        System.out.println();
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA(students);
        System.out.print(sortingStudentsByGPA);
        sortingStudentsByGPA.quick_sort_students(0, sortingStudentsByGPA.getStudents().length - 1);
        System.out.print(sortingStudentsByGPA);
        Student[] students2 = new Student[]{
                new Student(35, 412),
                new Student(16, 105),
                new Student(18, 128),
                new Student(222, 201)
        };
        Student[] merge_students = mergeArray(students, students2);
        merge_students = sortArray(merge_students);
        for (int i = 0; i < merge_students.length; i++) {
            System.out.print(merge_students[i].getGPA() + " ");
        }
    }
}
