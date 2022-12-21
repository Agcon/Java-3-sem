package ru.agcon.new_labs.laba9;

public class SortingStudentsByGPA implements Comparator {
    private Student students[];

    public SortingStudentsByGPA(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public void quick_sort_students(int begin, int end) {
        if (students.length == 0) return;
        if (begin >= end) return;
        
        int middle = begin + (end - begin) / 2;
        Student main_element = students[middle];

        int i = begin, j = end;
        while (i <= j) {
            while (students[i].getGPA() < main_element.getGPA()) {
                i++;
            }

            while (students[j].getGPA() > main_element.getGPA()) {
                j--;
            }

            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        if (begin < j)
            quick_sort_students(begin, j);

        if (end > i)
            quick_sort_students(i, end);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < students.length; i++){
            s += students[i].getGPA();
            s += " ";
        }
        s += "\n";
        return s;
    }
}
