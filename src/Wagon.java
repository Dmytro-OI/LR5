import java.util.Objects;

//public class Wagon {
//    private int passengerCount;   // Кількість пасажирів
//    private int baggageCount;      // Кількість багажу
//    private int comfortLevel;      // Рівень комфортності
//
//    public Wagon(int passengerCount, int baggageCount, int comfortLevel) {
//        this.passengerCount = passengerCount;
//        this.baggageCount = baggageCount;
//        this.comfortLevel = comfortLevel;
//    }
//
//    public int getPassengerCount() {
//        return passengerCount;
//    }
//
//    public int getBaggageCount() {
//        return baggageCount;
//    }
//
//    public int getComfortLevel() {
//        return comfortLevel;
//    }
//
//    public void displayInfo() {
//        System.out.println("Вагон: пасажирів - " + passengerCount + ", багажу - " + baggageCount + ", комфортність - " + comfortLevel);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Wagon)) return false;
//        Wagon wagon = (Wagon) o;
//        return passengerCount == wagon.passengerCount && baggageCount == wagon.baggageCount && comfortLevel == wagon.comfortLevel;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(passengerCount, baggageCount, comfortLevel);
//    }
//}
