
import com.mycompany.cuenta.bancaria.poo.CuentaBancaria;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaBancariaTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
    // @Test
    // public void miPrueba() {
    //      double valorEsperado = 10;
    //      double valorActual = Calculadora.calcular(7, 3, '+');
    //      assertEquals(valorEsperado, valorActual);
    // }
    
      private CuentaBancaria cuenta;

    @BeforeEach
    void setUp() {
        
        cuenta = new CuentaBancaria("Juan Pérez", "12345678", 1000.0, 0.15);
    }

    @Test
    void testInicializacionCuenta() {
        assertEquals("Juan Pérez", cuenta.getTitular());
        assertEquals("12345678", cuenta.getNumeroCuenta());
        assertEquals(1000.0, cuenta.getSaldo());
        assertEquals(0.15, cuenta.getTipoInteres());
    }

    @Test
    void testSetters() {
        cuenta.setTitular("Maria López");
        cuenta.setNumeroCuenta("87654321");
        cuenta.setSaldo(2000.0);
        cuenta.setTipoInteres(0.10);

        assertEquals("Maria López", cuenta.getTitular());
        assertEquals("87654321", cuenta.getNumeroCuenta());
        assertEquals(2000.0, cuenta.getSaldo());
        assertEquals(0.10, cuenta.getTipoInteres());
    }

    @Test
    void testAgregarCuenta() {
      
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana Gómez", "23456789", 1500.0, 0.12);
        cuenta.AgregarCuenta(cuenta2);

        assertTrue(cuenta.listaCuentas.contains(cuenta2));
    }

    @Test
    void testMostrarCuentas() {
       
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana Gómez", "23456789", 1500.0, 0.12);
        cuenta.AgregarCuenta(cuenta2);
}
}
