package homework1.practice4.number1;

public enum Season {

    WINTER(1, "Cold season") {

        public String getDescription() {
            return "Холодное время года";
        }
    } ,
    SPRING(10, "Green season"),
    SUMMER(20, "Hot season") {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8, "Rainy season");

    private int temp;
    private String description;
    Season(int temp, String des) {
        this.temp = temp;
        this.description = des;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return description;
    }

    public void printSeason() {
        switch (this) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("");

        }
    }


}
