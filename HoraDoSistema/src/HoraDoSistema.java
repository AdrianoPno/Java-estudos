import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;


public class HoraDoSistema {
    public static void main(String[] args) throws Exception {
        Date relogio = new Date();
        System.out.println("A Hora do sistema é: ");
        System.out.println(relogio.toString());
            Locale loc = Locale.getDefault();
            System.out.println("O idioma do sistema é: ");
            System.out.println(loc.getDisplayLanguage());
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();
                System.out.println("A resolucao do sistema é: " + d.width +" X " + d.getHeight());
    } 
}
