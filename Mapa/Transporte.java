import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Transporte
{
    private ArrayList<ArrayList<Integer>> listaAdyacencia;
    private Map<String, Integer> mapaVertice;
    private Map<String, Integer> mapaIndice;
    private int cantVertices = 0;

    public void Grafo ()
    {
        listaAdyacencia = new ArrayList<>();
        mapaVertice = new HashMap<>();
        mapaIndice = new HashMap<>();
        cantVertices = 0;
    }

    public void agregarVertice ( String Letra )
    {

        if ( !mapaVertice.containsKey( Letra ) )
        {
            mapaVertice.put( Letra, cantVertices );
            mapaIndice.put(Letra, cantVertices);
            listaAdyacencia.add( new ArrayList<>() );
            cantVertices++;
        }
    }

    public void agregarArista ( String inicio, String destino )
    {

        if ( mapaVertice.containsKey( inicio ) && mapaVertice.containsKey( destino ) )
        {
            Integer inicioInd = mapaVertice.get( inicio );
            Integer destinoInd = mapaVertice.get( destino );
            listaAdyacencia.get( inicioInd ).add( destinoInd );
            listaAdyacencia.get( destinoInd ).add( inicioInd );
        }

    }

    public void eliminarVertice ( String Letra )
    {
        if ( mapaVertice.containsKey( Letra ) )
        {
            Integer ind = mapaVertice.get( Letra );
            mapaVertice.remove( Letra );
            mapaIndice.remove( ind );
        }
    }

    public void eliminarArista ( String inicio, String destino )
    {

        if ( mapaVertice.containsKey( inicio ) && mapaVertice.containsKey( destino ) )
        {
            Integer inicioInd = mapaVertice.get( inicio );
            Integer destinoInd = mapaVertice.get( destino );
            listaAdyacencia.get( inicioInd ).remove( destinoInd );
            listaAdyacencia.get( destinoInd ).remove( inicioInd );
        }

    }

    public void modificarVertice ( String Letra, String nuevoNombre )
    {
        if ( mapaVertice.containsKey( Letra ) )
        {
            Integer ind = mapaVertice.get( Letra );
            mapaVertice.remove( Letra );
            mapaVertice.put( nuevoNombre, ind );
        }
    }

    public void modificarArista ( String inicio, String destino, String nuevoInicio, String nuevoDestino )
    {
        if ( mapaVertice.containsKey( inicio ) && mapaVertice.containsKey( destino ) )
        {
            Integer inicioInd = mapaVertice.get( inicio );
            Integer destinoInd = mapaVertice.get( destino );
            listaAdyacencia.get( inicioInd ).remove( destinoInd );
            listaAdyacencia.get( destinoInd ).remove( inicioInd );
            listaAdyacencia.get( inicioInd ).add(Integer.valueOf(nuevoInicio));
            listaAdyacencia.get( destinoInd ).add(Integer.valueOf(nuevoInicio));

        }
    }

    public void imprimirLista ()
    {
        for ( ArrayList<Integer> lista : listaAdyacencia )
        {
            System.out.println( lista );
        }
    }



}
