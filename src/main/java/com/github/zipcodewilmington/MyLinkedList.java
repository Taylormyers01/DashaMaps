package com.github.zipcodewilmington;

public class MyLinkedList {
    Node head = null;
    static class Node{
        String k;
        Integer v;
        Node next;
        Node(String k, Integer v){
            this.k = k;
            this.v = v;
            next = null;
        }
    }

    public static MyLinkedList add(MyLinkedList list, String k, Integer v){
        Node new_node = new Node(k, v);
        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next !=null){
                last=last.next;
            }
            last.next = new_node;
        }

        return list;
    }
    public static String printList(MyLinkedList list){
        StringBuilder sb = new StringBuilder();
        Node currentNode = list.head;
        sb.append("MyLinkedList: \n");
        while(currentNode != null){
            sb.append(currentNode.k).append("\n").append(currentNode.v).append("\n");
            currentNode = currentNode.next;
        }
        sb.append("\n");
        return sb.toString();
    }
    public static int find(MyLinkedList list, String k){
        Node currentNode = list.head;
        int index = 1;
        if(currentNode.k == k){
            return 0;
        }
        while(currentNode.next != null){
            if(currentNode.next.k == k){
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }
}
