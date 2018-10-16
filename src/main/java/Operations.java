import memory.MementoResult;
import memory.OriginResult;

public class Operations {

    private Float value = 0F;
    private OriginResult result;
    private MementoResult mementoResult;

    public Float addition(Float nextValue) {
        value = value + nextValue;
        return value;
    }

    public Float subtraction(Float nextValue) {
        value = value - nextValue;
        return value;
    }

    public Float division(Float nextValue) {
        value = value / nextValue;
        return value;
    }

    public Float multiplication(Float nextValue) {
        value = value * nextValue;
        return value;
    }

    public void result() {
        result = new OriginResult(value);
    }

    public void memorize() {
        mementoResult = result.createMementoResult();
    }

    public Float getMementoResult() {
        return mementoResult.getResult();
    }
}
