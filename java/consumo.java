package java;
import java.util.Scanner;

public class consumo {
    public static void main (String[] args){
        double km, litros, preco, consumo;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da gasolina: ");
        preco = leia.nextDouble();
        System.out.println("Digite a quilometragem percorrida: ");
        km = leia.nextDouble();
        // System.out.println("Digite a capacidade do tanque: ");
        // tanque = leia.nextDouble();
        System.out.println("Digite a quantidade abadtecida: ");
        litros = leia.nextDouble();

        consumo = km/litros;
        preco = preco*litros;

        System.out.println("===<<<CAUCÚLO DE CONSUMO>>>===");
        System.out.println("O consumo do veiculo é de: "+consumo+" km/l");
        System.out.println("O preço gasto foi de: "+preco+"R$");
        leia.close();
    }
    
}
