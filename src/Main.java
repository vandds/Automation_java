import check.NewClass;

import java.util.Scanner;
public class Main {
    NewClass a = new NewClass();
    KhoiTao b = new KhoiTao();

    /*
    * Biến cục bộ
    * Biến toàn cục
    * Cách khái báo biến cục bộ
    * */
    public String name;
    public int age;
   // khởi tạo đối tượng
    public Main(String name,Integer age) {
        this.name = name;
        this.age= age;
    }
    // Khởi tạo thuộc tính của đối tượng
    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void setAge(Integer age) {
        this.age= age;
    }
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        KhoiTao kt = new KhoiTao();
        Main Student = new Main("Phạm Đức Văn",24);
        System.out.println("Lấy tên User : "+ Student.getName());
        System.out.println("Lấy tuổi : " + Student.getAge());

        //nhập ký tự tu bàn phím
        System.out.println("Nhập tên muốn set lại cho user: ");
        //khởi tạo đối tượng Scanner để
        Scanner sn = new Scanner(System.in);
        String nameKey = sn.nextLine();
        //Nhận giá trị được nhập từ bàn phím và lưu vào bộ nhớ đệm
        Student.setName(nameKey);

        System.out.println("Nhập tuổi muốn set lại cho user: ");
        int ageKey = Integer.parseInt(sn.nextLine());
        Student.setAge(ageKey);
        System.out.println("Tên mới được sửa lại của user là : " + Student.getName());
        System.out.println("Tên mới được sửa lại của user là : " + Student.getAge());
    }
}