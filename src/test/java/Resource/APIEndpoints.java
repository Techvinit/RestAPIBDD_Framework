package Resource;

public enum APIEndpoints {

   LoginAPI("/api/ecom/auth/login");

    private String resource;
    APIEndpoints(String resource){

        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }
}
