class DynamicArray {
    private int size;
    private int capacity;
    private int[] arr;

    public DynamicArray(int capacity) {
        if (capacity > 0){
            this.capacity = capacity;
            this.arr = new int[capacity];
        }
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == arr.length){
            resize();
        }
        set(size,n);
        size +=1;
    }

    public int popback() {
        int temp = arr[size-1];
        size -= 1;
        return temp;
    }

    private void resize() {
        capacity *= 2;
        int[] temp = new int[capacity];
        for (int i=0; i< arr.length; i++){
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
