package com.book.designpattern.adapter;

import java.util.List;

public interface PS2Device {
    static final String GND = "PS/2 GND";
    static final String BLUE = "PS/2 Blue";
    static final String BLACK = "PS/2 Black";
    static final String GREEN = "PS/2 Green";
    static final String WHITE = "PS/2 White";
    static final String _5V = "PS/2 5V";
    public List<Wire> getWires();
    public void printWiresConnectionsToRight();
}
