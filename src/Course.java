import java.util.*;

public class Course {

    public static void run() {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "First", 25, Grade.SECONDARY),
                new Student(2, "Second", 20, Grade.PRIMARY),
                new Student(3, "Third", 26, Grade.SECONDARY),
                new Student(4, "Fourth", 23, Grade.SECONDARY),
                new Student(5, "Fourth", 23, Grade.SECONDARY), //duplicate
                new Student(6, "Fifth", 45, Grade.SECONDARY)));

//        List<Student> studentsToRemove = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getAge() > 25) {
//                studentsToRemove.add(student);
//            }
//        }
//        students.removeAll(studentsToRemove);
//        System.out.println(Arrays.toString(students.toArray()));
//
//        students.removeIf(student -> student.getAge() > 25);
//        System.out.println("\nOlder than 25 years old students removed");
//
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }

//        Set<Student> uniqueStudents = new HashSet<>(students);
//        System.out.println(uniqueStudents.size());
//        uniqueStudents.removeIf(us -> Grade.PRIMARY.equals(us.getGrade()));
//        System.out.println(uniqueStudents);
//
//
//        Map<Integer,Student> studentMap= students.stream().collect(Collectors.toMap(Student::getStudentID,student -> student));
//        System.out.println(studentMap.keySet());
//        System.out.println(studentMap.values().toString());
//        studentMap.get(4).changeGradeAndAge(Grade.PRIMARY,43);
//        studentMap.put(4,new Student(4, studentMap.get(4).getName(),99,Grade.SECONDARY));
//
//        System.out.println(studentMap.keySet());
//        System.out.println(studentMap.values().toString());

        //Sorting
        students.forEach(s -> System.out.println(s.getName()));
        students.sort(Comparator.comparing(Student::getName));
        System.out.println();
        students.forEach(s -> System.out.println(s.getName()));
        Optional<Student> optionalStudent = students.stream().filter(student -> student.getGrade().equals(null)).findFirst();

        System.out.println("looking for an optional student...");
        optionalStudent.ifPresent(student -> System.out.println(student.getName()));

    }
}