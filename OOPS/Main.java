package OOPS;
class Subject{
    private int subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(int subId, String name){
        this.subId = subId;
        this.name = name;
        this.maxMarks = 100;
    }

    public void setMarks(int marks){
        this.marksObtained = marks;
    }
    @Override
    public String toString(){
        return subId + " " + name + " " + marksObtained;
    }


    

}
class Student{
    private int rollNo;
    private String name ;
    private String department;
    private Subject[] subjects = new Subject[6];
    private int subjectCount = 0;
    // max 6 subjects
    public Student(int rollNo, String name, String department){
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public void add(Subject s){
        if(subjectCount<subjects.length){
            subjects[subjectCount] = s;
            subjectCount++;
        }
        else {
            System.out.println("Reached max subjects!");
        }
    }
    
    public void showSubjects(){
        for(int i = 0; i < subjectCount; i++){
            System.out.println(subjects[i]);
        }
    }


}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"tanishka","cse");
        Subject sub1 = new Subject(801, "GPU Architecture");
    
        s1.add(sub1);
        // the results came

        sub1.setMarks(89);
        s1.showSubjects();
    }
}
