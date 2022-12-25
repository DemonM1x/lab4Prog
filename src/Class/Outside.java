package Class;

public class Outside {
    @Override
    public String toString(){
        return "Деревья, туман, вода";
    }
    public static class Home{
        @Override
        public String toString(){
            return "Дом:"+"*Исчезает*";
        }
    }
    public String getWeather(){
        return "Холодная дождливая погода";
    }
}
