package hierarchy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AsciiTree {
	
	static class node{
		
		String name;
		List<node> children;
		
		public node(String name) {
			
			this.name = name;
			this.children = new ArrayList<>();
		}
		
		public void addchild(node child) {
			
			children.add(child);
		}
		
		
	}

	public static void main(String[] args) {
		
		node food = new node(" Food ");
		node fruit = new node("fruit");
		node consumable = new node("Consumable");
		node beverages = new node("Beverages");
		node Dairyproduct = new node("DairyProduct");
		node Condiments = new node("Condiments");
		node Vegetables = new node ("Vegetables");
		
		food.addchild(fruit);
		food.addchild(consumable);
		food.addchild(beverages);
		food.addchild(Dairyproduct);
		food.addchild(Condiments);
		food.addchild(Vegetables);
		
		fruit.addchild(new node("Apple"));
		fruit.addchild(new node("Banana"));
		fruit.addchild(new node("Grapes"));
		fruit.addchild(new node("Pineapple"));
		fruit.addchild(new node("Tomato"));
		
		beverages.addchild(new node("Cocoa"));
		beverages.addchild(new node("Orange Juice"));
		beverages.addchild(new node("Shake"));
		
		consumable.addchild(new node("Beef"));
		consumable.addchild(new node("Chicken"));
		consumable.addchild(new node("egg"));
		consumable.addchild(new node("fish"));
		consumable.addchild(new node("Green Bean"));
		consumable.addchild(new node("Meat"));
		consumable.addchild(new node("Poultry"));
		consumable.addchild(new node("Pork"));
		consumable.addchild(new node("Rice"));
		
		Condiments.addchild(new node("Soy Sauce"));
		Condiments.addchild(new node("Shrimp paste"));
		Condiments.addchild(new node("Fish Sauce"));
		
		Dairyproduct.addchild(new node("Butter"));
		Dairyproduct.addchild(new node("Cheese"));
		Dairyproduct.addchild(new node("Milk"));
		Dairyproduct.addchild(new node("Yoghurt Cream"));
		
		Vegetables.addchild(new node("Carrots"));
		Vegetables.addchild(new node("Lettuce"));
		Vegetables.addchild(new node("Spinach"));
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter if bullet or tree: ");
		
		String format = scanner.nextLine().trim().toLowerCase();
		if(format.equals("bullet")) {
				printHierarchyAsBullet(food);
				
		} else if(format.equals("tree")) {
			
			printHierarchyAsTree(food);
		} else {
			
			System.out.println("Invalid");
		}
			

}
    public static void printHierarchyAsBullet(node node) {
        printNodeAsBullet(node, "");
    }

    private static void printNodeAsBullet(node node, String prefix) {
        System.out.println(prefix + "• " + node.name);
        List<node> children = node.children;
        for (node child : children) {
            printNodeAsBullet(child, prefix + "  ");
        }
    }

    public static void printHierarchyAsTree(node node) {
        printNodeAsTree(node, "", true);
    }

    private static void printNodeAsTree(node node, String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.name);
        List<node> children = node.children;
        for (int i = 0; i < children.size() - 1; i++) {
            printNodeAsTree(children.get(i), prefix + (isTail ? "    " : "│   "), false);
        }
        if (children.size() > 0) {
            printNodeAsTree(children.get(children.size() - 1), prefix + (isTail ?"    " : "│   "), true);
        }
    }


	

	

				
        
}
