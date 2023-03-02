public class Course {
    private String courseID;
    private String courseTitle;
    private double credit;
    private Student[] studentList=new Student[10];
    private int numberOfStudent=0;
    private Faculty faculty;

   public Course(String courseID,String courseTitle,double credit){
      this.courseID=courseID;
      this.courseTitle=courseTitle;
      this.credit=credit;
    }
   public String toString(){
       return "Course{"+"courseID="+courseID+"  courseTitle="+courseTitle+"  credit="+credit+'}';
   }
   public void addStudent(Student S){
       studentList[numberOfStudent++]=S;
   }
   public void dropStudent(int ID){
      for(int i=0;i<numberOfStudent;i++) {
          if(ID==studentList[i].getStudentID()){

          }
      }
      numberOfStudent--;
   }
   public void addFaculty(Faculty f){
       faculty=f;
   }
   public void dropfaculty(){
       faculty=null;
   }
   public void PrintStudentList(){
       for(int i=0;i<numberOfStudent;i++){
           System.out.println(studentList[i].toString());
       }
   }
}
