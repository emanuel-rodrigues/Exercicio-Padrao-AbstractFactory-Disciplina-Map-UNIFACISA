

class Exercicio {
	
	
	//*********INTERFACE FABRICA DE PIZZA******************
	
	public interface FabricaDePizza{
		public Pizza criaPizzaNY(String tipo);
		public Pizza criaPizzaChicago(String tipo);
		
	}
	
	
	//**********CLASSE QUE IMPLEMENTA A FABRICA*******************
	
	public class PizzaStore implements FabricaDePizza{

		@Override
		public Pizza criaPizzaNY(String tipo) {
			if(tipo.equals("cheese")){
				return new CheesePizzaNY();
			}if(tipo.equals("veggie")){
				return new VeggiePizzaNY();
			}if(tipo.equals("clam")){
				return new ClamPizzaNY();
			}if(tipo.equals("pepperone")){
				return new PepperonePizzaNY();
			}
			return null;
			
		}
	

		@Override
		public Pizza criaPizzaChicago(String tipo) {
			if(tipo.equals("cheese")){
				return new CheesePizzaChicago();
			}if(tipo.equals("veggie")){
				return new VeggiePizzaChicago();
			}if(tipo.equals("clam")){
				return new ClamPizzaChicago();
			}if(tipo.equals("pepperone")){
				return new PepperonePizzaChicago();
			}
			return null;
		}
		
	}
	
	//***************INTERFACE DE PIZZA****************
	
	public interface Pizza{
		
		void exibeInfo(); 
		
	}
	
	
	//***************CLASSE QUE IMPLEMENTAM PIZZA***************
	
	
	//**************PIZZAS DE CHICAGO*************************
	
	public class CheesePizzaChicago implements Pizza{

		@Override
		public void exibeInfo() {
			System.out.println("Pizza Cheese de CHICAGO");
			
		}

	}

	public class VeggiePizzaChicago implements Pizza{

		@Override
		public void exibeInfo() {
			System.out.println("Pizza Veggie de CHICAGO");
			
		}
		
	}

	public class ClamPizzaChicago implements Pizza{

		@Override
		public void exibeInfo() {
			System.out.println("Pizza Clam de CHICAGO");
			
		}
		
	}
		
	public class PepperonePizzaChicago implements Pizza{
		@Override
		public void exibeInfo() {
			System.out.println("Pizza Pepperone de CHICAGO");
			
		}
			
	}
	
	
	//**************PIZZAS DE NY*************************

	
	public class CheesePizzaNY implements Pizza{

		@Override
		public void exibeInfo() {
			System.out.println("Pizza Cheese de NY");
			
		}

	}

	public class VeggiePizzaNY implements Pizza{

		@Override
		public void exibeInfo() {
			System.out.println("Pizza Veggie de NY");
			
		}

	}

	public class ClamPizzaNY implements Pizza{

		@Override
		public void exibeInfo() {
			System.out.println("Pizza Clam de NY");
			
		}

	}

	public class PepperonePizzaNY implements Pizza{

		@Override
		public void exibeInfo() {
			System.out.println("Pizza Pepperone de NY");
			
		}

	}
	
	
	
	//***************MAIN*****************************
	
	
		public static void main(String[] args) {
			
			FabricaDePizza fabrica = new PizzaStore();
			
			Pizza pizza1 = fabrica.criaPizzaChicago("cheese");
			Pizza pizza2 = fabrica.criaPizzaNY("cheese");
			
			
			pizza1.exibeInfo();
			
			pizza2.exibeInfo();
			
		}
	
	
	
	
	
}
