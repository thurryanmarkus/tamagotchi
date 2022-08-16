public class PrincipalThurryan{
    public static void main(String[] args){
        int random = 0;
        TamagotchiThurryan a = new TamagotchiThurryan();
        a.criarTamagotchi();
        a = new TamagotchiThurryan(a.getNomeConvidado(), a.getNome(), a.getIdade(), a.getPeso());
        a.infoInicialTamagotchi();
        a.infoTamagotchi();
        //A PARTIR DAQUI TEREMOS O CÓDIGO QUE FARÁ O TAMAGOTCHI CONTINUAR FUNCIONANDO ENQUANTO TIVER OS SEUS 15 DIAS DE VIDA.
        while(a.idade <= 15){
            //UTILIZANDO O MÉTODO Math.random() O SORTEIO DAS OPÇÕES ACONTECEM TODA VEZ QUE UMA AÇÃO FOR REALIZADA.
            random = (1 + (int) (Math.random() * 2));
            //NESTE if SÃO REALIZADAS AS AÇÕES QUANDO O TAMAGOTCHI FICAR COM FOME.
            if (random <= 1){
                System.out.println("\nEu estou com fome!!");
                a.comer();
                a.infoTamagotchi();
                //NESTE if O TAMAGOTCHI ACABA MORRENDO POR FICAR DESNUTRIDO QUANDO SEU PESO CHEGAR NO 0.
                if (a.peso <= 0){
                System.out.println("Seu amigo ficou desnutrido e infelizmente morreu, cuide melhor na próxima vez.  (╥﹏╥)");
                break;
                }
                //NESTE else if O TAMAGOTCHI EXPLODE POR COMER DEMAIS E SEU PESO FICAR ACIMA DE 20.
                else if (a.peso > 20){
                    System.out.println("MEU DEEEUS, seu amigo comeu muito e explodiu! Não alimente tanto na próxima vez.  (> ﹏ <)");
                    break;
                }
            }
            //NESTE else if SÃO REALIZADAS AS AÇÕES QUANDO O TAMAGOTCHI FICAR COM SONO.
            else if (random == 2){
                System.out.println("\nEu estou com sono!!");
                a.dormir();
                if (a.diasAcordado == 5){
                    System.out.println("\n### Já se passaram 5 dias e eu não aguento mais ficar acordado! Preciso de um descanso. ###");
                    a.idade ++;
                }
                a.infoTamagotchi();
            }
            //NESTE else if SÃO REALIZADAS AS AÇÕES QUANDO O TAMAGOTCHI FICAR ENTEDIADO E PRECISAR SE EXERCITAR.
            else if (random == 3){
                System.out.println("\nNesse momento estou meio entendiado de ficar parado, vamos fazer alguma coisa?");
                a.exercitar();
                a.infoTamagotchi();
                //ESTE if SERVE PARA PARAR O PROGRAMA QUANDO O TAMAGOTCHI FICAR DESNUTRIDO COM PESO 0 E MORRER.
                if (a.peso <= 0){
                    System.out.println("### Seu amigo ficou desnutrido e infelizmente morreu, cuide melhor na próxima vez. ###");
                    break;
                }
            }
            //ESTE if SERVE PARA ENCERRAR O CÓDIGO APÓS OS 15 DIAS DE VIDA, MOSTRANDO UMA MENSAGEM DE DESPEDIDA.
            if (a.idade > 15)
                System.out.println("Obrigado por toda essa vida de alegrias e brincadeiras, mas hoje ela chegou ao fim, até a próxima vida de aventuras  (◕‿◕)");
        }
    }
}