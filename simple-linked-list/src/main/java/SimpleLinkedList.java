import java.util.NoSuchElementException;
import java.lang.reflect.Array;
class SimpleLinkedList<T> {
    class Node<T>{
        T value;
        Node<T> next;
    }

    Node<T> head = null;
    int size=0;

    SimpleLinkedList() {
    }

    SimpleLinkedList(T[] values) {
        for (T value : values ) {
            push(value);
        }
    }

    void push(T value) {
        Node<T> element = new Node<T>();
        element.value=value;
        element.next=head;
        head=element;
        size++;
    }

    T pop() throws NoSuchElementException {
        if (head==null){
            throw new NoSuchElementException();
        }
        T value=head.value;
        head=head.next;
        size--;
        return value;
    }

    void reverse() {
        Node<T> following=head;
        Node<T> prev=null;
        Node<T> current=head;
        while(current!=null){
            following=following.next;
            current.next=prev;
            prev=current;
            current=following;
        }
        head=prev;
    }

    T[] asArray(Class<T> clazz) {
        T[] array = (T[])Array.newInstance(clazz,size());
        Node<T> element = head;
        for (int i = 0; element!=null; element=element.next,  i++) {
            array[i]= element.value;
        }
        return array;
    }

    int size() {
        return size;
    }
}
