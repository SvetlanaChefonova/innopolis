package homework06;

public class Person {
       public String getNamе() {
              return namе;
       }

       public void setNamе(String namе) {
              this.namе = namе;
       }

       private String namе; // имя покупателя

       public int getMoney() {
              return money;
       }

       public void setMoney(int money) {
              this.money = money;
       }

       private int money; // сумма денег

       String [] paketProductov = new String[4]; // пакет с продуктами, массив объектов типа Продукт



}
