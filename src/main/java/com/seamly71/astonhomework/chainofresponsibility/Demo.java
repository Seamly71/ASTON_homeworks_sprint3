package com.seamly71.astonhomework.chainofresponsibility;

import com.seamly71.astonhomework.chainofresponsibility.handlers.Producer;
import com.seamly71.astonhomework.chainofresponsibility.handlers.Seller;
import com.seamly71.astonhomework.chainofresponsibility.handlers.Shipper;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Producer producer = new Producer(
                Set.of("зеленый чай", "каркаде")
        );
        Shipper shipper = new Shipper(producer);
        Seller seller = new Seller(shipper);

        System.out.println(
                seller.handle(
                        new PurchaseRequest(
                                "sell",
                                "зеленый чай"
                        )
                ).getReport()
        );

        System.out.println();
        System.out.println(
                seller.handle(
                        new PurchaseRequest(
                                "sell",
                                "лимонад"
                        )
                ).getReport()
        );

        System.out.println();
        System.out.println(
                seller.handle(
                        new PurchaseRequest(
                                "ship",
                                "зеленый чай"
                        )
                ).getReport()
        );

        System.out.println();
        System.out.println(
                shipper.handle(
                        new PurchaseRequest(
                                "ship",
                                "зеленый чай"
                        )
                ).getReport()
        );
    }
}
