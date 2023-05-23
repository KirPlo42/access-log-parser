import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    private List<Integer> marks;

    private Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    static Student ofName(String name) {
        List<Integer> marks = new ArrayList<>();
        return new Student(name, marks);
    }

    static Student ofNameAndMarks(String name, List<Integer> marks) {
        for (int mark : marks) {
            if (mark < 2 || mark > 5)
                throw new IllegalArgumentException("Please set marks only from 2 to 5");
        }
        List<Integer> marksCopy = new ArrayList<>(marks);
        return new Student(name, marksCopy);
    }

    public void setMark(int mark) {
        if (mark >= 2 && mark <= 5) {
            marks.add(mark);
        } else {
            System.out.println("the mark must be from 2 to 5");
        }
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    @Override
    public String toString() {
        return name + ":" + marks;
    }
}
