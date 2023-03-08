package String;

public class CharArt {
    static String valor = "MATEUS - JAVA";
    static String nome = "Mateus - java ";
    public static void main(String[] args) {

        //CharArt - Retorna o valor da posição especificado
        System.out.println(valor.charAt(0));
        System.out.println(nome.charAt(2));

        //codePointAt - retorna o valor em UNICODE
        System.out.println(nome.codePointAt(0));


        //compareTo e compareToIgnoreCase
        System.out.println(valor.compareTo("MATEUS - JAVA") == 0 ? true : false);
        System.out.println(valor.compareTo("MATEUS - java") == 0 ? true : false);
        System.out.println(valor.compareToIgnoreCase("MATEUS - JAVA") == 0 ? true : false);

        //endsWith - Verifca se a String termina com o valor especificado e startsWith - verifica se a String começa com o valor especificado 
        System.out.println(valor.endsWith("java"));
        System.out.println(valor.startsWith("MAT"));
        System.out.println(valor.startsWith("TE", 2));

        System.out.println(nome.endsWith("JAVA"));
        System.out.println(nome.startsWith("us", 4));
        

        //TocharArray - Converte uma String em um Array de char. 
        for(char c : valor.toCharArray()) {
            System.out.println("Char: " + c);
        }
        for (byte b : valor.getBytes()) {
            System.out.println("byte: " + b);
        }

        String campoString = null; //campoString.isEmpty() = Expection in thread "main" java.lang.NullPointerExpection at StringManager.main(StringManager.java:29)
        System.out.println(campoString);

        /*Uso do split sem o LIMIT */

        String[] valorSemSplit = valor.split("-");

        for(String s : valorSemSplit) {
            System.out.println(s);
        }

        /*Uso do split com o LIMIT */
        String curso = "Engenharia - Advogacia - Medicina - Odontologia";
        String[] valorComSplit = curso.split("-", 4);

        for(String s : valorComSplit) {
            System.out.println(s);
        }

        //Sbstring - retorna um nova String e subSequence - retorna um CharSequence

        System.out.println(curso.subSequence(0, 5));
        System.out.println(curso.substring( 0, 5));

        //toLowerCase - converte toda String para caixa baixa, toUpperCase - converte toda String para caixa alta e trim - remove os espaços em branco no inicial e no final da String.

        System.out.println(valor.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(valor.trim());

        //valueOf - método converte divertos tipos para String
        //boolean
        boolean myBoolean = true;
        System.out.println(String.valueOf(myBoolean));
        
        //float
        float myFloat = -10;
        System.out.println(String.valueOf(myFloat));

        //double
        double myDouble = 10.30;
        System.out.println(String.valueOf(myDouble));

        //int
        int myInt = 10;
        System.out.println(String.valueOf(myInt));
               
        //format - realiza a formatação de uma String de acordo com as especifícações passadas
        String result = String.format("Hoje nos processamos %,d transações", 100000);
        System.out.println(result);

        result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
        System.out.println(result);
    }
}
