public class Contraterrorista extends ClassePersonagem{

    public Contraterrorista(float custoPersonagem){
        super(custoPersonagem);
    }

    public float calcularCustoPersonagem(){
        return this.custoPersonagem + this.skin.custoaumento();
    }
}
