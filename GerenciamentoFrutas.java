import java.util.HashSet; // Importa a classe HashSet para usar conjuntos sem duplicatas
import java.util.InputMismatchException; // Importa a exceção para capturar entradas incorretas
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class GerenciamentoFrutas { // Nome da classe principal
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para entrada de dados
        HashSet<String> frutas = new HashSet<>(); // Cria um HashSet para armazenar as frutas

        while (true) { // Inicia um loop infinito para o menu interativo
            try {
                // Exibe o menu de opções
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Adicionar uma fruta");
                System.out.println("2. Listar todas as frutas");
                System.out.println("3. Remover uma fruta");
                System.out.println("4. Verificar se uma fruta está presente");
                System.out.println("5. Sair");
                System.out.print("Opção: ");

                int opcao = scanner.nextInt(); // Lê a opção do usuário
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1: // Adicionar uma fruta
                        System.out.print("Digite o nome da fruta para adicionar: ");
                        String novaFruta = scanner.nextLine(); // Lê o nome da nova fruta
                        if (frutas.add(novaFruta)) { // Tenta adicionar a fruta no conjunto
                            System.out.println(novaFruta + " foi adicionada.");
                        } else {
                            System.out.println(novaFruta + " já está presente no conjunto.");
                        }
                        break;

                    case 2: // Listar todas as frutas
                        System.out.println("Frutas: " + frutas); // Exibe o conjunto de frutas
                        break;

                    case 3: // Remover uma fruta
                        System.out.print("Digite o nome da fruta que deseja remover: ");
                        String frutaRemover = scanner.nextLine(); // Lê o nome da fruta a ser removida
                        if (frutas.remove(frutaRemover)) { // Tenta remover a fruta
                            System.out.println(frutaRemover + " foi removida.");
                        } else {
                            System.out.println(frutaRemover + " não foi encontrada.");
                        }
                        break;

                    case 4: // Verificar se uma fruta está presente
                        System.out.print("Digite o nome da fruta para verificar: ");
                        String frutaVerificar = scanner.nextLine(); // Lê o nome da fruta a ser verificada
                        if (frutas.contains(frutaVerificar)) { // Verifica se a fruta está no conjunto
                            System.out.println(frutaVerificar + " está presente no conjunto.");
                        } else {
                            System.out.println(frutaVerificar + " não foi encontrada no conjunto.");
                        }
                        break;

                    case 5: // Sair do programa
                        System.out.println("Saindo...");
                        scanner.close(); // Fecha o Scanner
                        return; // Encerra o programa

                    default: // Caso o usuário insira uma opção inválida
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) { // Captura erros de tipo na entrada do usuário
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpa a entrada inválida
            }
        }
    }
}
