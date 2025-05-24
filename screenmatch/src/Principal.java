import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Episodio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Ready player one", 2021);
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(6.66);
        miPelicula.evalua(8.66);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La Casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeOmar = new Pelicula("El Señor de los anillos", 2001);
        peliculaDeOmar.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(peliculaDeOmar);
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaPeliculas.size());
        System.out.println("La primera película es: " + listaPeliculas.get(0).getNombre());

        System.out.println(listaPeliculas.toString());

        System.out.println("toString de la película: " + listaPeliculas.get(0).toString());
    }
}
