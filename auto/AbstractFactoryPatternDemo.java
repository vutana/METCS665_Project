
package auto;


public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

      //get models factory
      AbstractFactory modelsFactory = FactoryProducer.getFactory("MODELS");

      //get an object of Models Economy
      Models models1 = modelsFactory.getModels("ECONOMY");

      //call draw method of Models Economy
      models1.draw();

      //get an object of Models Sporty
      Models models2 = modelsFactory.getModels("Sporty");

      //call draw method of Models Sporty
      models2.draw();
      
    //get inventory factory
      AbstractFactory inventoryFactory = FactoryProducer.getFactory("INVENTORY");

      //get an object of Inventory USED
      Inventory inventory1 = inventoryFactory.getInventory("USED");

      //call fill method of Used
      inventory1.fill();

      //get an object of Inventory New
      Inventory inventory2 = inventoryFactory.getInventory("NEW");

      //call fill method of New
      inventory2.fill();

      
   }
}
