package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    void filtra(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy bien evaluado en el momento.");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular, pero no tan bueno.");
        } else {
            System.out.println("Película para ver después.");
        }
    }
}
