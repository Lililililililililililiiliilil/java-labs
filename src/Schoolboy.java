import java.util.List;
import java.util.TreeMap;

public class Schoolboy extends Person {
    private List<Integer> academic_performance;


    public Schoolboy(String name, int age, List<Integer> academic_performance) throws Exception {
        super(name, age);

        for (int i = 0; i < 2; i++) {
            if (!(academic_performance.get(i) > 1 && academic_performance.get(i) < 6))
                throw new Exception("Incorrect mark " + academic_performance.get(i));
        }

        this.academic_performance = academic_performance;

    }

    private void setAcademic_performance(List<Integer> academic_performance) throws Exception {
        for (int i = 0; i < 2; i++) {
            if (!(academic_performance.get(i) > 1 && academic_performance.get(i) < 6))
                throw new Exception("Incorrect mark " + academic_performance.get(i));
        }

        this.academic_performance = academic_performance;

    }

    public List<Integer> getAcademic_performance() {
        return this.academic_performance;
    }


    @Override
    public boolean isScholarship() {
        return ((academic_performance.get(0) + academic_performance.get(1) == 10) & ((academic_performance.get(2) > 0 && academic_performance.get(2) < 4) || (academic_performance.get(3) > 0)));


    }


    @Override
    public String toString() {
        return "Name: " + this.getName();

    }
}