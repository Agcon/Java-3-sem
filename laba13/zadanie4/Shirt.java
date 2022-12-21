package ru.agcon.new_labs.laba13.zadanie4;

class Shirt {
    String stArticle = "";
    String stModel = "";
    String stColor = "";
    String stSize = "";

    public Shirt(String str) {
        String[] all = str.split(",");

        for(int i = 0; i < all.length; ++i) {
            if (this.stArticle.isEmpty()) {
                this.stArticle = all[i];
            } else if (this.stModel.isEmpty()) {
                this.stModel = all[i];
            } else if (this.stColor.isEmpty()) {
                this.stColor = all[i];
            } else if (this.stSize.isEmpty()) {
                this.stSize = all[i];
            }
        }

    }

    public String toString() {
        return "Article: " + this.stArticle + " Model: " + this.stModel + " Color: " + this.stColor + " Size: " + this.stSize;
    }
}
