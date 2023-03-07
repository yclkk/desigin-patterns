package com.zyc.ChapterTwo.twelve.DDD;

import java.math.BigDecimal;

public class VirtualWallet {
    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;

    private boolean isAllowedOverDraft = true;

    private BigDecimal overDraftAmount = BigDecimal.ZERO;

    private BigDecimal frozenDraftAmount = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }


    public BigDecimal getAvailableBalance() {
        BigDecimal totalAvailableBalance = this.balance.subtract(this.frozenDraftAmount);
        if (isAllowedOverDraft) {
            totalAvailableBalance.add(this.overDraftAmount);
        }
        return totalAvailableBalance;
    }

    public void debit(BigDecimal amount) throws Exception {
        BigDecimal totalAvailableBalance = getAvailableBalance();
        if (totalAvailableBalance.compareTo(amount) < 0) {
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
