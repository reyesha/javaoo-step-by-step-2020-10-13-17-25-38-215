package practice08;

public class Klass {
    int number;
    Student leader;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return String.format("Class %s",number);
    }

    public void assignLeader(Student student) {
        this.setLeader(student);
    }
}
