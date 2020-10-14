package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {

        return klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else
            return super.introduce() + String.format(" I am a Teacher. I teach " + klass.getDisplayName() + ".");
    }
    public String introduceWith(Student student) {
        if (this.getKlass().getNumber() == student.getKlass().getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName()+ ".";
        }else
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}

