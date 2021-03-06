package com.supermarket.buzz.utils;

import com.supermarket.buzz.item.Item;
import com.supermarket.buzz.item.ItemA;
import com.supermarket.buzz.item.ItemB;
import com.supermarket.buzz.item.ItemC;
import com.supermarket.buzz.item.ItemD;
import com.supermarket.buzz.offer.Offer;
import java.io.FileNotFoundException;
import java.util.Map;

public class PriceCalculator {

  public int aggregateTotalPriceOfItem() throws FileNotFoundException {
    UserInput userInput = new UserInput();
    Map<String, Integer> items = userInput.acceptUserInput();
    int totalBill = 0;
    if (items.get("A") != null) {
      Item itemA = new ItemA(items.get("A").intValue());
      itemA = new Offer(itemA);
      System.out.println("A(" + items.get("A").intValue() +") cost = " + itemA.cost());
      totalBill = itemA.cost();
    }

    if (items.get("B") != null) {
      Item itemB = new ItemB(items.get("B").intValue());
      itemB = new Offer(itemB);
      System.out.println("B(" + items.get("B").intValue() +") cost = " + itemB.cost());
      totalBill = totalBill + itemB.cost();
    }

    if (items.get("C") != null) {
      Item itemC = new ItemC(items.get("C").intValue());
      itemC = new Offer(itemC);
      System.out.println("C(" + items.get("C").intValue() +") cost = " + itemC.cost());
      totalBill = totalBill + itemC.cost();
    }

    if (items.get("D") != null) {
      Item itemD = new ItemD(items.get("D").intValue());
      itemD = new Offer(itemD);
      System.out.println("D(" + items.get("D").intValue() +") cost = " + itemD.cost());
      totalBill = totalBill + itemD.cost();
    }
    return totalBill;
  }
}
