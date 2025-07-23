package _04_Trees.trees.heap.max_heap_construction;

public class MaxHeap {
    int[] heap;
    int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void siftUp(int index) {
        // as long as the child (heap[index]) is bigger than the parent (heap[index-1]/2)
        while(index > 0 && (heap[index] > heap[index-1]/2)) {
            int parentIndex = (index-1)/2;
            int tmp = heap[index];
            heap[index] = heap[parentIndex];
            heap[parentIndex] = tmp;

            index = parentIndex;
        }
    }

    public void siftDown(int index) {
        // we need to compare largest (the parent) with left and right until all his children are smaller and the parent is the biggest
        while (2 * index + 1 < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int largest = index;

            if (leftChild < size && heap[leftChild] > heap[largest]) {
                largest = leftChild;
            }

            if (rightChild < size && heap[rightChild] > heap[largest]) {
                largest = rightChild;
            }

            if (largest == index) {
                break;
            }

            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;

            index = largest;
        }
    }


    public int extractMax() {
        int result = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return result;
    }

    public int getMax() {
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int value) {
        heap[size] = value;
        siftUp(size);
        size++;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);

        int[] values = {
            100, 90, 85, 80, 75, 70, 65,
            60, 55, 50, 45, 40, 35, 30, 25,
            20, 15, 10
        };

        for (int val : values) {
            maxHeap.insert(val);
        }

        // for (int i = 0; i < maxHeap.size; i++) {
        //     System.out.print(maxHeap.heap[i] + " ");
        // }
        // System.out.println();

        maxHeap.insert(92);

        for (int i = 0; i < maxHeap.size; i++) {
            System.out.print(maxHeap.heap[i] + " ");
        }
    }
}