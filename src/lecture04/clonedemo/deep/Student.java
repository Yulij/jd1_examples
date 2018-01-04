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
}