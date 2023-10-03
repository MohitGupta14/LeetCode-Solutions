class MyLinkedList {
    private int val;
    private MyLinkedList next;

    public MyLinkedList() {}

    public MyLinkedList(int val) {
        this.val = val;
    }

    public MyLinkedList(int val, MyLinkedList next) {
        this.val = val;
        this.next = next;
    }
    
    private MyLinkedList head = null;
    
    public int get(int index) {
        MyLinkedList temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        return (temp != null) ? temp.val : -1;
    }
    
    public void addAtHead(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        if (head == null) {
            head = newNode;
            return;
        }
        
        MyLinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }
        
        if (index == 0) {
            addAtHead(val);
            return;
        }
        
        MyLinkedList newNode = new MyLinkedList(val);
        MyLinkedList temp = head;
        
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null) {
            return;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        
        if (index == 0) {
            if (head != null) {
                head = head.next;
            }
            return;
        }
        
        MyLinkedList temp = head;
        
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null || temp.next == null) {
            return;
        }
        
        temp.next = temp.next.next;
    }
}
