package lab_2;

public class Student {
    private int studentId;
    private String name;
    private String department;

    public Student() {
    }

    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
    }
}
