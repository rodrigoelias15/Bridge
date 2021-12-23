import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerroristaTest {


    @Test
    void deveRetornarCustoTerroristaComSkinFogo() {
        Skin skin = new SkinArmaFogo();
        Terrorista terrorista = new Terrorista(0.0f);
        terrorista.setSkin(skin);
        assertEquals(10.0f, terrorista.calcularCustoPersonagem(),0.01f);
    }

    @Test
    void deveRetornarCustoTerroristaComSkinArmaBranca() {
        Skin skin = new SkinArmaBranca();
        Terrorista terrorista = new Terrorista(0.0f);
        terrorista.setSkin(skin);
        assertEquals(5.0f, terrorista.calcularCustoPersonagem(),0.01f);
    }
}