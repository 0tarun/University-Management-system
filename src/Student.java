public class Student {
private int studentID;
private String studentName;
private double studentCGPA;
Student(int studentID,String studentName,double studentCGPA){
   this.studentID=studentID;
   this.studentName=studentName;
   this.studentCGPA=studentCGPA;
}
public int getStudentID(){
    return studentID;
}
    public String getStudentName(){
        return studentName;
    }
    public double getStudentCGPA(){
        return studentCGPA;
    }

    @Override
    public String toString(){

    return "Student{"+"StudentID="+studentID+"  StudentName="+studentName+"  StudentCGPA="+studentCGPA+'}';
    }
}
