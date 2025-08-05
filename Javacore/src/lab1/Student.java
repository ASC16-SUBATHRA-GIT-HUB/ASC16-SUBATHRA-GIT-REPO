package lab1;

public class Student {
    int studentId;
    String studentName;
    String city;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    boolean isEligibleForScholarship;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public boolean isEligibleForScholarship() {
        return isEligibleForScholarship;
    }

    public void setEligibleForScholarship(boolean eligibleForScholarship) {
        isEligibleForScholarship = eligibleForScholarship;
    }


public float getAnnualFee(float feePerMonth) {
    return feePerMonth *12;
}

public int getTotalMarks(int marks1,int marks2,int marks3){
        return marks1+marks2+marks3;
}
public int getAverage(int marks1,int marks2,int marks3){
        return marks1+marks2+marks3/3;
}
public String getResult(int marks1,int marks2,int marks3){
        if(marks1>60&& marks2>60 && marks3>60){
            return "pass";

        }
        else {
            return "Fail";
        }
}

    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.getAverage(50,80,90));
        Student s2=new Student();
        System.out.println(s2.getAnnualFee(10));
        Student s3=new Student();
        System.out.println(s3.getTotalMarks(80,90,70));
        Student s4=new Student();
        System.out.println(s4.getResult(90,80,50));
        Student s5=new Student();
    }
}

