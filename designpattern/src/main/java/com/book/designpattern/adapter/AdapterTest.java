package com.book.designpattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        USBDevice adapter = new PS2ToUSBAdapter(new PS2Keyboard());
        adapter.plugInto(new USBPort());
    }
}
