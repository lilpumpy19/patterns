package adapter;

public class MemoryCardAdapter implements IUsb {
    private IMemoryCard memoryCard;

    public MemoryCardAdapter(IMemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void getInfo() {
        memoryCard.getInfo();
    }
}
