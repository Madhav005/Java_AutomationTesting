package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "^(001|\\+1)-\\d{3}-\\d{3}-\\d{4}$";

        String phone1 = "001-765-989-3421";
        String phone2 = "+1-456-765-9345";

        validate(phone1, regex);
        validate(phone2, regex);
    }

    static void validate(String phone, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {
            System.out.println(phone + " → Valid phone number");
        } else {
            System.out.println(phone + " → Invalid phone number");
        }

	}

}
