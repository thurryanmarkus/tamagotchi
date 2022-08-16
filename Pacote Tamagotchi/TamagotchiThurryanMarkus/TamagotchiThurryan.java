public class TamagotchiThurryan{
    String nomeConvidado;
    String nome;
    int idade;
    int peso;
    int dormir = 0;
    int comer = 0;
    int diasAcordado = 0;
    
    public TamagotchiThurryan(){
        
    }
    
    public TamagotchiThurryan(String nomeConvidado, String nome, int idade, int peso){
        this.nomeConvidado = nomeConvidado;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    public String getNomeConvidado(){
        return nomeConvidado;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getPeso(){
        return peso;
    }
    //ESTE MÉTODO, SERVIRÁ PARA A CRIAÇÃO DO NOVO TAMAGOTCHI.
    public void criarTamagotchi(){
        nomeConvidado = Teclado.leString("Digite o seu nome: ");
        nome = Teclado.leString("Digite o nome do seu Tamagotchi: ");
        idade = 0;
        peso = 1;
    }
    //NESTE MÉTODO SERÁ COLOCADA AS OPÇÕES QUE DEVEM SER ESCOLHIDAS NO MOMENTO EM QUE O TAMAGOTCHI SENTIR FOME.
    public void comer(){
        int comer = Teclado.leInt("\n1 - COMER MUITO\n2 - COMER POUCO\n3 - NÃO COMER");
        if (comer == 1){
            System.out.println("\n###   Você comeu muito e precisou dormir.   ###");
            peso = peso + 5;
            idade = idade + 1;
        }
        else if (comer == 2){
            peso = peso + 1;
        }
        else if (comer == 3){
            peso = peso - 2;
        }
    }
    //NESTE MÉTODO SERÁ COLOCADA AS OPÇÕES QUE DEVEM SER ESCOLHIDAS NO MOMENTO EM QUE O TAMAGOTCHI SENTIR SONO.
    public void dormir(){
        int dormir = Teclado.leInt("\n1 - DORMIR\n2 - PERMANECER ACORDADO");
        if (dormir == 1){
            idade ++;
        }
        else if (dormir == 2){
            diasAcordado ++;
        }
    }
    //NESTE MÉTODO SERÁ COLOCADA AS OPÇÕES QUE DEVEM SER ESCOLHIDAS NO MOMENTO EM QUE O TAMAGOTCHI FICAR ENTEDIADO E PRECISAR SE EXERCITAR.
    public void exercitar(){
        int exercitar = Teclado.leInt("\n1 - CORRER 10 MINUTOS\n2 - CAMINHAR 10 MINUTOS");
        if (exercitar == 1){
            peso = peso - 4;
            System.out.println("\n###   Você ficou muito cansado e precisou repor a energia comendo muito.   ###");
            peso = peso + 5;
            idade = idade + 1;
        }
        else if (exercitar == 2){
            peso = peso - 1;
            System.out.println("\n###   Você ficou um pouco cansado e precisa repor suas energias.   ###");
            System.out.println("\n****************************************************************");
            System.out.println("  Nome: "+nome+"   |  Idade: "+idade+"   |   Peso: "+peso+"   |   Dono: "+nomeConvidado);
            System.out.println("****************************************************************");
            int comer = Teclado.leInt("\n1 - COMER MUITO\n2 - COMER POUCO\n3 - NÃO COMER");
            if (comer == 1){
            System.out.println("\n###   Você comeu muito e agora precisa descansar um pouco.   ###");
            peso = peso + 5;
            idade = idade + 1;
            }
            else if (comer == 2){
            peso = peso + 1;
            }
            else if (comer == 3){
            peso = peso - 2;
            }
        }
    }
    //COM ESTE MÉTODO, O TAMAGOTCHI DÁ AS BOAS VINDAS AO NOVO DONO, AGRADECENDO PELO NOME ESCOLHIDO PELO USUÁRIO.
    public void infoInicialTamagotchi(){
        System.out.println("\nOlá,"+nomeConvidado+"!\nEu me chamo "+nome+".  (◕‿◕)\nAmei o meu nome e sei que foi você quem pensou nele. Muito Obrigado!");
    }
    //COM ESTE MÉTODO, AS INFORMAÇÕES SERÃO DISPONIBILIZADAS TODA A VEZ QUE O USUÁRIO ESCOLHER UMA AÇÃO PARA O TAMAGOTCHI.
    public void infoTamagotchi(){
        System.out.println("\n****************************************************************");
        System.out.println("Nome: "+nome+"   |  Idade: "+idade+"   |   Peso: "+peso+"   |   Dono: "+nomeConvidado);
        System.out.println("****************************************************************");
    }
}