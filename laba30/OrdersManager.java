package ru.agcon.new_labs.laba30;

public interface OrdersManager {
    int itemsQuantity(String var1);

    int itemsQuantity(MenuItem var1);

    Order[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}
