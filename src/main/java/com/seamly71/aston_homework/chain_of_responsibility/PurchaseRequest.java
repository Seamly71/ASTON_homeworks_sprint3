package com.seamly71.aston_homework.chain_of_responsibility;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PurchaseRequest {

    private String action;
    private String item;

    public PurchaseRequest(final String action, final String item) {
        this.action = action;
        this.item = item;
    }

    public PurchaseRequest delegate(final String action) {
        return new PurchaseRequest(action, this.item);
    }
}
