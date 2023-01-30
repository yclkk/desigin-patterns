package com.zyc.ChapterTwo.twelve;

import java.math.BigDecimal;

public class VirtualWalletBo {
    private Long id;
    private Long createTime;

    private BigDecimal balance;


    public VirtualWalletBo() {
        this.balance = BigDecimal.ZERO;
        this.createTime = System.currentTimeMillis();
        // 随机生成一个id this.id = IdGenerator.getId();
    }
    public Long getId() {
        return id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
