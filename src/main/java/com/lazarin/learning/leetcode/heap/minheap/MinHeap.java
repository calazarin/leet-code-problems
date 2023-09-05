package com.lazarin.learning.leetcode.heap.minheap;

public class MinHeap {

    private int[] heap;
    private int size = 0;
    private int capacity = 0;

    public MinHeap(int capacity){
        heap = new int[capacity];
        this.capacity = capacity;
    }

    private int getParentIndex(int index){
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index){
        return (index * 2 ) + 1;
    }

    private int getRightChildIndex(int index){
        return (index * 2 ) + 2;
    }

    private boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }

    private boolean hasLeftChild(int index){
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index){
        return getRightChildIndex(index) < size;
    }

    private int getLeftChild(int index){
        return this.heap[getLeftChildIndex(index)];
    }

    private int getRightChild(int index){
        return this.heap[getRightChildIndex(index)];
    }

    private boolean isFull(){
        return capacity == size;
    }

    private int parent(int index){
        return this.heap[getParentIndex(index)];
    }

    private void swap(int index1, int index2){
        int temp = this.heap[index1];
        this.heap[index1] = this.heap[index2];
        this.heap[index2] = temp;
    }

    public void insert(int value){
        if(this.isFull()) return;
        this.heap[size] = value;
        size++;
        this.heapfyUp();
    }

    private void heapfyUp(){
        int last = size - 1;
        while(hasParent(last) && this.parent(last) > this.heap[last]){
            swap(getParentIndex(last), last);
            last = getParentIndex(last);
        }
    }

    public int remove(){
        if(size == 0) return -1;
        int data = heap[0];
        heap[0] = heap[size - 1];
        size--;
        this.heapfyDown();
        return data;
    }

    private void heapfyDown() {
        int index = 0;
        while(this.hasLeftChild(index)){
            int smallestLeftChildIndex = this.getLeftChildIndex(index);
            if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)){
                smallestLeftChildIndex = getRightChildIndex(index);
            }
            if(heap[index] < heap[smallestLeftChildIndex]){
                break;
            } else {
                swap(index, smallestLeftChildIndex);
            }
            index = smallestLeftChildIndex;
        }
    }
}
