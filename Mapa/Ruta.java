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

    public Parada getDestino() {
        return destino;
    }

    public void setDestino(Parada destino) {
        this.destino = destino;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

}
