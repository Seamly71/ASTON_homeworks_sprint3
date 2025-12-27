package com.seamly71.aston_homework.chain_of_responsibility.handlers;

import com.seamly71.aston_homework.chain_of_responsibility.PurchaseReport;
import com.seamly71.aston_homework.chain_of_responsibility.PurchaseRequest;

public class Shipper extends Handler{

    private static final String action = "ship";

    public Shipper(Handler successor) {
        this.successor = successor;
    }

    @Override
    public PurchaseReport handle(PurchaseRequest request) {
        String requestAction = request.getAction();

        if (requestAction.equals(action)) {
            PurchaseRequest shippingRequest = request.delegate("make");
            PurchaseReport successorAnswer = successor.handle(shippingRequest);

            if (successorAnswer.getSuccess()) {
                return successorAnswer.escalate(
                        "Доставлен, летя через моря и океаны."
                );
            }

            return successorAnswer;
        }

        return new PurchaseReport(
                false,
                String.format(
                        "Поставщик не смог выполнить действие \"%s\"",
                        requestAction
                )
        );
    }
}

