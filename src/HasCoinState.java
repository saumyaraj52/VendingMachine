public class HasCoinState implements VendingMachineState{

    public HasCoinState(){
        System.out.println("Currently Vending machine is in HasCoin State");
    }

    public HasCoinState(VendingMachine machine){
        System.out.println("Currently Vending machine is in HasCoin State");
    }
    @Override
    public void insertCoin(CoinType coinType, VendingMachine vendingMachine) {
        System.out.println("Has Coin State!!!");
        vendingMachine.addCoin(coinType);
    }

    @Override
    public void goToMenu(VendingMachine vendingMachine) {
        System.out.println("Has Coin State,CheckOut Menu!!!");
        vendingMachine.vendingMachineState = new SelectionState();
    }

    @Override
    public void chooseProduct(Item item, VendingMachine vendingMachine) {
        System.out.println("Has Coin State,Error!!!");
    }

    @Override
    public void getProduct() {
        System.out.println("Has Coin State,Error!!!");
    }
}
