package model;

/**
 * Created by SQ-OGBE PC on 20/09/2017.
 * For a paystack transaction, we have to know who would bear the charges, the account or the sub account
 */
public enum Bearer {

    ACCOUNT("account"),
    SUB_ACCOUNT("subaccount");
    private String name;

    Bearer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
