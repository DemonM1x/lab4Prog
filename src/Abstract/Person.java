package Abstract;

public abstract class Person {
    protected String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getName() + ": ";
    }
}
