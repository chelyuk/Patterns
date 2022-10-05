package IteratorPattern.dinermerger;

public class ArrayIterator implements Iterator {

    MenuItem[] items;

    int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
