package pruebas;

import metodo.*;

public class Pruebas {

    public static void main(String[] args) {
        
        SustitucionMonoalfabeticoDesplazamientoN sustitucionMonoalfabeticoDesplazamientoN =
                new SustitucionMonoalfabeticoDesplazamientoN();

        int desplazamiento = 5;//Para cualquier valor de desplazamiento
        sustitucionMonoalfabeticoDesplazamientoN.setDesplazamientoNCifrador(desplazamiento);
        System.err.println("Encriptamos el texto claro...");
        String textoClaro = "HOLA MUNDO COMO ESTAS";
        String textoCifrado = sustitucionMonoalfabeticoDesplazamientoN.encriptarTextoClaro(textoClaro);
        System.out.println(textoCifrado);
        System.err.println("Ahora desencriptamos el resultado que nos dio la encriptaci�n anterior...");
        sustitucionMonoalfabeticoDesplazamientoN.setDesplazamientoNDescifrador(desplazamiento);
        System.out.println(sustitucionMonoalfabeticoDesplazamientoN.desencriptarTextoCifrado(textoCifrado));
        
    }
}