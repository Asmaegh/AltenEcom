package com.alten.ecom.enums;

public enum InventoryStatus {
    
    INSTOCK("I"),
    LOWSTOCK("L"),
    OUTOFSTOCK("O");

    private final String code;

    InventoryStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static InventoryStatus fromCode(String code) {
        for (InventoryStatus status : InventoryStatus.values()) {
            if (status.code.equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}
