
public class Personagem {
    private String nome, sexo, raca, classe, arma, armadura;
    private int nivel, vida, mana, forca, agilidade, inteligencia, ataque, numeroDeHabilidades, defesa;

    //CONSTRUTOR

    public Personagem(String nome, String sexo, String raca, String classe, String arma, String armadura, int nivel, int vida, int mana, int forca, int agilidade, int inteligencia, int ataque, int defesa) {
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.classe = classe;
        this.arma = arma;
        this.armadura = armadura;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.ataque = ataque;
        this.numeroDeHabilidades = 3;
        this.defesa = defesa;
        this.numArmadura = numArmadura;
    }

    //GETTERS

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaca() {
        return raca;
    }

    public String getClasse() {
        return classe;
    }

    public String getArma() {
        return arma;
    }

    public String getArmadura() {
        return armadura;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getForca() {
        return forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getNumeroDeHabilidades() {
        return numeroDeHabilidades;
    }

    public int getDefesa() {
        return defesa;
    }

    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setNumeroDeHabilidades(int numeroDeHabilidades) {
        this.numeroDeHabilidades = numeroDeHabilidades;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "Personagem{" + "\n" +
                "nome='" + nome + '\'' + "\n" +
                ", sexo='" + sexo + '\'' + "\n" +
                ", raca='" + raca + '\'' + "\n" +
                ", classe='" + classe + '\'' + "\n" +
                ", arma='" + arma + '\'' + "\n" +
                ", armadura='" + armadura + '\'' + "\n" +
                ", nivel=" + nivel + "\n" +
                ", vida=" + vida + "\n" +
                ", mana=" + mana + "\n" +
                ", forca=" + forca + "\n" +
                ", agilidade=" + agilidade + "\n" +
                ", inteligencia=" + inteligencia + "\n" +
                ", ataque=" + ataque + "\n" +
                ", numeroDeHabilidades=" + numeroDeHabilidades + "\n" +
                ", defesa=" + defesa +
                '}'; 
    }
}
