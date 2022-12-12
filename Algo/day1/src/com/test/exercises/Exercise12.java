package com.test.exercises;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise12  implements MarketData{
	
	MarketDataSnapshot stock = new MarketDataSnapshot();
	
	public Exercise12() {
		receive("123", 12);
		getMarketData();
		receive("124", 15);
		getMarketData();
		receive("125", 16);
		getMarketData();
		receive("123", 17);
		getMarketData();
		receive("127", 11);
		getMarketData();
	}
	
	@Override
	public void receive(String symbol, int price) {
		
		this.stock.setStock(symbol, price);
		
	}
	
	@Override
	public MarketDataSnapshot getMarketData() {
		
		this.stock.getStock().forEach(e -> System.out.println(e.toString()));
		System.out.println("----");
		
		return this.stock;
		
	}
}

interface MarketData {
	void receive(String symbol,int price);
	
	MarketDataSnapshot getMarketData();
}

class MarketDataSnapshot {
	
	LinkedList<StockData> stock = new LinkedList<>();
	
	public LinkedList<StockData> getStock() {
		return stock;
	}
	
	public void setStock(String symbol, int price) {
		if(symbol==null) return;
		
		int location = 0;
		int stockSize = stock.size();
		
		while(location < stockSize) {
			if(symbol.equals(stock.get(location).getSymbol())) {
				stock.remove(location);
				break;
			}
			location++;
		}
		
		stock.push(new StockData(symbol,price));
		
	}
}

class StockData {
	
	String symbol;
	
	int price;
	
	public StockData(String symbol, int price) {
		this.symbol = symbol;
		this.price = price;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String toString() {
		return this.symbol + " " + this.price;
	}
	
}

