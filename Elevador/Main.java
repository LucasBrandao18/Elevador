/*Crie uma classe Elevador para armazenar as informações de um elevador de prédio. 
A classe deve armazenar o andar atual (terreo = 0), total de andares no predio (desconsiderando o terreo), capacidade do elevador e quantas pessoas estao presentes nele.
A classe deve também disponibilizar os seguintes metodos:
Inicializar: que deve receber como parametros a capacidade do elevador e o total de andares no predio (os elevadores sempre comecam no terreo e vazio);
Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaco);

Sair: para remover uma pessoa do elevador (so deve remover se houver alguem dentro dele);

Subir: para subir um andar (nao deve subir se ja estiver no ultimo andar);

Descer: para descer um andar (nao deve descer se ja estiver no térreo);

Crie uma classe Elevador para armazenar as informacoes de um elevador de predio.*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      
    int (capacidade; totalAndares; andarAtual; pessoasPresentes);

    Elevador elevador = new Elevador();   
      
    Scanner scanner = new Scanner(System.in);
      
    System.out.println("Informe a capacidade do elevador: ");
    int capacidade = scanner.nextInt();
    System.out.println("Informe quantas pessoas estão no elevador: ");
    int pessoasPresentes = scanner.nextInt();
    System.out.println("Informe o andar atual: ");
    int andarAtual = scanner.nextInt();
    System.out.println("Informe o total de andares no prédio: ");
    int totalAndares = scanner.nextInt();

        
    elevador.inicializarElevador(capacidade, totalAndares, andarAtual, pessoasPresentes);
    elevador.imprimir(); 

    scanner.close();

  }

}

