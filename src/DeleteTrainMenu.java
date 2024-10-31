import java.util.List;
import java.util.Scanner;

//public class DeleteTrainMenu {
//    private List<PassengerTrain> trains;
//
//    public DeleteTrainMenu(List<PassengerTrain> trains) {
//        this.trains = trains;
//    }
//
//    public void deleteTrain() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть номер потяга, який хочете видалити: ");
//        int trainNumber = Integer.parseInt(scanner.nextLine());
//
//        PassengerTrain trainToDelete = findTrainByNumber(trainNumber);
//        if (trainToDelete != null) {
//            trains.remove(trainToDelete);
//            System.out.println("Потяг з номером " + trainNumber + " видалено.");
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

public class DeleteTrainMenu implements Command{
    @Override
    public void execute() {
        System.out.println("Delete Train");
    }
}