package OOPs;

public class Basic {
    public static void main(String[] args) {

        Student S1 = new Student();
        S1.setRno(1);
        S1.name = "Rishab";
        S1.percentage = 92.2;
        System.out.println(S1.getRno());
        System.out.println(S1.name);
        System.out.println(S1.percentage);
        Student S2 = new Student(19 , "Aryan" , 92.4);
        System.out.println(S2.getRno());


    }



}
