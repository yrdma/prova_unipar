import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoas = 0;
        int taffismo = 0;
        int patinho = 0;
        int lucas = 0;
        int sportRedes = 0;

        String[] times = {"Taffismo Club", "Patinho Branquinho" ,"Lucas FC" ,"Sport Redes FC"};

        System.out.println("Digite o número de pessoas que vão participar da votação:");
        pessoas = sc.nextInt();
        int votos[] = new int[pessoas];

        for (int i = 0; i < pessoas;i++){
            System.out.println("Para votar digite os seguintes números:");
            System.out.println("80 - Taffismo Club");
            System.out.println("70 - Patinho Branquinho");
            System.out.println("60 - Lucas FC");
            System.out.println("50 - Sport Redes FC");
            votos[i] = sc.nextInt();

        if (votos[i] == 80){
            taffismo++;
        } else if (votos[i] == 70) {
            patinho++;
        } else if (votos[i] == 60) {
            lucas++;
        } else if (votos[i] == 50) {
            sportRedes++;

        }else {
            System.out.println("time inválido vote novamente:");
            i--;

        }
            if (taffismo > patinho && taffismo > sportRedes && taffismo > lucas) {
                System.out.println("Taffismo Club ganhou");
            } else if (patinho > taffismo && patinho > sportRedes && patinho > lucas) {
                System.out.println("Patinho Branquinho ganhou");
            } else if (lucas > taffismo && lucas > sportRedes && lucas > patinho) {
                System.out.println("Lucas FC ganhou");
            } else if (sportRedes > taffismo && sportRedes > lucas && sportRedes > patinho ) {
                System.out.println("Sport Redes FC ganhou");
            }else {
                System.out.println("deu empate obrigado fique na dúvida de quem empatou ");
            }


        }




}
}