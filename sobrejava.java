public class sobrejava {
    public static void main(String[] args) {
        
// VÁRIAVEIS E TIPOS DE DADOS...
        //    int = Para números inteiros.
        // Double = Para números decimais.
        //   Char = Para caracteres.
        // String = Para cadeias de caracteres.

        //Veja abaixo os exemplos;

        int idade = 25;
        double altura = 1.75;
        char letra = 'A';
        String nome = "João";

//ESTRUTURAS DE CONTROLE...

//Condicionais (if , else)
if se sim .  else se não.

        if (idade >= 18) {
            System.out.prinln("Adulto");
            } else {
                System.out.println("Menor de idade");
            }

            //AGORA LAÇOS DE REPETIÇÃO >> (For) e (While)...

            for (int i = 0; i <5; i++) {
                System.out.println("Número: " + i);
            }

            int j = 0;
            while (j < 5) {
                System.out.println("Número: " j);
                j++;
                        }

                        //Funções (Métodos)
                        //Funções são blocos de códigos que realizam uma tarefa específica.

                        public static int soma (int a, int b) {
                            return a + b;
                        } 

                        //Array
                        //arrays são usados para armazenar múltiplos valores em uma única variável.
                        
                        int[] numeros = {1,2,3,4,5};
                        System.out.println(numeros[0]);

                        // Orientação a Objetos 
                        // Java é uma linguagem orientada a objetos. Aqui estão os conceitos pincipais:

                        class Pessoa {
                            String nome;
                            int idade;

                            void apresentar() {
                                System.out.println("Meu nome é " + nome)
                            }
                        }
                        Pessoa pessoa1 = new Pessoa();
                        pessoa1.nome = "Maria";
                        pessoa1.idade = 30;
                        pessoa1.apresentar(); //Imprime "Meu nome é Maria"
                        
















    }
    
}
