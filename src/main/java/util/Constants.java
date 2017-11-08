package util;

/**
 * Created by SQ-OGBE PC on 28/10/2017.
 */
public class Constants {
    public static String PAYSTACK_BASE_URL = "https://api.paystack.co";
    public static String PAYSTACK_INIT_TRANSACTION_URL = PAYSTACK_BASE_URL + "/transaction/initialize";
    public static String PAYSTACK_VERIFY_TRANSACTION_URL = PAYSTACK_BASE_URL + "/transaction/verify/";
    public static String PAYSTACK_SECRET_KEY = "sk_test_xxxxxxxxxxxxxxxxxxxxxxxx";

    public static int STATUS_CODE_OK = 200;
}
