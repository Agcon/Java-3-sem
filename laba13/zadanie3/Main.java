package ru.agcon.new_labs.laba13.zadanie3;

import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) {
        Address first = new Address("Russia, MOSCOW, Moscow, Mira, 26, 122, 313", 0);
        Address second = new Address("Russia, MOSCOW, Moscow, Mira, 26, 122, 313", 1);
        Address third = new Address("Russia; MOSCOW; Moscow; Mira; 26; 122; 313", 1);
        Address fourth = new Address("Russia. MOSCOW. Moscow. Mira. 26. 122. 313", 1);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }

    static class Address {
        String stCountry;
        String stRegion;
        String stCity;
        String stStreet;
        String stHouse;
        String stCorpus;
        String stApartment;

        Address(String str, int iMethod) {
            super();
            this.stCountry = "";
            this.stRegion = "";
            this.stCity = "";
            this.stStreet = "";
            this.stHouse = "";
            this.stCorpus = "";
            this.stApartment = "";
            int counter = 0;
            label43:
            switch(iMethod) {
                case 0:
                    String[] arAddresses = str.split(", ");
                    int i = 0;

                    while(true) {
                        if (i >= arAddresses.length) {
                            break label43;
                        }

                        switch(i) {
                            case 0:
                                this.stCountry = arAddresses[i];
                            case 1:
                                this.stRegion = arAddresses[i];
                            case 2:
                                this.stCity = arAddresses[i];
                            case 3:
                                this.stStreet = arAddresses[i];
                            case 4:
                                this.stHouse = arAddresses[i];
                            case 5:
                                this.stCorpus = arAddresses[i];
                            case 6:
                                this.stApartment = arAddresses[i];
                            default:
                                ++i;
                        }
                    }
                case 1:
                    StringTokenizer tokenizer = new StringTokenizer(str, ",.;");

                    while(tokenizer.hasMoreTokens()) {
                        switch(counter++) {
                            case 0:
                                this.stCountry = tokenizer.nextToken();
                            case 1:
                                this.stRegion = tokenizer.nextToken();
                            case 2:
                                this.stCity = tokenizer.nextToken();
                            case 3:
                                this.stStreet = tokenizer.nextToken();
                            case 4:
                                this.stHouse = tokenizer.nextToken();
                            case 5:
                                this.stCorpus = tokenizer.nextToken();
                            case 6:
                                this.stApartment = tokenizer.nextToken();
                        }
                    }
            }

            this.stCountry = this.stCountry.replace(" ", "");
            this.stRegion = this.stRegion.replace(" ", "");
            this.stCity = this.stCity.replace(" ", "");
            this.stStreet = this.stStreet.replace(" ", "");
            this.stHouse = this.stHouse.replace(" ", "");
            this.stCorpus = this.stCorpus.replace(" ", "");
            this.stApartment = this.stApartment.replace(" ", "");
        }

        public String toString() {
            return "Country: " + this.stCountry + " Region: " + this.stRegion + " City: " + this.stCity + " Street: " + this.stStreet + " House: " + this.stHouse + " Corpus: " + this.stCorpus + " Apartment: " + this.stApartment;
        }
    }
}