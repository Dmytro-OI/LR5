import java.util.List;
import java.util.Scanner;

//public class RemoveWagonMenu {
//    private List<PassengerTrain> trains;
//
//    public RemoveWagonMenu(List<PassengerTrain> trains) {
//        this.trains = trains;
//    }
//
//    public void removeWagon() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть номер потяга, з якого хочете видалити вагон: ");
//        int trainNumber = Integer.parseInt(scanner.nextLine());
//
//        PassengerTrain train = findTrainByNumber(trainNumber);
//        if (train != null) {
//            System.out.print("Введіть кількість пасажирів вагона для видалення: ");
//            int passengerCount = Integer.parseInt(scanner.nextLine());
//            System.out.print("Введіть кількість багажу вагона для видалення: ");
//            int baggageCount = Integer.parseInt(scanner.nextLine());
//            System.out.print("Введіть рівень комфортності вагона для видалення: ");
//            int comfortLevel = Integer.parseInt(scanner.nextLine());
//
//            Wagon wagonToRemove = new Wagon(passengerCount, baggageCount, comfortLevel);
//            train.removeWagon(wagonToRemove);
//        } else {
//            System.out.println("Потяг з номером " + trainNumber + " не знайдено.");
//        }
//    }
//
//    private PassengerTrain findTrainByNumber(int trainNumber) {
//        for (PassengerTrain train : trains) {
//            if (train.getTrainNumber() == trainNumber) {
//                return train;
//            }
//        }
//        return null;
//    }
//}

class RemoveWagonMenu implements Command {
    @Override
    public void execute() {
        System.out.println("Remove the wagon");
    }
}
