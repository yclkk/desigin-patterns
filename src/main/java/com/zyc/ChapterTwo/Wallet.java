package com.zyc.ChapterTwo;

import java.math.BigDecimal;

public class Wallet {
    private String id;
    private BigDecimal balance;
    private long createTime;
    private long balanceLastModifiedTime;

    public Wallet() {
//        this.id = IdGenerator.getIn;
        this.balance = BigDecimal.ZERO;
        this.createTime = System.currentTimeMillis();
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public long getCreateTime() {
        return createTime;
    }

    public long getBalanceLastModifiedTime() {
        return balanceLastModifiedTime;
    }

    public void increaseBalance(BigDecimal increasedAmount) {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("增加的金额为负数，无法增钱");
        }
        this.balance.add(increasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }
    public void decreaseBalance(BigDecimal decreasedAmount) {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("扣款的金额为负数，无法扣款");
        }
        if (decreasedAmount.compareTo(balance) > 0) {
            throw new IllegalArgumentException("余额不足");
        }
        this.balance.subtract(decreasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }
}
