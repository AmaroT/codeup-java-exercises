package grades;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        //Student list

        Student rachel = new Student("Rachel");
        rachel.addGrade(71);
        rachel.addGrade(77);
        rachel.addGrade(88);
        rachel.recordAttendance("2020-05-28" ,"P");
        rachel.recordAttendance("2020-05-29" ,"P");
        rachel.recordAttendance("2020-05-30" ,"A");
        rachel.recordAttendance("2020-05-31" ,"P");
        rachel.recordAttendance("2020-06-04" ,"A");
        rachel.recordAttendance("2020-05-05" ,"P");

        Student monica = new Student("Monica");
        monica.addGrade(73);
        monica.addGrade(79);
        monica.addGrade(85);
        monica.recordAttendance("2020-05-28" ,"P");
        monica.recordAttendance("2020-05-29" ,"A");
        monica.recordAttendance("2020-05-30" ,"A");
        monica.recordAttendance("2020-05-31" ,"P");
        monica.recordAttendance("2020-06-04" ,"A");
        monica.recordAttendance("2020-05-05" ,"P");

        Student chandler = new Student("Chandler");
        chandler.addGrade(70);
        chandler.addGrade(80);
        chandler.addGrade(100);
        chandler.recordAttendance("2020-05-29" ,"P");
        chandler.recordAttendance("2020-05-30" ,"P");
        chandler.recordAttendance("2020-05-31" ,"P");
        chandler.recordAttendance("2020-06-04" ,"P");
        chandler.recordAttendance("2020-05-05" ,"P");

        Student phoebe = new Student("Phoebe");
        phoebe.addGrade(91);
        phoebe.addGrade(95);
        phoebe.addGrade(100);
        phoebe.recordAttendance("2020-05-28" ,"P");
        phoebe.recordAttendance("2020-05-29" ,"P");
        phoebe.recordAttendance("2020-05-30" ,"P");
        phoebe.recordAttendance("2020-05-31" ,"P");
        phoebe.recordAttendance("2020-06-04" ,"P");
        phoebe.recordAttendance("2020-05-05" ,"P");

        Student joey = new Student("Joey");
        joey.addGrade(55);
        joey.addGrade(69);
        joey.addGrade(83);
        joey.recordAttendance("2020-05-28" ,"A");
        joey.recordAttendance("2020-05-29" ,"P");
        joey.recordAttendance("2020-05-30" ,"A");
        joey.recordAttendance("2020-05-31" ,"P");
        joey.recordAttendance("2020-06-04" ,"A");
        joey.recordAttendance("2020-05-05" ,"A");

        Student ross = new Student("Ross");
        ross.addGrade(84);
        ross.addGrade(93);
        ross.addGrade(97);
        ross.recordAttendance("2020-05-28" ,"P");
        ross.recordAttendance("2020-05-29" ,"A");
        ross.recordAttendance("2020-05-30" ,"A");
        ross.recordAttendance("2020-05-31" ,"P");
        ross.recordAttendance("2020-06-04" ,"P");
        ross.recordAttendance("2020-05-05" ,"P");

        students.put("gitrachel", rachel);
        students.put("gitmonica", monica);
        students.put("gitphoebe", phoebe);
        students.put("gitjoey", joey);
        students.put("gitross", ross);

        String student = "";
        String choice = "";
        boolean validStudentChoice = false;

    //Scanner function for User input

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!\n");

        do {
            do{
                System.out.println("Here are the Github usernames of the class: \n");
                System.out.println("All");



                for(String stu : students.keySet()) {
                    System.out.println(stu);
                }
                System.out.println();
                System.out.println("What student would you like to see more information on?");
                student = input.nextLine();
                System.out.println();

                if(student.equalsIgnoreCase("All")) {
                    System.out.println("Name            | GitHub username  |   GPA                Attendance");

                    double overallGPA = 0;

                    for(String stu : students.keySet()) {
                        Student s = students.get(stu);

                        System.out.printf("%-10s   | %-15s | %-5s | %s%%%n", s.getName(), stu, s.getGradeAverage(), s.attendancePercentage());

//                        Formatter fmt = new Formatter();
//                        fmt.format("%.2f", overallGPA);

                        overallGPA += s.getGradeAverage();
                    }
                    System.out.println();

                    System.out.println("Overall GPA: " + overallGPA / students.size());
                    validStudentChoice = true;
                } else if(!students.containsKey(student)) {
                    System.out.println("Sorry, no student found with the Github username of \"" + student + ".\"");
                    System.out.println();

                    validStudentChoice = false;
                } else {
                    Student s = students.get(student);
                    System.out.println("Name: " + s.getName() + " - Github UserName: " + student);

                    System.out.println("Grades: ");
                    for(int grade: s.getGrades()) {
                        System.out.println("\t" + grade);

                    }
                    System.out.println("Current Average: " + s.getGradeAverage());
                    System.out.println("Attendance: " + s.attendancePercentage() + "%");

                    System.out.println("Days Absent: ");
                    for(String a : s.getAttendance().keySet()){
                        if(s.getAttendance().get(a).equals("A")){
                            System.out.println("\t" + a);
                        }
                    }
                    validStudentChoice = true;
                }
            } while(!validStudentChoice);
            System.out.println();
            System.out.println("Would you like to see another student? [Y/N] ");
            choice = input.nextLine();
            System.out.println();
            if(choice.equalsIgnoreCase("n")) {
                System.out.println("Goodbye, and have a nice day!");
            }
        } while(choice.equalsIgnoreCase("y"));

    }
}
