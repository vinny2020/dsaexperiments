package com.xaymaca.datastructures.linkedlists;


public class LinkedNodes {

    private static class Node {

        private int value;
        private Node next;

        public int getValue() {
            return this.value;
        }

        void setValue(int value) {
            this.value = value;
        }


        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Node first = new Node();
        first.setValue(3);

        Node middle = new Node();
        middle.setValue(5);

        Node last = new Node();
        last.setValue(7);

        first.setNext(middle);
        middle.setNext(last);

        printNodeList(first);



    }

    private static void  printNodeList(Node node ) {

        while(node!=null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }

    }




}
