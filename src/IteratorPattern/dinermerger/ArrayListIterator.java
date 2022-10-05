package IteratorPattern.dinermerger;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

    ArrayList<MenuItem> items;

    int position = 0;

    public ArrayListIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
