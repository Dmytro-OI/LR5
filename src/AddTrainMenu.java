import java.util.List;
import java.util.Scanner;

//public class AddTrainMenu {
//    private List<PassengerTrain> trains;
//
//    public AddTrainMenu(List<PassengerTrain> trains) {
//        this.trains = trains;
//    }
//
//    public void addTrain() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть номер потяга: ");
//        int trainNumber = Integer.parseInt(scanner.nextLine());
//
//        PassengerTrain newTrain = new PassengerTrain(trainNumber);
//        trains.add(newTrain);
//        System.out.println("Потяг з номером " + trainNumber + " додано.");
//    }
//}
class AddTrainMenu implements Command {
    @Override
    public void execute() {
        System.out.println("Adding the train is in progress");
    }
}
