package teste_programacao;


import java.math.BigDecimal;
import java.time.LocalDate;
//import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;


import Entidades.Funcionarios;


public class Teste  {
	
public static void main(String[] args) {

	List<Funcionarios> funcionario = new ArrayList<>();
	
	Scanner sc = new Scanner (System.in);
    int opcao;
    do {
    	Menu();
    	do {
    		System.out.print("Digite uma opcao: ");
    		opcao = sc.nextInt();
    		if(!validaMenu(opcao))
    			System.out.println("Opcao invalida, tente novamente...");
    	}while(!validaMenu(opcao));
        switch (opcao) {
		case 1: 
			
			insertEmployee(funcionario);
			
			break;
		
		case 2: 
			printBirthdays(funcionario);
			break;
		
		
		}
    }while (opcao != 0);
    
    sc.close();
    












}
public static void Menu() {
	System.out.println(" Prothera Tecnologia ");
    System.out.println("\t\tMENU");
    System.out.println("1. Inserir Funcionário");
    System.out.println("2. Remover Funcionário ");
    System.out.println("3. Lista todos os Funcionários");
    System.out.println("4. Aumento de 10%");
    System.out.println("5. Funcionários agrupados");
    System.out.println("6. Funcionários por função");
    System.out.println("7. Funcionários que fazem aniversário no mês 10 e 12");
    System.out.println("8. Funcionário com a maior idade");
    System.out.println("9. Funcionários por ordem alfabética");
    System.out.println("10.Total dos salários dos funcionários.");
    System.out.println("11.Quantidade de sálario minímo por funcionário.");
    System.out.println("0. Sair");
}

public static boolean validaMenu(int opcao) {
    if (opcao > 11 || opcao < 0)
        return false;
    else return true;
}


	
	private static void insertEmployee(List<Funcionarios> funcionario) {
		
		funcionario.add(new Funcionarios("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
		funcionario.add(new Funcionarios("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
		funcionario.add(new Funcionarios("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
		funcionario.add(new Funcionarios("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("1919.88"), "Diretor"));
		funcionario.add(new Funcionarios("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
		funcionario.add(new Funcionarios("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
		funcionario.add(new Funcionarios("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
		funcionario.add(new Funcionarios("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
		funcionario.add(new Funcionarios("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
		funcionario.add(new Funcionarios("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));	
		
	}
	

	
	private static void printBirthdays(List<Funcionarios> funcionarios) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Nome\t| Data de Nascimento | Salário | Função ");
        for (Funcionarios funcionario : funcionarios) {
        	int mes = funcionario.getDataNascimento().getMonthValue();
        	if(mes == 10 || mes == 12) {
        		  System.out.printf("%s\t| %s\t     | %.2f |  %s%n",
                          funcionario.getNome(),
                          funcionario.getDataNascimento().format(formatter),
                          funcionario.getSalario(),
                          funcionario.getFuncao());
        	}
          
        }
	}
	
}