package sorteio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {

  public static void main(String[] args) {
    List<String> participantes = new ArrayList<String>();
    participantes.add("Suyle");
    participantes.add("Zé");
    participantes.add("Ralf");
    participantes.add("Igão");
    participantes.add("Paquito");
    participantes.add("Saulo");
    participantes.add("Alan");
    participantes.add("Vinícius o bonitão");
    sortear(5, participantes);
  }

  public static void sortear(int quantidadeSorteios, List<String> participantes) {
    Random random = new Random();
    int i = 1;
    while (i <= quantidadeSorteios) {
      String sorteado = participantes.get(random.nextInt(participantes.size()));
      System.out.println(i + "-" + sorteado);
      i++;
    }
  }
}
