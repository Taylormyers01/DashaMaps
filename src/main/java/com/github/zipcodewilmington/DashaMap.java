package com.github.zipcodewilmington;

import static com.github.zipcodewilmington.MyLinkedList.*;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements  HashMapX{
    static MyLinkedList[] nodes = new MyLinkedList[26];
    String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public static void main(String[] args) {
//        nodes[0] = add(new MyLinkedList(), "a", null);
//        System.out.println(printList(nodes[0]));
        DashaMap dashaMap = new DashaMap();
    }

    public DashaMap(){
        setup();
    }

    private void setup() {
        for(int i = 0; i < alphabet.length; i++){
            nodes[i] = add(new MyLinkedList(), alphabet[i], null);
        }
//        for(int x = 0; x < alphabet.length; x++){
//            System.out.println(printList(nodes[x]));
//        }

    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {

        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 26;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
