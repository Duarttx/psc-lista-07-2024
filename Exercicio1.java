import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> mesList = new ArrayList<String>();
        ArrayList<Double> temperaturaMedia = new ArrayList<Double>();
        
        double mediaMes, mediaAnual = 0, somaAnual = 0;

        mesList.add("1 - Janeiro");
        mesList.add("2 - Fevereiro");
        mesList.add("3 - Março");
        mesList.add("4 - Abril");
        mesList.add("5 - Maio");
        mesList.add("6 - Junho");
        mesList.add("7 - Julho");
        mesList.add("8 - Agosto");
        mesList.add("9 - Setembro");
        mesList.add("10 - Outubro");
        mesList.add("11 - Novembro");
        mesList.add("12 - Dezembro");

        for(int i = 0; i < 12; i++){
            System.out.print(mesList.get(i) + ": ");
            mediaMes = input.nextDouble();
            temperaturaMedia.add(mediaMes);
            somaAnual += mediaMes;
        }

        mediaAnual = somaAnual / 12;

        System.out.println("Média anual das temperaturas: " + mediaAnual);
        System.out.println("Meses com temperatura acima da média anual:");

        for(int i = 0; i < 12; i++){
            if (temperaturaMedia.get(i) > mediaAnual) {
                System.out.println(mesList.get(i) + ": " + temperaturaMedia.get(i));
            }
        }

        input.close();
    }
}

    

