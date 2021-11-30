import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) {
        try {


            ArrayList<Schoolboy> pupils = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("pupils.txt"));
            String w;
            while ((w = reader.readLine()) != null) {
                String[] a = w.trim().split(" ");
                if (a.length < 2) {
                    throw new Exception("No data");
                }
                String name = a[0];
                int age = Integer.parseInt(a[1]);
                ArrayList<Integer> marks = new ArrayList<>();
                for (int i = 2; i < a.length; i++) {
                    marks.add(Integer.parseInt(a[i]));
                }

                if (marks.size() < 4) {
                    throw new Exception("No marks");
                }

                Schoolboy pl = new Schoolboy(name, age, marks);
                pupils.add(pl);

            }


            for (Schoolboy pupil:pupils){
                if (pupil.isScholarship())
                    System.out.println(pupil);
            }


        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException ex) {
            System.err.println("Error data file");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }


    }
}
