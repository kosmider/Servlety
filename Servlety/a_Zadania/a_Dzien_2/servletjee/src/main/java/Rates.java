import java.util.List;

public class Rates {
    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;

    public List<Rate> getRate() {
        return rates;
    }
}