package com.company;

public class Mob {
    private String name;
    private int x;
    private int y;
    private int hp;
    private int mp;


    public Mob(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.x = 0;
        this.y = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.hp;
    }

    public int getMP(){
        return this.mp;
    }

    public Mob(int speed){
        this.x += speed;
        this.y += speed;

    }

    public String toString(){
        return this.name;
    }
}
