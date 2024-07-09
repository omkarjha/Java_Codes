import java.util.Random;

class RandomOTPGenerator implements OTPGenerator {
    public String generateOTP() {
        Random random = new Random();

        int otp = 100000 + random.nextInt(900000); // Range: 100000 to 999999
        return String.valueOf(otp);
    }
}