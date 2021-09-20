public class Students {
    public static void main(String[] args) {
        marks z = new marks(80,80,80,80,80);

        double average;

        average=(z.marks1 + z.marks2 + z.marks3 + z.marks4 + z.marks5) / 5;

        System.out.println("Average = "+average);
    }

}
