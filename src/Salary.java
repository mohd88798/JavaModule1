public class Salary {
    public static void main(String[] args) {

        double DA,HRA,CCA=240,PF, PT=100,basic=25000, gross, net;
        DA= basic*(.7);

        PF= basic*(.1);

        HRA= basic*(.3);

        gross= DA+HRA+CCA+basic;
        net= gross-PF-PT;

        System.out.println("Gross and Net Salary is "+gross +"  "+ net);
    }
}
