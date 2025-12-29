package com.seamly71.astonhomework.chainofresponsibility.handlers;

import com.seamly71.astonhomework.chainofresponsibility.PurchaseReport;
import com.seamly71.astonhomework.chainofresponsibility.PurchaseRequest;

public abstract class Handler {

    protected Handler successor;

    public abstract PurchaseReport handle(final PurchaseRequest request);
}
