/*Crie uma classe Elevador para armazenar as informações de um elevador de prédio. 
A classe deve armazenar o andar atual (terreo = 0), total de andares no predio (desconsiderando o terreo), capacidade do elevador e quantas pessoas estao presentes nele.
A classe deve também disponibilizar os seguintes metodos:
Inicializar: que deve receber como parametros a capacidade do elevador e o total de andares no predio (os elevadores sempre comecam no terreo e vazio);
Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaco);

Sair: para remover uma pessoa do elevador (so deve remover se houver alguem dentro dele);

Subir: para subir um andar (nao deve subir se ja estiver no ultimo andar);

Descer: para descer um andar (nao deve descer se ja estiver no térreo);

Crie uma classe Elevador para armazenar as informacoes de um elevador de predio.*/

class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

  public int getandarAtual() {
      return andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
      this.andarAtual = andarAtual;
  }

  public int getTotalAndares() {
      return totalAndares;
  }

  public void setTotalAndares(int totalAndares) {
      this.totalAndares = totalAndares;
  }

  public int getCapacidade() {
      return capacidade;
  }
  public void setCapacidade(int capacidade){
      this.capacidade = capacidade;
  }
  public int getPessoasPresentes(){
      return pessoasPresentes;
  }
  public void setPessoasPresentes(int pessoasPresentes){
      this.pessoasPresentes = pessoasPresentes;
  }
  
  public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; 
        this.pessoasPresentes = 0; 
    }
    
  public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
    
  public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    
  public void status() {
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Total de Andares: " + totalAndares);
        System.out.println("Andar Atual: " + andarAtual);
        System.out.println("Pessoas Presentes: " + pessoasPresentes);
    }
    
  public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar mais pessoas.");
        }
    }
    
  public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador já está vazio. Não é possível sair mais pessoas.");
        }
    }
    
  public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }
    
  public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }
}