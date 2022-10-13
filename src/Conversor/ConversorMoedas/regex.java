package Conversor.ConversorMoedas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

    public String regexPrice(String inputDaAPI) { 
      try {
      
        String regex = "[\\d]+[.][\\d]+";
        Pattern padrao = Pattern.compile(regex);
        Matcher combinador = padrao.matcher(inputDaAPI);
        combinador.find();
        
        return combinador.group();

      } catch (Exception e) {
        System.out.println(e);
        return e.toString();
      }
      
    }
}