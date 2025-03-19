package POO.Exercicio18;

class Automovel {
    String modelo;
    String cor;
    int ano;

    Automovel(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    void ligar() {
        System.out.println("O automóvel está ligado.");
    }

    void desligar() {
        System.out.println("O automóvel está desligado.");
    }
}

class Carro extends Automovel {
    Carro(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    void ligar() {
        System.out.println("O carro está ligado.");
    }
}

class Moto extends Automovel {
    Moto(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    void ligar() {
        System.out.println("A moto está ligada.");
    }
}

class Guincho extends Automovel {
    Guincho(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    void carregar(Automovel automovel) {
        System.out.println("O guincho está carregando o automóvel: " + automovel.modelo);
    }
}

class CarroAutomatico extends Carro {
    boolean freioPressionado;

    CarroAutomatico(String modelo, String cor, int ano, boolean freioPressionado) {
        super(modelo, cor, ano);
        this.freioPressionado = freioPressionado;
    }

    void ligar() {
        if (freioPressionado) {
            System.out.println("O carro automático está ligado.");
        } else {
            System.out.println("É necessário pressionar o freio para ligar o carro automático.");
        }
    }
}

class MotoPartidaPedal extends Moto {
    boolean aceleradorPuxado;

    MotoPartidaPedal(String modelo, String cor, int ano, boolean aceleradorPuxado) {
        super(modelo, cor, ano);
        this.aceleradorPuxado = aceleradorPuxado;
    }

    void ligar() {
        if (aceleradorPuxado) {
            System.out.println("A moto com partida a pedal está ligada.");
        } else {
            System.out.println("É necessário puxar o acelerador para ligar a moto.");
        }
    }
}

public class Automoveis {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "Azul", 1974);
        Moto moto = new Moto("Honda", "Vermelha", 2020);
        Guincho guincho = new Guincho("Guincho 2021", "Amarelo", 2021);

        CarroAutomatico carroAutomatico = new CarroAutomatico("Tesla", "Preto", 2022, true);
        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal("Yamaha", "Preta", 2018, false);

        carro.ligar();
        moto.ligar();
        guincho.carregar(carro);
        guincho.carregar(moto);

        carroAutomatico.ligar();
        motoPartidaPedal.ligar();
    }
}

