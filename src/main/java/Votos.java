import java.util.Random;
public class Votos {
    public static void main(String[] args) {
        char[][] votos = new char[10][2];
        llenarVotos(votos);
        mostrarVotos(votos);
        mostrarCantSiHombres(votos);
        mostrarCantNoMujeres(votos);
        mostrarPorcentajeSiTotal(votos);
        mostrarNumDeEncuestados(votos);
    }
    public static void llenarVotos(char[][] votos) {
        for (int i = 0; i < votos.length; i++) {
            char genero = obtenerGenero();
            char voto = obtenerVoto();
            votos[i][0] = genero;
            votos[i][1] = voto;
        }
    }
    public static char obtenerGenero() {
        String alphabet = "HM";
        Random r = new Random();
        char c = alphabet.charAt(r.nextInt(alphabet.length()));
        return c;
    }
    public static char obtenerVoto(){
        String alphabet = "SXN";
        Random r = new Random();
        char c = alphabet.charAt(r.nextInt(alphabet.length()));
        return c;
        //public static void agregarDatos(char[][] votos, String artista, String album, String lanzamiento){
    }
    public static void mostrarVotos(char[][]votos){
        System.out.println("Sexo - Voto");
        for (int i = 0; i < votos.length; i++) {
            System.out.println(" " + votos[i][0] + "   -  " + votos[i][1]);
        }
    }
    public static int cantidadSiHombres(char[][]votos){
        int contador = 0;
        for (int i = 0; i < votos.length ; i++){
            if (votos[i][0] == 'H' ) {
                if (votos[i][1] == 'S') {
                    contador++;
                }
            }
        } return contador;
    }
    public static void mostrarCantSiHombres(char[][]votos){
        int cantidadSiHombres =cantidadSiHombres(votos);
        System.out.println(cantidadSiHombres +" Hombre(s) si aprueban la gestion del gobierno");
    }
    public static int cantidadNoMujeres(char[][]votos){
        int contador = 0;
        for (int i = 0; i < votos.length ; i++){
            if (votos[i][0] == 'M' ) {
                if (votos[i][1] == 'N') {
                    contador++;
                }
            }
        } return contador;
    }
    public static void mostrarCantNoMujeres(char[][]votos){
        int cantidadNoMujeres =cantidadNoMujeres(votos);
        System.out.println(cantidadNoMujeres +" Mujeres(s) no aprueban la gestion del gobierno");
    }
    public static int SiTotal(char[][]votos){
        int contador = 0;
        for (int i = 0; i < votos.length; i++) {
            if (votos[i][1] == 'S') {
                contador++;
            }

        } return contador;
    }
    public static int porcentajeSiTotal(char[][]votos){
        int siTotal = SiTotal(votos);
        return ((siTotal*100)/ votos.length);
    }
    public static void mostrarPorcentajeSiTotal(char[][]votos){
        int porcentajeSiTotal = porcentajeSiTotal(votos);
        System.out.println("El "+ porcentajeSiTotal + "% de los votos fueron Si");
    }
    public static void mostrarNumDeEncuestados(char[][]votos){
        System.out.println( votos.length + " Personas participaron de la encuesta");
    }

}

