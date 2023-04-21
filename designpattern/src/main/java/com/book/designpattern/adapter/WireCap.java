package com.book.designpattern.adapter;

public class WireCap {
    WireCap link = WireCap.LooseCap;

    public static WireCap LooseCap = new WireCap(null);
    private Wire wire;
    public WireCap(Wire wire){
        this.wire = wire;
    }

    public void addLinkTo(WireCap link){
        this.link = link;
    }

    public Wire getWire(){
        return wire;
    }

    public WireCap getLink(){
        return link;
    }

    @Override
    public String toString() {
        if (link.equals(WireCap.LooseCap))
            return "WireCap belonging to LooseCap";
        return "WireCap belonging to " + wire + " is linked to " + link.getWire();
    }
}
