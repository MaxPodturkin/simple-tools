package memory;

public class MementoResult {

    private Float result;

    public MementoResult(Float result) {
        this.result = result;
    }

    public MementoResult createMemento(Float result) {
        return new MementoResult(result);
    }

    public Float getResult() {
        return result;
    }
}
