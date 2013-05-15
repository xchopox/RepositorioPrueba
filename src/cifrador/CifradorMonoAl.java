package cifrador;

/**
 *
 * @author felipe@uanaco.cl
 */
public class CifradorMonoAl {

    private int desplazamientoN = 0;
    char tablaCesar[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
         'M', 'N', 'O', 'P', 'Q', 'R', 'S','T', 'U', 'V', 'W', 'X', 'Y', 'Z'    };

    private int getDesplazamientoN() {
        return desplazamientoN;
    }

    public void setDesplazamientoN(int desplazamientoN) {
        this.desplazamientoN = desplazamientoN;
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