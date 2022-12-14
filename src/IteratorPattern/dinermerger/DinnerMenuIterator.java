package IteratorPattern.dinermerger;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;
    public DinnerMenuIterator(MenuItem[] items) {
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
