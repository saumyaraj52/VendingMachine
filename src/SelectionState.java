public class SelectionState implements VendingMachineState{

    public SelectionState(){
        System.out.println("Currently Vending machine is in Selection State");
    }

    public SelectionState(VendingMachine machine){
        System.out.println("Currently Vending machine is in Selection State");
    }
    @Override
    public void insertCoin(CoinType five, VendingMachine vendingMachine) {
        System.out.println("Selection State,Error!!!");
    }

    @Override
    public void goToMenu(VendingMachine vendingMachine) {
        System.out.println("Selection State,Error!!!");
    }

    @Override
    public void chooseProduct(Item item, VendingMachine vendingMachine) {
        System.out.println("Selection State!!!");
        if(vendingMachine.total>= item.Price)
        {
            int changeAmount=vendingMachine.total- item.Price;
            System.out.println("Change Amount : "+changeAmount);
            if(changeAmount >0) {
                if(vendingMachine.coinMachine.getChange(changeAmount)==true)
                {
                    System.out.println("Change Amount is processed");
                }
                else
                {
                    System.out.println("Change Amount not processed");
                    vendingMachine.giveAllCoinsUp();
                    vendingMachine.vendingMachineState = new IdleState();
                    return;
                }
            }
            if(vendingMachine.inventory.removeItem(item)==true)
            {
                System.out.println("Item Present and dispensed");
                vendingMachine.vendingMachineState = new DispenseState(vendingMachine);
                vendingMachine.vendingMachineState = new IdleState();
                return;
            }
            else
            {
                System.out.println("Item not present");
                vendingMachine.giveAllCoinsUp();
                vendingMachine.vendingMachineState = new IdleState();
                return;
            }

        }
        else {
            System.out.println("Not Enough Balance!!!");
            vendingMachine.vendingMachineState = new SelectionState();
        }
    }

    @Override
    public void getProduct() {
        System.out.println("Selection State,Choose Product!!!");
    }
}
