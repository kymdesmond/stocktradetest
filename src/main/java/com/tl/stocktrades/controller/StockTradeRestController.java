package com.tl.stocktrades.controller;

import com.tl.stocktrades.repository.StockTradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockTradeRestController {

    @Autowired
    StockTradeRepository stockTradeRepository;

}
