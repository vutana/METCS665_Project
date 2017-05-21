
package auto;


public class InventoryFactory extends AbstractFactory{
    @Override
   public Models getModels(String modelsType){
      return null;
   }
   
   @Override
   Inventory getInventory(String inventory) {
   
      if(inventory == null){
         return null;
      }		
      
      if(inventory.equalsIgnoreCase("NEW")){
         return new New();
         
      }else if(inventory.equalsIgnoreCase("USED")){
         return new Used();
         
      }
      
      return null;
   }
}
