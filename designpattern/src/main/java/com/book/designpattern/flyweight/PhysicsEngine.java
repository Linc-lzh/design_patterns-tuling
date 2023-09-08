package com.book.designpattern.flyweight;

public class PhysicsEngine {
    public void animateCollision(_3DObject collider, _3DObject collidee){
        System.out.println("Animate Collision between " + collider + " and " + collidee);
    }
}
