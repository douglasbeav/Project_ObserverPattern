public class Stock extends Subject {

    private int stockInTrade;

    public Stock() {
        stockInTrade = 0;
    }

    public int getStockIT() {
        return stockInTrade;
    }

    public void setStockIT(int sIT) {
        if (sIT != stockInTrade) {
            stockInTrade = sIT;
            notifyObs();
        }
    }
}
