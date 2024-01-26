package org.example.queuesFIFO;

import org.example.utils.Item;

public class Queue<T> {
    private Item<T> refLastIn;
    private int size;

    public Queue() {
        this.refLastIn = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(T value) {
        Item<T> item = new Item<>(value);
        item.setRefItem(this.refLastIn);
        this.refLastIn = item;
        this.size++;
    }

    public T first() {
        if (!this.isEmpty()) {
            Item<T> item = this.refLastIn;
            while(item.getRefItem() != null) {
                item = item.getRefItem();
            }
            return item.getData();
        }

        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Item<T> item = this.refLastIn;
            Item<T> itemAux = null;
            while(item.getRefItem() != null) {
                itemAux = item;
                item = item.getRefItem();
            }

            itemAux.setRefItem(null);
            this.size--;

            return item.getData();
        }

        return null;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder stringReturn = new StringBuilder("--------------------\n");
        stringReturn.append("-------Queues-------\n");
        stringReturn.append("--------------------\n");

        Item<T> item = this.refLastIn;

        while(item != null) {
            if (item.getRefItem() != null) {
                stringReturn.append(item.getData() + " ---> ");
            } else {
                stringReturn.append(item.getData());
            }

            item = item.getRefItem();
        }

        stringReturn.append("\n====================\n");

        return stringReturn.toString();
    }
}
