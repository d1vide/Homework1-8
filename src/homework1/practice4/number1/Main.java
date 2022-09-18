package homework1.practice4.number1;

public class Main {
    public static void main(String[] args) {
        Season season1 = Season.SPRING;
        System.out.println(season1);
        season1.printSeason();

        Season season2 = Season.SUMMER;
        System.out.println(season2.getDescription());
        for (Season s : Season.values()) {
            System.out.println(s + " Описание:" + s.getDescription() + " | Температура:" + s.getTemp() + "\n");
        }
    }
}
