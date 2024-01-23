package com.company;

public class Main {

    public static void main(String[] args) {
	AnimalHouse<Pinguin> pinguinHouse = new AnimalHouse<>();
    AnimalHouse<Bird> birdHouse = new AnimalHouse<>();
    Pinguin pinguin = new Pinguin();
    Bird bird = new Bird();
        pinguinHouse.animal=pinguin;
        birdHouse.animal= bird;
    }
}
