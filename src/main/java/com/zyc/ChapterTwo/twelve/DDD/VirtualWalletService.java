package com.zyc.ChapterTwo.twelve.DDD;

import com.zyc.ChapterTwo.twelve.*;

import java.math.BigDecimal;

public class VirtualWalletService {
    private VirtualWalletRepository walletRepo;
    private VirtualWalletTranscationRepository transactionRepo;

    public VirtualWallet getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        return wallet;
    }

    private VirtualWallet convert(VirtualWalletEntity walletEntity) {
        return null;
    }

    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    public void debit(Long walletId, BigDecimal amount) throws Exception {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.debit(amount);
        walletRepo.updateBalance(walletId, wallet.getAvailableBalance());
    }

    public void credit(Long walletId, BigDecimal amount) throws Exception {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.credit(amount);
        walletRepo.updateBalance(walletId, wallet.getAvailableBalance());
    }
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) throws Exception {
        VirtualWalletTranscationEntity transcationEntity = new VirtualWalletTranscationEntity();
        transcationEntity.setToWalletId(toWalletId);
        transcationEntity.setFromWalletId(fromWalletId);
        transcationEntity.setStatus(Status.TO_BE_SUCCESS);
        transcationEntity.setAmount(amount);
        transcationEntity.setCreateTime(System.currentTimeMillis());
        Long transactionId = transactionRepo.saveTransaction(transcationEntity);

        try {
            debit(fromWalletId, amount);
            credit(toWalletId, amount);
        } catch(Exception e) {
            transactionRepo.updateStatus(transactionId, Status.FAILED);
        }
        transactionRepo.updateStatus(transactionId, Status.EXECUTED);

    }
}
