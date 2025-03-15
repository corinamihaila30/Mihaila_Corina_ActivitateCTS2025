package bakery.singleton;

public class Sweet {
    private String code;

    public Sweet(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "code='" + code + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }
}
