package Abstraction;

/*
Abstraction:
    - hides implementation complexity, so we can
    achieve generalization
Abstract Class:
    - is template for a class where some functionality
    is not implemented yet
    - used in data management
 */
public abstract class Abstraction<D> {
    public abstract String getTableName();

    //public abstract DynamoDB getDBClient();

    public void putItem(D value) {
        System.out.println("Adding item to " + getTableName());

        //public D getItem(String key){
            // Retrieve item
        //}

        //public void removeItem(String key){
            //Remove item
        //}
    }
}
