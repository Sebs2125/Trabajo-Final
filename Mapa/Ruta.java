public class Ruta
{

    Parada destino;
    private int tiempo;
    private int costo;
    private int distancia;

    public Ruta ( Parada destino, int tiempo, int costo, int distancia )
    {
        this.destino = destino;
        this.tiempo = tiempo;
        this.costo = costo;
        this.distancia = distancia;
    }

}
