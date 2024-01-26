package org.example.satcksLIFO;

import org.example.utils.Item;

public class Stack<T> {
    private Item<T> refLastIn;
    private int size;

    public Stack() {
        this.refLastIn = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public T top() {
        return this.refLastIn.getData();
    }

    public void push(T value) {
        Item<T> item = new Item<>(value);
        item.setRefItem(this.refLastIn);
        this.refLastIn = item;
        this.size++;
    }

    public T pop() {
        if (!this.isEmpty()) {
            Item<T> item = this.refLastIn;
            this.refLastIn = refLastIn.getRefItem();
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
        stringReturn.append("-------Stacks-------\n");
        stringReturn.append("--------------------\n");

        Item<T> item = this.refLastIn;

        while(item != null) {
            stringReturn.append(item.getData() + "\n");
            item = item.getRefItem();
        }

        stringReturn.append("====================\n");

        return stringReturn.toString();
    }
}
