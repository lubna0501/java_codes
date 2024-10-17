package encap;

public class Student {
    private int roll;
    private String name;

    public void setroll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getroll() {
        return roll;
    }

    public String getname() {
        return name;
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setroll(12);
        s1.setName("ANDROID");
        System.out.println(s1.getroll());
        System.out.println(s1.getname());
    }
}