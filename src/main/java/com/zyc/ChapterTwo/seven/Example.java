package com.zyc.ChapterTwo.seven;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        List<Item> itemList = shoppingCart.getItems();
        itemList.clear();
        //仍然存在一下问题，虽然不能clear和add，但是可以获取itemList中某个item来修改值
        Item item = itemList.get(0);
        // 优化：只要不暴露setter方法就不能修改价格了
        item.setPrice(19.0);

    }
}
