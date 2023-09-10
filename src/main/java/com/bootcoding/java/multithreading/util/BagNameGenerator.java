package com.bootcoding.java.multithreading.util;

import java.util.Random;

public class BagNameGenerator {
    private static String[] bagBrands = {
            "JanSport", "Eastpak",
            "Herschel Supply Co.",
            "Fjällräven",
            "The North Face",
            "Kipling",
            "Timbuk2",
            "Dakine",
            "Patagonia",
            "High Sierra",
            "Vans",
            "SwissGear",
            "Under Armour",
            "Columbia",
            "Osprey",
            "Everlane",
            "Tumi",
            "Deuter",
            "Topo Designs",
            "Kelty",
    };

    public static String getName() {

        int randomIndex = random.nextInt(bagBrands.length);
        return bagBrands[randomIndex];
    }

    private static Random random = new Random();
}

