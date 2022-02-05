package empoderacao;

import java.io.IOException;


/*
 * @author Daniela Goulart
 * @author Erika Kuo
 * @author Leonardo Carvalho
 * @author Lucas Silva
 * @author Luiz Gustavo
 * @author Vanessa Navarro
 * @author Victor Costa
 * @since 03-02-2022
 */

/**
 * Class principal que roda o programa
 */
public class Main {
	
	/**
	 * O método main
	 *
	 * IOException caso ocorra um problema no arquivo txt.
	 * InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		Menu menu = new Menu();
		menu.comeco();
	}
}