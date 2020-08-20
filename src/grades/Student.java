package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    public static void main(String[] args) {

        Student rachel = new Student("Rachel");
        rachel.addGrade(33);
        rachel.addGrade(44);
        rachel.addGrade(70);
        rachel.addGrade(85);
        rachel.addGrade(100);
        System.out.println(rachel.getName() + "'s grade avg: " + rachel.getGradeAverage());
    }

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }
        //Return student name
        public String getName() {
            return this.name;
        }

        //adding in the grade to the grades prop
        public void addGrade(int grade){
            this.grades.add(grade);
        }
        public ArrayList<Integer> getGrades(){
            return this.grades;
        }
        //return avg
        public double getGradeAverage() {
            int sum = 0;

            for(double grade: this.grades) {
                sum += grade;
            }
            return (double) sum / this.grades.size();
        }
        public void recordAttendance(String date, String value) {
            this.attendance.put(date, value);
        }
        public HashMap<String, String> getAttendance() {
            return this.attendance;
        }
        public double attendancePercentage() {
            double absences = 0;

            for(String a: this.attendance.values()) {
                if(a.equals("A")) {
                    absences++;
                }
            }
            return ((double) (this.attendance.size() - absences) / this.attendance.size()) * 100;
        }
    }

