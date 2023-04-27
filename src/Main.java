import com.Ruth.clases.Consola;
import com.Ruth.clases.Corbeta;
import com.Ruth.clases.Lancha;
import com.Ruth.clases.Puerto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        float precioMerluza = 11f;
        Puerto puertoMiramar = new Puerto("Puerto Miramar");

        Lancha lancha1 = new Lancha("HI326", "Barquin", "m01", 100f, 300);
        Lancha lancha2 = new Lancha("OK626", "Barquin", "m01", 60f, 150);
        Lancha lancha3 = new Lancha("MA265", "Barquin", "m01", 80f, 200);
        Lancha lancha4 = new Lancha("OK65+", "Barquin", "m01", 100f, 300);

        Corbeta corbeta1 = new Corbeta("IK987", "Barcon", "m09", 100f, 10);
        Corbeta corbeta2 = new Corbeta("JU587", "Barcon", "m09", 50f, 10);
        Corbeta corbeta3 = new Corbeta("OI976", "Barcon", "m09", 100f, 6);
        Corbeta corbeta4 = new Corbeta("TH597", "Barcon", "m09", 150f, 16);

        puertoMiramar.agregarBarco(lancha1);
        puertoMiramar.agregarBarco(lancha2);
        puertoMiramar.agregarBarco(lancha3);
        puertoMiramar.agregarBarco(lancha4);
        puertoMiramar.agregarBarco(corbeta1);
        puertoMiramar.agregarBarco(corbeta2);
        puertoMiramar.agregarBarco(corbeta3);
        puertoMiramar.agregarBarco(corbeta4);

        Consola.escribir("\n⛵⚓⛵ EL PUERTO 1er Estado ⛵⚓⛵" + puertoMiramar.toString());

        puertoMiramar.todosAPescar();
        Consola.escribir("\n\n⛵⚓⛵ EL PUERTO 2do Estado ⛵⚓⛵" + puertoMiramar.toString());

        puertoMiramar.todosDeRegreso();
        Consola.escribir("\n\n⛵⚓⛵ EL PUERTO 3er Estado ⛵⚓⛵" + puertoMiramar.toString());

        /// RESULTADOS DE LA PESCA
        float pescaLanchas = puertoMiramar.totalPescadoLanchas();
        float pescaCorbetas = puertoMiramar.totalPescadoCorbetas();
        Consola.escribir("\n Las lanchas pescaron " + pescaLanchas + "kg, y las corbetas " + pescaCorbetas + "kg.");
        Consola.escribir("\n En total se pescaron " + (pescaLanchas+pescaCorbetas) + "kg, lo que equivale a " +
                ((pescaLanchas+pescaCorbetas)*precioMerluza) + "dolares.");

        Consola.escribir("\n\n⛵⚓⛵ EL PUERTO 4to Estado (TODO en PUERTO, y en 0hs) ⛵⚓⛵" + puertoMiramar.toString());
    }
}