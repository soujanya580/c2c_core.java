package InheritanceExample;

public class Student extends Person {
    private int sid;
    private String course;
    private String dept;


    public Student(String name, int age, String city, int sid, String course, String dept) {
        super(name, age, city); // calling base class constructor
        this.sid = sid;
        this.course = course;
        this.dept = dept;
    }

    public int getSid() { return sid; }
    public void setSid(int sid) { this.sid = sid; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    @Override
    public String toString() {
        return "Student [Name=" + getName() + ", Age=" + getAge() + ", City=" + getCity()
               + ", SID=" + sid + ", Course=" + course + ", Dept=" + dept + "]";
    }
}
