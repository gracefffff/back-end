package com.sevenbits;

public interface IFixedStorage {
    void add(String key,Planet planet);

    void remove(String key);

    Planet get(String key);

    boolean contains(Planet value);
}
