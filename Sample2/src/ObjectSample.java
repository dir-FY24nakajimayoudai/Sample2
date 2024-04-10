
public class ObjectSample {

    public static void main(String[] args) {
       Employee emp1 = new Employee("中島","新人部", "えらい", 100);
       System.out.println(emp1.department);
       emp1.department = "人事部";
       System.out.println(emp1.department);
    }

}
