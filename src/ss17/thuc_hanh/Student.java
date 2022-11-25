package ss17.thuc_hanh;

public class Student {
    private String name;
    private String module;
    private int id;
    public Student(){}

    public Student(String name, String module, int id) {
        this.name = name;
        this.module = module;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }public String writeFile(){
        return this.name+ "," +this.module+ ", "+ this.id;

    }
}
