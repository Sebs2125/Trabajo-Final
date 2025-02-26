import java.util.ArrayList;
import java.util.List;


public class GestionRuta
{

    public class gestionRuta {
        private List<Ruta> rutas = new ArrayList<>();

        public void eliminarRuta(Ruta ruta) {
            rutas.remove(ruta);
        }
    }

}
