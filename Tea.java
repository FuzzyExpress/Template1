/**
 * Concrete implementation of the Beverage template for tea.
 */
public class Tea extends Beverage {
    
    private boolean withCondiments;
    
    public Tea(boolean withCondiments) {
        this.withCondiments = withCondiments;
    }
    
    @Override
    protected void brew() {
        System.out.println("Steeping tea bag");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
    
    @Override
    protected boolean customerWantsCondiments() {
        return withCondiments;
    }
} 