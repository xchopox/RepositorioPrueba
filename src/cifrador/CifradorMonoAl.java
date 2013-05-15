package cifrador;

/**
 *
 * @author xchopox@gmail.com
 */
public class CifradorMonoAl {
    //funcion Cifrador mono

    private int desplazamientoN = 0;
    char tablaCesar[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
         'M', 'N', 'O', 'P', 'Q', 'R', 'S','T', 'U', 'V', 'W', 'X', 'Y', 'Z'    };

    private int getDesplazamientoN() {
        return desplazamientoN;
        //Vamos a agregarle unas lineas por aquí
    }

    public void setDesplazamientoN(int desplazamientoN) {
        this.desplazamientoN = desplazamientoN;
        // y otras por acá
    }

    public char getTextoCifrado1(char parTextoClaro) {
        int indiceX = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoClaro == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }

        return tablaCesar[(indiceX + getDesplazamientoN()%26) % 26];
    }
        public char getTextoCifrado2(char parTextoClaro) {
        int indiceX = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoClaro == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }

        return tablaCesar[(indiceX + getDesplazamientoN()%26) % 26];
    }
}