package groupassinment;

public class StudentRecord {
    private String name;
    private int roll;
    public int grade;
    public int science;
    public int maths;
    public int java;
    public int database;
    public int business;
    public int total;
    public String school;
    public String dob;
    public char gender;

    public StudentRecord() {

    }

    //constructor
    public StudentRecord(String name, int roll, int grade, int science, int maths, int java, int database, int business, int total, String school, String dob, char gender) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
        this.science = science;
        this.maths = maths;
        this.java = java;
        this.database = database;
        this.business = business;
        this.total = total;
        this.dob = dob;
        this.gender = gender;
        this.school=school;
    }


    //getter and setter
    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getScience() {
        return science;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getMaths() {
        return maths;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getJava() {
        return java;
    }

    public void setDatabase(int database) {
        this.database = database;
    }

    public int getDatabase() {
        return database;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public int getBusiness() {
        return business;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

}


