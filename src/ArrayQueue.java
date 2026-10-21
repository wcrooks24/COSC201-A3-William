public class ArrayQueue<T> {
  private T[] arr;
  private int front;
  private int size;

  public ArrayQueue(int capacity) {
      arr = (T[]) new Object[capacity];
      front = 0;
      size = 0;
  }

  public void enqueue(T data){
    if (size == arr.length) {
        throw new IllegalStateException("Queue is full");
    }
    int rear = (front + size) % arr.length;
    arr[rear] = data;
    size++;
  }
  public T dequeue() {
    if (isEmpty()) {
        throw new IllegalStateException("Queue is empty");
    }
    T data = arr[front];
    front = (front + 1) % arr.length;
    size--;
    return data;
  }

  public T front() {
      if (isEmpty()) {
          throw new IllegalStateException("Queue is empty");
      }
      return arr[front];
  }

  public boolean isEmpty() {
      return size == 0;
    }
  
  public int size() {
      return size;
    }
  
  

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
        queue.enqueue(32);
        queue.enqueue(4);
        queue.enqueue(594);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue());
    }
}