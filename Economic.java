
    public class Economic extends Passenger implements Fare {
        private double baseFare;
        private double tax;
        private double discount;
    
        public Economic(String name, String email, long phoneNumber, int age, String ticketClass, double baseFare,
                double tax, double discount) {
            super(name, email, phoneNumber, age, ticketClass);
            this.baseFare = baseFare;
            this.tax = tax;
            this.discount = discount;
        }
    
        @Override
        public double getBaseFare() {
            return baseFare;
        }
    
        @Override
        public double getTax() {
            return tax;
        }
    
        @Override
        public double getDiscount() {
            return discount;
        }
    
        @Override
        public  double CalculateFare() {
            return baseFare + tax - discount;
        }
    }
    

