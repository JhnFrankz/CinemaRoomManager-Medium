import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());
        final int java = 1;
        final int kotlin = 2;
        final int scala = 3;
        final int python = 4;

        switch (option) {
            case java:
                System.out.println("Yes!");
                break;
            case kotlin:
            case scala:
            case python:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}