import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mago mago = new Mago(
            "Dumbledore",
            "Masculino",
            "Humano",
            "Mago",
            "Cajado",
            "Manto",
            10,
            100,
            5,
            10,
            25,
            15,
            10,
            200
        );

        Paladino paladino = new Paladino(
            "Joana d'Arc",
            "Feminino",
            "Humano",
            "Paladino",
            "Espada Sagrada",
            "Armadura de Prata",
            10,
            180,
            20,
            10,
            15,
            25,
            25,
            100
        );

        List<Personagem> personagens = new ArrayList<>();

        personagens.add(mago);
        personagens.add(paladino);

        for (Personagem personagem : personagens) {
            System.out.println(personagem.toString());
            System.out.println();
        }
    }
}