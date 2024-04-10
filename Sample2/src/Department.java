
public class Department {
    private String name;
    private String departmentId;
    private final int budget;
    
    //コンストラクター
    public Department(String name, String departmentId, int budget) {
        this.name = name;
        this.departmentId = departmentId;
        this.budget = budget;
    }
    
    //メソッド
    public void meeting() {
        System.out.println(name+"で会議を行います。予算は" + budget + "です。");
    }
    public String getName() {
        return name;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int newBudget) {
        if (newBudget < 0) {
            throw new IllegalArgumentException("予算はマイナスにできません。");
        }
        this.budget = newBudget;
//        System.out.println("新しい予算をセットしました：" + this.budget);
    }
}
