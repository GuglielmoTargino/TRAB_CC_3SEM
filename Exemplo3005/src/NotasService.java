
public class NotasService {

    public static String verificarAprovacao(double nota, int nAulas, int nFaltas) {

        double limiteFaltas;
        limiteFaltas = nAulas * 25 / 100;
        if (nota < 6 || nFaltas > limiteFaltas) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }

    }
     public static String verificarAprovacao(double nota) {

            
        if (nota < 6) {
            return "Reprovado";
        } else {
            return "Aprovado";
        }

     }
}
