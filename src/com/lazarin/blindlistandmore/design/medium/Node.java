package com.lazarin.blindlistandmore.design.medium;

public class Node {
    public Integer key;
    public Integer value;
    public Node prev;
    public Node next;

    public Node(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }
}
