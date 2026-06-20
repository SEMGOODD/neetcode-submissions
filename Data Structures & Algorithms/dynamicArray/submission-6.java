class DynamicArray {
    private int size;
    private int[] arr;

    public DynamicArray(int capacity) {
        if (capacity > 0){
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
        this.arr[size] = n;
        size +=1;
    }

    public int popback() {
        int temp = arr[size-1];
        size -= 1;
        return temp;
    }

    private void resize() {
        this.arr = java.util.Arrays.copyOf(this.arr, this.arr.length * 2);
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.arr.length;
    }
}
