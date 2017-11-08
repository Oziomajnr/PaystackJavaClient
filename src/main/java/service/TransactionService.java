package service;

import model.transaction.InitializeTransactionRequest;
import model.transaction.InitializeTransactionResponse;
import model.transaction.VerifyTransactionResponse;

/**
 * Created by SQ-OGBE PC on 07/11/2017.
 */
public interface TransactionService {
    /**
     * Initialize a paystack transaction to generate a payment url
     * @param request request body for initializing transaction api. see
     * @return
     * @throws Exception
     */
    InitializeTransactionResponse initializeTransaction(InitializeTransactionRequest request) throws Exception;
    VerifyTransactionResponse verifyTransaction (String reference);
}
