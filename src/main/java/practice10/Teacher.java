package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> linkedList = new LinkedList<>();

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public Klass getKlass() {

        return klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public String introduce() {
        String classes = "";
        for (int index = 0; index < linkedList.size();index++){
            classes += linkedList.get(index).getNumber();
            if(!((linkedList.size() - index) == 1)){
                classes += ", ";
            }
        }
        return linkedList.size() != 0 ? super.introduce() + " I am a Teacher. I teach Class " + classes + "." : super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        if (linkedList.contains( student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName()+ ".";
        }else
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return linkedList.contains(student.getKlass());
    }
}

