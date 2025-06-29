package example;
public class MyService {
    private ExternalApi externalApi;
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }
    public void fetchData() {
        externalApi.getData();  // Interaction to be verified
    }
}
