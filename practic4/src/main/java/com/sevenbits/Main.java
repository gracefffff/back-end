package com.sevenbits;

public class Main {
    public static void main(final String[] args) {
        UniqueStorage uniqueStorage = new UniqueStorage();
        FIxedStorage fIxedStorage = new FIxedStorage();
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        Planet saturn = new Planet("Saturn");
        Planet mercury = new Planet("Mercury");
        Planet neptune = new Planet("Neptune");
        Planet uranus = new Planet("Uranus");
        uniqueStorage.add(earth);
        uniqueStorage.add(mars);
        uniqueStorage.add(saturn);
        uniqueStorage.add(jupiter);
        uniqueStorage.add(uranus);
        uniqueStorage.add(mercury);
        uniqueStorage.add(neptune);
        fIxedStorage.add(earth.getId(), earth);
        fIxedStorage.add(mars.getId(), mars);
        fIxedStorage.add(saturn.getId(), saturn);
        fIxedStorage.add(jupiter.getId(), jupiter);
        fIxedStorage.add (uranus.getId(), uranus);
        fIxedStorage.add(mercury.getId(), mercury);
        fIxedStorage.add(neptune.getId(), neptune);
        System.out.println("FixedStorage : " + fIxedStorage.toString());
        System.out.println(("UniqueStorage : " + uniqueStorage.toString()));

    }
}
