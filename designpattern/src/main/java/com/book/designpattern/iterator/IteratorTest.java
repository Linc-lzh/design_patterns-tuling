package com.book.designpattern.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "c", "d"};
        StringArray strArr = new StringArray(arr);
        for(Iterator it = strArr.createIterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
