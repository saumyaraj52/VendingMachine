public class ItemShelf {
    Item item;
    int ProductCode;

    boolean isPresent;

    public ItemShelf(Item item,int productCode)
    {
        this.isPresent = true;
        this.item = item;
        this.ProductCode = productCode;
    }
}
