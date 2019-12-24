import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
//import java.util.List;
import java.util.Map;


public class Pares {
  
  private Map pares;
  
  public static void main(String[] args) {
      Pares kcomp = new Pares();
      int[] numeros = new int[]{7, 1, 5, 6, 9, 3, 11, -1};
      Integer[][] pars = kcomp.getKComplementaryPairs(10, numeros);
      
      for (Integer[] osPares : pars) {
          System.out.println(" Pares s�o "+osPares[0] + " e " + osPares[1]);
      }
  }
  
  public Pares() {
      this.pares = new HashMap();
  }
  
  /**
   * Um algoritmo para encontrar o par da matriz fornecida que somaria o dado K
   * 
   * �  de ordem linea o(n).O mesmo n�mero de instru��es � executado para cada um dos elementos de entrada
   * e cria uma lista tempor�ria de pares com HashMap( associa chaves de pesquisa a valores. Seu objetivo �, a partir de uma chave simples,
   *  fazer uma busca r�pida e obter o valor desejado.)
   * (n�o autoriza valores duplicados de chave, sendo que o �ltimo substitui o j� adicionado.)
   * (valor, soma-valor). 
   *  listOfIntegers
   */
  public Integer[][] getKComplementaryPairs(int soma, int[] listOfIntegers) {
      
      
      Integer[][] complementaryPairs = new Integer[listOfIntegers.length][2];
      //Preencha os pares 
      for (int valor : listOfIntegers) { //O(n) complexidade
          this.pares.put(valor, soma-valor);
      }
      
      // filtre os pares que n�o t�m o n�mero complementar correspondente
      int index = 0;
      for (int valor : listOfIntegers) { //O(n) complexidade 
          int complementary = soma - valor;
          //verifique se a chave existe nesses pares
          if ( this.pares.containsKey(complementary) ) {
              complementaryPairs[index][0] = valor;
              complementaryPairs[index][1] = complementary;
              index ++;
          }
      }
      Integer[][] resultado= new Integer[index][2];
      
      index = 0;
      for (Integer[] item : complementaryPairs) { //O(n) complexity
          if (item[0] != null) {
              resultado[index][0] = item[0];
              resultado[index][1] = item[1];
          }
          index++;
      }
        
 
      return resultado;
  }
}