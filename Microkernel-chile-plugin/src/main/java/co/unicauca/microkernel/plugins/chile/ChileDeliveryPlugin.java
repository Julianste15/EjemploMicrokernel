package co.unicauca.microkernel.plugins.chile;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;

public class ChileDeliveryPlugin implements IDeliveryPlugin{

    // Constantes para los costos
    private static final double COST_LIGHT_SHORT = 3.0;
    private static final double COST_LIGHT_LONG = 4.0;
    private static final double COST_HEAVY_SHORT = 4.0;
    private static final double COST_HEAVY_LONG = 5.0;

    // Umbrales
    private static final double MAX_LIGHT_WEIGHT = 4.0;   // kg
    private static final double SHORT_DISTANCE = 80.0;    // km
    
    @Override
    public double calculateCost(Delivery delivery) {
        
        Product product = delivery.getProduct();
        double weight = product.getWeight();
        double distance = delivery.getDistance();

        boolean isLight = weight <= MAX_LIGHT_WEIGHT;
        boolean isShortDistance = distance <= SHORT_DISTANCE;

        if (isLight && isShortDistance) {
            return COST_LIGHT_SHORT;
        } else if (isLight) {
            return COST_LIGHT_LONG;
        } else if (isShortDistance) {
            return COST_HEAVY_SHORT;
        } else {
            return COST_HEAVY_LONG;
        }
        
    }
    
}
