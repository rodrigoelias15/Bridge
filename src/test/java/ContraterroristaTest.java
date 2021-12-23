import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContraterroristaTest {

    @Test
    void deveRetornarCustoContraTerroristaComSkinArmaFogo() {
        Skin skin = new SkinArmaFogo();
        Contraterrorista contraterrorista = new Contraterrorista(0.0f);
        contraterrorista.setSkin(skin);
        assertEquals(10.0f, contraterrorista.calcularCustoPersonagem(),0.01f);
    }

    @Test
    void deveRetornarCustoContraTerroristaComSkinArmaBranca() {
        Skin skin = new SkinArmaBranca();
        Contraterrorista contraterrorista = new Contraterrorista(0.0f);
        contraterrorista.setSkin(skin);
        assertEquals(5.0f, contraterrorista.calcularCustoPersonagem(),0.01f);
    }
}