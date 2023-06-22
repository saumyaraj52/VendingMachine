public class IdleState implements VendingMachineState{

    @Override
    public void insertCoin(CoinType coinType,VendingMachine machine) {
        System.out.println("Please Add coin ");
        machine.addCoin(coinType);
        machine.vendingMachineState = new HasCoinState();
    }


    public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
    }


    @Override
    public void goToMenu(VendingMachine machine) {
        System.out.println("Idle State,Error!!!");
    }

    @Override
    public void chooseProduct(Item item, VendingMachine vendingMachine) {
        System.out.println("Idle State,Error!!!");
    }

    @Override
    public void getProduct() {
        System.out.println("Idle State,Error!!!");
    }
}
