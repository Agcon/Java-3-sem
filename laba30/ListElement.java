package ru.agcon.new_labs.laba30;

public class ListElement {
    MenuItem item;
    ListElement prevItem;
    ListElement nextItem;

    ListElement(MenuItem item, ListElement parent) {
        this.item = item;
        this.prevItem = parent;
    }
}
