package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class Bigmac {

    private final String bun;
    private final int pattiesNo;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        public static final String WITHSESAME = "BUN WITH SESAME";
        public static final String NOSESAME = "STANDARD BUN";
        public static final String STANDARDSAUCE = "STANDARD SAUCE";
        public static final String ISLANDS = "1000 ISLANDS SAUCE";
        public static final String BARBECUE = "BARBECUE SAUCE";
        public static final List<String> INGDREDIENTS = new ArrayList(Arrays.asList("salad", "onion", "bacon",
                "cucumber", "chilli", "mushrooms", "shrimps", "cheese"));

        private String bun;
        private int pattiesNo;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder chooseBun(String bun) {
            if (bun.equals(WITHSESAME) || bun.equals(NOSESAME)) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Bun not in offer. Only \"standard\" and \"with sesame\" buns available");
            }
        }

        public BigMacBuilder choosePattiesNo(int number) {
            this.pattiesNo = number;
            return this;
        }

        public BigMacBuilder chooseSauce(String sauce) {
            if (sauce.equals(STANDARDSAUCE) || sauce.equals(ISLANDS) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Sauce not in offer. Only \"standard\", \"1000 islands\" and " +
                        "\"barbecue\" sauces available");
            }
        }

        public BigMacBuilder chooseIngredients(String ingredient) {
            if (INGDREDIENTS.contains(ingredient)) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Ingredient not in offer. Available ingredients: " + INGDREDIENTS);
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, pattiesNo, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int pattiesNo, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.pattiesNo = pattiesNo;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getPattiesNo() {
        return pattiesNo;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bigmac bigmac = (Bigmac) o;
        return pattiesNo == bigmac.pattiesNo &&
                Objects.equals(bun, bigmac.bun) &&
                Objects.equals(sauce, bigmac.sauce) &&
                Objects.equals(ingredients, bigmac.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bun, pattiesNo, sauce, ingredients);
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", pattiesNo=" + pattiesNo +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
