public abstract class ClassePersonagem {

    protected Skin skin;
    protected float custoPersonagem;

    public ClassePersonagem(float custoPersonagem) {
        this.custoPersonagem = custoPersonagem;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public void setCustoPersonagem(float custoPersonagem) {
        this.custoPersonagem = custoPersonagem;
    }

    public abstract float calcularCustoPersonagem();

}
