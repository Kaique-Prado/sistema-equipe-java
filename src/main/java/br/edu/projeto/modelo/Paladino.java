public class Paladino extends Personagem {
    private int honra;

    public Paladino(String nome, String sexo, String raca, String arma, 
    String armadura, int nivel, int vida, int forca, int agilidade, int inteligencia, int ataque, int defesa, int honra){

    super(nome, sexo, raca, classe, arma, armadura, nivel, vida, forca, agilidade, inteligencia, ataque, defesa);

    this.honra = honra;
    }

    public int getHonra(){
        return honra;
    }

    public void setHonra(int honra){
        this.honra = honra
    }

    @Override
    public String toString(){
        return super.toString() + "\nHonra=" + honra
        
    }