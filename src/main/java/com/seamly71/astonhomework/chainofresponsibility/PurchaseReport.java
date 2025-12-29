package com.seamly71.astonhomework.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PurchaseReport {

    private Boolean success;
    private String report;

    public PurchaseReport(final Boolean success, final String report) {
        this.success = success;
        this.report = report;
    }

    public PurchaseReport escalate(final String suffix) {
        return new PurchaseReport(
                this.success,
                String.format("%s\n%s", this.report, suffix)
        );
    }
}
