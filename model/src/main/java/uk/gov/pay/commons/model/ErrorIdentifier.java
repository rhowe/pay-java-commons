package uk.gov.pay.commons.model;

public enum ErrorIdentifier {
    GENERIC,
    REFUND_NOT_AVAILABLE,
    REFUND_AMOUNT_AVAILABLE_MISMATCH,
    ZERO_AMOUNT_NOT_ALLOWED,
    GO_CARDLESS_ACCOUNT_NOT_LINKED
}
