package cifrador;

/**
 *
 * @author sin_querer
 */
public class DescifradorMonoAl {

    private static int desplazamientoN = 0;
    char tablaCesar[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
         'M', 'N', 'O', 'P', 'Q', 'R', 'S','T', 'U', 'V', 'W', 'X', 'Y', 'Z'    };

    private int getDesplazamientoN() {
        return desplazamientoN;
    }

    public void setDesplazamientoN(int desplazamientoN) {
        this.desplazamientoN = desplazamientoN;
    }

    public char getTextoClaro1(char parTextoCifrado) {
        int indiceX = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoCifrado == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }

        return tablaCesar[(indiceX + (26 - getDesplazamientoN()%26)) % 26];
    }
        public char getTextoClaro2(char parTextoCifrado) {
        int indiceX = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoCifrado == tablaCesar[i]) {
                indiceX = i-14;
                break;
            }
        }

        return tablaCesar[(indiceX + (26 - getDesplazamientoN()%26)) % 26];
    }
}