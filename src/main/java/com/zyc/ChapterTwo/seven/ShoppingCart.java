package com.zyc.ChapterTwo.seven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 封装：通过访问权限控制，隐藏内部数据，
 * 外部仅能通过类提供的有限接口，方法修改内部数据。
 * 因此不应该暴露setter方法
 */
public class ShoppingCart {
    private int itemCount;
    private double totalPrice;
    private List<Item> Items = new ArrayList<>();

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    // 这个与getItemCount无伤大雅，并不能修改内部数据
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // 这个与前两者不同，可以拿到items来修改内部数据
    public List<Item> getItems() {
//        return items;
        return Collections.unmodifiableList(this.Items);
    }

    public void addItems(Item item) {
        itemCount++;
        this.totalPrice += item .getPrice();
        Items.add(item);
    }
}
