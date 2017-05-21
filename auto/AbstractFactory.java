
package auto;


public abstract class AbstractFactory {
    abstract Inventory getInventory(String inventory);
   abstract Models getModels(String models) ;
}
