package Assignment;

public class Student {
    private int studentId, marks1, marks2, marks3;
    private String studentName, city;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    //Setters
    public void setStudentId(int id) {studentId = id;}

    public void setStudentName(String name) {studentName = name;}

    public void setCity(String city) {this.city = city;}

    public void setMarks1(int m1) {marks1 = m1;}

    public void setMarks2(int m2) {marks2 = m2;}

    public void setMarks3(int m3) {marks3 = m3;}

    public void setFeePerMonth(float fee) {feePerMonth = fee;}

    public void setIsEligibleForScholarship(boolean flag) {isEligibleForScholarship = flag;}

    //Getters
    public int getStudentId() {return studentId;}

    public String getStudentName() {return studentName;}

    public String getCity() {return city;}

    public int getMarks1() {return marks1;}

    public int getMarks2() {return marks2;}

    public int getMarks3() {return marks3;}

    public float getFeePerMonth() {return feePerMonth;}

    public boolean getIsEligibleForScholarship() {return isEligibleForScholarship;}

    //custom methods
 public float getAnnulFee(){
        return feePerMonth * 12;
}
public int getTotalMarks(){
        return marks1 + marks2 + marks3;
}
public float getAverage(){
        return getTotalMarks() / 3f;
}
public String getResult(){
        return (marks1 > 60 && marks2 > 60 && marks3 >60) ? "pass" : "fail" ;
}
}


