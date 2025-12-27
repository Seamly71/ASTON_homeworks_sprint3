package com.seamly71.aston_homework.chain_of_responsibility.handlers;

import com.seamly71.aston_homework.chain_of_responsibility.PurchaseReport;
import com.seamly71.aston_homework.chain_of_responsibility.PurchaseRequest;

public class Seller extends Handler{

    private static final String action = "sell";

    public Seller(Handler successor) {
        this.successor = successor;
    }

    @Override
    public PurchaseReport handle(PurchaseRequest request) {
        String requestAction = request.getAction();

        if (requestAction.equals(action)) {
            PurchaseRequest shippingRequest = request.delegate("ship");
            PurchaseReport successorAnswer = successor.handle(shippingRequest);

            if (successorAnswer.getSuccess()) {
                return successorAnswer.escalate(
                        "Продан обернутый в красивую бумагу."
                );
            }

            return successorAnswer;
        }

        return new PurchaseReport(
                false,
                String.format(
                        "Продавец не смог выполнить действие \"%s\"",
                        requestAction
                )
        );
    }

}
