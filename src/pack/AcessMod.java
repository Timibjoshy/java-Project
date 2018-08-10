package pack;

/**
 * Created by expert on 6/29/18.
 */
public class AcessMod {
    private int studentid;
    public String studentname;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int mark;//provide getter and setter method by right click and select generate then select getter and setter option

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
}
//protected variables & function are acessbile in same package only
//public variables & function can be acessed anywhere
