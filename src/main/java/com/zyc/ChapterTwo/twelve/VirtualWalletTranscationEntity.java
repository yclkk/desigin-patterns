package com.zyc.ChapterTwo.twelve;

import java.math.BigDecimal;

public class VirtualWalletTranscationEntity {
    private Long fromWalletId;

    private Long toWalletId;

    private Long createTime;

    private BigDecimal amount;

    private String status;

    public void setFromWalletId(Long fromWalletId) {
        this.fromWalletId = fromWalletId;
    }

    public void setToWalletId(Long toWalletId) {
        this.toWalletId = toWalletId;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
