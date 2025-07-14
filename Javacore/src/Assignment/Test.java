package Assignment;

public class Test {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("suba");
        s1.setCity("New York");
        s1.setMarks1(80);
        s1.setMarks2(90);
        s1.setMarks3(85);
        s1.setFeePerMonth(500.0f);
        s1.setIsEligibleForScholarship(true);

        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("vig");
        s2.setCity("New York2");
        s2.setMarks1(70);
        s2.setMarks2(75);
        s2.setMarks3(65);
        s2.setFeePerMonth(450.0f);
        s2.setIsEligibleForScholarship(false);

        Student s3 = new Student();
        s3.setStudentId(3);
        s3.setStudentName("linny");
        s3.setCity("New York3");
        s3.setMarks1(60);
        s3.setMarks2(62);
        s3.setMarks3(58);
        s3.setFeePerMonth(400.0f);
        s3.setIsEligibleForScholarship(true);
        Student[] students={s1,s2,s3};

        //Highest total marks
//        Student top = s1;
//        for(Student s:students)
//            if(s.getTotalMarks()>top.getTotalMarks()) top=s;
//        System.out.println("Top Scorer:" +top.getStudentName());

        s1.getTotalMarks();

        //Lowest fee
        Student lowFee = s1;
        for(Student s: students)
            if(s.getFeePerMonth()< lowFee.getFeePerMonth()) lowFee=s;
        System.out.println("Lowest Fee: "+ lowFee.getStudentName()+"-" +lowFee.getFeePerMonth());

        //print all student info
        System.out.println("\n--- Student Details---");
        for(Student s:students){
            System.out.println("Name: "+ s.getStudentName());
            System.out.println("Total Marks: " +s.getTotalMarks());
            System.out.println("Average: " + s.getAverage());
            System.out.println("Result: "+s.getResult());
            System.out.println("Scholarship:"+s.getIsEligibleForScholarship());
            System.out.println();
        }

    }
}
