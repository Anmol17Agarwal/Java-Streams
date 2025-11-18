import java.util.*;
import java.util.stream.Collectors;

public class CoderAverageSalary {

    static class Coder{
        int coderId;
        int CoderDept;
        double CoderSalary;

        public Coder(int coderId, int coderDept, double coderSalary) {
            this.coderId = coderId;
            CoderDept = coderDept;
            CoderSalary = coderSalary;
        }

        public int getCoderId() {
            return coderId;
        }

        public void setCoderId(int coderId) {
            this.coderId = coderId;
        }

        public int getCoderDept() {
            return CoderDept;
        }

        public void setCoderDept(int coderDept) {
            CoderDept = coderDept;
        }

        public double getCoderSalary() {
            return CoderSalary;
        }

        public void setCoderSalary(double coderSalary) {
            CoderSalary = coderSalary;
        }

        @Override
        public String toString() {
            return "Coder{" +
                    "coderId=" + coderId +
                    ", CoderDept=" + CoderDept +
                    ", CoderSalary=" + CoderSalary +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 5 Department * 10 CoderEach = 50 Coder

        List<Coder> coderRecord = new ArrayList<>();
        Random random = new Random();
        int coderIdCount=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                double coderSalary = 30000 + random.nextInt(50000);
                coderRecord.add(new Coder(coderIdCount++,i,coderSalary));
            }
        }
        System.out.println(new ArrayList<>(new ArrayList<>(coderRecord)));
        Map<Integer,Double> averageTopTwoSalary =  coderRecord.stream().
                collect(Collectors.groupingBy(
                        Coder::getCoderDept,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list->list.stream()
                                .sorted(Comparator.comparingDouble(Coder::getCoderSalary))
                                .mapToDouble(Coder::getCoderSalary)
                                .limit(2)
                                .average()
                                .orElse(0.0))));

        System.out.println(averageTopTwoSalary);
    }
}
