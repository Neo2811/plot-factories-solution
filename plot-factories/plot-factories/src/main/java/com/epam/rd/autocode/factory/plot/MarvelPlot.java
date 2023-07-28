package com.epam.rd.autocode.factory.plot;

class MarvelPlot implements Plot {
    private Character[] heroes;
    private EpicCrisis epicCrisis;
    private Character villain;

    public MarvelPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
    }

    @Override
    public String asText() {
        StringBuilder heroesText = new StringBuilder();

        if (villain.name().equals("Obadiah Stane")) {
            for (Character hero : heroes) {
                heroesText.append("the brave ").append(hero.name());
            }

            return epicCrisis.name() + " threatens the world. " +
                    "But " + heroesText.toString() + " is on guard. " +
                    "So, no way that intrigues of " + villain.name() + " will bend the willpower of the inflexible hero.";
        }else if (villain.name().equals("Loki")) {
            for (int i = 0; i < heroes.length; i++) {
                if (i <= heroes.length-3) {
                    heroesText.append("the brave ").append(heroes[i].name()).append(", ");
                }else if (i == heroes.length-2) {
                    heroesText.append("the brave ").append(heroes[i].name()).append(" ");
                }else {
                    heroesText.append("and the brave ").append(heroes[i].name());
                }
            }

            return epicCrisis.name() + " threatens the world. " +
                    "But " + heroesText.toString() + " are on guard. " +
                    "So, no way that intrigues of " + villain.name() + " will bend the willpower of inflexible heroes.";
        }

        for (int i = 0; i < heroes.length; i++) {
            if (i <= heroes.length-3) {
                heroesText.append("the brave ").append(heroes[i].name()).append(", ");
            }else if (i == heroes.length-2) {
                heroesText.append("the brave ").append(heroes[i].name()).append(" ");
            }else {
                heroesText.append("and the brave ").append(heroes[i].name());
            }
        }

            return epicCrisis.name() + " threatens the world. " +
                    "But " + heroesText.toString() + " are on guard. " +
                    "So, no way that intrigues of " + villain.name() + " will bend the willpower of inflexible heroes.";
    }
}



