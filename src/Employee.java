public class Employee {
    private String name;
    private Date birthDate;

    public Employee(String name, Date birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }

    public String toString(){
        return "name "+name+" birthDate "+birthDate;
    }
}
