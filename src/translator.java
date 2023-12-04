import java.util.HashMap;

public class translator {
    HashMap<Integer, String> numericAlpha = new HashMap<Integer, String>();


    public translator(Integer[] numeric, String[] alphabetic){
        for (int i = 0; i < alphabetic.length; i++){
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number){


        return numericAlpha.get(number);
    }


}

