package metodo;

import cifrador.CifradorMonoAl;
import cifrador.DescifradorMonoAl;

/**
 *
 * @author sin_querer@hotmail.com
 */
public class SustitucionMonoalfabeticoDesplazamientoN {
    CifradorMonoAl
            cifradorSustitucionMonoalfabeticoDesplazamientoN = 
            new CifradorMonoAl();
    
    DescifradorMonoAl
            descifradorSustitucionMonoalfabeticoDesplazamientoN = 
            new DescifradorMonoAl();
    
    
    public void setDesplazamientoNCifrador(int desplazamientoN){
        cifradorSustitucionMonoalfabeticoDesplazamientoN.setDesplazamientoN(desplazamientoN);
    }

    public void setDesplazamientoNDescifrador(int desplazamientoN){
        descifradorSustitucionMonoalfabeticoDesplazamientoN.setDesplazamientoN(desplazamientoN);
    }
    
    public String encriptarTextoClaro(String textoClaro) {
        String textoCifrado = "";
        int contador = 0;
        for (int i = 0; i < textoClaro.length(); i++) {
            if(textoClaro.charAt(i) != ' '){
                if(contador==0||contador==3)
                    textoCifrado += cifradorSustitucionMonoalfabeticoDesplazamientoN.getTextoCifrado1(textoClaro.charAt(i)) + "";
                else
                    textoCifrado += cifradorSustitucionMonoalfabeticoDesplazamientoN.getTextoCifrado2(textoClaro.charAt(i)) + "";
                contador ++;//debe ir dentro del primer if para que no cuente los espacios en blanco
            }
            else
                textoCifrado += " ";

            if(contador >4)
                contador = 0;

        }
        return textoCifrado;
    }

    public String desencriptarTextoCifrado(String textoCifrado) {
        String textoClaro = "";
        int contador = 0;
        for (int i = 0; i < textoCifrado.length(); i++) {
            if(textoCifrado.charAt(i) != ' '){
                if(contador==0||contador==3)
                    textoClaro += descifradorSustitucionMonoalfabeticoDesplazamientoN.getTextoClaro1(textoCifrado.charAt(i)) + "";
                else
                    textoClaro += descifradorSustitucionMonoalfabeticoDesplazamientoN.getTextoClaro2(textoCifrado.charAt(i)) + "";
                contador ++;//debe ir dentro del primer if para que no cuente los espacios en blanco
            }
            else
                textoClaro += " ";


            if(contador > 4)
                contador = 0;

        }
        return textoClaro;
    }
}