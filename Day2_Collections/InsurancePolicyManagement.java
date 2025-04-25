package day2;
import java.time.LocalDateTime;
import java.util.*;
class Policy<T,U,LocalDate> {
    T policyNumber;
    U policyholderName;
    LocalDateTime ExpiryDate;
    U CoverageType;
    T PremiumAmount;
    Policy( T policyNumber,
    U policyholderName,
    LocalDateTime ExpiryDate,
    U CoverageType,
    T PremiumAmount){
        this.policyNumber =policyNumber;
        this.policyholderName =policyholderName;
        this.ExpiryDate =ExpiryDate;
        this.CoverageType =CoverageType;
        this.PremiumAmount =PremiumAmount;

    }


}
interface iStorage{
    void AddPolicy(Object Pol);
     void PrintStorage();
}
class   HashsetPolicyStore<Policy> implements iStorage{
    Set<Policy> HashsetStorage = new HashSet<>() ;

   @Override
   public void AddPolicy(Policy Pol){
        HashsetStorage.add(Pol);
    }
    @Override
    public void PrintStorage(){
        System.out.println(HashsetStorage);
    }


}

public class InsurancePolicyManagement {

}
