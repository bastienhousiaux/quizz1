package be.bastienhousiaux.quizz.business.models.types;

public class AbstractTypedData<DataContentType> {
    private DataContentType data;

    public AbstractTypedData(DataContentType data) {
        this.data = data;
    }

    public DataContentType getData() {
        return data;
    }

    public void setData(DataContentType data) {
        this.data = data;
    }
}
