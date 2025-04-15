/**
 * Concrete implementation of the Beverage template for a special herbal infusion.
 */
public class HerbalInfusion extends Beverage {
    
    private String herbType;
    private boolean withHoney;
    
    /**
     * Creates a new herbal infusion with the specified herb type and honey preference.
     * 
     * @param herbType The type of herb to use (e.g., "chamomile", "mint")
     * @param withHoney Whether to add honey as a condiment
     */
    public HerbalInfusion(String herbType, boolean withHoney) {
        this.herbType = herbType;
        this.withHoney = withHoney;
    }
    
    @Override
    protected void brew() {
        System.out.println("Infusing " + herbType + " in hot water");
        System.out.println("Allowing herbs to release their essential oils and flavors");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding organic honey and a twist of lemon");
    }
    
    @Override
    protected boolean customerWantsCondiments() {
        return withHoney;
    }
    
    /**
     * Specialized method unique to herbal infusions.
     */
    public void describeHealthBenefits() {
        switch (herbType.toLowerCase()) {
            case "chamomile":
                System.out.println("Chamomile has calming effects and may promote better sleep");
                break;
            case "mint":
                System.out.println("Mint can aid digestion and freshen breath");
                break;
            case "ginger":
                System.out.println("Ginger has anti-inflammatory properties and may help with nausea");
                break;
            default:
                System.out.println(herbType + " has various health benefits");
        }
    }
} 