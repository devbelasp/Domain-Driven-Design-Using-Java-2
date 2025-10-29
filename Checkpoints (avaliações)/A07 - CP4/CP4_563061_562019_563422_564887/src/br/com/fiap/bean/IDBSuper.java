//Andrei de Paiva Gibbini - RM: 563061
//Felipe Monte de Sousa - RM: 562019
//Isabela dos Santos Pinto - RM: 563422
//Manuela de Lacerda Soares - RM: 564887

package br.com.fiap.bean;

import java.io.IOException;
/**
 * Interface que define operações de leitura e gravação
 * de dados de personagens {@link DragonBallSuper}.
 */
public interface IDBSuper {
    // Metodo que recebe um caminho e retorna o objeto DragonBallSuper
    public DragonBallSuper ler(String path) throws IOException;

    // Metodo que grava algo em um arquivo/caminho e retorna uma String
    public String gravar (String path);
}
