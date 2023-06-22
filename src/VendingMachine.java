import java.util.HashMap;

public class VendingMachine {
    VendingMachineState vendingMachineState;
    Inventory inventory;
    CoinMachine coinMachine;
    Integer total;
    HashMap<CoinType,Integer> coinAmount;

    public VendingMachine(VendingMachineState vendingMachineState)
    {
        this.vendingMachineState = vendingMachineState;
        this.inventory = new Inventory();
        this.inventory.printInventory();
        this.coinMachine = new CoinMachine(CoinType.TEN,new CoinMachine(CoinType.FIVE,new CoinMachine(CoinType.TWO,new CoinMachine(CoinType.ONE))));
        this.total=0;
        this.coinAmount = new HashMap<CoinType,Integer>();
        this.coinAmount.put(CoinType.ONE,0);
        this.coinAmount.put(CoinType.TWO,0);
        this.coinAmount.put(CoinType.FIVE,0);
        this.coinAmount.put(CoinType.TEN,0);
    }

    public void addCoin(CoinType coinType)
    {
        if(coinType==CoinType.TEN)
            this.total+=10;
        else if(coinType==CoinType.FIVE)
            this.total+=5;
        else if(coinType==CoinType.TWO)
            this.total+=2;
        else if(coinType==CoinType.ONE)
            this.total+=1;
        this.coinAmount.put(coinType, this.coinAmount.get(coinType)+1);
        this.coinMachine.addCoin(coinType);
    }

    public void giveAllCoinsUp() {

        this.total = 0;
        this.coinAmount.put(CoinType.TEN,0);
        this.coinAmount.put(CoinType.FIVE,0);
        this.coinAmount.put(CoinType.TWO,0);
        this.coinAmount.put(CoinType.ONE,0);
        this.coinMachine.removeAllCoin();
    }
}
