public class pizza {
        public String storeAddress;
        public String storeName;
    
        public String Menu;
    
        public long storePhone;
        public String storEemali;
        public String pizzaIngredients;
        public double pizzaPrice;
        public String pizzaSide;
        public String drinks;
    
        private String orderID;
        private double orderTotal;

        }
        public void takeOrder(String id, String ingredients, String sides, String drink, double price, double total){
            this.orderID = id;
            this.pizzaIngredients = ingredients;
            this.pizzaSide = sides;
            this.drinks = drink;
            this.pizzaPrice = price;
            this.orderTotal = total;
            
            System.out.println("order accepted!");
    
            System.out.println("order is being prepared");
    
            try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                System.out.println("order is ready for pickup!");
            }
    
            System.out.println("your order is ready!");
             
            printreceipt();
        
        }

        private void printreceipt(){
            System.out.println("********RECEIPT********");
    
            System.out.println("order ID:" + orderID);
            System.out.println("order total:" + orderTotal);
        
        }
    
        public void makepizza(){
            System.out.println("pizza ingredients:"  + pizzaIngredients);
            System.out.println("pizza sides:"  + pizzaSide);
            System.out.println("drinks:"  + drinks);
        } 
    
    }
    

