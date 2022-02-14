package groupassinment;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<StudentRecord>Stud=new ArrayList<StudentRecord>();
        while(true){
            System.out.println("Menu Driven Program:");
            System.out.println(".............");
            System.out.println("1.Enter the students upto 5:");
            System.out.println("2.update students:");
            System.out.println("3.delete the students:");
            System.out.println("4.view the students:");
            System.out.println("5.Exit:");
            System.out.println(".......................");
            System.out.println("enter yours choices :");
            String  choice = sc.next();

            switch(choice) {

                case "1":
                    addStudent(Stud);
                    break;
                case "2":
                    updateStudent(Stud);
                    break;
                case "3":
                    deleteStudent(Stud);
                    break;
                case "4":

                    queryStudents(Stud);
                    break;
                case "5":
                    System.out.println("Thank you for your use");
                    break;

                default:
                    System.out.println("Input is wrong");
                    break;

            }
        }
    }

        //add students records



    public static void addStudent(ArrayList<StudentRecord> Stud) {
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);

            int roll;

            while (true) {
                System.out.println("Enter Roll Number:");
                roll = sc.nextInt();

                int index = getIndex(Stud, roll);

                if (index == -1) {

                    break;
                }
            }

            System.out.println("enter yours name::");
            String name = sc.next();
            System.out.println(" enter the School Name:");
            String school = sc.next();

            System.out.println("enter the Student Standard:");
            int grade = sc.nextInt();
            System.out.println(" enter the Student DOB(yyyy/mm/dd):");
            String dob = sc.next();
            System.out.println("enter the Student Gender(M/F):");
            char gender = sc.next().charAt(0);
            System.out.println("Enter the  Science marks of the students :");
            int science = sc.nextInt();
            System.out.println("Enter the marks of the math :");
            int math = sc.nextInt();
            System.out.println("Enter the marks of the java :");
            int java = sc.nextInt();
            System.out.println("enter the marks of the database :");
            int database = sc.nextInt();
            System.out.println("Enter the marks of the business :");
            int business = sc.nextInt();
            int total = science + math + java + database + business;

            StudentRecord s1 = new StudentRecord(name, roll, grade,science, math, java, database, business, total, school, dob, gender);

            Stud.add(s1);

            System.out.println("Added successfully!");
            System.out.println(" ");
            System.out.println(" ");
        }
    }


    public static int getIndex(ArrayList<StudentRecord>Stud, int roll) {

        int index = -1;

        for (int i = 0; i < Stud.size(); i++) {
            StudentRecord s1= Stud.get(i);

            int id = s1.getRoll();
            if (id == roll) {
                index = i;
            }
        }
        return index;
    }

    //to delete the students Records

    public static void deleteStudent(ArrayList<StudentRecord> Stud) {
        System.out.println("Student Roll Number  to delete data:");

        Scanner sc = new Scanner(System.in);
        int deleteroll = sc.nextInt();

        int index = getIndex(Stud, deleteroll);

        if (index == -1) {

            System.out.println("No information, Please re-enter");
        }

        else {

            Stud.remove(index);
            System.out.println("Successfully deleted!");
            System.out.println(" ");
        }
    }

    // to update the students records
    public static void updateStudent(ArrayList<StudentRecord> Stud) {
        System.out.println("Student roll number for data updates:");
        Scanner sc = new Scanner(System.in);
        int updateroll = sc.nextInt();

        int index = getIndex(Stud, updateroll);

        if (index == -1) {

            System.out.println("No information, Please re-enter");
        }

        else {


            System.out.println("Enter new Student Name:");
            String name = sc.next();
            System.out.println("Enter  new Student Roll:");
            int roll = sc.nextInt();
            System.out.println("Enter new School Name:");
            String school = sc.next();
            System.out.println("Enter  new Student Standard:");
            int grade = sc.nextInt();
            System.out.println("Enter  new DOB(YYYY/MM/DD) :");
            String dob = sc.next();
            System.out.println("Gender :");
            char gender = sc.next().charAt(0);
            System.out.println("Enter Science Marks :");
            int science = sc.nextInt();
            System.out.println("Enter java Marks :");
            int java = sc.nextInt();
            System.out.println("Enter Maths Marks :");
            int maths = sc.nextInt();
            System.out.println("Enter database Marks :");
            int database = sc.nextInt();
            System.out.println("Enter business Marks :");
            int business = sc.nextInt();

            int total = science + maths + java + database + business;


            StudentRecord s1 = new StudentRecord(name, roll, grade, science, maths, java, database, business, total, school, dob, gender);

            Stud.set(index, s1);
            System.out.println("Updated successfully!");
            System.out.println("   ");
        }
    }

    // to the view students records


       public static void queryStudents(ArrayList<StudentRecord> Stud) {

        if (Stud.size() == 0) {
            System.out.println("Empty, Please add and query again");
            return;
        }


        for(int i = 0; i < Stud.size(); i++) {
            StudentRecord s1 = Stud.get(i);
            StudentRecord s = new StudentRecord() ;


            System.out.println(" ");
            System.out.println("=============================");
            System.out.println("=============================");
            System.out.println("Marksheet of Grade :" + s1.getGrade() + " , " + s1.getSchool());
            System.out.println("=============================");
            System.out.println("Roll :" + s1.getRoll() + "   " + "Name :" + s1.getName());
            System.out.println("Gender :" + s1.getGender() + "   " + "DOB :" + s1.getDob());
            System.out.println("-----------------------------");
            System.out.println("Subject      Marks");

            System.out.println("-----------------------------");

            System.out.println("Science    :" + s1.getScience());
            System.out.println("maths    :" + s1.getMaths());
            System.out.println("java   :" + s1.getJava());
            System.out.println("database   :" + s1.getDatabase());
            System.out.println("business    :" + s1.getBusiness());
            System.out.println("-----------------------------");
            System.out.println("Total :" + s1.getTotal());
            System.out.println("=============================");
            System.out.println(" ");

        }
    }
}

