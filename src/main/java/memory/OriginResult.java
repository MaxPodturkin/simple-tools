package memory;

public class OriginResult {

    private Float currentResult = 0F;

    public OriginResult(Float result) {
        this.currentResult = result;
    }

    public MementoResult createMementoResult() {
        return new MementoResult(currentResult);
    }

    public Float getCurrentResult() {
        return currentResult;
    }
}
