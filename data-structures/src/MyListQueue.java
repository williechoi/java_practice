interface Queue{
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();

}

public class MyListQueue extends MyLinkedList implements Queue {
    @Override
    public void enQueue(String data) {

    }

    @Override
    public String deQueue() {
        return null;
    }

    @Override
    public void printQueue() {

    }
}
