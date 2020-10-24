package school;


import java.util.Scanner;     //主要功能是简化文本扫描、获取控制台输入
public class Test{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Courses a = null ;      //对a进行初始化赋值
        Student w = new Student(2019310196, "张三", 'M');
        System.out.println("学生信息");
        System.out.println(w);
        Teacher b = new Teacher(1, "周", 'M', "模电");
        Teacher c = new Teacher(2, "魏", 'M', "离散");
        Teacher d = new Teacher(3, "徐", 'W', "线代");
        System.out.println("教师信息");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        Courses e = new Courses("模电", 7, "207", 2, 2);
        Courses f = new Courses("离散", 8, "300", 2, 3);
        Courses g = new Courses("线代", 9, "301", 2, 4);
        System.out.println("课程信息");
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("请输入1,2,3进行选课: ");
        int x = in.nextInt();        // Scanner 类来获取用户的输入
        if (x == 1) {
            a = e;
            System.out.println("已选课: " + e);
            System.out.println(b);
        } else if (x == 2) {
            a = f;
            System.out.println("已选课: " + f);
            System.out.println(c);
        } else if (x == 3) {
            a = g;
            System.out.println("已选课: " + g);
            System.out.println(d);
        } else {
            System.out.println("未查到课程");
        }

        System.out.println(w);
        System.out.println("已选课程  "+a);


        System.out.println("请输入1,2,3进行退课: ");
        int y = in.nextInt();

        while (x == 1)      //确保只能退已选课程
            if (y == 1) {
                a = e;
                System.out.println("已退课: " + e);
                System.out.println(b);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }
        while (x == 2)
            if (y == 2) {
                a = f;
                System.out.println("已退课: " + f);
                System.out.println(c);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }

        while (x == 3)
            if (y == 3) {
                a = g;
                System.out.println("已退课: " + g);
                System.out.println(d);
                break;
            } else {
                System.out.println("未查到课程");
                break;
            }
    }
}
