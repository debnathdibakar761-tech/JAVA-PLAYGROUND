
import java.util.Comparator;
import java.util.PriorityQueue;

        public class StudentPriorityQueue {

            public static void main(String[] args) {

                PriorityQueue<Student> queue =
                        new PriorityQueue<>(new Comparator<Student>() {

                            @Override
                            public int compare(Student s1, Student s2) {

                                return s1.getGrade() - s2.getGrade();
                            }
                        });

                queue.offer(new Student("Prashant", 'B'));
                queue .offer(new Student("Vijay" , 'B') ) ;
                queue.offer(new Student("Rahul", 'B'));
                queue.offer(new Student("Aman", 'B'));
                queue.offer(new Student("Ram", 'B'));

                while (!queue.isEmpty()) {

                    Student s = queue.poll();

                    System.out.println(
                            s.getName() + " : " + s.getGrade());
                }
            }

            static class Student {

                private final String name;
                private final char grade;

                public Student(String name, char grade) {

                    this.name = name;
                    this.grade = grade;
                }

                public String getName() {
                    return name;
                }

                public char getGrade() {
                    return grade;
                }
            }
        }