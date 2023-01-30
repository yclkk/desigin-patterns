package com.zyc.ChapterTwo.twelve;

import javax.naming.InsufficientResourcesException;
import java.math.BigDecimal;

public class VirtualWalletService {
    private VirtualWalletRepository walletRepo;

    private VirtualWalletTranscationRepository transactionRepo;

    public VirtualWalletBo getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWalletBo walletBo = convert(walletEntity);
        return walletBo;
    }

    /**
     * 将VirtualWalletEntity转成VirtualWalletBo
     * @param walletEntity
     * @return
     */
    private VirtualWalletBo convert(VirtualWalletEntity walletEntity) {
        return null;
    }

    /**
     * 获取余额
     * @param walletId
     * @return
     */
    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    /**
     * 出账
     */
    public void debit(Long walletId, BigDecimal amount) throws InsufficientResourcesException {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        if (balance.compareTo(amount) < 0) {
            // 抛异常
            throw new InsufficientResourcesException("..");
        }
        walletRepo.updateBalance(walletId, balance.subtract(amount));
    }

    /**
     * 入账
     * @param walletId
     * @param amount
     */
    public void credit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        walletRepo.updateBalance(walletId, balance.add(amount));
    }

    public void  transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        VirtualWalletTranscationEntity transcationEntity = new VirtualWalletTranscationEntity();
        transcationEntity.setAmount(amount);
        transcationEntity.setToWalletId(toWalletId);
        transcationEntity.setFromWalletId(fromWalletId);
        transcationEntity.setCreateTime(System.currentTimeMillis());
        transcationEntity.setStatus(Status.TO_BE_SUCCESS);
        Long transactionId = transactionRepo.saveTransaction(transcationEntity);

        try {
            debit(fromWalletId, amount);
            credit(toWalletId, amount);
        } catch(InsufficientResourcesException e) {
            transactionRepo.updateStatus(transactionId, Status.CLOSE);
        } catch (Exception e) {
            transactionRepo.updateStatus(transactionId, Status.FAILED);
        }

        transactionRepo.updateStatus(transactionId, Status.EXECUTED);
    }

}
