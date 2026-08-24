import java.time.Year;

public class Book {
        private String title;
        private String author;
        private int year;
        private double price;
        private boolean isAvailable = true;

        public Book (String title, String author, int year, double price){
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year <= Year.now().getValue()){
                this.year = year;
            }else {
                System.out.println("Вы хотите книгу из будущего? " +
                        "Телепорт еще не придумали, или в вашем времени он уже есть?");
                this.year = Year.now().getValue();
            }
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {

            if(price<0){
                System.out.println("Мы не платим денег за то что вы заберете книгу себе, " +
                        "мы просто отдаем ее вам бесплатно!");
                this.price =0;
            } else this.price = price;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }


        public void displayInfo (){
            String available;
            if(isAvailable() == true){
                available = "Есть в наличии";
            }else {
                available = "Нет в наличии";
            }
            System.out.println("Название книги: "+getTitle()+"\nАвтор: "+getAuthor()+
                    "\nНаличие в магазине: "+ available+ "\nГод выхода: "+ getYear()+"\nЦена: "+getPrice()+" руб.");
            System.out.println();
        }
    }

