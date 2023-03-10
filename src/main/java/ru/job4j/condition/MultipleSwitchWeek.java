package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 1;
            case "Среда", "Wednesday" -> 1;
            case "Четверг", "Thursday" -> 1;
            case "Пятница", "Friday" -> 1;
            case "Суббота", "Saturday" -> 1;
            case "Воскресенье", "Sunday" -> 1;
            default -> -1;
        };
    }

    public static void main(String[] args)  {
        System.out.println(numberOfDay("Tuesday"));
        System.out.println(numberOfDay("Пятница"));
        System.out.println(numberOfDay("Тяпница"));
    }
}