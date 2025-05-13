package exception;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Exception 통합 테스트 ===");
        System.out.println("1. ArithmeticException (0으로 나누기)");
        System.out.println("2. InputMismatchException (문자 입력)");
        System.out.println("3. NullPointerException (null 참조)");
        System.out.println("4. ArrayIndexOutOfBoundsException (배열 인덱스 초과)");
        System.out.println("5. FileNotFoundException (없는 파일 열기)");
        System.out.print("번호를 선택하세요: ");

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
                    System.out.println("잘못된 번호입니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력하세요!");
        }

        System.out.println("=== 프로그램 종료 ===");
    }

    public static void testArithmeticException() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : 0으로 나눌 수 없습니다.");
        }
    }

    public static void testInputMismatchException() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("숫자를 입력하세요: ");
            int num = sc.nextInt();
            System.out.println("입력한 숫자: " + num);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException : 숫자가 아닌 값을 입력했습니다.");
        }
    }

    public static void testNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException : null 값을 참조했습니다.");
        }
    }

    public static void testArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : 배열 인덱스를 벗어났습니다.");
        }
    }

    public static void testFileNotFoundException() {
        try {
            FileReader fr = new FileReader("notfound.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException : 파일을 찾을 수 없습니다.");
        }
    }
}