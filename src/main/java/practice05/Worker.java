package practice05;

public class Worker extends Person {
    private int klass;
    public Worker(String name, int age) {
        super(name, age);
        this.klass = klass;
    }
    public int getKlass() {

        return klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Worker. I have a job.";
    }
}

