/**
 * Abstract Beverage class implementing the Template Method pattern.
 * Defines the skeleton of the beverage preparation algorithm, with specific
 * steps deferred to subclasses.
 */
public abstract class Beverage {
    
    /**
     * Template method defining the algorithm for preparing a beverage.
     * This method is final so subclasses cannot override it.
     */
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        serve();
    }
    
    // These methods will be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();
    
    // These are common operations, implemented in the base class
    private void boilWater() {
        System.out.println("Boiling water");
    }
    
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    private void serve() {
        System.out.println("Your beverage is ready! Enjoy!");
    }
    
    /**
     * Hook method - subclasses can override this method to provide
     * custom behavior. Default implementation returns true.
     */
    protected boolean customerWantsCondiments() {
        return true;
    }
} 