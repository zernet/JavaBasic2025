package com.gmail.zernetcsgo.hw15;

public class WeekdayAdvisor implements Advisor  {
    @Override
    public void advise(Day day) {
        switch (day) {

            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println(
                    """
                    Порада: плануйте день за правилом 60/20/20 (60 % – ключові завдання, \
                    20 % – навчання, 20 % – перепочинок). Не забувайте про перерви кожні 50 хв.
                    """);

            case FRIDAY -> System.out.println("Happy Friday! Підбийте підсумки тижня й відзначте свої успіхи.");

            case SATURDAY, SUNDAY -> System.out.println(
                    """
                    Вихідні! Рекомендуємо:
                    • прогулянку в парку або невеличкий хайк;
                    • відвідини місцевого музею / галереї;
                    • зустріч із друзями на каву або настільні ігри.
                    Насолоджуйтесь відпочинком!
                    """);
        }
    }
}
