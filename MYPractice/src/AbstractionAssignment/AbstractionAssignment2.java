package AbstractionAssignment;

abstract class BankAbst{
    abstract int getBalance();
}

class BankAAbst{
    int getBalance(){   
          return 100;
    }
}
class BankBAbst{
    int getBalance(){   
          return 150;
    }
}
class BankCAbst{
    int getBalance(){   
          return 200;
    }
}

public class AbstractionAssignment2 {
    public static void main(String[] args) {
        BankAAbst AObj = new BankAAbst();
        BankBAbst BObj = new BankBAbst();
        BankCAbst CObj = new BankCAbst();
        System.out.println("Deposit in Bank A is: "+AObj.getBalance());
        System.out.println("Deposit in Bank B is: "+BObj.getBalance());
        System.out.println("Deposit in Bank C is: "+CObj.getBalance());
        
        
    }
}
