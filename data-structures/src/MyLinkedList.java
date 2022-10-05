public class MyLinkedList {
    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            MyListNode node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
        count += 1;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        if (position < 0 || position > count) {
            System.out.println("Cannot insert element!");
            return null;
        }

        MyListNode newNode = new MyListNode(data);
        MyListNode tempNode = head;
        MyListNode preNode = null;
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {

            for (int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }

            newNode.next = preNode.next;
            preNode.next = newNode;
        }


        count += 1;

        return newNode;
    }

    public MyListNode removeElement(int position) {
        if (position < 0 || position > count) {
            System.out.println("Cannot delete element!");
            return null;
        }
        MyListNode deleteNode = head;

        if (position == 0) {
            head = deleteNode.next;
        } else {
            MyListNode beforeDeleteNode = null;
            for (int i = 0; i < position; i++) {
                beforeDeleteNode = deleteNode;
                deleteNode = deleteNode.next;
            }

            beforeDeleteNode.next = deleteNode.next;
        }
        count -= 1;
        return deleteNode;
    }

    public MyListNode getElement(int position) {
        if (position < 0 || position > count) {
            System.out.println("Cannot get Element!");
            return null;
        }

        MyListNode returnNode;
        MyListNode tempNode = head;

        for (int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        returnNode = tempNode;
        return returnNode;
    }

    public void printAll() {
        if(count == 0) {
            System.out.println("출력할 내용없음");
            return;
        }

        MyListNode temp = head;
        while(temp != null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp != null) {
                System.out.print("->");
            }
        }
        System.out.println("");
    }
}
