import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//public class PassengerTrain {
//    private int trainNumber;                   // Номер потяга
//    private List<Wagon> wagons;                // Список вагонів
//
//    public PassengerTrain(int trainNumber) {
//        this.trainNumber = trainNumber;
//        this.wagons = new ArrayList<>();
//    }
//
//    public void addWagon(Wagon wagon) {
//        wagons.add(wagon);
//        System.out.println("Вагон додано до потяга з номером " + trainNumber);
//    }
//
//    public void removeWagon(Wagon wagon) {
//        if (wagons.remove(wagon)) {
//            System.out.println("Вагон видалено з потяга з номером " + trainNumber);
//        } else {
//            System.out.println("Вагон не знайдено в потязі з номером " + trainNumber);
//        }
//    }
//
//    public int calculateTotalPassengers() {
//        int totalPassengers = 0;
//        for (Wagon wagon : wagons) {
//            totalPassengers += wagon.getPassengerCount();
//        }
//        return totalPassengers;
//    }
//
//    public int calculateTotalBaggage() {
//        int totalBaggage = 0;
//        for (Wagon wagon : wagons) {
//            totalBaggage += wagon.getBaggageCount();
//        }
//        return totalBaggage;
//    }
//
//    public int getTrainNumber() {
//        return trainNumber;
//    }
//
//    public List<Wagon> getWagons() {
//        return wagons;  // Повертає список вагонів
//    }
//
//    public void displayTrainInfo() {
//        System.out.println("Потяг номер: " + trainNumber);
//        System.out.println("Вагони:");
//        for (Wagon wagon : wagons) {
//            wagon.displayInfo();
//        }
//        System.out.println("Загальна кількість пасажирів: " + calculateTotalPassengers());
//        System.out.println("Загальна кількість багажу: " + calculateTotalBaggage());
//    }
//
//    public void sortWagonsByComfort() {
//        Collections.sort(wagons, new Comparator<Wagon>() {
//            @Override
//            public int compare(Wagon w1, Wagon w2) {
//                return Integer.compare(w1.getComfortLevel(), w2.getComfortLevel());
//            }
//        });
//    }
//}
