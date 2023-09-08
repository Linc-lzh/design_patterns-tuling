package com.book.designpattern.iterator;

public class StringArray implements Aggregate{
    private String values[];
    public StringArray(String[] values){
        this.values = values;
    }
    @Override
    public Iterator createIterator() {
        return (Iterator) new StringArrayIterator();
    }

    private class StringArrayIterator implements Iterator{
        private int position;
        @Override
        public Object next() {
            if(this.hasNext())
                return values[position++];
            else
                return null;
        }

        @Override
        public boolean hasNext() {
            return (position < values.length);
        }
    }
}
