package practice03;

public class Worker extends Person {
    private int klass;
    public Worker(String name, int age) {
        super(name, age);
        this.klass = klass;
    }
    public int getKlass() {
        return klass;
    }
    @Override
    public String introduce() {

        return String.format("I am a Worker. I have a job.");
    }
}

