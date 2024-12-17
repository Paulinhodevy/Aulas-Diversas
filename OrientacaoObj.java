import java.util.Scanner;

//Classe Base ("Classe Carro")
class Carro {

    //Atributos
    private String cor;
    private String modelo;
    private int velocidade;

    // Construtor
    public Carro(String cor, String modelo, int velocidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
        }

        //Métodos 
        public void acelerar(int incremento) {
            this.velocidade += incremento;
            System.out.println("O carro acelerou para" + this.velocidade + "km/h.");
        }

        public void frear() {
            this.velocidade = 0;
            System.out.println("O carro parou.");
            }

            //Metodos de Encapsulamento ( Getters e Setters )
            public int getVelocidade() {
                return this.velocidade;
            }

            public void setvelocidade(int velocidade) {
                if (velocidade >= 0) {
                    this.velocidade = velocidade;
                    System.out.println("Velocidade ajustada para" + this.velocidade + "km/h");
                } else {
                    System.out.println("Velocidade não pode ser negativa!")
                }
            }
}

// Herança - "Class CarroEsportivo" Herda de "Carro"
class CarroEsportivo extends Carro {
    private boolean turbo;

    //Construtor
    public CarroEsportivo(String cor, String modelo, int velocidade, boolean turbo) {
        super(cor, modelo, velocidade); // Chama o construtor da classe base "Carro"
        this.turbo = turbo;
    }

    //Sobrescrevendo o método "Acelerar" (Polimorfismo)
    @Override
    public void acelerar(int incremento) {
        if (this.turbo) {
            incremento *= 2; // Acelera mais rapido se o turbo estiver ativado
            System.out.println("Turbo ativado");
        }
        ola my friends 

        super.acelerar(incremento); //Chama o método da classe base "carro"
            }
}

//