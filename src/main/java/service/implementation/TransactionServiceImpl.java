package service.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import model.transaction.InitializeTransactionRequest;
import model.transaction.InitializeTransactionResponse;
import model.transaction.VerifyTransactionResponse;
import service.TransactionService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.joda.time.format.ISODateTimeFormat;
import util.Constants;

import static util.Constants.PAYSTACK_INIT_TRANSACTION_URL;
import static util.Constants.PAYSTACK_SECRET_KEY;
import static util.Constants.STATUS_CODE_OK;


/**
 * Created by SQ-OGBE PC on 08/11/2017.
 */
public class TransactionServiceImpl implements TransactionService{
    public InitializeTransactionResponse initializeTransaction(InitializeTransactionRequest request) throws Exception {
        InitializeTransactionResponse paystackInitTransactionResponse;
        try {
            // convert request to json then use it as a payload
            Gson gson = new Gson();
            StringEntity postingString = new StringEntity(gson.toJson(request));
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(PAYSTACK_INIT_TRANSACTION_URL);
            post.setEntity(postingString);
            post.addHeader("Content-type", "application/json");
            post.addHeader("Authorization", "Bearer " + PAYSTACK_SECRET_KEY);
            StringBuilder result = new StringBuilder();
            HttpResponse response = client.execute(post);
            if (response.getStatusLine().getStatusCode() == STATUS_CODE_OK) {
                BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

                String line;
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }

            } else {
                throw new Exception("Error Occurred while connecting to url: " + PAYSTACK_INIT_TRANSACTION_URL);
            }
            ObjectMapper mapper = new ObjectMapper();

            paystackInitTransactionResponse = mapper.readValue(result.toString(), InitializeTransactionResponse.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Failure initializaing paystack transaction");
        }

        return paystackInitTransactionResponse;
    }

    public VerifyTransactionResponse verifyTransaction(String reference) {
        return null;
    }
}
