import java.util.ArrayList;
import java.util.Iterator;

public class RemoteControl implements Iterable<String> {
    public ArrayList<String> channels = new ArrayList<String>();

    @Override
    public Iterator<String> iterator() {
        return new RemoteControlIterator(); //we have to return a reference here.
    }

    public class RemoteControlIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < channels.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            String channel = channels.get(index);
            index++;
            return channel;
        }
    }
    public void displayChannel() {
        if (channels.isEmpty()) {
            System.out.println("There is no channel to display.");
        }
        else {
            for (String s : channels) {
                System.out.println(s);
            }
        }
    }

    public void addChannel(String channel) {
        channels.add(channel);
    }
    public void removeChannel(String channel) {
        if (channels.contains(channel)) {
            channels.remove(channel);
            System.out.println(channel + " removed successfully.");
        }
        else {
            System.out.println(channel + " is not found.");
        }
    }
    public int numberOfChannels() {
        return channels.size();
    }
}
