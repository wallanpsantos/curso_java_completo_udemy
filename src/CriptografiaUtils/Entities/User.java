package CriptografiaUtils.Entities;

import CriptografiaUtils.Utils.CryptoUtils;

public class User {
    private String username;

    private UserDetails userDetails;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    private void encryptFields() {
        if (userDetails != null) {
            if (userDetails.getFirstName() != null) {
                userDetails.setFirstName(CryptoUtils.encrypt(userDetails.getFirstName()));
            }
        }
    }

    private void decryptFields() {
        if (userDetails != null) {
            if (userDetails.getFirstName() != null) {
                userDetails.setFirstName(CryptoUtils.decrypt(userDetails.getFirstName()));
            }
        }
    }
}
