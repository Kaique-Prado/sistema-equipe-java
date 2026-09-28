public class Mago extends Personagem{
    private int mana;

    public Mago (String nome, String sexo, String raca, String classe, String arma, String armadura, int nivel, int vida, int forca, int agilidade, int inteligencia, int ataque, int defesa, int mana){
        
        super (nome, sexo, raca, classe, arma, armadura, nivel, vida, forca, agilidade, inteligencia, ataque, defesa);
        this.mana = mana;
    }

    public String getMana(){
        return mana;
    }

    public void setMana(String tipoMagia){
        this.mana = mana;
    }

    @Override
    public void toString(){
        return super.toString() + "\nMana =" + mana;
    }
}