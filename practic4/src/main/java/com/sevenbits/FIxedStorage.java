package com.sevenbits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FIxedStorage implements IFixedStorage{
    private final int MAX_SIZE = 16;
    private final static Logger logger = LoggerFactory.getLogger(UniqueStorage.class);
    private Map<String, Planet> hashmap;

    public FIxedStorage() {
        hashmap = new HashMap<String, Planet>();
    }

    @Override
    public void add(String key,Planet planet) {
        if (planet.getId ()  == null || planet.getName() == null || key == null)  {
            logger.error("this object has not key or value");
        }
        if (hashmap.size() == MAX_SIZE && !hashmap.containsKey(key)) {
            logger.error("stored has a max size! this object has not added");
        } else {
            if (hashmap.containsKey(key)) {
                logger.warn("this key has already used");
            }
            hashmap.put(key, planet);
            logger.info("planet has added");
        }
    }

    @Override
    public void remove(String key) {
        if (!hashmap.containsKey(key)) {
            logger.error("this key is not exist in FixedStorage");
        }
        hashmap.remove(key);
        logger.info("planet has removed");
    }

    @Override
    public Planet get(String key) {
        if (!hashmap.containsKey(key)) {
            logger.error("this key is not exist in FixedStorage");
        }
        return hashmap.get(key);
    }

    @Override
    public boolean contains(Planet planet) {
        return hashmap.containsValue(planet);
    }

    @Override
    public String toString() {
         StringBuilder items = new StringBuilder();
        for (String key : hashmap.keySet()) {
            items.append(key).append(' ');
            items.append(hashmap.get(key)).append('\n');

        }
        return items.toString();
    }


}
