package school;


import java.util.Scanner;     //��Ҫ�����Ǽ��ı�ɨ�衢��ȡ����̨����
public class Test{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Courses a = null ;      //��a���г�ʼ����ֵ
        Student w = new Student(2019310200, "����", 'M');
        System.out.println("ѧ����Ϣ");
        System.out.println(w);
        Teacher b = new Teacher(1, "��", 'M', "ģ��");
        Teacher c = new Teacher(2, "κ", 'M', "��ɢ");
        Teacher d = new Teacher(3, "��", 'W', "�ߴ�");
        System.out.println("��ʦ��Ϣ");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        Courses e = new Courses("ģ��", 7, "207", 2, 2);
        Courses f = new Courses("��ɢ", 8, "300", 2, 3);
        Courses g = new Courses("�ߴ�", 9, "301", 2, 4);
        System.out.println("�γ���Ϣ");
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("������1,2,3����ѡ��: ");
        int x = in.nextInt();        // Scanner ������ȡ�û�������
        if (x == 1) {
            a = e;
            System.out.println("��ѡ��: " + e);
            System.out.println(b);
        } else if (x == 2) {
            a = f;
            System.out.println("��ѡ��: " + f);
            System.out.println(c);
        } else if (x == 3) {
            a = g;
            System.out.println("��ѡ��: " + g);
            System.out.println(d);
        } else {
            System.out.println("δ�鵽�γ�");
        }

        System.out.println(w);
        System.out.println("��ѡ�γ�  "+a);


        System.out.println("������1,2,3�����˿�: ");
        int y = in.nextInt();

        while (x == 1)      //ȷ��ֻ������ѡ�γ�
            if (y == 1) {
                a = e;
                System.out.println("���˿�: " + e);
                System.out.println(b);
                break;
            } else {
                System.out.println("δ�鵽�γ�");
                break;
            }
        while (x == 2)
            if (y == 2) {
                a = f;
                System.out.println("���˿�: " + f);
                System.out.println(c);
                break;
            } else {
                System.out.println("δ�鵽�γ�");
                break;
            }

        while (x == 3)
            if (y == 3) {
                a = g;
                System.out.println("���˿�: " + g);
                System.out.println(d);
                break;
            } else {
                System.out.println("δ�鵽�γ�");
                break;
            }
    }
}