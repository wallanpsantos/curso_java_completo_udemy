package CriptografiaUtils;

import CriptografiaUtils.Entities.User;
import CriptografiaUtils.Entities.UserDetails;
import CriptografiaUtils.Utils.CryptoUtils;

public class ProgramaCriptografia {
    public static void main(String[] args) {

        User user = new User();
        UserDetails userDetails = new UserDetails();

        userDetails.setFirstName(CryptoUtils.encrypt("DaVinci"));

        System.out.println(userDetails.getFirstName());

        System.out.println(CryptoUtils.decrypt(userDetails.getFirstName()));

    }
}
