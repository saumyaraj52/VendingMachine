public class DispenseState implements VendingMachineState{

    public DispenseState(){
        System.out.println("Currently Vending machine is in Dispense State");
    }

    public DispenseState(VendingMachine machine){
        System.out.println("Currently Vending machine is in Dispense State");
        machine.giveAllCoinsUp();
    }
    @Override
    public void insertCoin(CoinType five, VendingMachine vendingMachine) {
        System.out.println("Dispense State,Error!!!");
    }

    @Override
    public void goToMenu(VendingMachine vendingMachine) {
        System.out.println("Dispense State,Error!!!");
    }

    @Override
    public void chooseProduct(Item item, VendingMachine vendingMachine) {
        System.out.println("Dispense State,Error!!!");
    }

    @Override
    public void getProduct() {
        System.out.println("Dispense State,Dispense Product!!!");
    }
}
