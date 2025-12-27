package com.seamly71.aston_homework.chain_of_responsibility.handlers;

import com.seamly71.aston_homework.chain_of_responsibility.PurchaseReport;
import com.seamly71.aston_homework.chain_of_responsibility.PurchaseRequest;

public abstract class Handler {

    protected Handler successor;

    public abstract PurchaseReport handle(final PurchaseRequest request);
}
