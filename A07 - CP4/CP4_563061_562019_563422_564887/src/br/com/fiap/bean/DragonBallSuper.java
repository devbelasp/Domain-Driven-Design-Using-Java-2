//Andrei de Paiva Gibbini - RM: 563061
//Felipe Monte de Sousa - RM: 562019
//Isabela dos Santos Pinto - RM: 563422
//Manuela de Lacerda Soares - RM: 564887

package br.com.fiap.bean;

import javax.swing.*;
import java.io.*;
/**
 * Classe que representa um personagem do universo Dragon Ball Super.
 * Implementa a interface {@link IDBSuper} para salvar e ler os dados
 * do personagem em arquivos de texto (nome, KI, técnicas, velocidade
 * e transformações).
 */
public class DragonBallSuper implements IDBSuper {
    //atributos
    private String nome;
    private int ki;
    private int tecnicas;
    private int velocidade;
    private int transformacoes;
    //construtor
    public DragonBallSuper() {
    }
    //métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getKi() {
        return ki;
    }
    public void setKi(int ki) {
        this.ki = ki;
    }
    public int getTecnicas() {
        return tecnicas;
    }
    public void setTecnicas(int tecnicas) {
        this.tecnicas = tecnicas;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getTransformacoes() {
        return transformacoes;
    }
    public void setTransformacoes(int transformacoes) {
        this.transformacoes = transformacoes;
    }
    // métodos da classe (particulares)
    /**
     * Esse metodo tem a função de ler os dados de um personagem a partir de um arquivo texto.
     *
     * <p>O arquivo deve estar localizado no caminho informado e conter as informações do personagem
     * (nome, KI, técnicas, velocidade e transformações).</p>
     *
     * @param path Caminho da pasta onde o arquivo está localizado.
     * @return O próprio objeto {@link DragonBallSuper} com os dados carregados.
     * @throws IOException Caso ocorra erro na leitura do arquivo.
     */
    @Override
    public DragonBallSuper ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + "/" + nome + ".txt"));
        nome = br.readLine();
        ki = Integer.parseInt(br.readLine());
        tecnicas = Integer.parseInt(br.readLine());
        velocidade = Integer.parseInt(br.readLine());
        transformacoes = Integer.parseInt(br.readLine());
        br.close();
        return this;
    }
    /**
     * Esse metodo tem a função de gravar os dados do personagem em um arquivo texto.
     *
     * <p>O arquivo será criado (ou sobrescrito) dentro do caminho informado,
     * com o nome do personagem como nome do arquivo. O conteúdo do arquivo será
     * gravado contendo as informações do personagem: (nome, KI, técnicas, velocidade e transformações).</p>
     *
     * @param path Caminho da pasta onde o arquivo será criado.
     * @return Mensagem indicando sucesso ou falha na gravação do arquivo.
     */
    @Override
    public String gravar(String path) {
        try{
            if (nome == null || nome.equals("")) {
                return "Erro: o nome do personagem não pode estar vazio!";
            }

            File dir = new File(path);
            if (!dir.exists()){
                dir.mkdir();
            }
            PrintWriter pw = new PrintWriter(path + "/" + nome + ".txt");
            pw.println(nome);
            pw.println(ki);
            pw.println(tecnicas);
            pw.println(velocidade);
            pw.println(transformacoes);
            pw.flush();
            pw.close();
            return "arquivo gravado com sucesso!";

        } catch (IOException  e) {
            return "Falha ao gravar o arquivo: " + e.getMessage();
        }
    }
}
