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

        // Система оценивания
        System.out.println("Канча балл алдыныз?");
        float score = scanner.nextFloat();

        if (score >= 90 && score <=  100){
            System.out.println("5 деген баа коюлду.");
        } else if (score >= 70 && score <= 89) {
            System.out.println("4 деген баа коюлду.");
        } else if (score >= 50 && score <= 69){
            System.out.println("3 деген баа коюлду.");
        } else if (score >= 0 && score <= 49){
            System.out.println("2 деген баа коюлду.");
        } else {
            System.out.println("Максималдуу балл 100!");
        }

    }
}