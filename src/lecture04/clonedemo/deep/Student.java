package lecture04.clonedemo.deep;

import java.util.ArrayList;
public class Student implements Cloneable {
    private int id = 71;
    private Mark mark = new Mark();
    private ArrayList<Mark> lm = new ArrayList<>();

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public ArrayList<Mark> getMark() { return lm; }
    public void setMark(ArrayList<Mark> lm) { this.lm = lm; }

    public Object clone() {
        try {
            Student copy = (Student) super.clone();
            copy.lm = (ArrayList<Mark>) lm.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(
                    "отсутствует Cloneable!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (mark != null ? !mark.equals(student.mark) : student.mark != null) return false;
        return lm != null ? lm.equals(student.lm) : student.lm == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        result = 31 * result + (lm != null ? lm.hashCode() : 0);
        return result;
    }
}