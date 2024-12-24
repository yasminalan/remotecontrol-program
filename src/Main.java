import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Remote Control Program.....");
        String operations = "Operations\n" +
                "1. Operation = Show channels\n" +
                "2. Operation = Add channel\n" +
                "3. Operation = Remove channel\n" +
                "4. Operation = Display the number of channels" +
                "Press q to exit.";

        Scanner scanner = new Scanner(System.in);

        RemoteControl remoteControl = new RemoteControl(); //We should not define the remote control reference
        //inside the loop. Otherwise a new reference is created every time the loop iterates.

//        Iterator<String> iterator = remoteControl.iterator(); //When we want to use the iterator that we created.
//        remoteControl.channels.add("FM");
//        remoteControl.channels.add("Channel101");
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        while(true) {
            System.out.println("*********************");
            System.out.println(operations);
            System.out.println("Please enter the operation that you'd like to perform.");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Closing the program");
                break;

            } else if (operation.equals("1")) {
                remoteControl.displayChannel();

            } else if (operation.equals("2")) {
                System.out.println("Please enter the channel you want to add");
                String newChannel = scanner.nextLine();
                remoteControl.addChannel(newChannel);

            } else if (operation.equals("3")) {
                System.out.println("Please enter the channel that you want to remove");
                String channelToBeDeleted = scanner.nextLine();
                remoteControl.removeChannel(channelToBeDeleted);

            } else if (operation.equals("4")) {
                System.out.println("Number of channels: " + remoteControl.numberOfChannels());

            } else {
                System.out.println("Invalid operation entered.");
            }
        }
    }
}