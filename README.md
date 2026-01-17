Projeto Integrador I-A: Chatbot Clínica Bem-Estar (Java)


Este repositório contém a implementação em Java de um chatbot para a Clínica Bem-Estar. O sistema foi desenvolvido como parte do Projeto Integrador I-A na Escola Politécnica da PUC Goiás.
+1

👥 Autores

Ana Clara Rodrigues de Oliveira Castilho 


Bruna Gomes da Silva 


Pedro Henrique Clay de Lima Gonçalves 

🚀 Funcionalidades do Código
O programa foi estruturado para simular um fluxo de atendimento real, utilizando estruturas de repetição e condicionais em Java para gerenciar as seguintes opções:


Menu Principal Interativo: Utiliza um laço de repetição (como while ou do-while) para manter o atendimento ativo até que o usuário escolha a opção "Sair".
+2


Módulo de Cadastro: Captura de dados do tipo String para nome, especialidade e período, além de validar entradas de data e telefone.
+4


Consulta de Exames: Exibição de uma lista pré-definida de exames disponíveis na unidade.


Agendamento por Localidade: Sistema de sub-menus para escolha de endereços (Avenida Castelo Branco, Setor Bueno ou Jardim América) com seleção de datas e horários específicos.
+2

🛠️ Tecnologias e Conceitos Aplicados
Linguagem: Java.


Entrada de Dados: Classe Scanner para capturar as interações do usuário via console.
+2


Estruturas de Controle: switch-case para o menu principal e if-else para validações de agendamento.
+2


Saída de Dados: System.out.println para a interface de diálogo com o paciente.
+2

📋 Fluxo de Execução Exemplo
O sistema exibe as boas-vindas e o menu.
+1

O usuário seleciona Opção 1 (Cadastro).

O programa solicita dados como Nome e Telefone.
+1

Após o preenchimento, o sistema confirma o sucesso do cadastro.

O usuário pode prosseguir para agendar local e horário na Opção 3.

O sistema encerra ao digitar Opção 4
