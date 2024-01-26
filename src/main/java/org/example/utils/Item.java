package org.example.utils;

public class Item<T> {

    private T data;
    private Item refItem = null;

    public Item() {
    }

    public Item(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Item getRefItem() {
        return refItem;
    }

    public void setRefItem(Item refItem) {
        this.refItem = refItem;
    }

    @Override
    public String toString() {
        return "item{" +
                "data=" + data +
                '}';
    }
}
