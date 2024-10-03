import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alinhamentos = 0;
        int alinhamentosBons = 0;
        int alinhamentosRuins = 0;
        double valorTotal = 0.0;
        double media = 0.0;

        System.out.println("Digite a quantidade de alinhamentos:");
        alinhamentos = sc.nextInt();
        double avaliacaoAlinhamentos[] = new double[alinhamentos];

        for (int i = 0; i < alinhamentos;i++){
            System.out.println("Digite a nota do " + (i+1) + "° alinhamento:");
            avaliacaoAlinhamentos[i] = sc.nextDouble();


            if (avaliacaoAlinhamentos[i] <= -1 || avaliacaoAlinhamentos[i] > 10){
                System.out.println("Nota inválida digite novamente");
                i--;
            } else if (avaliacaoAlinhamentos[i] < 6) {
                alinhamentosRuins++;
                valorTotal += avaliacaoAlinhamentos[i];
            }else if (avaliacaoAlinhamentos[i] >= 6) {
                alinhamentosBons++;
                valorTotal += avaliacaoAlinhamentos[i];
            }
        }

        media = valorTotal / alinhamentos;

        System.out.println("A quantidade de avaliações ruins são: " + alinhamentosRuins);
        System.out.println("A quantidade de avaliações boas são: " + alinhamentosBons);
        System.out.println("A média das avaliações é: " + media);




    }
}