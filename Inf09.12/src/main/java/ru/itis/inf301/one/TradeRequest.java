package ru.itis.inf301.one;


import java.math.BigDecimal;

public class TradeRequest{
    int amount;
    BigDecimal total;

    public TradeRequest(int amount, String total) {
        this.amount = amount;
        this.total = new BigDecimal(total);
    }
    public void registerTrade(){
        try{
            reviewValue();
            System.out.println("Trade registered with total price = " +total+" for amount = "+amount);
        }
        catch (InvalidAmountException e) {
            System.out.println("Amount should be greater than 0");
        }
        catch (InvalidTotalException e) {
            System.out.println("Total should be greater than 0");
        }
        catch (InvalidTotalScaleException e) {
            System.out.println("Total has scale = "+ total.scale()+" instead of scale = 2");
        }
        catch (Exception e) {
            System.out.println("Unknown error");
        }

    }
    private void reviewValue() throws InvalidAmountException, InvalidTotalException, InvalidTotalScaleException{
        BigDecimal zero = new BigDecimal("0");
        if (amount < 0) throw new InvalidAmountException();
        if (total.compareTo(zero) < 0) throw new InvalidTotalException();
        if (total.scale() > 2) throw new InvalidTotalScaleException(total.scale(),2);
    }
}