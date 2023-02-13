package DesignPatterns.CreationalDesignPatterns.Enum;

public enum RegistryEnum {

    SAFE, //for example to test
    GETAVERAGEPSP("getAveragePSP"),
    GETINTELLIGENT("getIntelligent");
    String value;

    public String getValue() {
        return value;
    }
    RegistryEnum()
    {

    }
    RegistryEnum(String value)
    {
        this.value=value;
    }


}
