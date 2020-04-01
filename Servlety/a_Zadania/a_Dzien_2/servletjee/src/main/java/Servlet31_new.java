/*import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/s")
public class Servlet31_new extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Double> currenciesPairs = getCurrenciesPairs();
        String currencyPair = request.getParameter("currencyPair");
        Double amount = Double.parseDouble(request.getParameter("amount"));

        if (!currenciesPairs.containsKey(currencyPair)) {
            throw new IOException("Nie udalo sie pobrac kursu walut");
        }
        String result = String.format("%.2f %s %.2f", amount, currencyPair.replaceAll("-", " = "),
                (currenciesPairs.get(currencyPair) * amount));
        response.getWriter().println(result);
    }

    private Map<String, Double> getCurrenciesPairs() throws IOException {
        Double eurPln = getCurrencyRate("EUR");
        Double usdPln = getCurrencyRate("USD");
        Map<String, Double> currenciesPairs = new HashMap<>();

        currenciesPairs.put("eur-usd", eurPln / usdPln);
        currenciesPairs.put("usd-eur", usdPln / eurPln);
        currenciesPairs.put("eur-pln", eurPln);
        currenciesPairs.put("pln-eur", 1 / eurPln);
        currenciesPairs.put("usd-pln", usdPln);
        currenciesPairs.put("pln-usd", 1 / usdPln);

        return currenciesPairs;
    }

    private Double getCurrencyRate(String currencyCode) throws IOException {
        final String URL = "http://api.nbp.pl/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NbpInterfaces nbpInterfaces = retrofit.create(NbpInterfaces.class);
        Call<Rates> nbpCall = nbpInterfaces.getCurrencyRate(currencyCode);
        Response<Rates> response = nbpCall.execute();
        if (!response.isSuccessful()) {
            throw new IOException("Nie udalo sie pobrac kursu walut");
        }

        return getRateFromApiResponse(response.body());
    }

    private Double getRateFromApiResponse(Rates rates) throws IOException {
        final int FIRST_RATE = 0;
        if (rates.getRate() != null) {
            return rates.getRate().get(FIRST_RATE).getMid();
        }
        throw new IOException("Nie udalo sie pobrac kursu walut");
    }

}

 */