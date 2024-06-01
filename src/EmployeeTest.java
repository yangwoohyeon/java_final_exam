public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(2001,07,17);
        Employee employee = new Employee("양우현",birth);
        System.out.println(employee);
    }
}
