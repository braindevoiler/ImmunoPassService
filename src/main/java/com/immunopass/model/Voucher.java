package com.immunopass.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Voucher {
    private final Long id;
    private final String voucherCode;
    private final Long issuerId;
    private final String userName;
    private final String userMobile;
    private final String userEmpId;
    private final String userGovernmentId;
    private final String userLocation;
    private final VoucherStatus status;
    private final Long orderId;
    private final Long immunopassId;
}
