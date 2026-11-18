import org.junit.Test;
import static org.junit.Assert.*;

public class ProductCalculationsTest {
    
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(525.0, calc.GetVat(), 0.01); 
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(4200.0, calc.GetTotal(), 0.01);
    }
    
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Just testing that the class can be instantiated without errors
        Product report = new Product();
        assertEquals(0.0, report.GetAverageProductSold(), 0.1); 
    }
}