import java.util.List;
import java.util.Scanner;

//public class SortWagonsMenu {
//    private List<PassengerTrain> trains;
//
//    public SortWagonsMenu(List<PassengerTrain> trains) {
//        this.trains = trains;
//    }
//
//    public void sortWagons() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть номер потяга для сортування вагонів: ");
//        int trainNumber = Integer.parseInt(scanner.nextLine());
//
//        PassengerTrain train = findTrainByNumber(trainNumber);
//        if (train != null) {
//            train.sortWagonsByComfort();
//            System.out.println("Вагони потяга з номером " + trainNumber + " відсортовано за рівнем комфортності.");
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
class SortWagonsMenu implements Command {
    @Override
    public void execute() {
        System.out.println("The command to sort the wagons");
    }
}
