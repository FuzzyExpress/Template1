/**
 * Demonstration of the Template Method Pattern using different beverages.
 */
public class BeverageDemo {
    
    public static void main(String[] args) {
        System.out.println("===== BEVERAGE PREPARATION DEMO =====");
        System.out.println("\n1. Preparing Coffee with condiments:");
        Beverage coffee = new Coffee(true);
        coffee.prepareBeverage();
        
        System.out.println("\n2. Preparing Tea without condiments:");
        Beverage tea = new Tea(false);
        tea.prepareBeverage();
        
        System.out.println("\n3. Preparing Chamomile Herbal Infusion:");
        HerbalInfusion chamomile = new HerbalInfusion("chamomile", true);
        chamomile.prepareBeverage();
        chamomile.describeHealthBenefits();
        
        System.out.println("\n4. Preparing Ginger Herbal Infusion without honey:");
        HerbalInfusion ginger = new HerbalInfusion("ginger", false);
        ginger.prepareBeverage();
        ginger.describeHealthBenefits();
    }
} 
