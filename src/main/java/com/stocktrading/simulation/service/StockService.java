package com.stocktrading.simulation.service;

import com.stocktrading.simulation.entity.Stock;
import java.util.List;

public interface StockService {
    Stock saveStock(Stock stock);
    Stock getStockById(Long id);
    List<Stock> getAllStocks();
    Stock updateStock(Long id, Stock stock);
    void deleteStock(Long id);
}
