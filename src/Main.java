import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выбор одежны по температуре воздуха
        System.out.println("Аба ырайы канча градус корсотуп жатат?");
        int temperature = scanner.nextInt();
        if (temperature < 0){
            System.out.println("Кун суук, жылуу кийин.");
        }
        else if (temperature <= 30){
            System.out.println("Кундогудой кийин.");
        }
        else {
            System.out.println("Кун ысык. Женил кийин.");
        }
    }
}