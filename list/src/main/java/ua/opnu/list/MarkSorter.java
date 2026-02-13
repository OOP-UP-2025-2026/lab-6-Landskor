package ua.opnu.list;

import java.util.Comparator;

public class MarkSorter implements Comparator<Student> {
    private boolean ascending;

    public MarkSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        if (ascending) {
            return Double.compare(s1.getAvgMark(), s2.getAvgMark());
        } else {
            return Double.compare(s2.getAvgMark(), s1.getAvgMark());
        }
    }
}