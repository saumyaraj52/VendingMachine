public class Main {
    public static void main(String[] args)
    {
        System.out.println("Start");
        VendingMachine vendingMachine= new VendingMachine(new IdleState());

        vendingMachine.vendingMachineState.insertCoin(CoinType.TEN,vendingMachine);
        vendingMachine.vendingMachineState.insertCoin(CoinType.TEN,vendingMachine);
        //vendingMachine.vendingMachineState.insertCoin(CoinType.FIVE,vendingMachine);
        //vendingMachine.vendingMachineState.insertCoin(CoinType.FIVE,vendingMachine);
        vendingMachine.vendingMachineState.insertCoin(CoinType.FIVE,vendingMachine);

        vendingMachine.vendingMachineState.goToMenu(vendingMachine);
        vendingMachine.vendingMachineState.chooseProduct(new Item(ItemType.COKE,22),vendingMachine);
        System.out.println("Done Part1");

        for(int i=0;i<6;i++) {
            vendingMachine.vendingMachineState.insertCoin(CoinType.TEN, vendingMachine);
            vendingMachine.vendingMachineState.insertCoin(CoinType.TEN, vendingMachine);
            vendingMachine.vendingMachineState.insertCoin(CoinType.FIVE, vendingMachine);
            vendingMachine.vendingMachineState.goToMenu(vendingMachine);
            vendingMachine.vendingMachineState.chooseProduct(new Item(ItemType.COKE, 20), vendingMachine);
            System.out.println("Done Part"+(i+2));
        }

        //System.out.println(vendingMachine.vendingMachineState);



        vendingMachine.vendingMachineState.insertCoin(CoinType.TEN,vendingMachine);
        vendingMachine.vendingMachineState.insertCoin(CoinType.TEN,vendingMachine);
        vendingMachine.vendingMachineState.insertCoin(CoinType.FIVE,vendingMachine);
        vendingMachine.vendingMachineState.goToMenu(vendingMachine);
        vendingMachine.vendingMachineState.chooseProduct(new Item(ItemType.COKE,30),vendingMachine);
        System.out.println("Done Part3");
    }
}