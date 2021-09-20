
class marks{
    double marks1, marks2, marks3, marks4, marks5, average;

    double average(){

        average=(marks1+marks2+marks3+marks4+marks5)/5;
        return average;
    }
}

public class Students {
    public static void main(String[] args) {

        marks a = new marks();
        a.marks1=80;
        a.marks2=80;
        a.marks3=80;
        a.marks4=80;
        a.marks5=80;
        a.average();
    }
}
