import java.util.*;

public class AtmOperationServiceIml implements AtmOperationService {
    ATM atm = new ATM();
//    Map<Double, String> ministmt = new HashMap<>();
    private List<AbstractMap.SimpleEntry<Double,String>> ministatenebt = new ArrayList<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :" + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <=atm.getBalance()){
            ministatenebt.add(new AbstractMap.SimpleEntry<>(withdrawAmount,"Amount Withdraw"));
            System.out.println(withdrawAmount + ": Withdraw Successfully !!");
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();

        }else{
            System.out.println("Insufficient Balance !!");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministatenebt.add(new AbstractMap.SimpleEntry<>(depositAmount,"Amount Deposit"));
        System.out.println(depositAmount + ": Deposit Successfully !!");
        atm.setBalance(atm.getBalance() +  depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(var entity : ministatenebt){
            System.out.println(entity.getKey()+" "+entity.getValue());
        }
    }
}
