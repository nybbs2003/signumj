package signumj.entity.response.http;

public class AssetResponse extends BRSResponse  {
    private final String issuer;
    private final String issuerRS;
    private final String account;
    private final String accountRS;
    private final String name;
    private final String description;
    private final int decimals;
    private final String quantityQNT;
    private final String asset;
    private final boolean mintable;
    private final int numberOfTrades;
    private final int numberOfTransfers;
    private final int numberOfAccounts;

    public AssetResponse(String issuer, String issuerRS, String account, String accountRS, String name, String description, int decimals, String quantityQNT, String asset, boolean mintable, int numberOfTrades, int numberOfTransfers, int numberOfAccounts) {
        this.issuer = issuer;
        this.issuerRS = issuerRS;
        this.account = account;
        this.accountRS = accountRS;
        this.name = name;
        this.description = description;
        this.decimals = decimals;
        this.quantityQNT = quantityQNT;
        this.asset = asset;
        this.mintable = mintable;
        this.numberOfTrades = numberOfTrades;
        this.numberOfTransfers = numberOfTransfers;
        this.numberOfAccounts = numberOfAccounts;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getIssuerRS() {
        return issuerRS;
    }
    
    public String getAccount() {
        return account;
    }

    public String getAccountRS() {
        return accountRS;
    }

    public boolean getMintable() {
    	return mintable;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDecimals() {
        return decimals;
    }

    public String getQuantityQNT() {
        return quantityQNT;
    }

    public String getAsset() {
        return asset;
    }

    public int getNumberOfTrades() {
        return numberOfTrades;
    }

    public int getNumberOfTransfers() {
        return numberOfTransfers;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
