
package auto;


public class ModelsFactory extends AbstractFactory{

    @Override
   public Models getModels(String modelsType){
   
      if(modelsType == null){
         return null;
      }		
      
      if(modelsType.equalsIgnoreCase("ECONOMY")){
         return new Economy();
         
      }else if(modelsType.equalsIgnoreCase("SPORTY")){
         return new Sporty();
         
      }
      
      return null;
   }
   
   @Override
   Inventory getInventory(String color) {
      return null;
   }
    
}
