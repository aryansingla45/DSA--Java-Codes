package OOPs;

public class Student {
    private int rno;
    String name;
    double percentage;

    public Student(){

    }
    //Constructor
    public Student(int rno, String name, Double percentage) {
        this.rno = rno;
        this.name = name;
        this.percentage = percentage;
    }

    // Getter and Setter if Constructor is not used
    public void setRno(int rno) {
        this.rno = rno;                    //this keyword
    }

    public int getRno() {
        return rno;
    }


}






