package _02_data_structures.trees.heap.max_heap_construction;

public class MaxHeap {
    int[] heap;
    int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void siftUp(int index) {
        // cat timp copilul (heap[index]) este mai mare decat parintele (heap[index-1]/2)
        while(index > 0 && (heap[index] > heap[index-1]/2)) {
            int parentIndex = (index-1)/2;
            int tmp = heap[index];
            heap[index] = heap[parentIndex];
            heap[parentIndex] = tmp;

            index = parentIndex;
        }
    }

    public void siftDown(int index) {
        // trebuie sa compar largest (parintele) cu stanga si cu dreapta pana cand copii lui sunt mai mici ambii si parintele lor este mai mare
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

        int[] values = {100, 90, 85, 80, 75, 70, 65,
                        60, 55, 50, 45, 40, 35, 30,
                        25, 20, 15, 10};

        for (int val : values) {
            maxHeap.insert(val);
        }

        maxHeap.insert(92);

        // for (int i = 0; i < maxHeap.size; i++) {
        //     System.out.print(maxHeap.heap[i] + " ");
        // }
        maxHeap.insert(92);
        for (int i = 0; i < maxHeap.size; i++) {
            System.out.print(maxHeap.heap[i] + " ");
        }
    }
}