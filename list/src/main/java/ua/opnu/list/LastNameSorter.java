package ua.opnu.list;

import java.util.Comparator;

public class LastNameSorter implements Comparator<Student> {
    private boolean ascending;

    public LastNameSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        if (ascending) {
            return s1.getLastName().compareTo(s2.getLastName());
        } else {
            return s2.getLastName().compareTo(s1.getLastName());
        }
    }
}