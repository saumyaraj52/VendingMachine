import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<ItemShelf> itemShelfList;

    public Inventory()
    {
        this.itemShelfList = new ArrayList<>(20);
        for(int i=0;i<20;i++)
        {
            if(i<5)
                this.itemShelfList.add(new ItemShelf(new Item(ItemType.COKE,20),100+i));
            else if(i<10)
                this.itemShelfList.add(new ItemShelf(new Item(ItemType.PEPSI,15),100+i));
            else if(i<15)
                this.itemShelfList.add(new ItemShelf(new Item(ItemType.FANTA,10),100+i));
            else
                this.itemShelfList.add(new ItemShelf(new Item(ItemType.SPRITE,5),100+i));
        }
    }

    public void printInventory()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println(this.itemShelfList.get(i).item.itemType+"  "+this.itemShelfList.get(i).isPresent);
        }
    }


    public boolean removeItem(Item item) {
        for(int i=0;i<20;i++)
        {
            if(this.itemShelfList.get(i).item.itemType == item.itemType&&this.itemShelfList.get(i).isPresent==true) {
                this.itemShelfList.get(i).isPresent = false;
                return true;
            }
        }
        return false;

    }
}
