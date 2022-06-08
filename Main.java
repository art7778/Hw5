import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maxName = null;
        int length = 0;
        while (true) {
            System.out.println("Введите имя с большой буквы:");
            String name = scanner.nextLine();
            if ("end".equals(name)) {
                System.out.println("Программа завершена!");
                break;
            }
            boolean isUpperCase = Character.isUpperCase(name.charAt(0));
            if (!isUpperCase) {
                System.out.println("Имена нужно вводить с большой буквы!");
                continue;
            }
            if (maxName == null) {
                System.out.println("Это первое введённое имя!");
                maxName = name;
                length = maxName.length();
            } else {
                if (length > name.length()) {
                    int different = maxName.length() - name.length();
                    System.out.println("Самое длинное имя:" + maxName);
                    System.out.println("Не хватило символов:" + different);
                } else {
                    maxName = name;
                    System.out.println("Самое длинное имя:" + maxName);
                }
            }
        }
    }
}

