package model;
import java.util.HashMap;
import java.util.Map;

public class database {
    private static Map<String, String[]> products = new HashMap<>();    static {
        products.put("at",new String[] {"Arroz thatiana","30"});
      products.put("bp",new String[] {"Feijao preto","39"});
      products.put("msa",new String[] {"Macarrao santa Amalia","25"});
    }
    public static String[] selectProduct(String code){
        return products.get(code);
    }
}
