import java.util.HashSet;
import java.util.Set;

/*public class Parada
{
    private String nombre;

    public Parada ( String nombre )
    {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    */

        public class Parada {

            private String nombre;
            private Set<String> tiposDeTransporte; // agregue esto asi podemos manejar los tipos de transporte que habiamos hablado

            public Parada(String nombre) {
                this.nombre = nombre;
                this.tiposDeTransporte = new HashSet<>();
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public void agregarTransporte(String tipo) {
                tiposDeTransporte.add(tipo);
            }

            public void eliminarTransporte(String tipo) {
                tiposDeTransporte.remove(tipo);
            }

            public boolean tipoTransportePorParada(String tipo) {
                return tiposDeTransporte.contains(tipo);
            }

            public Set<String> getTiposDeTransporte() {
                return tiposDeTransporte;
            }







    }

