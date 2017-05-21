
package auto;


public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("MODELS")){
         return new ModelsFactory();
         
      }else if(choice.equalsIgnoreCase("INVENTORY")){
         return new InventoryFactory();
      }
      
      return null;
   }
}
