public interface VendingMachineState {

    public void insertCoin(CoinType five, VendingMachine vendingMachine);

    public void goToMenu(VendingMachine vendingMachine);
    void chooseProduct(Item item, VendingMachine vendingMachine);

    public void getProduct();
}
