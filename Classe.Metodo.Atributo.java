public class Classe.Metodo.Atributo {
    public class Main {
        public static void main(String[] args) {
            // Criando um objeto da classe Carro
            Carro meuCarro = new Carro();
            
            // Atribuindo valores aos atributos
            meuCarro.modelo = "Fusca";
            meuCarro.cor = "Azul";
            meuCarro.ano = 1985;
    
            // Acessando os atributos
            System.out.println("Modelo: " + meuCarro.modelo);
            System.out.println("Cor: " + meuCarro.cor);
            System.out.println("Ano: " + meuCarro.ano);
    
            // Chamando os métodos
            meuCarro.dirigir();
            meuCarro.parar();
        }
    }
    
}
