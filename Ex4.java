import java.util.Scanner;

//4. Foi feita uma pesquisa entre os 10000 habitantes de uma região 
//para coletar os seguintes dados: sexo
//(0-feminino, 1-masculino), idade e altura. 
//Faça um algoritmo que leia as informações coletadas e mostre as
//seguintes informações: (use o comando repita ate)
//a) média da idade do grupo;
//b) média da altura das mulheres;
//c) média da idade dos homens;
//d) percentual de pessoas com idade entre 18 e 45 anos (inclusive).

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("VAMOS INICAR A PESQUISA:");
		System.out.println("Por favor insira os dados de Idade e Altura");
		System.out.println("Primeira parte grupo feminino");

		Mulher mulher = new Mulher();
		System.out.println("Quantas dados de mulheres voce gostaria de inserir?");
		int contadorM = sc.nextInt();

		int somaIdadeMulher = 0;
		int mediaIdadeMulher = 0;
		double somaAlturaMulher = 0;
		double mediaAlturaMulher = 0;
		int contarIdadeEspecialM = 0;

		for (int i = 0; i < contadorM; i++) {
			System.out.println("Insira a Idade da mulher: ");
			mulher.idade = sc.nextInt();

			System.out.println("Insira a Altura da mulher: ");
			mulher.altura = sc.nextDouble();

			somaIdadeMulher = mulher.idade + somaIdadeMulher;
			mediaIdadeMulher = somaIdadeMulher / contadorM;

			somaAlturaMulher = mulher.altura + somaAlturaMulher;
			mediaAlturaMulher = somaAlturaMulher / contadorM;

			if (mulher.idade >= 18 && mulher.idade <= 45) {
				contarIdadeEspecialM = contarIdadeEspecialM + 1;
			}

		}
		System.out.println("Teste " + contarIdadeEspecialM);
		System.out.println("Muito Obrigado, vamos a segunda parte:");

		Homem homem = new Homem();
		System.out.println("Quantas dados de homens voce gostaria de inserir?");
		int contadorH = sc.nextInt();

		int somaIdadeHomem = 0;
		int mediaIdadeHomem = 0;
		double somaAlturaHomem = 0;
		double mediaAlturaHomem = 0;
		int contarIdadeEspecialH = 0;

		for (int i = 0; i < contadorH; i++) {
			System.out.println("Insira a Idade do homem: ");
			homem.idade = sc.nextInt();

			System.out.println("Insira a Altura do homem: ");
			homem.altura = sc.nextDouble();

			somaIdadeHomem = homem.idade + somaIdadeHomem;
			mediaIdadeHomem = somaIdadeHomem / contadorH;

			somaAlturaHomem = homem.altura + somaAlturaHomem;
			mediaAlturaHomem = somaAlturaHomem / contadorH;
			
			if (homem.idade >= 18 && homem.idade <= 45) {
				contarIdadeEspecialH++;
			}
		}
		System.out.println("Teste " + contarIdadeEspecialH);
		double mediatotal = (somaIdadeHomem + somaIdadeMulher) / (contadorH + contadorM);
				
		double teste1 = (contarIdadeEspecialH + contarIdadeEspecialM);
		System.out.println(teste1);
		double teste2 = (contadorH + contadorM);
		System.out.println(teste2);
		double mediaFinal = teste1 / teste2;

		System.out.println("A media de idade do grupo e: " + mediatotal);
		System.out.println("A media de altura das mulheres e: " + mediaAlturaMulher);
		System.out.println("A media de idade dos homems e: " + mediaIdadeHomem);
		System.out.println("O percentual de pessoal entre 18 e 45 anos e: " + mediaFinal + "%");

		sc.close();

	}

}
