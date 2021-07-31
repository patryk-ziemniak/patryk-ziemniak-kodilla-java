package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    public static final String SESAME = "SESAME";
    public static final String BUN = "BUN";
    public static final String STANDARD = "STANDARD";
    public static final String THOUSAND = "THOUSAND";
    public static final String BARBECUE = "BARBECUE";
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String PICKLES = "PICKLES";
    public static final String CHILI = "CHILI";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String PRAWNS = "PRAWNS";
    public static final String CHEESE = "CHEESE";

    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            switch (bun) {
                case SESAME:
                case BUN:
                    this.bun = bun;
                    break;
                default:
                    throw new IllegalStateException("Only SESAME and BUN allowed in bun field");
            }
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            switch (sauce) {
                case STANDARD:
                case THOUSAND:
                case BARBECUE:
                    this.sauce = sauce;
                    break;
                default:
                    throw new IllegalStateException("Only STANDARD, THOUSAND and BARBECUE allowed in sauce field");
            }
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            switch (ingredient) {
                case LETTUCE:
                case ONION:
                case BACON:
                case PICKLES:
                case CHILI:
                case MUSHROOMS:
                case PRAWNS:
                case CHEESE:
                    this.ingredients.add(ingredient);
                    break;
                default:
                    throw new IllegalStateException("Only LETTUCE, ONION, BACON, PICKLES, CHILI, MUSHROOMS, PRAWNS and CHEESE allowed in ingredient field");
            }
            return this;
        }

        public BigMac build() {
            if (bun == null) {
                throw new IllegalStateException("Field bun can't be empty");
            } else if (burgers < 1) {
                throw new IllegalStateException("Field burgers can't have less than 1 burger");
            } else if (sauce == null) {
                throw new IllegalStateException("Field sauce can't be empty");
            }
            return new BigMac(this.bun, this.burgers, this.sauce, this.ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
