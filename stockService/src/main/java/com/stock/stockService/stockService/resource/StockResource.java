package com.stock.stockService.stockService.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/rest/stock")
public class StockResource {

    @Autowired
    RestTemplate restTemplate;

    private YahooFinance yahooFinance;

    @GetMapping(value = "{username}")
    public List<String> getStock(@PathVariable("username") final String userName) {

        ResponseEntity<List<String>> qouteResponse = restTemplate.exchange("http://stock-db-serivce/rest/db/" + userName, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<String>>() {
                });
        List<String> qoutes = qouteResponse.getBody();
        return qoutes;

//        return qoutes
//                .stream()
//                .map(this::getStockPrice)
//                .collect(Collectors.toList());
    }

    private Stock getStockPrice(String qoute) {
        try {
            return YahooFinance.get(qoute);
        } catch (IOException e) {
            e.printStackTrace();
            return new Stock(qoute);
        }
    }
}
