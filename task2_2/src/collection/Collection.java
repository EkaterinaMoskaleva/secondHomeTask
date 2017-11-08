package collection;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class Collection {
    // class student реализует станд. интерфейс сравнения
    static class Student implements Comparable<Student> {
        private int id, age;
        private String firstName, lastName;

        // constructor
        public Student(int id, String lastName, String firstName, int age) {
            this.id = id;
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // getter
        public int getId() { return this.id; }
        public int getAge() { return this.age; }
        public String getFirstName() { return this.firstName; }
        public String getLastName() { return this.lastName; }

        // пер. method toString
        public String toString() { return this.getLastName() + " " + this.getFirstName() + "{" + this.getAge() + "}"; }

        // обязат. испол. функции интерфейса Comparable
        public int compareTo(Student o) {
            if (o == null) return 1;
            if (o.getAge() > this.getAge()) return -1;
            if (o.getAge() < this.getAge()) return 1;
            return 0;
        }
    }

    // вывод студентов, чьи фамилии начинаются на од. букву
    public static List<Student> filter(List<Student> list, String prefix) {
        List<Student> result = new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).getLastName().startsWith(prefix)) result.add(list.get(i));
        }
        return result;
    }

    // average age
    public static float getAverage(List<Student> list) {
        float acc = 0.0f;
        for (Student student : list) {
            acc += student.getAge();
        }
        return acc / list.size();
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12,"Ryshova","Karina",214));
        students.add(new Student(13,"Petrov", "Oleg",32));
        students.add(new Student(14, "Stasov", "Petr", 20));
        students.add(new Student(15,"Moskaleva","Katy",24));
        students.add(new Student(16,"Babul", "Igor",28));
        students.add(new Student(17, "Cvetkova", "Olya", 26));
        students.add(new Student(18,"Sved","Tom",15));
        students.add(new Student(19,"Oxxxy", "Myrom",45));
        students.add(new Student(20, "Shevnova", "Svetlana", 35));
        students.add(new Student(21, "Ovdeev", "Victor", 25));

        Collections.sort(students);
        System.out.println(students);

        System.out.println(getAverage(students));

        System.out.print("Enter any letter:");
        Scanner let = new Scanner(System.in);
        String letter = let.next();
        System.out.println(letter);
        System.out.println(filter(students, letter));
    }




}