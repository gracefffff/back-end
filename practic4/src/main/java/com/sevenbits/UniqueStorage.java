package com.sevenbits;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


public class UniqueStorage implements IUniqueStorage {
    private ArrayList<Planet> listPlanet;
    private final static Logger logger = LoggerFactory.getLogger(UniqueStorage.class);

    public UniqueStorage() {
        listPlanet = new ArrayList<Planet>();
    }

    public void add(Planet planet) {
        if (planet.getName() == null || planet.getId() == null) {
            logger.error("this planet has not name or id");
            return;
        }
        for (Planet item : listPlanet) {
            if (item.equals(planet)) {
                logger.warn("this planet has already added");
                return;
            }
        }
        listPlanet.add(planet);
        logger.info("planet has added");
    }

    public void remove(int index) {
        try {
            listPlanet.remove(index);
            listPlanet.trimToSize();
            logger.info("planet has removed");
        } catch (IndexOutOfBoundsException ex) {
            logger.error("this planet is not exist in collection");
        }
    }


    public boolean contains(Planet planet) {
        return listPlanet.contains(planet);
    }

    @Override
    public String toString() {
        StringBuilder planets = new StringBuilder();
        for (Planet planet : listPlanet) {
            planets.append(planet.getId()).append(' ');
            planets.append(planet.getName()).append('\n');
        }
        return planets.toString();

    }

}
