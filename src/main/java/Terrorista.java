public class Terrorista extends ClassePersonagem{
    public Terrorista(float custoPersonagem){
        super(custoPersonagem);
    }

    public float calcularCustoPersonagem(){
        return this.custoPersonagem + this.skin.custoaumento();
    }
}
