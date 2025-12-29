package com.seamly71.astonhomework.chainofresponsibility.handlers;

import com.seamly71.astonhomework.chainofresponsibility.PurchaseReport;
import com.seamly71.astonhomework.chainofresponsibility.PurchaseRequest;
import java.util.HashSet;
import java.util.Set;

public class Producer extends Handler {

    private static final String action = "make";

    private final Set<String> items;

    public Producer(Set<String> items) {
        this.successor = null;
        this.items = new HashSet<>(items);
    }

    @Override
    public PurchaseReport handle(PurchaseRequest request) {
        String requestAction = request.getAction();

        if (requestAction.equals(action)) {
            String requestItem = request.getItem();

            if (items.contains(requestItem)) {
                return new PurchaseReport(
                        true,
                        String.format("Сделанный с любовью %s.", requestItem)
                );
            }

            return new PurchaseReport(
                    false,
                    String.format("Производитель не производит %s", requestItem)
            );
        }

        return new PurchaseReport(
                false,
                String.format(
                        "Производитель не смог выполнить действие \"%s\"",
                        requestAction
                )
        );
    }
}

