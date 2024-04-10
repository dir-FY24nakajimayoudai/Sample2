
public class Employee {
    //フィールド
    protected String name;
    private final String department;
    private final String position;
    private final int employeeId;
    
    //コンストラクター
    public Employee(String hikisuuName, String hikisuuDepartment, String hikisuuPosition, int hikisuuEmployeeId) {
        this.name = hikisuuName;
        this.department = hikisuuDepartment;
        this.position = hikisuuPosition;
        this.employeeId = hikisuuEmployeeId;
    }
    
    //メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告");
        System.out.println("役職：" + position);
        System.out.println("名前：" + name);
    }
    
    //オーバーロードしたメソッド
    public void report() {
        report(1);
    }
    
    //クラスを関連させたメソッド
    public void joinMeeting() {
        department.meeting();
        System.out.println("上記の予算が" + department.getBudget() + "しかない" + department.getName() + "の会議に出席します");
        System.out.println("------------------");
    }
}
