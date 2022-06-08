import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        String maxName  = null;
        int leength = 0;
        int difernet;
        while (true) {
            System.out.println("Введите имя с большой буквы:");
            String input = scanner.nextLine();
            String name = input;
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }
            boolean isUpperCase = Character.isUpperCase(name.charAt(0));
            if (isUpperCase == false) {
                System.out.println("Имена нужно вводить с большой буквы!");
                continue;
            }
            if (maxName == null) {
                System.out.println("Это первое введённое имя!");
                maxName = name;
                leength = maxName.length();
            } else {
                if (leength > name.length()) {
                    difernet = maxName.length() - name.length();
                    System.out.println("Самое длинное имя:"+ maxName);
                    System.out.println("Не хватило символов:"+ difernet);
                    continue;
                } else {
                        maxName = name;
                        System.out.println("Самое длинное имя:"+ maxName);
                }

            }


        }
    }
}

