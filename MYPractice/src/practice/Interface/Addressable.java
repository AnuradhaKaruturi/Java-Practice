package practice.Interface;

 interface AddressableInterface
{
   public class Address
   {
      private String boxNumber;
      private String street;
      private String city;

      public Address(String boxNumber, String street, String city)
      {
         this.boxNumber = boxNumber;
         this.street = street;
         this.city = city;
      }

      public String getBoxNumber()
      {
         return boxNumber;
      }

      public String getStreet()
      {
         return street;
      }

      public String getCity()
      {
         return city;
      }

      public String toString()
      {
         return boxNumber + " - " + street + " - " + city;
      }
   }

   public Address getAddress();
   public String name();
}

 class Letter implements AddressableInterface
{
   private AddressableInterface.Address address;

   public Letter(String string, String street, String city)
   {
      address = new AddressableInterface.Address(string, street, city);
   }

   public Address getAddress()
   {
      return address;
   }

public String name() {
    return "address_interface";
}
}

public class Addressable{
    public static void main(String[] args) {
        Letter lObj = new Letter("101","Victoria Street","New Jersery");
        System.out.println(lObj.getAddress());
        System.out.println(lObj.name());

    }
}

