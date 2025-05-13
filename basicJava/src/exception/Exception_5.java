package exception;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Exception ���� �׽�Ʈ ===");
        System.out.println("1. ArithmeticException (0���� ������)");
        System.out.println("2. InputMismatchException (���� �Է�)");
        System.out.println("3. NullPointerException (null ����)");
        System.out.println("4. ArrayIndexOutOfBoundsException (�迭 �ε��� �ʰ�)");
        System.out.println("5. FileNotFoundException (���� ���� ����)");
        System.out.print("��ȣ�� �����ϼ���: ");

        try {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    testArithmeticException();
                    break;
                case 2:
                    testInputMismatchException();
                    break;
                case 3:
                    testNullPointerException();
                    break;
                case 4:
                    testArrayIndexOutOfBoundsException();
                    break;
                case 5:
                    testFileNotFoundException();
                    break;
                default:
                    System.out.println("�߸��� ��ȣ�Դϴ�.");
            }
        } catch (InputMismatchException e) {
            System.out.println("���ڸ� �Է��ϼ���!");
        }

        System.out.println("=== ���α׷� ���� ===");
    }

    public static void testArithmeticException() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : 0���� ���� �� �����ϴ�.");
        }
    }

    public static void testInputMismatchException() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("���ڸ� �Է��ϼ���: ");
            int num = sc.nextInt();
            System.out.println("�Է��� ����: " + num);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException : ���ڰ� �ƴ� ���� �Է��߽��ϴ�.");
        }
    }

    public static void testNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException : null ���� �����߽��ϴ�.");
        }
    }

    public static void testArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : �迭 �ε����� ������ϴ�.");
        }
    }

    public static void testFileNotFoundException() {
        try {
            FileReader fr = new FileReader("notfound.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException : ������ ã�� �� �����ϴ�.");
        }
    }
}