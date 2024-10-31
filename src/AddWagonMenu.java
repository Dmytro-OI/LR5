import java.util.List;
import java.util.Scanner;

//public class AddWagonMenu {
//    private List<PassengerTrain> trains;
//
//    public AddWagonMenu(List<PassengerTrain> trains) {
//        this.trains = trains;
//    }
//
//    public void addWagon() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть номер потяга, до якого хочете додати вагон: ");
//        int trainNumber = Integer.parseInt(scanner.nextLine());
//
//        PassengerTrain train = findTrainByNumber(trainNumber);
//        if (train != null) {
//            System.out.print("Введіть кількість пасажирів: ");
//            int passengerCount = Integer.parseInt(scanner.nextLine());
//            System.out.print("Введіть кількість багажу: ");
//            int baggageCount = Integer.parseInt(scanner.nextLine());
//            System.out.print("Введіть рівень комфортності: ");
//            int comfortLevel = Integer.parseInt(scanner.nextLine());
//
//            Wagon newWagon = new Wagon(passengerCount, baggageCount, comfortLevel);
//            train.addWagon(newWagon);
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
class AddWagonMenu implements Command {
    @Override
    public void execute() {
        System.out.println("Adding a wagon is in progress");
    }
}
