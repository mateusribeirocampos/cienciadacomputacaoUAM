import java.io.FileInputStream;    // importação da classe FileInputStream
import java.io.FileNotFoundException; // importação FileNotFoundException
import java.io.IOException; // importação da classe IOException

public class InputStream {

    public static void main(String[] args) {
    
        try {
        
            FileInputStream leitura = new FileInputStream("Teste.txt");
            
            byte [] conteudoByte = new byte[leitura.available()];
            
            leitura.read(conteudoByte);
            
            String conteudoStr = new String(conteudoByte);
            
            leitura.close();
            
            System.out.println(conteudoStr);
            
        } catch (FileNotFoundException e) {
        
            System.out.println("Arquivo não encontrado!");
            
        } catch (IOException e) {
        
  	        System.out.println("Erro ao manipular arquivo!");
        
        }
    
    }

}
