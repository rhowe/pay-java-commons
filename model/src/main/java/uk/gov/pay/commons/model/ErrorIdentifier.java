package uk.gov.pay.commons.model;

public enum ErrorIdentifier {
    GENERIC,
    REFUND_NOT_AVAILABLE,
    REFUND_AMOUNT_AVAILABLE_MISMATCH,
    ZERO_AMOUNT_NOT_ALLOWED,
    GO_CARDLESS_ACCOUNT_NOT_LINKED,
    GO_CARDLESS_ACCOUNT_ALREADY_LINKED_TO_ANOTHER_ACCOUNT,
    MANDATE_STATE_INVALID,
    MANDATE_ID_INVALID,
    MOTO_NOT_ALLOWED,
    CANCEL_CHARGE_FAILURE_DUE_TO_CONFLICTING_TERMINAL_STATE_AT_GATEWAY
}
