package desafio.classe;

public class Pessoa {
    String nome = "";
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    /**
     * 
     * @param c do tipo Comida
     * @return peso adcicionado ao que comeu
     */
    double Comer(Comida c) {
        this.peso = this.peso + c.peso;
        return this.peso;
    }

}
