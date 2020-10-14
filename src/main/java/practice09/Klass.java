package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
    private List<Student> members = new ArrayList<>();

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

    public void assignLeader(Student leader) {
        if(members.contains(leader)){
            this.setLeader(leader);
        }else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student member) {
        members.add(member);
    }
}
