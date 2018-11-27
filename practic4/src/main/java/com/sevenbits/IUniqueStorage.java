package com.sevenbits;


public interface IUniqueStorage {

    void add(Planet planet);

    void remove(int index);

    boolean contains(Planet planet);
}
