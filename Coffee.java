/**
 * Concrete implementation of the Beverage template for coffee.
 */
public class Coffee extends Beverage {
    
    private boolean withCondiments;
    
    public Coffee(boolean withCondiments) {
        this.withCondiments = withCondiments;
    }
    
    @Override
    protected void brew() {
        System.out.println("Brewing coffee grounds");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
    @Override
    protected boolean customerWantsCondiments() {
        return withCondiments;
    }
} 