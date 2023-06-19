public class Main {
    public static void main(String[] args) {

        int score = 100; // Начальный счет
        int replenishment = 1100; // Сумма пополнения

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int balance = score + replenishment + bonus;

        System.out.println("Итоговый баланс: " + balance + " руб.");
        System.out.println("Количество начисленных бонусов: " + bonus + " руб.");
    }
}