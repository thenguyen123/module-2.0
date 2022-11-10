package ss6.bai_tap_2;

public class Students {
    private String name="Merry";
    private String classes="C08";
    Students(){

    }
    Students(String n,String c){
        this.name=n;
        this.classes=c;
    }
    public void getName(){
        this.name=name;
    }
    public  void setClasses(String classes){
        this.classes=classes;
    }
    public  String getClasses(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String display(){
        return " "+name+"  "+classes;
    }
}
