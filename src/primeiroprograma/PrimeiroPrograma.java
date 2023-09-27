package primeiroprograma;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        
        // Instanciando
        //
        Date relogio = new Date();        
        
        // Escrevendo na tela as informações
        //
        System.out.println("Horário do sistema: ");
        System.out.println(relogio.toString() + "\n\n");
        System.out.println("O idioma do seu sistema é " + Locale.getDefault() + "\n\n");
        System.out.println("O tamanho da sua tela é " + Toolkit.getDefaultToolkit().getScreenSize().height + " x " + Toolkit.getDefaultToolkit().getScreenSize().width + "\n\n");
        
    }

}
