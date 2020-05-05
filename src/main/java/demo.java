import com.google.common.collect.Lists;

public class demo {
    public static void main(String[] args) {
        Basic.Person.Builder builder = Basic.Person.newBuilder().setFirstName("")
                .setLastName("")
                .setIsValidate(true)
                .setHeight(5.02)
                .addAllPhoneNumber(Lists.newArrayList("123", "456"))
                .setSupp(Basic.Person.Supplier.GALILEO)
                .setDate(Basic.Date.newBuilder().setYear(1).setMonth(2).setDate(3));


    }
}
