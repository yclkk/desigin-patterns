package com.zyc.ChapterTwo.twelve.DDD;

import java.math.BigDecimal;

public class VirtualWallet {
    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public void debit(BigDecimal amount) throws Exception {
        if (this.balance.compareTo(amount) < 0) {
            throw new Exception("金额不足");
        }
        this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount) throws Exception {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new Exception("金额小于0");
        }
        this.balance.add(amount);
    }



}
