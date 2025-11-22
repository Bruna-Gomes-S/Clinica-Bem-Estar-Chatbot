package clinica_bem_estar;

import java.util.Scanner;

public class chatbot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		boolean continuar = true;
	
	
		while (continuar) {
		System.out.println("Olá! Seja bem-vindo à Clínica Bem-Estar. ");
		System.out.println("Estamos aqui para te ajudar! ");
		System.out.println("Escolha a opção que deseja seguir: ");
		
		System.out.println("1. Cadastro ");		
		System.out.println("2. Tipos de exames ");		
		System.out.println("3. Locais e horários");		
		System.out.println("4. Sair ");		
		System.out.print("Digite uma opção: ");
		
		String entrada = sc.nextLine();
        try {
            opcao = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            continue;
        }
		switch (opcao) {
        case 1: {
        	System.out.println("Certo, você escolheu a opção cadastro");
    		System.out.println("Vamos realizar seu cadastro para agendamento de consulta");
    		System.out.print("Digite o seu nome: ");
    		String nome = sc.nextLine();
    		System.out.print("Digite sua idade: "); 
    		String idade = sc.nextLine();
    		System.out.print("Digite a sua data de nascimento (Ex: 01/01/2000): ");
    		String nascimento = sc.nextLine();
    		System.out.print("Digite o seu telefone: ");
    		String telefone = sc.nextLine();
    		System.out.println("Obrigado, " + nome + "!");
    		System.out.println("Cadastro realizado com sucesso. ");
    		continuar = false;
    		break;
        }
		
        case 2: {
			System.out.println("Certo, você escolheu tipos de exame");
			System.out.println("A seguir, estão os exames disponíveis em nossa clínica");
			System.out.println(" Hemograma completo");
			System.out.println(" Eletrocardiograma");
			System.out.println(" Ultrassonografia ");
			System.out.println(" Exame de glicemia ");
			continuar = false;
			break;
		}
        case 3: {
        	String enderecoFinal = "opcaoEndereco";
            String dataFinal = "";
            String horarioFinal = "";
        	
        	System.out.println("Certo, Locais e horários");
    		System.out.println("Selecione abaixo qual o endereço da clínica que você deseja agendar:");
    		System.out.println("1. Avenida Castelo Branco");
    		System.out.println("2. Setor Bueno");
    		System.out.println("3. Jardim América");
    		System.out.print("Digite uma opção: ");
    		String endereco = sc.nextLine();
    			
			switch (endereco) {
            case "1":
                enderecoFinal = "Avenida Castelo Branco";
                break;
            case "2":
                enderecoFinal = "Setor Bueno";
                break;
            case "3":
                enderecoFinal = "Jardim América";
                break;
            default:
                enderecoFinal = "Horário inválido";
    		}
        	
    		System.out.println("Temos as seguintes datas nesse endereço: ");
    		System.out.println("1. 18/04 ");
    		System.out.println("2. 19/04 ");
    		System.out.println("3. 20/04");
    		System.out.println("Digite uma opção: ");
    		String data = sc.nextLine();
    		
			switch (data) {
            case "1":
                dataFinal = "18/04";
                break;
            case "2":
                dataFinal = "19/04";
                break;
            case "3":
                dataFinal = "20/04";
                break;
            default:
                dataFinal = "Horário inválido";
            
        }
    		  		
    		System.out.println("Horários disponíveis: ");
    		System.out.println("1. 09:00 ");
    		System.out.println("2. 14:00 ");
    		System.out.println("3. 17:30 ");
    		System.out.println("Digite uma opção: ");
    		String horario = sc.nextLine();
			
    		switch (horario) {
            case "1":
                horarioFinal = "09:00";
                break;
            case "2":
                horarioFinal = "14:00";
                break;
            case "3":
                horarioFinal = "17:30";
                break;
            default:
                horarioFinal = "Horário inválido";
        }
    		
    		System.out.println("Sua consulta está agendada para o endereço: " + enderecoFinal + " para o dia " + dataFinal + " às " + horarioFinal + ".");
    		System.out.println("Entraremos em contato para confirmar sua consulta um dia antes. ");
    		System.out.println("Muito obrigado pela preferência! ");
    		continuar = false;
    		break;
        }
        case 4: {
        	System.out.println("Encerrando a conversa, Obrigado!");
        	continuar = false;
        	break;
        	
        }
        default:
            System.out.println("Opção inválida!");

        }
		}
		sc.close();
	}
}